/**
 */
package qucircuit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qucircuit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QucircuitFactoryImpl extends EFactoryImpl implements QucircuitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QucircuitFactory init() {
		try {
			QucircuitFactory theQucircuitFactory = (QucircuitFactory)EPackage.Registry.INSTANCE.getEFactory(QucircuitPackage.eNS_URI);
			if (theQucircuitFactory != null) {
				return theQucircuitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QucircuitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QucircuitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QucircuitPackage.QUANTUM_CIRCUIT: return createQuantumCircuit();
			case QucircuitPackage.QUANTUM_REGISTER: return createQuantumRegister();
			case QucircuitPackage.CLASSIC_REGISTER: return createClassicRegister();
			case QucircuitPackage.LAYER: return createLayer();
			case QucircuitPackage.CLASSIC_CONTROL: return createClassicControl();
			case QucircuitPackage.STATE_PREPARATION: return createStatePreparation();
			case QucircuitPackage.MEASUREMENT: return createMeasurement();
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE: return createElementaryQuantumGate();
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE: return createCompositeQuantumGate();
			case QucircuitPackage.ANGLE_PARAMETER: return createAngleParameter();
			case QucircuitPackage.LOOP_OPERATION: return createLoopOperation();
			case QucircuitPackage.ELEMENT_SELECTOR: return createElementSelector();
			case QucircuitPackage.RANGE_SELECTOR: return createRangeSelector();
			case QucircuitPackage.OPERATION: return createOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QucircuitPackage.ITERATION_TYPE:
				return createITERATION_TYPEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QucircuitPackage.ITERATION_TYPE:
				return convertITERATION_TYPEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumCircuit createQuantumCircuit() {
		QuantumCircuitImpl quantumCircuit = new QuantumCircuitImpl();
		return quantumCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumRegister createQuantumRegister() {
		QuantumRegisterImpl quantumRegister = new QuantumRegisterImpl();
		return quantumRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicRegister createClassicRegister() {
		ClassicRegisterImpl classicRegister = new ClassicRegisterImpl();
		return classicRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicControl createClassicControl() {
		ClassicControlImpl classicControl = new ClassicControlImpl();
		return classicControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePreparation createStatePreparation() {
		StatePreparationImpl statePreparation = new StatePreparationImpl();
		return statePreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryQuantumGate createElementaryQuantumGate() {
		ElementaryQuantumGateImpl elementaryQuantumGate = new ElementaryQuantumGateImpl();
		return elementaryQuantumGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeQuantumGate createCompositeQuantumGate() {
		CompositeQuantumGateImpl compositeQuantumGate = new CompositeQuantumGateImpl();
		return compositeQuantumGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleParameter createAngleParameter() {
		AngleParameterImpl angleParameter = new AngleParameterImpl();
		return angleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperation createLoopOperation() {
		LoopOperationImpl loopOperation = new LoopOperationImpl();
		return loopOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSelector createElementSelector() {
		ElementSelectorImpl elementSelector = new ElementSelectorImpl();
		return elementSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSelector createRangeSelector() {
		RangeSelectorImpl rangeSelector = new RangeSelectorImpl();
		return rangeSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITERATION_TYPE createITERATION_TYPEFromString(EDataType eDataType, String initialValue) {
		ITERATION_TYPE result = ITERATION_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITERATION_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QucircuitPackage getQucircuitPackage() {
		return (QucircuitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QucircuitPackage getPackage() {
		return QucircuitPackage.eINSTANCE;
	}

} //QucircuitFactoryImpl
