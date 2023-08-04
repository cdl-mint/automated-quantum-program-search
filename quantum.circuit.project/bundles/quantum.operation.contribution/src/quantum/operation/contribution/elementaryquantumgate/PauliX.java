package quantum.operation.contribution.elementaryquantumgate;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class PauliX extends AbstractExtendElementaryQuantumGate {

public static final String PALETTE_ICON = "x-gate.png";
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
}
