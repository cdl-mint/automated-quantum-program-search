package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import quope.Parameter;
import qucircuit.QucircuitPackage;

public abstract class AbstractExtendElementaryQuantumGate extends LibraryQuantumGate {
	
	protected boolean hasParameters() {
		return false;
	}
	
	protected Parameter getParameterConfiguration() {
		return null;
	}
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QucircuitPackage.eINSTANCE.getElementaryQuantumGate();
	}	
}
