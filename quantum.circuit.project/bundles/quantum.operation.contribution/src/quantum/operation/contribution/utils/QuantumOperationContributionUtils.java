package quantum.operation.contribution.utils;

import org.eclipse.emf.common.util.URI;

import quope.AbstractQuantumOperation;
import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quantum.operation.contribution.elementaryquantumgate.CNOT;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.RZ;
import quantum.operation.definition.api.utils.QuantumOperationUtils;

public class QuantumOperationContributionUtils {
	
	public static final String ICONS_FOLDER = "icons";
	
	public static String PLUGIN_NAME = "quantum.operation.contribution";
	
	//Suppress default constructor for noninstantiability
	private QuantumOperationContributionUtils() {
		throw new AssertionError();
	}
	
	public static URI getIconURI(String iconFileName) {
		return URI.createPlatformPluginURI(PLUGIN_NAME + "/" + ICONS_FOLDER + "/" + iconFileName, false);
	}
	
	public static ConcreteQuantumOperation getHadamardOperation(QuantumOperationLibrary quantumOpLib) {
		 var operation = QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), Hadamard.class.getSimpleName());
		 return getConcreteQuantumOperation(operation);
	}

	public static ConcreteQuantumOperation getCNOTOperation(QuantumOperationLibrary quantumOpLib) {
		var operation = QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), CNOT.class.getSimpleName());
		return getConcreteQuantumOperation(operation);
	}
	
	public static ConcreteQuantumOperation getRZOperation(QuantumOperationLibrary quantumOpLib) {
		var operation =  QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), RZ.class.getSimpleName());
		return getConcreteQuantumOperation(operation);
	}
	
	private static ConcreteQuantumOperation getConcreteQuantumOperation(AbstractQuantumOperation abstractQuantumOpe) {
		if (abstractQuantumOpe instanceof ConcreteQuantumOperation concreteOperation)
			 return concreteOperation;
		 throw new IllegalAccessError("Not found ConcreteQuantumOperation");
	}
}
