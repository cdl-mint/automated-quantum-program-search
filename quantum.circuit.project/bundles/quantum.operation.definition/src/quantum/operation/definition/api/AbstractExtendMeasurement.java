package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import qucircuit.QucircuitPackage;

public abstract class AbstractExtendMeasurement implements IGeneralOperationType {
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QucircuitPackage.eINSTANCE.getMeasurement();
	}
}
