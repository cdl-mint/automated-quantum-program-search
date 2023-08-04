package quantum.circuit.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.Swap;
import quantum.circuit.qiskit.elementary.*;

import qucircuit.ClassicRegister;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;
import quope.ConcreteQuantumOperation;
import quope.QuopePackage;

public final class FitnessCalculator {
	
	static Process pyProcess;
	static OutputStream outputStream;
	static BufferedReader inputReader;
	static BufferedReader errorReader;
	static PrintWriter outputWriter;
	static int barrierLocation;
	
	public static void init(int barrierLocation, String condaEnvPath) {
		  FitnessCalculator.barrierLocation = barrierLocation;
		  ProcessBuilder processBuilder = new ProcessBuilder(
				  Path.of(condaEnvPath, "bin/python").toString()
          		, Path.of("eval-scripts", "main_circ_eval.py").toString());
          try {
			Process pyProcess = processBuilder.start();
			
			// Get the input and output streams of the process
            outputStream = pyProcess.getOutputStream();
            inputReader = new BufferedReader(new InputStreamReader(pyProcess.getInputStream()));
            errorReader = new BufferedReader(new InputStreamReader(pyProcess.getErrorStream()));

            outputWriter = new PrintWriter(outputStream, true);
            
            // Read the initial output to ensure the libraries are loaded
            String line;
            // Read the error stream from the Python process
//            while ((line = errorReader.readLine()) != null) {
//            	System.err.println("Python error: " + line);
//            }
            while ((line = inputReader.readLine()) != null) {
//            	System.out.println(line);
                if (!line.isEmpty()) {
                    System.out.println("PyProcess: " + line);
                    break;
                }
            }
            
		} catch (IOException e) {
			e.printStackTrace();
		}
          

	}

    private static String pattern = "\\((\\d\\.\\d+), (\\d), (\\d), (\\d), (\\d), (\\[.*?\\])\\)";

    public static int nrOfGates(final QuantumCircuit qc) {
    	return qc.getNrOfGates();
    }
    
    public static int depth(final QuantumCircuit qc) {
    	return qc.getDepth();
    }

    public static int nrOfNonlocalGates(final QuantumCircuit qc) {
    	return qc.getNrOfNonlocalGates();
    }
    
    public static int nrOfParams(final QuantumCircuit qc) {
    	return qc.getNrOfParams();
    }
    
    
	public static synchronized double overlap(final QuantumCircuit qc) {
		Map<Integer, AngleParameterRef> idToGAV = new HashMap<>();
		String circCode = generateCircuitCode(qc, idToGAV);
		if (circCode.contains("CZ") && circCode.contains("CRY")) 
				System.out.println(circCode);
		String response = sendToPyProcess(circCode);
		

			Pattern r = Pattern.compile(pattern); 
			Matcher m = r.matcher(response);
			
			if (!m.find()) throw new RuntimeException("Error parsing values!");
			
			double overlap = Double.parseDouble(m.group(1));
			int noGates = Integer.parseInt(m.group(2));
			int depth = Integer.parseInt(m.group(3));
			int noNonlocalGates = Integer.parseInt(m.group(4));
			int noParams = Integer.parseInt(m.group(5));
			
			String paramList = m.group(6);
			List<Double> paramValues = paramList.equals("[]") ? List.of() :
				Arrays.asList(paramList.replace("[", "").replace("]", "").split(", ")).stream().map(v -> Double.parseDouble(v)).collect(Collectors.toList());
			
			qc.setNrOfGates(noGates-2);
			qc.setDepth(depth-1);
			qc.setNrOfNonlocalGates(noNonlocalGates-1);
			qc.setOverlap(overlap);
			qc.setNrOfParams(noParams);
			
			for(int i = 0; i < paramValues.size(); i++) {
				AngleParameterRef paramToUpdateRef = idToGAV.get(i);
				switch(paramToUpdateRef.getName()) {
				case "lambda":
					paramToUpdateRef.getAngleParameter().setLambda(paramValues.get(i));
					break;
				case "phi":
					paramToUpdateRef.getAngleParameter().setPhi(paramValues.get(i));
					break;
				case "theta":
					paramToUpdateRef.getAngleParameter().setTheta(paramValues.get(i));
					break;
				}
			}
			
			
			
		return qc.getOverlap();
	}
	
	private static String sendToPyProcess(String codeBlock) {
           	outputWriter.println("###PYTHON_CODE_START###");  // Input start marker
            outputWriter.println(codeBlock);
           	outputWriter.println("###PYTHON_CODE_END###");  // Termination marker
            outputWriter.flush();  // Flush the output buffer	

               // Read the output from the Python script
            String response = null;
            String line;
            // Read the error stream from the Python process
      
			try {

				response = inputReader.readLine();
				if (response == null) {
//					 // Read the error stream from the Python process
//		            while ((line = errorReader.readLine()) != null) {
//		            	System.err.println("Python error: " + line);
//		            }
	                throw new RuntimeException("Null response from python process!");
	            }
			} catch (IOException e) {
				e.printStackTrace();
			}
         
            return response;
	}

