package quantum.operation.contribution.elementaryquantumgate;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class CZ extends AbstractExtendElementaryQuantumGate {
	
public static final String PALETTE_ICON = "cz-gate.png";
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
	
}
