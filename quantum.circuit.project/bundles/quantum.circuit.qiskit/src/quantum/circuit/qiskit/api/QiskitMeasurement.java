package quantum.circuit.qiskit.api;

import qucircuit.Measurement;
import qucircuit.QuantumCircuit;

public interface QiskitMeasurement {
	
	public String generateCode(QuantumCircuit qucircuit, Measurement measurement);
}
