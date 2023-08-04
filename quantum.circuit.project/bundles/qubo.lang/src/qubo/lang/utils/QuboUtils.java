package qubo.lang.utils;

import java.util.Random;

import org.eclipse.emf.ecore.util.EcoreUtil;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import qucircuit.ElementSelector;
import qucircuit.Layer;
import qucircuit.QucircuitFactory;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import quope.QuantumOperationLibrary;
import qubo.Qubo;

public class QuboUtils {
	
	public static QuantumCircuit createQuboCircuit(Qubo qubo, QuantumOperationLibrary quantumOpLib) {
		final var rz = QuantumOperationContributionUtils.getRZOperation(quantumOpLib);
		final var cnot = QuantumOperationContributionUtils.getCNOTOperation(quantumOpLib);	
		//Number of Qubits
		final int numberOfQubits = qubo.getMatrix().getRows().size();
		//Gamma value
		final double gamma = Math.PI * new Random().nextDouble();
		//Create the Circuit		
		final QuantumCircuit quCircuit = QucircuitFactory.eINSTANCE.createQuantumCircuit();
		quCircuit.setName("Generated-Qubo-Circuit");
		final QuantumRegister quRegister = QucircuitFactory.eINSTANCE.createQuantumRegister();
		quRegister.setNumberOfQubits(numberOfQubits);
		quRegister.setName("qr1");
		
//		final EList<Qubit> quBits = new BasicEList<Qubit>(numberOfQubits);
//		for (int i = 0; i < numberOfQubits; i++) {
//			quBits.add(QucircuitFactory.eINSTANCE.createQubit());			
//		}		
//		quRegister.getQubits().addAll(quBits);
		quCircuit.getQuantumRegisters().add(quRegister);	
		//Diagonal Rz
		final Layer diagonalRzLayer = QucircuitFactory.eINSTANCE.createLayer();		
		diagonalRzLayer.setName("L1");
		for (int i = 0; i < numberOfQubits; i++) {
			var quOpeDiagonalRz = QucircuitFactory.eINSTANCE.createElementaryQuantumGate();
			quOpeDiagonalRz.setName("RZ");
			var operationRZ = QucircuitFactory.eINSTANCE.createOperation();
			operationRZ.setOperation(rz);
			quOpeDiagonalRz.getOperations().add(operationRZ);
			//Set angle
			var parameter =  QucircuitFactory.eINSTANCE.createAngleParameter();
			parameter.setTheta(2*gamma*qubo.getMatrix().getRows().get(i).getColumns().get(0).getValue());
			//Set Parameter
			quOpeDiagonalRz.setAngleParameter(parameter);
			//Create IndexInt
			ElementSelector qubitIndex = QucircuitFactory.eINSTANCE.createElementSelector();
			qubitIndex.setIndex(i);
			//Set Qubit
			quOpeDiagonalRz.getTargetQubits().add(qubitIndex);
			//add to Diagonal Layer
			diagonalRzLayer.getQuantumOperations().add(quOpeDiagonalRz);
			for (int j = 1; j < qubo.getMatrix().getRows().get(i).getColumns().size(); j++) {
				final Layer cnotLayer = QucircuitFactory.eINSTANCE.createLayer();
				cnotLayer.setName("CNOTLayer" + i + j);
				var quOpeCNotBegin = QucircuitFactory.eINSTANCE.createElementaryQuantumGate();
				quOpeCNotBegin.setName("quOpeCNotBegin" + i + j);
				var operationCNOT = QucircuitFactory.eINSTANCE.createOperation();
				operationCNOT.setOperation(cnot);
				quOpeCNotBegin.getOperations().add(operationCNOT);
				//CreateIndex Target Qubit
				ElementSelector targetQubitIndex = QucircuitFactory.eINSTANCE.createElementSelector();
				targetQubitIndex.setIndex(j);
				quOpeCNotBegin.getTargetQubits().add(targetQubitIndex);
				//CreateIndex Control Qubit
				ElementSelector controlQubitIndex = QucircuitFactory.eINSTANCE.createElementSelector();
				controlQubitIndex.setIndex(i);			
				quOpeCNotBegin.getControlQubits().add(controlQubitIndex);
				cnotLayer.getQuantumOperations().add(quOpeCNotBegin);
				quCircuit.getLayers().add(cnotLayer);
				final Layer rzLayer = QucircuitFactory.eINSTANCE.createLayer();
				rzLayer.setName("rzLayer" + i + j);
				var quOpeRz = QucircuitFactory.eINSTANCE.createElementaryQuantumGate();
				quOpeRz.setName("quOpeRz" + i +j);
				var operationRZ1 = QucircuitFactory.eINSTANCE.createOperation();
				operationRZ1.setOperation(rz);
				quOpeRz.getOperations().add(operationRZ1);
				//CreateIndex RZ Target Qubit
				ElementSelector targetRzQubitIndex = QucircuitFactory.eINSTANCE.createElementSelector();
				targetRzQubitIndex.setIndex(j);
				quOpeRz.getTargetQubits().add(targetRzQubitIndex);
				//Set angle
				var parameterRZ =  QucircuitFactory.eINSTANCE.createAngleParameter();
				parameterRZ.setTheta(2*gamma*qubo.getMatrix().getRows().get(i).getColumns().get(j).getValue());
				//Set Parameter
				quOpeRz.setAngleParameter(parameterRZ);
				rzLayer.getQuantumOperations().add(quOpeRz);
				quCircuit.getLayers().add(rzLayer);
				quCircuit.getLayers().add(EcoreUtil.copy(cnotLayer));
			}			
		}
		quCircuit.getLayers().add(diagonalRzLayer);
		return quCircuit;		
	}
}
