package quantum.operation.contribution.compositequantumgate;

import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qubo.Qubo;
import quope.QuantumOperationLibrary;

public class CostUnitary extends AbstractExtendCompositeQuantumGate {

	public CostUnitary() {
		// Do nothing
	}
	
	public boolean qiskitCode() {
		return false;
	}
	
	@Override
	public void getCustomBlock(Qubo qubo, QuantumOperationLibrary quantumOpLib) {
		
		
		// TODO Auto-generated method stub
		System.out.println("implement");
	}
	
}
