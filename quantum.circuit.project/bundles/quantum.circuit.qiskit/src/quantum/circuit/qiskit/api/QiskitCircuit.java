package quantum.circuit.qiskit.api;

import qucircuit.QuantumCircuit;

public interface QiskitCircuit {
	
	public String generateCode(QuantumCircuit qucircuit);
	
}
