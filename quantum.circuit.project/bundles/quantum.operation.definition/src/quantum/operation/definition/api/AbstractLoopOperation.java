package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import qucircuit.QucircuitPackage;

public class AbstractLoopOperation implements ILoopOperationLibrary{

	@Override
	public boolean allowsFixedControlQubits() {
		return true;
	}

	@Override
	public boolean allowsFixedTargetQubits() {
		return true;
	}

	@Override
	public boolean allowsControlQubitsIterationType() {
		return true;
	}

	@Override
	public boolean allowsTargetQubitsIterationType() {
		return true;
	}

	@Override
	public boolean allowsControlQubitsBlockSize() {
		return true;
	}

	@Override
	public boolean allowsTargetQubitsBlockSize() {
		return true;
	}

	@Override
	public boolean allowsIncrementControlQubits() {
		return true;
	}

	@Override
	public boolean allowsIncrementTargetQubits() {
		return true;
	}

	@Override
	public boolean allowsIteration() {
		return true;
	}

	@Override
	public boolean allowsMultipleOperations() {
		return true;
	}

}
