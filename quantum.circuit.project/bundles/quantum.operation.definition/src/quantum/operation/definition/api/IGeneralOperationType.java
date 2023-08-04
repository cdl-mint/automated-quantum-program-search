package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

public interface IGeneralOperationType {	
	
	//Palette icon path
	public String getPaletteIconPath();
	//Style icon path
	public String getStyleIconPath();
	//Name of the Reverse Quantum Gate
	public String getReverseConcreteQuantumOperation();//TODO is this true? Should be a list of gates right?
	//Get the AbstractQuantumGate (QuantumGate, CustomBlock, StatePreparation or Measurement)
	public EClass getAbstractQuantumGate();	
}
