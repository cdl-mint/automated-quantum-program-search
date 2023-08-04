package quantum.operation.definition.api;

import quope.FixedQuantumOperation;
import quope.Parameter;

public abstract class LibraryQuantumGate implements IGeneralOperationType {

	public FixedQuantumOperation getFixedQuantumOperators() {
		return null;
	}
	
	public Parameter getParameter() {
		return null;
	}
	
	@Override
	public String getPaletteIconPath() {
		return "";
	}

	@Override
	public String getStyleIconPath() {
		return "";
	}

	@Override
	public String getReverseConcreteQuantumOperation() {
		return "";
	}	
}
