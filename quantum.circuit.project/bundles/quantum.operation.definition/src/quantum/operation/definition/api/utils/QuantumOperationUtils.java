package quantum.operation.definition.api.utils;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import quope.AbstractQuantumOperation;
import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quantum.operation.definition.EvaluateQuantumOperationsContributions;
import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;

public class QuantumOperationUtils {
	
	//Suppress default constructor for noninstantiability
	private QuantumOperationUtils() {
		throw new AssertionError();
	}
	
	public static String QUANTUM_OPERATION_NAME = "QuantumLibrary";
	
	public static QuantumOperationLibrary getAllQuantumOperations() {
		return new EvaluateQuantumOperationsContributions().execute(Platform.getExtensionRegistry());	
	}
	
	public static AbstractExtendCompositeQuantumGate getQuantumOperationByName(String name) {
		return new EvaluateQuantumOperationsContributions().getQuantumOperationByName(Platform.getExtensionRegistry(), name);	
	}
	
	public static ConcreteQuantumOperation getConcreteQuantumOperationByName(Collection<AbstractQuantumOperation> quantumOperations, String name) {
		var qOpe = quantumOperations.stream()
						.filter(ope -> ope.getName().equals(name) && ope instanceof ConcreteQuantumOperation)
						.map(ope -> (ConcreteQuantumOperation) ope)
						.findAny();
		if (qOpe.isPresent()) {
			return qOpe.get();
		}
		else
			return null;
	}	
	
	public static Resource saveLibraryConcreteQuantumOperation(URI libraryUri) {
		var reset = new ResourceSetImpl();
		var quOpeResource = reset.createResource(libraryUri);
		var quantumOpLib = QuantumOperationUtils.getAllQuantumOperations();
		quOpeResource.getContents().add(quantumOpLib);
		try {
			quOpeResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		return quOpeResource;
	}
}
