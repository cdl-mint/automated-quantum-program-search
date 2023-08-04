/**
 */
package quope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see quope.QuopeFactory
 * @model kind="package"
 * @generated
 */
public interface QuopePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/QuantumOpe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuopePackage eINSTANCE = quope.impl.QuopePackageImpl.init();

	/**
	 * The meta object id for the '{@link quope.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.NamedElementImpl
	 * @see quope.impl.QuopePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quope.impl.QuantumOperationLibraryImpl <em>Quantum Operation Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.QuantumOperationLibraryImpl
	 * @see quope.impl.QuopePackageImpl#getQuantumOperationLibrary()
	 * @generated
	 */
	int QUANTUM_OPERATION_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantum Operation Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantum Operation Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quope.impl.AbstractQuantumOperationImpl <em>Abstract Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.AbstractQuantumOperationImpl
	 * @see quope.impl.QuopePackageImpl#getAbstractQuantumOperation()
	 * @generated
	 */
	int ABSTRACT_QUANTUM_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reversible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__REVERSIBLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION__REVERSE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quope.impl.ConcreteQuantumOperationImpl <em>Concrete Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.ConcreteQuantumOperationImpl
	 * @see quope.impl.QuopePackageImpl#getConcreteQuantumOperation()
	 * @generated
	 */
	int CONCRETE_QUANTUM_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__NAME = ABSTRACT_QUANTUM_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH = ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH = ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Reversible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__REVERSIBLE = ABSTRACT_QUANTUM_OPERATION__REVERSIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__TYPE = ABSTRACT_QUANTUM_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__REVERSE = ABSTRACT_QUANTUM_OPERATION__REVERSE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__PARAMETER = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Quantum Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allows Qubo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concrete Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION_FEATURE_COUNT = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concrete Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION_OPERATION_COUNT = ABSTRACT_QUANTUM_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quope.impl.FixedQuantumOperationImpl <em>Fixed Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.FixedQuantumOperationImpl
	 * @see quope.impl.QuopePackageImpl#getFixedQuantumOperation()
	 * @generated
	 */
	int FIXED_QUANTUM_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Number Of Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS = 0;

	/**
	 * The feature id for the '<em><b>Number Of Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS = 1;

	/**
	 * The feature id for the '<em><b>Number Of Classic Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS = 2;

	/**
	 * The number of structural features of the '<em>Fixed Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fixed Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quope.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.ParameterImpl
	 * @see quope.impl.QuopePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__THETA = 0;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PHI = 1;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LAMBDA = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quope.impl.ConcreteLoopOperationImpl <em>Concrete Loop Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quope.impl.ConcreteLoopOperationImpl
	 * @see quope.impl.QuopePackageImpl#getConcreteLoopOperation()
	 * @generated
	 */
	int CONCRETE_LOOP_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__NAME = ABSTRACT_QUANTUM_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__PALETTE_ICON_PATH = ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__STYLE_ICON_PATH = ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH;

	/**
	 * The feature id for the '<em><b>Reversible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__REVERSIBLE = ABSTRACT_QUANTUM_OPERATION__REVERSIBLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__TYPE = ABSTRACT_QUANTUM_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__REVERSE = ABSTRACT_QUANTUM_OPERATION__REVERSE;

	/**
	 * The feature id for the '<em><b>Allows Fixed Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allows Fixed Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allows Control Qubits Iteration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allows Target Qubits Iteration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allows Control Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allows Target Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allows Increment Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allows Increment Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Allows Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Allows Multiple Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Concrete Loop Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION_FEATURE_COUNT = ABSTRACT_QUANTUM_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Concrete Loop Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_LOOP_OPERATION_OPERATION_COUNT = ABSTRACT_QUANTUM_OPERATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link quope.QuantumOperationLibrary <em>Quantum Operation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Operation Library</em>'.
	 * @see quope.QuantumOperationLibrary
	 * @generated
	 */
	EClass getQuantumOperationLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link quope.QuantumOperationLibrary#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see quope.QuantumOperationLibrary#getOperations()
	 * @see #getQuantumOperationLibrary()
	 * @generated
	 */
	EReference getQuantumOperationLibrary_Operations();

	/**
	 * Returns the meta object for class '{@link quope.ConcreteQuantumOperation <em>Concrete Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Quantum Operation</em>'.
	 * @see quope.ConcreteQuantumOperation
	 * @generated
	 */
	EClass getConcreteQuantumOperation();

	/**
	 * Returns the meta object for the containment reference '{@link quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see quope.ConcreteQuantumOperation#getParameter()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Quantum Operation</em>'.
	 * @see quope.ConcreteQuantumOperation#getFixedQuantumOperation()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_FixedQuantumOperation();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteQuantumOperation#isAllowsQubo <em>Allows Qubo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Qubo</em>'.
	 * @see quope.ConcreteQuantumOperation#isAllowsQubo()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EAttribute getConcreteQuantumOperation_AllowsQubo();

	/**
	 * Returns the meta object for class '{@link quope.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see quope.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link quope.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see quope.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link quope.FixedQuantumOperation <em>Fixed Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Quantum Operation</em>'.
	 * @see quope.FixedQuantumOperation
	 * @generated
	 */
	EClass getFixedQuantumOperation();

	/**
	 * Returns the meta object for the attribute '{@link quope.FixedQuantumOperation#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Target Qubits</em>'.
	 * @see quope.FixedQuantumOperation#getNumberOfTargetQubits()
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	EAttribute getFixedQuantumOperation_NumberOfTargetQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.FixedQuantumOperation#getNumberOfControlQubits <em>Number Of Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Control Qubits</em>'.
	 * @see quope.FixedQuantumOperation#getNumberOfControlQubits()
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	EAttribute getFixedQuantumOperation_NumberOfControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.FixedQuantumOperation#getNumberOfClassicBits <em>Number Of Classic Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Classic Bits</em>'.
	 * @see quope.FixedQuantumOperation#getNumberOfClassicBits()
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	EAttribute getFixedQuantumOperation_NumberOfClassicBits();

	/**
	 * Returns the meta object for class '{@link quope.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see quope.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link quope.Parameter#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see quope.Parameter#getTheta()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Theta();

	/**
	 * Returns the meta object for the attribute '{@link quope.Parameter#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see quope.Parameter#getPhi()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Phi();

	/**
	 * Returns the meta object for the attribute '{@link quope.Parameter#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see quope.Parameter#getLambda()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Lambda();

	/**
	 * Returns the meta object for class '{@link quope.ConcreteLoopOperation <em>Concrete Loop Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Loop Operation</em>'.
	 * @see quope.ConcreteLoopOperation
	 * @generated
	 */
	EClass getConcreteLoopOperation();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsFixedControlQubits <em>Allows Fixed Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Fixed Control Qubits</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsFixedControlQubits()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsFixedControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsFixedTargetQubits <em>Allows Fixed Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Fixed Target Qubits</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsFixedTargetQubits()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsFixedTargetQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsControlQubitsIterationType <em>Allows Control Qubits Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Control Qubits Iteration Type</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsControlQubitsIterationType()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsControlQubitsIterationType();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsTargetQubitsIterationType <em>Allows Target Qubits Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Target Qubits Iteration Type</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsTargetQubitsIterationType()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsTargetQubitsIterationType();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsControlQubitsBlockSize <em>Allows Control Qubits Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Control Qubits Block Size</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsControlQubitsBlockSize()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsControlQubitsBlockSize();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsTargetQubitsBlockSize <em>Allows Target Qubits Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Target Qubits Block Size</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsTargetQubitsBlockSize()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsTargetQubitsBlockSize();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsIncrementControlQubits <em>Allows Increment Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Increment Control Qubits</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsIncrementControlQubits()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsIncrementControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsIncrementTargetQubits <em>Allows Increment Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Increment Target Qubits</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsIncrementTargetQubits()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsIncrementTargetQubits();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsIterations <em>Allows Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Iterations</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsIterations()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsIterations();

	/**
	 * Returns the meta object for the attribute '{@link quope.ConcreteLoopOperation#getAllowsMultipleOperations <em>Allows Multiple Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allows Multiple Operations</em>'.
	 * @see quope.ConcreteLoopOperation#getAllowsMultipleOperations()
	 * @see #getConcreteLoopOperation()
	 * @generated
	 */
	EAttribute getConcreteLoopOperation_AllowsMultipleOperations();

	/**
	 * Returns the meta object for class '{@link quope.AbstractQuantumOperation <em>Abstract Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quantum Operation</em>'.
	 * @see quope.AbstractQuantumOperation
	 * @generated
	 */
	EClass getAbstractQuantumOperation();

	/**
	 * Returns the meta object for the attribute '{@link quope.AbstractQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Icon Path</em>'.
	 * @see quope.AbstractQuantumOperation#getPaletteIconPath()
	 * @see #getAbstractQuantumOperation()
	 * @generated
	 */
	EAttribute getAbstractQuantumOperation_PaletteIconPath();

	/**
	 * Returns the meta object for the attribute '{@link quope.AbstractQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Icon Path</em>'.
	 * @see quope.AbstractQuantumOperation#getStyleIconPath()
	 * @see #getAbstractQuantumOperation()
	 * @generated
	 */
	EAttribute getAbstractQuantumOperation_StyleIconPath();

	/**
	 * Returns the meta object for the attribute '{@link quope.AbstractQuantumOperation#getReversible <em>Reversible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversible</em>'.
	 * @see quope.AbstractQuantumOperation#getReversible()
	 * @see #getAbstractQuantumOperation()
	 * @generated
	 */
	EAttribute getAbstractQuantumOperation_Reversible();

	/**
	 * Returns the meta object for the reference '{@link quope.AbstractQuantumOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see quope.AbstractQuantumOperation#getType()
	 * @see #getAbstractQuantumOperation()
	 * @generated
	 */
	EReference getAbstractQuantumOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link quope.AbstractQuantumOperation#getReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reverse</em>'.
	 * @see quope.AbstractQuantumOperation#getReverse()
	 * @see #getAbstractQuantumOperation()
	 * @generated
	 */
	EReference getAbstractQuantumOperation_Reverse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuopeFactory getQuopeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link quope.impl.QuantumOperationLibraryImpl <em>Quantum Operation Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.QuantumOperationLibraryImpl
		 * @see quope.impl.QuopePackageImpl#getQuantumOperationLibrary()
		 * @generated
		 */
		EClass QUANTUM_OPERATION_LIBRARY = eINSTANCE.getQuantumOperationLibrary();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION_LIBRARY__OPERATIONS = eINSTANCE.getQuantumOperationLibrary_Operations();

		/**
		 * The meta object literal for the '{@link quope.impl.ConcreteQuantumOperationImpl <em>Concrete Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.ConcreteQuantumOperationImpl
		 * @see quope.impl.QuopePackageImpl#getConcreteQuantumOperation()
		 * @generated
		 */
		EClass CONCRETE_QUANTUM_OPERATION = eINSTANCE.getConcreteQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__PARAMETER = eINSTANCE.getConcreteQuantumOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Fixed Quantum Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION = eINSTANCE
				.getConcreteQuantumOperation_FixedQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Allows Qubo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO = eINSTANCE.getConcreteQuantumOperation_AllowsQubo();

		/**
		 * The meta object literal for the '{@link quope.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.NamedElementImpl
		 * @see quope.impl.QuopePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link quope.impl.FixedQuantumOperationImpl <em>Fixed Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.FixedQuantumOperationImpl
		 * @see quope.impl.QuopePackageImpl#getFixedQuantumOperation()
		 * @generated
		 */
		EClass FIXED_QUANTUM_OPERATION = eINSTANCE.getFixedQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Number Of Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS = eINSTANCE
				.getFixedQuantumOperation_NumberOfTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Number Of Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS = eINSTANCE
				.getFixedQuantumOperation_NumberOfControlQubits();

		/**
		 * The meta object literal for the '<em><b>Number Of Classic Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS = eINSTANCE
				.getFixedQuantumOperation_NumberOfClassicBits();

		/**
		 * The meta object literal for the '{@link quope.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.ParameterImpl
		 * @see quope.impl.QuopePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__THETA = eINSTANCE.getParameter_Theta();

		/**
		 * The meta object literal for the '<em><b>Phi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PHI = eINSTANCE.getParameter_Phi();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LAMBDA = eINSTANCE.getParameter_Lambda();

		/**
		 * The meta object literal for the '{@link quope.impl.ConcreteLoopOperationImpl <em>Concrete Loop Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.ConcreteLoopOperationImpl
		 * @see quope.impl.QuopePackageImpl#getConcreteLoopOperation()
		 * @generated
		 */
		EClass CONCRETE_LOOP_OPERATION = eINSTANCE.getConcreteLoopOperation();

		/**
		 * The meta object literal for the '<em><b>Allows Fixed Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS = eINSTANCE
				.getConcreteLoopOperation_AllowsFixedControlQubits();

		/**
		 * The meta object literal for the '<em><b>Allows Fixed Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS = eINSTANCE
				.getConcreteLoopOperation_AllowsFixedTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Allows Control Qubits Iteration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE = eINSTANCE
				.getConcreteLoopOperation_AllowsControlQubitsIterationType();

		/**
		 * The meta object literal for the '<em><b>Allows Target Qubits Iteration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE = eINSTANCE
				.getConcreteLoopOperation_AllowsTargetQubitsIterationType();

		/**
		 * The meta object literal for the '<em><b>Allows Control Qubits Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE = eINSTANCE
				.getConcreteLoopOperation_AllowsControlQubitsBlockSize();

		/**
		 * The meta object literal for the '<em><b>Allows Target Qubits Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE = eINSTANCE
				.getConcreteLoopOperation_AllowsTargetQubitsBlockSize();

		/**
		 * The meta object literal for the '<em><b>Allows Increment Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS = eINSTANCE
				.getConcreteLoopOperation_AllowsIncrementControlQubits();

		/**
		 * The meta object literal for the '<em><b>Allows Increment Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS = eINSTANCE
				.getConcreteLoopOperation_AllowsIncrementTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Allows Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS = eINSTANCE.getConcreteLoopOperation_AllowsIterations();

		/**
		 * The meta object literal for the '<em><b>Allows Multiple Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS = eINSTANCE
				.getConcreteLoopOperation_AllowsMultipleOperations();

		/**
		 * The meta object literal for the '{@link quope.impl.AbstractQuantumOperationImpl <em>Abstract Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quope.impl.AbstractQuantumOperationImpl
		 * @see quope.impl.QuopePackageImpl#getAbstractQuantumOperation()
		 * @generated
		 */
		EClass ABSTRACT_QUANTUM_OPERATION = eINSTANCE.getAbstractQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Palette Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH = eINSTANCE
				.getAbstractQuantumOperation_PaletteIconPath();

		/**
		 * The meta object literal for the '<em><b>Style Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH = eINSTANCE.getAbstractQuantumOperation_StyleIconPath();

		/**
		 * The meta object literal for the '<em><b>Reversible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUANTUM_OPERATION__REVERSIBLE = eINSTANCE.getAbstractQuantumOperation_Reversible();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_QUANTUM_OPERATION__TYPE = eINSTANCE.getAbstractQuantumOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_QUANTUM_OPERATION__REVERSE = eINSTANCE.getAbstractQuantumOperation_Reverse();

	}

} //QuopePackage
