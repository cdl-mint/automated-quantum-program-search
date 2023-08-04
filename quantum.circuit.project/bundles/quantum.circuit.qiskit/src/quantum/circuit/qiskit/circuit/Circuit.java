package quantum.circuit.qiskit.circuit;

import quantum.circuit.qiskit.api.QiskitCircuit;
import quantum.circuit.qiskit.elementary.gate.ElementaryGateGeneration;
import quantum.circuit.qiskit.library.GenerateLibrary;
import quantum.circuit.qiskit.loop.LoopGeneration;
import quantum.circuit.qiskit.measurement.MeasurementGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.ClassicRegister;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;

public class Circuit implements QiskitCircuit {

	@Override
	public String generateCode(QuantumCircuit qucircuit) {
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
				.append("=QuantumRegister(" + cr.getNumberOfBits() + ")")
				.append("\n");
			quantumCircuitDef.append(cr.getName() + ",");
		}	
		//Delete the last comma
		quantumCircuitDef.deleteCharAt(quantumCircuitDef.length() - 1);
		quantumCircuitDef. append(")");
		
		//Include the necessary libraries
		var objectQuantumOperations = new GenerateLibrary().generateCode(qucircuit); 
		var quantumOperation = new StringBuilder();
		
		for (Layer l : qucircuit.getLayers()) {
			for (QuantumOperation quOpe : l.getQuantumOperations()) {
				//Target Qubits
				quantumOperation.append("target_qubits =" + QiskitCodeGenerationUtils.indexes(quOpe.getTargetQubits())).append("\n");
				//Append Operation
				if (quOpe instanceof ElementaryQuantumGate elementaryGate) {
					quantumOperation.append(new ElementaryGateGeneration().generateCode(qucircuit, elementaryGate));
				}
				else if (quOpe instanceof Measurement measurement) {
					quantumOperation.append(new MeasurementGeneration().generateCode(qucircuit, measurement));
				}
				else if (quOpe instanceof LoopOperation loopOperation) {
					quantumOperation.append(new LoopGeneration().generateCode(qucircuit, loopOperation));
				}
			}		
			
		}		
		
		return """
				from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
				from qiskit.circuit import Gate
				import numpy as np
				#Import Library 			
				import Composite_Gates
				import Loop_Operations
				import Measurements
				import Elementary_Gates
				#Create empty Quantum Circuit				
				""" 
				+ quantumRegisters.toString()
				+ classicRegisters.toString()
				+ quantumCircuitDef.toString()
				+ objectQuantumOperations
				+ quantumOperation.toString()
				;
	}

	
	
	

}