	static String generateCircuitCode(QuantumCircuit qucircuit, Map<Integer, AngleParameterRef> idToGAV) {
		CompositeQuantumGate qa = (CompositeQuantumGate) qucircuit.getLayers().get(1).getQuantumOperations().get(0);

		var quantumCircuitDef = new StringBuilder().append(qucircuit.getName() + " = QuantumCircuit(");		
		var quantumRegisters = new StringBuilder();
		for (QuantumRegister qr : qucircuit.getQuantumRegisters()) {
			quantumRegisters
				.append(qr.getName())
				.append("=QuantumRegister(" + qr.getNumberOfQubits() + ")")
				.append("\n");
			quantumCircuitDef.append(qr.getName() + ",");
		}
		
		var classicRegisters = new StringBuilder();
		for (ClassicRegister cr : qucircuit.getClassicRegisters()) {
			classicRegisters
				.append(cr.getName())
				.append("=ClassicalRegister(" + cr.getNumberOfBits() + ")")
				.append("\n");
			quantumCircuitDef.append(cr.getName() + ",");
		}	
		//Delete the last comma
		quantumCircuitDef.deleteCharAt(quantumCircuitDef.length() - 1);
		quantumCircuitDef. append(")");

		//Include the necessary libraries
		//var objectQuantumOperations = new GenerateLibrary().generateCode(qucircuit); 
		var quantumOperation = new StringBuilder("e_gate=Elementary_Gates.ElementaryGate()\n");
		AtomicInteger paramCnt = new AtomicInteger(0);	
		
		
		int insertBarrierAfterLayer = FitnessCalculator.barrierLocation-1;
		for (int i = 0; i < qucircuit.getLayers().size(); i++) {
			getOperationsFromLayer(qucircuit, idToGAV, paramCnt, qucircuit.getLayers().get(i), quantumOperation);	
			if (i == insertBarrierAfterLayer) quantumOperation.append(String.format("\n%s.barrier()\n", qucircuit.getName()));
		}		
		
		quantumCircuitDef.append(String.format("\n\nparams = ParameterVector(\"P\", %d)\n", idToGAV.size()));
		quantumCircuitDef.append(String.format("qc_params = np.random.random(%d)*np.pi*2\n", idToGAV.size()));

		
		return quantumRegisters.toString()
				+ classicRegisters.toString() + "\n"
				+ quantumCircuitDef.toString() + "\n"
				+ quantumOperation.toString() + "\n"
				+ String.format("overall = [%s, params, qc_params]\n", qucircuit.getName())
				+ String.format("res = fitness_from_qc(overall, settings, params=%s)", ((idToGAV.size() > 0) ? "True" : "False"));
	}
	
	private static void getOperationsFromLayer(QuantumCircuit qucircuit, Map<Integer, AngleParameterRef> idToGAV, AtomicInteger paramCnt, Layer l, StringBuilder quantumOperation) {
		for (QuantumOperation quOpe : l.getQuantumOperations()) {
			//Target Qubits
		
			//Append Operation
			if (quOpe instanceof ElementaryQuantumGate elementaryGate) {	
				quantumOperation.append("target_qubits =" + QiskitCodeGenerationUtils.indexes(quOpe.getTargetQubits())).append("\n");
				if (elementaryGate.getControlQubits().size() > 0) quantumOperation.append("control_qubits =" + QiskitCodeGenerationUtils.indexes(elementaryGate.getControlQubits())).append("\n");

				quantumOperation.append(generateElementaryQuantumGate(qucircuit, elementaryGate, idToGAV, paramCnt));
			} else if (quOpe instanceof CompositeQuantumGate compositeGate) {
				for (Layer subLayer : compositeGate.getLayers()) {
					getOperationsFromLayer(qucircuit, idToGAV, paramCnt, subLayer, quantumOperation);
				}
			}
		}			
	}

