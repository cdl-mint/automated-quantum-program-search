package quantum.circuit.qiskit.measurement;

import quantum.circuit.qiskit.api.QiskitMeasurement;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.Measurement;
import qucircuit.QuantumCircuit;

public class MeasurementGeneration implements QiskitMeasurement{

	@Override
	public String generateCode(QuantumCircuit qucircuit, Measurement measurement) {
		var measurementOperation = new StringBuilder();
		measurementOperation.append("cbits=" + QiskitCodeGenerationUtils.indexes(measurement.getClassicBits())).append("\n");
		measurementOperation.append(qucircuit.getName() + ".append(m_gate.measurement(target_qubits,cbits), target_qubits, cbits)").append("\n");
		return measurementOperation.toString();
	}
	
}
