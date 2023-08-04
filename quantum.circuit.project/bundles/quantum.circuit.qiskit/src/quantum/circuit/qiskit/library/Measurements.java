package quantum.circuit.qiskit.library;

import quantum.circuit.qiskit.api.QiskitLibrary;
import qucircuit.QuantumCircuit;

public class Measurements implements QiskitLibrary {

	@Override
	public String generateLibraryFile(QuantumCircuit quCircuit) {
		return """
				#Measurement Gates
				from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
				from qiskit.circuit import Gate
				import numpy as np
				from numpy.random import choice, random as rand, randint
				
				class MeasurementGate:
			    def __init__(self):
			        self.type="MeasurementGate"
			        
			    def measurement(self,target_qubits, cbits):
			        qc=QuantumCircuit(QuantumRegister(len(target_qubits)), ClassicalRegister(len(cbits)))
			        for i in range(len(cbits)):
			            qc.measure(target_qubits[i], cbits[i])
			        gate=qc.to_instruction()
			        return gate
				""";
	}
		
	

}
