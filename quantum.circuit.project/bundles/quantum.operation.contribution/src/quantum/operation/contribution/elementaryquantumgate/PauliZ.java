package quantum.operation.contribution.elementaryquantumgate;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class PauliZ extends AbstractExtendElementaryQuantumGate {

	public static final String PALETTE_ICON = "multicontrolledz-gate.png";//TODO only Z..
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
}
