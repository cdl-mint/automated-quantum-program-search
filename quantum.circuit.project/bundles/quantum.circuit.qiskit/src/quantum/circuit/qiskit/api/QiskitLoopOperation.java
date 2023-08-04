package quantum.circuit.qiskit.api;

import qucircuit.LoopOperation;
import qucircuit.QuantumCircuit;

public interface QiskitLoopOperation {
	
	public String generateCode(QuantumCircuit qucircuit, LoopOperation loopOperation);
}
