package quantum.operation.contribution.loops;

import quantum.operation.definition.api.AbstractLoopOperation;

public class Power2Loop extends AbstractLoopOperation {

	public Power2Loop() {
		// Do nothing
	}
	
	@Override
	public boolean allowsFixedControlQubits() {
		return false;
	}
	
	@Override
	public boolean allowsFixedTargetQubits() {
		return false;
	}
	
	@Override
	public boolean allowsControlQubitsIterationType() {
		return false;
	}
	
	@Override
	public boolean allowsTargetQubitsIterationType() {
		return false;
	}
	
	@Override
	public boolean allowsControlQubitsBlockSize() {
		return false;
	}
	
	@Override
	public boolean allowsTargetQubitsBlockSize() {
		return false;
	}
	
	@Override
	public boolean allowsIteration() {
		return false;
	}
	
	@Override
	public boolean allowsMultipleOperations() {
		return false;
	}

}
