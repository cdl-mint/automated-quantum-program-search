package quantum.operation.contribution.loops;

import quantum.operation.definition.api.AbstractLoopOperation;

public class StaticLoop extends AbstractLoopOperation {

	public StaticLoop() {
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
	public boolean allowsIncrementControlQubits() {
		return false;
	}
	
	@Override
	public boolean allowsIncrementTargetQubits() {
		return false;
	}	
}
