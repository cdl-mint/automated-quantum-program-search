package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import qubo.Qubo;
import qucircuit.QucircuitPackage;
import quope.QuantumOperationLibrary;


public abstract class AbstractExtendCompositeQuantumGate extends LibraryQuantumGate {
	
	public abstract void getCustomBlock(Qubo qubo, QuantumOperationLibrary quantumOpLib);
	
	protected boolean reversible() {
		return true;
	}
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QucircuitPackage.eINSTANCE.getCompositeQuantumGate();
	}
}
