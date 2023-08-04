package quantum.circuit.qiskit.api;

import qucircuit.QuantumOperation;
//TODO is this necessary
public interface QiskitOperationGeneration {
	
	public String generateQiskitCode(QuantumOperation quOpe);
}
