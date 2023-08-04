/**
 */
package qucircuit.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qubo.QuboPackage;

import qucircuit.AbstractCompositeGate;
import qucircuit.AbstractQuantumGate;
import qucircuit.AngleParameter;
import qucircuit.ClassicControl;
import qucircuit.ClassicRegister;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementSelector;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.NamedElement;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;
import qucircuit.QucircuitFactory;
import qucircuit.QucircuitPackage;
import qucircuit.RangeSelector;
import qucircuit.Register;
import qucircuit.Selector;
import qucircuit.StatePreparation;

import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QucircuitPackageImpl extends EPackageImpl implements QucircuitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statePreparationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCompositeGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iteratioN_TYPEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qucircuit.QucircuitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QucircuitPackageImpl() {
		super(eNS_URI, QucircuitFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QucircuitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QucircuitPackage init() {
		if (isInited) return (QucircuitPackage)EPackage.Registry.INSTANCE.getEPackage(QucircuitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQucircuitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QucircuitPackageImpl theQucircuitPackage = registeredQucircuitPackage instanceof QucircuitPackageImpl ? (QucircuitPackageImpl)registeredQucircuitPackage : new QucircuitPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		QuopePackage.eINSTANCE.eClass();
		QuboPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQucircuitPackage.createPackageContents();

		// Initialize created meta-data
		theQucircuitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQucircuitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QucircuitPackage.eNS_URI, theQucircuitPackage);
		return theQucircuitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumCircuit() {
		return quantumCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_QuantumRegisters() {
		return (EReference)quantumCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_ClassicRegisters() {
		return (EReference)quantumCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_Layers() {
		return (EReference)quantumCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumCircuit_NrOfGates() {
		return (EAttribute)quantumCircuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumCircuit_Depth() {
		return (EAttribute)quantumCircuitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumCircuit_NrOfNonlocalGates() {
		return (EAttribute)quantumCircuitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumCircuit_NrOfParams() {
		return (EAttribute)quantumCircuitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumCircuit_Overlap() {
		return (EAttribute)quantumCircuitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumRegister() {
		return quantumRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantumRegister_NumberOfQubits() {
		return (EAttribute)quantumRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicRegister() {
		return classicRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassicRegister_NumberOfBits() {
		return (EAttribute)classicRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_QuantumOperations() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicControl() {
		return classicControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassicControl_Value() {
		return (EAttribute)classicControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassicControl_ClassicRegister() {
		return (EReference)classicControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumOperation() {
		return quantumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_ClassicControl() {
		return (EReference)quantumOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_Operations() {
		return (EReference)quantumOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_TargetQubits() {
		return (EReference)quantumOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQuantumGate() {
		return abstractQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractQuantumGate_ControlQubits() {
		return (EReference)abstractQuantumGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractQuantumGate_InverseForm() {
		return (EAttribute)abstractQuantumGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatePreparation() {
		return statePreparationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_ClassicBits() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryQuantumGate() {
		return elementaryQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryQuantumGate_AngleParameter() {
		return (EReference)elementaryQuantumGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeQuantumGate() {
		return compositeQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleParameter() {
		return angleParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Theta() {
		return (EAttribute)angleParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Phi() {
		return (EAttribute)angleParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Lambda() {
		return (EAttribute)angleParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCompositeGate() {
		return abstractCompositeGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCompositeGate_Layers() {
		return (EReference)abstractCompositeGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopOperation() {
		return loopOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_Iterations() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOperation_FixedControlQubits() {
		return (EReference)loopOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOperation_FixedTargetQubits() {
		return (EReference)loopOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOperation_Loop() {
		return (EReference)loopOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_IncrementControlQubits() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_IncrementTargetQubits() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOperation_LoopTargetQubits() {
		return (EReference)loopOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopOperation_LoopControlQubits() {
		return (EReference)loopOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_TargetQubitsBlockSize() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_ControlQubitsBlockSize() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_ControlQubitsIterationType() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_TargetQubitsIterationType() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_IncrementBlockTargetQubits() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_IncrementBlockControlQubits() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopOperation_IncrementBy() {
		return (EAttribute)loopOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_Register() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSelector() {
		return elementSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSelector_Index() {
		return (EAttribute)elementSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSelector() {
		return rangeSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeSelector_Begin() {
		return (EAttribute)rangeSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeSelector_End() {
		return (EAttribute)rangeSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Qubo() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Operation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getITERATION_TYPE() {
		return iteratioN_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QucircuitFactory getQucircuitFactory() {
		return (QucircuitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		quantumCircuitEClass = createEClass(QUANTUM_CIRCUIT);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__QUANTUM_REGISTERS);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__CLASSIC_REGISTERS);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__LAYERS);
		createEAttribute(quantumCircuitEClass, QUANTUM_CIRCUIT__NR_OF_GATES);
		createEAttribute(quantumCircuitEClass, QUANTUM_CIRCUIT__DEPTH);
		createEAttribute(quantumCircuitEClass, QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES);
		createEAttribute(quantumCircuitEClass, QUANTUM_CIRCUIT__NR_OF_PARAMS);
		createEAttribute(quantumCircuitEClass, QUANTUM_CIRCUIT__OVERLAP);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		quantumRegisterEClass = createEClass(QUANTUM_REGISTER);
		createEAttribute(quantumRegisterEClass, QUANTUM_REGISTER__NUMBER_OF_QUBITS);

		classicRegisterEClass = createEClass(CLASSIC_REGISTER);
		createEAttribute(classicRegisterEClass, CLASSIC_REGISTER__NUMBER_OF_BITS);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__QUANTUM_OPERATIONS);

		classicControlEClass = createEClass(CLASSIC_CONTROL);
		createEAttribute(classicControlEClass, CLASSIC_CONTROL__VALUE);
		createEReference(classicControlEClass, CLASSIC_CONTROL__CLASSIC_REGISTER);

		quantumOperationEClass = createEClass(QUANTUM_OPERATION);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__CLASSIC_CONTROL);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__OPERATIONS);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__TARGET_QUBITS);

		abstractQuantumGateEClass = createEClass(ABSTRACT_QUANTUM_GATE);
		createEReference(abstractQuantumGateEClass, ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS);
		createEAttribute(abstractQuantumGateEClass, ABSTRACT_QUANTUM_GATE__INVERSE_FORM);

		statePreparationEClass = createEClass(STATE_PREPARATION);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__CLASSIC_BITS);

		elementaryQuantumGateEClass = createEClass(ELEMENTARY_QUANTUM_GATE);
		createEReference(elementaryQuantumGateEClass, ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER);

		compositeQuantumGateEClass = createEClass(COMPOSITE_QUANTUM_GATE);

		angleParameterEClass = createEClass(ANGLE_PARAMETER);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__THETA);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__PHI);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__LAMBDA);

		abstractCompositeGateEClass = createEClass(ABSTRACT_COMPOSITE_GATE);
		createEReference(abstractCompositeGateEClass, ABSTRACT_COMPOSITE_GATE__LAYERS);

		loopOperationEClass = createEClass(LOOP_OPERATION);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__ITERATIONS);
		createEReference(loopOperationEClass, LOOP_OPERATION__FIXED_CONTROL_QUBITS);
		createEReference(loopOperationEClass, LOOP_OPERATION__FIXED_TARGET_QUBITS);
		createEReference(loopOperationEClass, LOOP_OPERATION__LOOP);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__INCREMENT_CONTROL_QUBITS);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__INCREMENT_TARGET_QUBITS);
		createEReference(loopOperationEClass, LOOP_OPERATION__LOOP_TARGET_QUBITS);
		createEReference(loopOperationEClass, LOOP_OPERATION__LOOP_CONTROL_QUBITS);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS);
		createEAttribute(loopOperationEClass, LOOP_OPERATION__INCREMENT_BY);

		selectorEClass = createEClass(SELECTOR);
		createEReference(selectorEClass, SELECTOR__REGISTER);

		elementSelectorEClass = createEClass(ELEMENT_SELECTOR);
		createEAttribute(elementSelectorEClass, ELEMENT_SELECTOR__INDEX);

		rangeSelectorEClass = createEClass(RANGE_SELECTOR);
		createEAttribute(rangeSelectorEClass, RANGE_SELECTOR__BEGIN);
		createEAttribute(rangeSelectorEClass, RANGE_SELECTOR__END);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__QUBO);
		createEReference(operationEClass, OPERATION__OPERATION);

		registerEClass = createEClass(REGISTER);

		// Create enums
		iteratioN_TYPEEEnum = createEEnum(ITERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		QuopePackage theQuopePackage = (QuopePackage)EPackage.Registry.INSTANCE.getEPackage(QuopePackage.eNS_URI);
		QuboPackage theQuboPackage = (QuboPackage)EPackage.Registry.INSTANCE.getEPackage(QuboPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantumCircuitEClass.getESuperTypes().add(this.getNamedElement());
		quantumRegisterEClass.getESuperTypes().add(this.getRegister());
		classicRegisterEClass.getESuperTypes().add(this.getRegister());
		layerEClass.getESuperTypes().add(this.getNamedElement());
		quantumOperationEClass.getESuperTypes().add(this.getNamedElement());
		abstractQuantumGateEClass.getESuperTypes().add(this.getQuantumOperation());
		statePreparationEClass.getESuperTypes().add(this.getQuantumOperation());
		measurementEClass.getESuperTypes().add(this.getQuantumOperation());
		elementaryQuantumGateEClass.getESuperTypes().add(this.getAbstractQuantumGate());
		compositeQuantumGateEClass.getESuperTypes().add(this.getAbstractCompositeGate());
		abstractCompositeGateEClass.getESuperTypes().add(this.getAbstractQuantumGate());
		loopOperationEClass.getESuperTypes().add(this.getAbstractCompositeGate());
		elementSelectorEClass.getESuperTypes().add(this.getSelector());
		rangeSelectorEClass.getESuperTypes().add(this.getSelector());
		registerEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(quantumCircuitEClass, QuantumCircuit.class, "QuantumCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumCircuit_QuantumRegisters(), this.getQuantumRegister(), null, "quantumRegisters", null, 1, -1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumCircuit_ClassicRegisters(), this.getClassicRegister(), null, "classicRegisters", null, 0, -1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumCircuit_Layers(), this.getLayer(), null, "layers", null, 0, -1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantumCircuit_NrOfGates(), theEcorePackage.getEInt(), "nrOfGates", null, 0, 1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantumCircuit_Depth(), theEcorePackage.getEInt(), "depth", null, 0, 1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantumCircuit_NrOfNonlocalGates(), theEcorePackage.getEInt(), "nrOfNonlocalGates", null, 0, 1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantumCircuit_NrOfParams(), theEcorePackage.getEInt(), "nrOfParams", null, 0, 1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantumCircuit_Overlap(), theEcorePackage.getEDouble(), "overlap", null, 0, 1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantumRegisterEClass, QuantumRegister.class, "QuantumRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantumRegister_NumberOfQubits(), ecorePackage.getEIntegerObject(), "numberOfQubits", null, 0, 1, QuantumRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classicRegisterEClass, ClassicRegister.class, "ClassicRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassicRegister_NumberOfBits(), ecorePackage.getEIntegerObject(), "numberOfBits", null, 0, 1, ClassicRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_QuantumOperations(), this.getQuantumOperation(), null, "quantumOperations", null, 1, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classicControlEClass, ClassicControl.class, "ClassicControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassicControl_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, ClassicControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassicControl_ClassicRegister(), this.getClassicRegister(), null, "classicRegister", null, 1, 1, ClassicControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantumOperationEClass, QuantumOperation.class, "QuantumOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumOperation_ClassicControl(), this.getClassicControl(), null, "classicControl", null, 0, 1, QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumOperation_Operations(), this.getOperation(), null, "operations", null, 1, -1, QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumOperation_TargetQubits(), this.getSelector(), null, "targetQubits", null, 1, -1, QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQuantumGateEClass, AbstractQuantumGate.class, "AbstractQuantumGate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractQuantumGate_ControlQubits(), this.getSelector(), null, "controlQubits", null, 0, -1, AbstractQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractQuantumGate_InverseForm(), ecorePackage.getEBooleanObject(), "inverseForm", "false", 0, 1, AbstractQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statePreparationEClass, StatePreparation.class, "StatePreparation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_ClassicBits(), this.getSelector(), null, "classicBits", null, 1, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryQuantumGateEClass, ElementaryQuantumGate.class, "ElementaryQuantumGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryQuantumGate_AngleParameter(), this.getAngleParameter(), null, "angleParameter", null, 0, 1, ElementaryQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeQuantumGateEClass, CompositeQuantumGate.class, "CompositeQuantumGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleParameterEClass, AngleParameter.class, "AngleParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngleParameter_Theta(), ecorePackage.getEDoubleObject(), "theta", null, 0, 1, AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngleParameter_Phi(), ecorePackage.getEDoubleObject(), "phi", null, 0, 1, AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngleParameter_Lambda(), ecorePackage.getEDoubleObject(), "lambda", null, 0, 1, AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCompositeGateEClass, AbstractCompositeGate.class, "AbstractCompositeGate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCompositeGate_Layers(), this.getLayer(), null, "layers", null, 0, -1, AbstractCompositeGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopOperationEClass, LoopOperation.class, "LoopOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoopOperation_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOperation_FixedControlQubits(), this.getSelector(), null, "fixedControlQubits", null, 0, -1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOperation_FixedTargetQubits(), this.getSelector(), null, "fixedTargetQubits", null, 0, -1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOperation_Loop(), theQuopePackage.getConcreteLoopOperation(), null, "loop", null, 1, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_IncrementControlQubits(), ecorePackage.getEBooleanObject(), "incrementControlQubits", "true", 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_IncrementTargetQubits(), ecorePackage.getEBooleanObject(), "incrementTargetQubits", "true", 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOperation_LoopTargetQubits(), this.getSelector(), null, "loopTargetQubits", null, 1, -1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopOperation_LoopControlQubits(), this.getSelector(), null, "loopControlQubits", null, 0, -1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_TargetQubitsBlockSize(), ecorePackage.getEIntegerObject(), "targetQubitsBlockSize", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_ControlQubitsBlockSize(), ecorePackage.getEIntegerObject(), "controlQubitsBlockSize", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_ControlQubitsIterationType(), this.getITERATION_TYPE(), "controlQubitsIterationType", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_TargetQubitsIterationType(), this.getITERATION_TYPE(), "targetQubitsIterationType", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_IncrementBlockTargetQubits(), ecorePackage.getEBooleanObject(), "incrementBlockTargetQubits", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_IncrementBlockControlQubits(), ecorePackage.getEBooleanObject(), "incrementBlockControlQubits", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopOperation_IncrementBy(), ecorePackage.getEIntegerObject(), "incrementBy", null, 0, 1, LoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelector_Register(), this.getRegister(), null, "register", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementSelectorEClass, ElementSelector.class, "ElementSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementSelector_Index(), ecorePackage.getEIntegerObject(), "index", null, 0, 1, ElementSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeSelectorEClass, RangeSelector.class, "RangeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeSelector_Begin(), ecorePackage.getEIntegerObject(), "begin", null, 0, 1, RangeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeSelector_End(), ecorePackage.getEIntegerObject(), "end", null, 0, 1, RangeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Qubo(), theQuboPackage.getQubo(), null, "qubo", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Operation(), theQuopePackage.getConcreteQuantumOperation(), null, "operation", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registerEClass, Register.class, "Register", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.class, "ITERATION_TYPE");
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.NONE);
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.SHIFT);
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.CHANGE_BLOCK);

		// Create resource
		createResource(eNS_URI);
	}

} //QucircuitPackageImpl
