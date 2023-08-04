package quantum.circuit.qiskit.library;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;

import quantum.circuit.qiskit.api.QiskitCircuit;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementaryQuantumGate;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;

public class GenerateLibrary implements QiskitCircuit{
	
	public static final String ELEMENTARY_IMPORT_LIBRARY = "e_gate=Elementary_Gates.ElementaryGate()";
	public static final String COMPOSITE_IMPORT_LIBRARY = "c_gate=Composite_Gates.CompositeGate()";
	public static final String LOOP_OPERATION_IMPORT_LIBRARY = "l_gate=Loop_Operations.LoopOperation()";
	public static final String MEASUREMENT_IMPORT_LIBRARY = "m_gate=Measurements.MeasurementGate()";
		
	@Override
	public String generateCode(QuantumCircuit qucircuit) {
		var librariesBuilder = new StringBuilder().append("\n");
		librariesBuilder.append("#Create objects for quantum operations").append("\n");
		var listOperations = qucircuit.getLayers().stream()
								.map(l -> l.getQuantumOperations())
								.flatMap(Collection::stream)
								.map(quOpe -> quOpe.getOperations())
								.flatMap(Collection::stream)
								.collect(Collectors.toCollection(ECollections::newBasicEList))
								;
		var mapOfLibraries = getMapLibraries();
		int size = mapOfLibraries.size();
		for (Operation ope : listOperations) {
			boolean isAdded = false;
			if (ope.getOperation().getType().getName().equals(ElementaryQuantumGate.class.getSimpleName())) {
				isAdded = addLibrary(librariesBuilder, mapOfLibraries, ELEMENTARY_IMPORT_LIBRARY);
			}
			else if (ope.getOperation().getType().getName().equals(CompositeQuantumGate.class.getSimpleName())) {
				isAdded = addLibrary(librariesBuilder, mapOfLibraries, COMPOSITE_IMPORT_LIBRARY);
			}
			else if (ope.getOperation().getType().getName().equals(Measurement.class.getSimpleName())) {
				isAdded = addLibrary(librariesBuilder, mapOfLibraries, MEASUREMENT_IMPORT_LIBRARY);
			}
			if (ope.eContainer() instanceof LoopOperation) {
				isAdded = addLibrary(librariesBuilder, mapOfLibraries, LOOP_OPERATION_IMPORT_LIBRARY);				
			}
			if (isAdded == true) {
				size--;
				if (size == 0) 
					break;
			}
		}		
		return librariesBuilder.toString();
	}	
	
	private boolean addLibrary(StringBuilder librariesBuilder, Map<String, Boolean> mapOfLibraries,
			String measurementImportLibrary) {
		var isAdded = mapOfLibraries.get(measurementImportLibrary);
		if (isAdded == false) {
			librariesBuilder.append(measurementImportLibrary).append("\n");
			mapOfLibraries.put(measurementImportLibrary, true);
			return true;
		}
		return false;		
	}

	public static Map<String,Boolean> getMapLibraries() {
		var mapOfLibraries = new HashMap<String,Boolean>();
		mapOfLibraries.put(ELEMENTARY_IMPORT_LIBRARY, false);
		mapOfLibraries.put(COMPOSITE_IMPORT_LIBRARY, false);
		mapOfLibraries.put(LOOP_OPERATION_IMPORT_LIBRARY, false);
		mapOfLibraries.put(MEASUREMENT_IMPORT_LIBRARY, false);
		return mapOfLibraries;
	}

}
