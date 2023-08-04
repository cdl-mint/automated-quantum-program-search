/*
 * generated by Xtext 2.31.0
 */
package quantum.circuit.lang.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import quantum.circuit.lang.services.QuCircuitGrammarAccess;
import qucircuit.AngleParameter;
import qucircuit.ClassicRegister;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementSelector;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import qucircuit.QucircuitPackage;
import qucircuit.RangeSelector;
import qucircuit.StatePreparation;

@SuppressWarnings("all")
public class QuCircuitSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuCircuitGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QucircuitPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QucircuitPackage.ANGLE_PARAMETER:
				sequence_AngleParameter(context, (AngleParameter) semanticObject); 
				return; 
			case QucircuitPackage.CLASSIC_REGISTER:
				sequence_ClassicRegister(context, (ClassicRegister) semanticObject); 
				return; 
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE:
				sequence_CompositeQuantumGate(context, (CompositeQuantumGate) semanticObject); 
				return; 
			case QucircuitPackage.ELEMENT_SELECTOR:
				sequence_ElementSelector(context, (ElementSelector) semanticObject); 
				return; 
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE:
				sequence_ElementaryQuantumGate(context, (ElementaryQuantumGate) semanticObject); 
				return; 
			case QucircuitPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case QucircuitPackage.LOOP_OPERATION:
				sequence_Loop(context, (LoopOperation) semanticObject); 
				return; 
			case QucircuitPackage.MEASUREMENT:
				sequence_Measurement(context, (Measurement) semanticObject); 
				return; 
			case QucircuitPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case QucircuitPackage.QUANTUM_CIRCUIT:
				sequence_QuantumCircuit(context, (QuantumCircuit) semanticObject); 
				return; 
			case QucircuitPackage.QUANTUM_REGISTER:
				sequence_QuantumRegister(context, (QuantumRegister) semanticObject); 
				return; 
			case QucircuitPackage.RANGE_SELECTOR:
				sequence_RangeSelector(context, (RangeSelector) semanticObject); 
				return; 
			case QucircuitPackage.STATE_PREPARATION:
				sequence_StatePreparation(context, (StatePreparation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AngleParameter returns AngleParameter
	 *
	 * Constraint:
	 *     (theta=EDoubleObject? phi=EDoubleObject? lambda=EDoubleObject?)
	 * </pre>
	 */
	protected void sequence_AngleParameter(ISerializationContext context, AngleParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ClassicRegister returns ClassicRegister
	 *
	 * Constraint:
	 *     (name=EString numberOfBits=INT?)
	 * </pre>
	 */
	protected void sequence_ClassicRegister(ISerializationContext context, ClassicRegister semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumOperation returns CompositeQuantumGate
	 *     CompositeQuantumGate returns CompositeQuantumGate
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         inverseForm?='inverseForm'? 
	 *         operations+=Operation? 
	 *         targetQubits+=Selector 
	 *         targetQubits+=Selector* 
	 *         (controlQubits+=Selector controlQubits+=Selector*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompositeQuantumGate(ISerializationContext context, CompositeQuantumGate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Selector returns ElementSelector
	 *     ElementSelector returns ElementSelector
	 *
	 * Constraint:
	 *     (register=[Register|EString]? index=INT)
	 * </pre>
	 */
	protected void sequence_ElementSelector(ISerializationContext context, ElementSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumOperation returns ElementaryQuantumGate
	 *     ElementaryQuantumGate returns ElementaryQuantumGate
	 *
	 * Constraint:
	 *     (
	 *         inverseForm?='inverseForm'? 
	 *         name=EString 
	 *         operations+=Operation? 
	 *         targetQubits+=Selector 
	 *         targetQubits+=Selector* 
	 *         (controlQubits+=Selector controlQubits+=Selector*)* 
	 *         angleParameter=AngleParameter?
	 *     )
	 * </pre>
	 */
	protected void sequence_ElementaryQuantumGate(ISerializationContext context, ElementaryQuantumGate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Layer returns Layer
	 *
	 * Constraint:
	 *     (name=EString quantumOperations+=QuantumOperation quantumOperations+=QuantumOperation*)
	 * </pre>
	 */
	protected void sequence_Layer(ISerializationContext context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumOperation returns LoopOperation
	 *     Loop returns LoopOperation
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         inverseForm?='inverseForm'? 
	 *         incrementBlockTargetQubits?='incrementBlockTargetQubits'? 
	 *         incrementBlockControlQubits?='incrementBlockControlQubits'? 
	 *         iterations=INT? 
	 *         incrementTargetQubits?='incrementTargetQubits'? 
	 *         incrementControlQubits?='incrementControlQubits'? 
	 *         targetQubitsBlockSize=INT? 
	 *         controlQubitsBlockSize=INT? 
	 *         controlQubitsIterationType=ITERATION_TYPE? 
	 *         targetQubitsIterationType=ITERATION_TYPE? 
	 *         incrementBy=INT? 
	 *         (operations+=Operation operations+=Operation*)? 
	 *         targetQubits+=Selector 
	 *         targetQubits+=Selector* 
	 *         (controlQubits+=Selector controlQubits+=Selector*)? 
	 *         (fixedControlQubits+=Selector fixedControlQubits+=Selector*)? 
	 *         (fixedTargetQubits+=Selector fixedTargetQubits+=Selector*)? 
	 *         loop=[ConcreteLoopOperation|EString] 
	 *         loopTargetQubits+=Selector 
	 *         loopTargetQubits+=Selector* 
	 *         (loopControlQubits+=Selector loopControlQubits+=Selector*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Loop(ISerializationContext context, LoopOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumOperation returns Measurement
	 *     Measurement returns Measurement
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         operations+=Operation? 
	 *         targetQubits+=Selector 
	 *         targetQubits+=Selector* 
	 *         classicBits+=Selector 
	 *         classicBits+=Selector*
	 *     )
	 * </pre>
	 */
	protected void sequence_Measurement(ISerializationContext context, Measurement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation=[ConcreteQuantumOperation|EString] qubo=[Qubo|EString]?)
	 * </pre>
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumCircuit returns QuantumCircuit
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         quantumRegisters+=QuantumRegister 
	 *         quantumRegisters+=QuantumRegister* 
	 *         classicRegisters+=ClassicRegister* 
	 *         layers+=Layer 
	 *         layers+=Layer*
	 *     )
	 * </pre>
	 */
	protected void sequence_QuantumCircuit(ISerializationContext context, QuantumCircuit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumRegister returns QuantumRegister
	 *
	 * Constraint:
	 *     (name=EString numberOfQubits=INT?)
	 * </pre>
	 */
	protected void sequence_QuantumRegister(ISerializationContext context, QuantumRegister semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Selector returns RangeSelector
	 *     RangeSelector returns RangeSelector
	 *
	 * Constraint:
	 *     (register=[Register|EString]? begin=INT end=INT)
	 * </pre>
	 */
	protected void sequence_RangeSelector(ISerializationContext context, RangeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantumOperation returns StatePreparation
	 *     StatePreparation returns StatePreparation
	 *
	 * Constraint:
	 *     (name=EString operations+=Operation operations+=Operation* targetQubits+=Selector targetQubits+=Selector*)
	 * </pre>
	 */
	protected void sequence_StatePreparation(ISerializationContext context, StatePreparation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
