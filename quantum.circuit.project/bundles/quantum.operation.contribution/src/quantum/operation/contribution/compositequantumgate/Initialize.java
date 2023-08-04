package quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qubo.Qubo;
import qucircuit.CompositeQuantumGate;
import qucircuit.QuantumOperation;
import quope.QuantumOperationLibrary;


public class Initialize extends AbstractExtendCompositeQuantumGate {
	
	public static final String PALETTE_ICON = "init-block-gate.png";

	public Initialize() {
		// Do nothing
	}
			
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}

	@Override
	public void getCustomBlock(Qubo qubo, QuantumOperationLibrary quantumOpLib) {
		// TODO Auto-generated method stub
		
	}

	

}
