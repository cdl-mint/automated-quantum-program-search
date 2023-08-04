/**
 */
package quope.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import quope.AbstractQuantumOperation;
import quope.ConcreteLoopOperation;
import quope.ConcreteQuantumOperation;
import quope.FixedQuantumOperation;
import quope.NamedElement;
import quope.Parameter;
import quope.QuantumOperationLibrary;
import quope.QuopeFactory;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuopePackageImpl extends EPackageImpl implements QuopePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumOperationLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteQuantumOperationEClass = null;

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
	private EClass fixedQuantumOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteLoopOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQuantumOperationEClass = null;

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
	 * @see quope.QuopePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuopePackageImpl() {
		super(eNS_URI, QuopeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QuopePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuopePackage init() {
		if (isInited)
			return (QuopePackage) EPackage.Registry.INSTANCE.getEPackage(QuopePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQuopePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QuopePackageImpl theQuopePackage = registeredQuopePackage instanceof QuopePackageImpl
				? (QuopePackageImpl) registeredQuopePackage
				: new QuopePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQuopePackage.createPackageContents();

		// Initialize created meta-data
		theQuopePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuopePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuopePackage.eNS_URI, theQuopePackage);
		return theQuopePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumOperationLibrary() {
		return quantumOperationLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperationLibrary_Operations() {
		return (EReference) quantumOperationLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteQuantumOperation() {
		return concreteQuantumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteQuantumOperation_Parameter() {
		return (EReference) concreteQuantumOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteQuantumOperation_FixedQuantumOperation() {
		return (EReference) concreteQuantumOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteQuantumOperation_AllowsQubo() {
		return (EAttribute) concreteQuantumOperationEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedQuantumOperation() {
		return fixedQuantumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedQuantumOperation_NumberOfTargetQubits() {
		return (EAttribute) fixedQuantumOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedQuantumOperation_NumberOfControlQubits() {
		return (EAttribute) fixedQuantumOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedQuantumOperation_NumberOfClassicBits() {
		return (EAttribute) fixedQuantumOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Theta() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Phi() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Lambda() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteLoopOperation() {
		return concreteLoopOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsFixedControlQubits() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsFixedTargetQubits() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsControlQubitsIterationType() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsTargetQubitsIterationType() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsControlQubitsBlockSize() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsTargetQubitsBlockSize() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsIncrementControlQubits() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsIncrementTargetQubits() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsIterations() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteLoopOperation_AllowsMultipleOperations() {
		return (EAttribute) concreteLoopOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQuantumOperation() {
		return abstractQuantumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractQuantumOperation_PaletteIconPath() {
		return (EAttribute) abstractQuantumOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractQuantumOperation_StyleIconPath() {
		return (EAttribute) abstractQuantumOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractQuantumOperation_Reversible() {
		return (EAttribute) abstractQuantumOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractQuantumOperation_Type() {
		return (EReference) abstractQuantumOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractQuantumOperation_Reverse() {
		return (EReference) abstractQuantumOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuopeFactory getQuopeFactory() {
		return (QuopeFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		quantumOperationLibraryEClass = createEClass(QUANTUM_OPERATION_LIBRARY);
		createEReference(quantumOperationLibraryEClass, QUANTUM_OPERATION_LIBRARY__OPERATIONS);

		concreteQuantumOperationEClass = createEClass(CONCRETE_QUANTUM_OPERATION);
		createEReference(concreteQuantumOperationEClass, CONCRETE_QUANTUM_OPERATION__PARAMETER);
		createEReference(concreteQuantumOperationEClass, CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION);
		createEAttribute(concreteQuantumOperationEClass, CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		fixedQuantumOperationEClass = createEClass(FIXED_QUANTUM_OPERATION);
		createEAttribute(fixedQuantumOperationEClass, FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS);
		createEAttribute(fixedQuantumOperationEClass, FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS);
		createEAttribute(fixedQuantumOperationEClass, FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__THETA);
		createEAttribute(parameterEClass, PARAMETER__PHI);
		createEAttribute(parameterEClass, PARAMETER__LAMBDA);

		concreteLoopOperationEClass = createEClass(CONCRETE_LOOP_OPERATION);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS);
		createEAttribute(concreteLoopOperationEClass, CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS);

		abstractQuantumOperationEClass = createEClass(ABSTRACT_QUANTUM_OPERATION);
		createEAttribute(abstractQuantumOperationEClass, ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH);
		createEAttribute(abstractQuantumOperationEClass, ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH);
		createEAttribute(abstractQuantumOperationEClass, ABSTRACT_QUANTUM_OPERATION__REVERSIBLE);
		createEReference(abstractQuantumOperationEClass, ABSTRACT_QUANTUM_OPERATION__TYPE);
		createEReference(abstractQuantumOperationEClass, ABSTRACT_QUANTUM_OPERATION__REVERSE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantumOperationLibraryEClass.getESuperTypes().add(this.getNamedElement());
		concreteQuantumOperationEClass.getESuperTypes().add(this.getAbstractQuantumOperation());
		concreteLoopOperationEClass.getESuperTypes().add(this.getAbstractQuantumOperation());
		abstractQuantumOperationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(quantumOperationLibraryEClass, QuantumOperationLibrary.class, "QuantumOperationLibrary",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumOperationLibrary_Operations(), this.getAbstractQuantumOperation(), null, "operations",
				null, 0, -1, QuantumOperationLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteQuantumOperationEClass, ConcreteQuantumOperation.class, "ConcreteQuantumOperation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteQuantumOperation_Parameter(), this.getParameter(), null, "parameter", null, 0, 1,
				ConcreteQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteQuantumOperation_FixedQuantumOperation(), this.getFixedQuantumOperation(), null,
				"fixedQuantumOperation", null, 0, 1, ConcreteQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteQuantumOperation_AllowsQubo(), theEcorePackage.getEBoolean(), "allowsQubo", null, 0,
				1, ConcreteQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedQuantumOperationEClass, FixedQuantumOperation.class, "FixedQuantumOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedQuantumOperation_NumberOfTargetQubits(), ecorePackage.getEIntegerObject(),
				"numberOfTargetQubits", null, 1, 1, FixedQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedQuantumOperation_NumberOfControlQubits(), ecorePackage.getEIntegerObject(),
				"numberOfControlQubits", null, 1, 1, FixedQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedQuantumOperation_NumberOfClassicBits(), ecorePackage.getEIntegerObject(),
				"numberOfClassicBits", null, 1, 1, FixedQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Theta(), ecorePackage.getEBooleanObject(), "theta", "false", 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Phi(), ecorePackage.getEBooleanObject(), "phi", "false", 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Lambda(), ecorePackage.getEBooleanObject(), "lambda", "false", 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(concreteLoopOperationEClass, ConcreteLoopOperation.class, "ConcreteLoopOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteLoopOperation_AllowsFixedControlQubits(), ecorePackage.getEBooleanObject(),
				"allowsFixedControlQubits", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsFixedTargetQubits(), ecorePackage.getEBooleanObject(),
				"allowsFixedTargetQubits", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsControlQubitsIterationType(), ecorePackage.getEBooleanObject(),
				"allowsControlQubitsIterationType", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsTargetQubitsIterationType(), ecorePackage.getEBooleanObject(),
				"allowsTargetQubitsIterationType", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsControlQubitsBlockSize(), ecorePackage.getEBooleanObject(),
				"allowsControlQubitsBlockSize", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsTargetQubitsBlockSize(), ecorePackage.getEBooleanObject(),
				"allowsTargetQubitsBlockSize", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsIncrementControlQubits(), ecorePackage.getEBooleanObject(),
				"allowsIncrementControlQubits", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsIncrementTargetQubits(), ecorePackage.getEBooleanObject(),
				"allowsIncrementTargetQubits", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsIterations(), ecorePackage.getEBooleanObject(),
				"allowsIterations", "true", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteLoopOperation_AllowsMultipleOperations(), theEcorePackage.getEBooleanObject(),
				"allowsMultipleOperations", "false", 0, 1, ConcreteLoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQuantumOperationEClass, AbstractQuantumOperation.class, "AbstractQuantumOperation",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractQuantumOperation_PaletteIconPath(), ecorePackage.getEString(), "paletteIconPath",
				null, 0, 1, AbstractQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractQuantumOperation_StyleIconPath(), ecorePackage.getEString(), "styleIconPath", null, 0,
				1, AbstractQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractQuantumOperation_Reversible(), ecorePackage.getEBooleanObject(), "reversible", null,
				0, 1, AbstractQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractQuantumOperation_Type(), theEcorePackage.getEClass(), null, "type", null, 1, 1,
				AbstractQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractQuantumOperation_Reverse(), this.getAbstractQuantumOperation(), null, "reverse", null,
				0, 1, AbstractQuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QuopePackageImpl
