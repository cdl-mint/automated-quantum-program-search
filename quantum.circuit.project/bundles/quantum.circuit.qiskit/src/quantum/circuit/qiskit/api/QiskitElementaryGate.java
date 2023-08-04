package quantum.circuit.qiskit.api;

import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumCircuit;

public interface QiskitElementaryGate {
	
	public String generateCode(QuantumCircuit qucircuit, ElementaryQuantumGate elementaryGate);
}
