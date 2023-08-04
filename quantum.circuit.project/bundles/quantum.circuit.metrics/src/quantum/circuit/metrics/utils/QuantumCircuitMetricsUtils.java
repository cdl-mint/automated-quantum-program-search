//package quantum.circuit.metrics.utils;
//
//import java.util.stream.Collectors;
//import java.util.Collection;
//import org.eclipse.emf.common.util.BasicEList;
//import org.eclipse.emf.common.util.EList;
//
//import quantum.operation.contribution.elementaryquantumgate.Hadamard;
//import qucircuit.AbstractQuantumGate;
//import qucircuit.CompositeQuantumGate;
//import qucircuit.Layer;
//import qucircuit.Measurement;
//import qucircuit.QuantumCircuit;
//import qucircuit.QuantumRegister;
//import qucircuit.Qubit;
//import quope.ConcreteQuantumOperation;
//
//public class QuantumCircuitMetricsUtils {
//	
//	//Suppress default constructor for noninstantiability
//	private QuantumCircuitMetricsUtils() {
//		throw new AssertionError();
//	}
//	
//	//Width: number of qubits in the circuit
//	public static Integer width(QuantumCircuit quCircuit) {
//		return quCircuit.getQuantumRegisters()
//				.stream()
//				.mapToInt(qr -> qr.getNumberOfQubits())
//				.sum()
//				;				
//	}
//	
//	//Depth: maximum number of operations applied to a qubit in the circuit (ignore Measurement Gates).
//	public static Integer depth(QuantumCircuit quCircuit) {
//		EList<Integer> quList = quCircuit.getQuantumRegisters()
//									.stream()
//									.map(QuantumRegister::getNumberOfQubits)
//									.flatMap(Collection::stream)
//									.collect(Collectors.toCollection(BasicEList::new));
//		return quList.stream()
//					.mapToInt(qubit -> numberOfOperations(quCircuit,qubit))
//					.max()
//					.orElse(0);		
//	}
//	
//	//Get the number of Operation of certain Qubit
//	public static Integer numberOfOperations(QuantumCircuit quCircuit, Qubit qubit) {
//		return quCircuit.getLayers()
//							.stream()
//							.map(Layer::getQuantumOperations)
//							.flatMap(Collection::stream)
//							.filter(quOpe -> (!(quOpe instanceof Measurement)))
//							.mapToInt(quOpe -> (quOpe.getTargetQubits().contains(qubit))?1:0)
//							.sum();	
//	}
//	
//	//Number of Hadamard 3
//	public static Integer numberOfHadamard(QuantumCircuit quCircuit) {
//		return quCircuit.getLayers()
//		 	.stream()
//		 	.map(Layer::getQuantumOperations)
//		 	.flatMap(Collection::stream)
//		 	.filter(quope -> quope.getOperation().getType().getName().equals(Hadamard.class.getName()))
//		 	.mapToInt(quope -> quope.getTargetQubits().size())
//		 	.sum()
//		 	;	
//	}
//	
//	//composed grover is Three time hadamard and AA + Oracle
//	//5
//	public static Integer totalNumberOfGates(QuantumCircuit quCircuit) {
//		return quCircuit.getLayers()
//			 	.stream()
//			 	.flatMap(l -> l.getQuantumOperations().stream())
//			 	.filter(AbstractQuantumGate.class::isInstance)
//			 	.mapToInt(quope -> quope.getTargetQubits().size())
//			 	.sum()			 	
//			 	;	
//	}	
//	
//	
//	public static Long totalNumberOfCompositeGates(QuantumCircuit quCircuit) {
//		return quCircuit.getLayers()
//			 	.stream()
//			 	.flatMap(l -> l.getQuantumOperations().stream())
//			 	.filter(CompositeQuantumGate.class::isInstance)
//			 	.count()
//			 	;	
//	}
//	
//}
