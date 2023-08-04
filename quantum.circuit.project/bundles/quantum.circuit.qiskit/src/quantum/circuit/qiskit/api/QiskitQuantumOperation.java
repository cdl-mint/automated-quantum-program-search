package quantum.circuit.qiskit.api;

import qucircuit.QuantumOperation;

public interface QiskitQuantumOperation {
	
	public String generateCode(QuantumOperation quOpe);
}
