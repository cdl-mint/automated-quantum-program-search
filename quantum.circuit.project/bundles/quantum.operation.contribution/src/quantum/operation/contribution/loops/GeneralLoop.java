package quantum.operation.contribution.loops;

import quantum.operation.definition.api.AbstractLoopOperation;

public class GeneralLoop extends AbstractLoopOperation {

	public GeneralLoop() {
		// Do nothing
	}
	
	@Override
	public boolean allowsMultipleOperations() {
		return false; 
	}

}