	private static String getScriptGateName(String modelGateName) {
		if (modelGateName.equals("Hadamard")) return "hadamard";
		if (modelGateName.equals("XGate")) return "x_gate";
		if (modelGateName.equals("YGate")) return "y_gate";
		if (modelGateName.equals("ZGate")) return "z_gate";
		if (modelGateName.equals("SXGate")) return "sx_gate";
		if (modelGateName.equals("TDGGate")) return "tdg_gate";
		if (modelGateName.equals("TGate")) return "t_gate";
		if (modelGateName.equals("RX")) return "rx_gate";
		if (modelGateName.equals("RY")) return "ry_gate";
		if (modelGateName.equals("RZ")) return "rz_gate";
		if (modelGateName.equals("UGate")) return "u_gate";
		if (modelGateName.equals("Swap")) return "swap";
		if (modelGateName.equals("CNot")) return "cnot";
		if (modelGateName.equals("CZ")) return "cz";
		if (modelGateName.equals("CY")) return "cy";
		if (modelGateName.equals("CH")) return "ch";
		if (modelGateName.equals("CSX")) return "csx";
		if (modelGateName.equals("ISwap")) return "iswap";	
		if (modelGateName.equals("RZZ")) return "rzz";	
		if (modelGateName.equals("RXX")) return "rxx";	
		if (modelGateName.equals("RYY")) return "ryy";	
		if (modelGateName.equals("CRX")) return "crx";	
		if (modelGateName.equals("CRY")) return "cry";	
		if (modelGateName.equals("CRZ")) return "crz";	
		if (modelGateName.equals("CU")) return "cu";
		if (modelGateName.equals("CP")) return "cp";	
		return null;
	}

	private static Object generateElementaryQuantumGate(QuantumCircuit qucircuit,
			ElementaryQuantumGate elementaryGate, Map<Integer, AngleParameterRef> idToGAV, AtomicInteger paramCnt) {
		var elementaryGateGeneration = new StringBuilder();
		EcoreUtil.resolveAll(elementaryGate.getOperations().get(0).getOperation());
		
		
		ConcreteQuantumOperation cqo = elementaryGate.getOperations().get(0).getOperation();
		String modelGateName = cqo.getName();
		if (modelGateName == null) {
			//extract from proxy uri
			String eProxyUri = ((InternalEObject) elementaryGate.getOperations().get(0).getOperation()).eProxyURI().toString();
			modelGateName = eProxyUri.substring(eProxyUri.lastIndexOf("#") + 1);
		}
	   
	    String scriptGateName =  getScriptGateName(modelGateName);

		switch (modelGateName) {
			case "TGate", "TDGGate", "SXGate", "ZGate", "YGate", "XGate", "Hadamard":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(target_qubits), target_qubits)");
				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(target_qubits), target_qubits)").append("\n");
				break;
			case "RX", "RY", "RZ":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(target_qubits, theta=params[" + paramCnt.get() + "]), target_qubits)");

				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(target_qubits, theta=params[" + paramCnt.get() + "]), target_qubits)").append("\n");
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("theta", elementaryGate.getAngleParameter()));
				break;
			case "UGate":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(theta=params[" + paramCnt.get() + "], phi=params[" + (paramCnt.get()+1) + "], lamb=params[" + (paramCnt.get()+2) + "]), control_qubits+target_qubits)");
				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(target_qubits, theta=params[" + paramCnt.get() + "], phi=params[" + (paramCnt.get()+1) + "], lamb=params[" + (paramCnt.get()+2) + "]), target_qubits)").append("\n");
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("theta", elementaryGate.getAngleParameter()));
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("phi", elementaryGate.getAngleParameter()));
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("lambda", elementaryGate.getAngleParameter()));
				break;
			case "Swap", "CNot", "CZ", "CY", "CH", "CSX", "ISwap":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(), control_qubits+target_qubits)");

				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(), control_qubits+target_qubits)").append("\n");
				break;
			case "RZZ", "RXX", "RYY", "CRX", "CRY", "CRZ", "CP":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(theta=params[" + paramCnt.get() + "]), control_qubits+target_qubits)");

				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(theta=params[" + paramCnt.get() + "]), control_qubits+target_qubits)").append("\n");
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("theta", elementaryGate.getAngleParameter()));
				break;
			case "CU":
//				System.out.println(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(theta=params[" + paramCnt.get() + "], phi=params[" + (paramCnt.get()+1) + "], lamb=params[" + (paramCnt.get()+2) + "]), control_qubits+target_qubits)");

				elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + scriptGateName +"(theta=params[" + paramCnt.get() + "], phi=params[" + (paramCnt.get()+1) + "], lamb=params[" + (paramCnt.get()+2) + "]), control_qubits+target_qubits)").append("\n");
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("theta", elementaryGate.getAngleParameter()));
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("phi", elementaryGate.getAngleParameter()));
				idToGAV.put(paramCnt.getAndIncrement(), AngleParameterRef.of("lambda", elementaryGate.getAngleParameter()));
				break;
		}
		//elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + gateName +"(target_qubits), target_qubits)").append("\n");
		return elementaryGateGeneration.toString();
	}
}
