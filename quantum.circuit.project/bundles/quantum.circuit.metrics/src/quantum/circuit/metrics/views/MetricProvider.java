//package quantum.circuit.metrics.views;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import quantum.circuit.metrics.utils.QuantumCircuitMetricsUtils;
//import qucircuit.QuantumCircuit;
//
//public class MetricProvider {
//    
//	private List<Metric> metrics;    
//
//    public MetricProvider(QuantumCircuit quCircuit) {
//    	metrics = new ArrayList<Metric>();
//        // Image here some fancy database access to read the persons and to
//        // put them into the model
//    	metrics.add(new Metric("Width", QuantumCircuitMetricsUtils.width(quCircuit).toString(),
//    			"Number of qubits used in the circuit"));
//    	metrics.add(new Metric("Depth", QuantumCircuitMetricsUtils.depth(quCircuit).toString(), 
//    			"Maximum number of operations applied to a qubit used in the circuit."));  
//    	metrics.add(new Metric("NoH", QuantumCircuitMetricsUtils.numberOfHadamard(quCircuit).toString(), ""));
//    	metrics.add(new Metric("NoGates", QuantumCircuitMetricsUtils.totalNumberOfGates(quCircuit).toString(), ""));
//    	metrics.add(new Metric("NoCompQG", QuantumCircuitMetricsUtils.totalNumberOfCompositeGates(quCircuit).toString(),""));
//    }
//
//	public List<Metric> getMetrics() {
//        return metrics;
//    }
//
//}
