/**
 */
package quope.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quope.ConcreteLoopOperation;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsFixedControlQubits <em>Allows Fixed Control Qubits</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsFixedTargetQubits <em>Allows Fixed Target Qubits</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsControlQubitsIterationType <em>Allows Control Qubits Iteration Type</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsTargetQubitsIterationType <em>Allows Target Qubits Iteration Type</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsControlQubitsBlockSize <em>Allows Control Qubits Block Size</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsTargetQubitsBlockSize <em>Allows Target Qubits Block Size</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsIncrementControlQubits <em>Allows Increment Control Qubits</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsIncrementTargetQubits <em>Allows Increment Target Qubits</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsIterations <em>Allows Iterations</em>}</li>
 *   <li>{@link quope.impl.ConcreteLoopOperationImpl#getAllowsMultipleOperations <em>Allows Multiple Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteLoopOperationImpl extends AbstractQuantumOperationImpl implements ConcreteLoopOperation {
	/**
	 * The default value of the '{@link #getAllowsFixedControlQubits() <em>Allows Fixed Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsFixedControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_FIXED_CONTROL_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsFixedControlQubits() <em>Allows Fixed Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsFixedControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsFixedControlQubits = ALLOWS_FIXED_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsFixedTargetQubits() <em>Allows Fixed Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsFixedTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_FIXED_TARGET_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsFixedTargetQubits() <em>Allows Fixed Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsFixedTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsFixedTargetQubits = ALLOWS_FIXED_TARGET_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsControlQubitsIterationType() <em>Allows Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsControlQubitsIterationType() <em>Allows Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsControlQubitsIterationType = ALLOWS_CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsTargetQubitsIterationType() <em>Allows Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_TARGET_QUBITS_ITERATION_TYPE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsTargetQubitsIterationType() <em>Allows Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsTargetQubitsIterationType = ALLOWS_TARGET_QUBITS_ITERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsControlQubitsBlockSize() <em>Allows Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsControlQubitsBlockSize() <em>Allows Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsControlQubitsBlockSize = ALLOWS_CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsTargetQubitsBlockSize() <em>Allows Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_TARGET_QUBITS_BLOCK_SIZE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsTargetQubitsBlockSize() <em>Allows Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsTargetQubitsBlockSize = ALLOWS_TARGET_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsIncrementControlQubits() <em>Allows Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_INCREMENT_CONTROL_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsIncrementControlQubits() <em>Allows Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsIncrementControlQubits = ALLOWS_INCREMENT_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsIncrementTargetQubits() <em>Allows Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_INCREMENT_TARGET_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsIncrementTargetQubits() <em>Allows Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsIncrementTargetQubits = ALLOWS_INCREMENT_TARGET_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsIterations() <em>Allows Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIterations()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_ITERATIONS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowsIterations() <em>Allows Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsIterations()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsIterations = ALLOWS_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowsMultipleOperations() <em>Allows Multiple Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsMultipleOperations()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOWS_MULTIPLE_OPERATIONS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAllowsMultipleOperations() <em>Allows Multiple Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowsMultipleOperations()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowsMultipleOperations = ALLOWS_MULTIPLE_OPERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteLoopOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuopePackage.Literals.CONCRETE_LOOP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsFixedControlQubits() {
		return allowsFixedControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsFixedControlQubits(Boolean newAllowsFixedControlQubits) {
		Boolean oldAllowsFixedControlQubits = allowsFixedControlQubits;
		allowsFixedControlQubits = newAllowsFixedControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS, oldAllowsFixedControlQubits,
					allowsFixedControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsFixedTargetQubits() {
		return allowsFixedTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsFixedTargetQubits(Boolean newAllowsFixedTargetQubits) {
		Boolean oldAllowsFixedTargetQubits = allowsFixedTargetQubits;
		allowsFixedTargetQubits = newAllowsFixedTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS, oldAllowsFixedTargetQubits,
					allowsFixedTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsControlQubitsIterationType() {
		return allowsControlQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsControlQubitsIterationType(Boolean newAllowsControlQubitsIterationType) {
		Boolean oldAllowsControlQubitsIterationType = allowsControlQubitsIterationType;
		allowsControlQubitsIterationType = newAllowsControlQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE,
					oldAllowsControlQubitsIterationType, allowsControlQubitsIterationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsTargetQubitsIterationType() {
		return allowsTargetQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsTargetQubitsIterationType(Boolean newAllowsTargetQubitsIterationType) {
		Boolean oldAllowsTargetQubitsIterationType = allowsTargetQubitsIterationType;
		allowsTargetQubitsIterationType = newAllowsTargetQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE,
					oldAllowsTargetQubitsIterationType, allowsTargetQubitsIterationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsControlQubitsBlockSize() {
		return allowsControlQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsControlQubitsBlockSize(Boolean newAllowsControlQubitsBlockSize) {
		Boolean oldAllowsControlQubitsBlockSize = allowsControlQubitsBlockSize;
		allowsControlQubitsBlockSize = newAllowsControlQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE,
					oldAllowsControlQubitsBlockSize, allowsControlQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsTargetQubitsBlockSize() {
		return allowsTargetQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsTargetQubitsBlockSize(Boolean newAllowsTargetQubitsBlockSize) {
		Boolean oldAllowsTargetQubitsBlockSize = allowsTargetQubitsBlockSize;
		allowsTargetQubitsBlockSize = newAllowsTargetQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE,
					oldAllowsTargetQubitsBlockSize, allowsTargetQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsIncrementControlQubits() {
		return allowsIncrementControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsIncrementControlQubits(Boolean newAllowsIncrementControlQubits) {
		Boolean oldAllowsIncrementControlQubits = allowsIncrementControlQubits;
		allowsIncrementControlQubits = newAllowsIncrementControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS,
					oldAllowsIncrementControlQubits, allowsIncrementControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsIncrementTargetQubits() {
		return allowsIncrementTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsIncrementTargetQubits(Boolean newAllowsIncrementTargetQubits) {
		Boolean oldAllowsIncrementTargetQubits = allowsIncrementTargetQubits;
		allowsIncrementTargetQubits = newAllowsIncrementTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS,
					oldAllowsIncrementTargetQubits, allowsIncrementTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsIterations() {
		return allowsIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsIterations(Boolean newAllowsIterations) {
		Boolean oldAllowsIterations = allowsIterations;
		allowsIterations = newAllowsIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS, oldAllowsIterations, allowsIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowsMultipleOperations() {
		return allowsMultipleOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsMultipleOperations(Boolean newAllowsMultipleOperations) {
		Boolean oldAllowsMultipleOperations = allowsMultipleOperations;
		allowsMultipleOperations = newAllowsMultipleOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS, oldAllowsMultipleOperations,
					allowsMultipleOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS:
			return getAllowsFixedControlQubits();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS:
			return getAllowsFixedTargetQubits();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE:
			return getAllowsControlQubitsIterationType();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE:
			return getAllowsTargetQubitsIterationType();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE:
			return getAllowsControlQubitsBlockSize();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE:
			return getAllowsTargetQubitsBlockSize();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS:
			return getAllowsIncrementControlQubits();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS:
			return getAllowsIncrementTargetQubits();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS:
			return getAllowsIterations();
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS:
			return getAllowsMultipleOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS:
			setAllowsFixedControlQubits((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS:
			setAllowsFixedTargetQubits((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE:
			setAllowsControlQubitsIterationType((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE:
			setAllowsTargetQubitsIterationType((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE:
			setAllowsControlQubitsBlockSize((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE:
			setAllowsTargetQubitsBlockSize((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS:
			setAllowsIncrementControlQubits((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS:
			setAllowsIncrementTargetQubits((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS:
			setAllowsIterations((Boolean) newValue);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS:
			setAllowsMultipleOperations((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS:
			setAllowsFixedControlQubits(ALLOWS_FIXED_CONTROL_QUBITS_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS:
			setAllowsFixedTargetQubits(ALLOWS_FIXED_TARGET_QUBITS_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE:
			setAllowsControlQubitsIterationType(ALLOWS_CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE:
			setAllowsTargetQubitsIterationType(ALLOWS_TARGET_QUBITS_ITERATION_TYPE_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE:
			setAllowsControlQubitsBlockSize(ALLOWS_CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE:
			setAllowsTargetQubitsBlockSize(ALLOWS_TARGET_QUBITS_BLOCK_SIZE_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS:
			setAllowsIncrementControlQubits(ALLOWS_INCREMENT_CONTROL_QUBITS_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS:
			setAllowsIncrementTargetQubits(ALLOWS_INCREMENT_TARGET_QUBITS_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS:
			setAllowsIterations(ALLOWS_ITERATIONS_EDEFAULT);
			return;
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS:
			setAllowsMultipleOperations(ALLOWS_MULTIPLE_OPERATIONS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS:
			return ALLOWS_FIXED_CONTROL_QUBITS_EDEFAULT == null ? allowsFixedControlQubits != null
					: !ALLOWS_FIXED_CONTROL_QUBITS_EDEFAULT.equals(allowsFixedControlQubits);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS:
			return ALLOWS_FIXED_TARGET_QUBITS_EDEFAULT == null ? allowsFixedTargetQubits != null
					: !ALLOWS_FIXED_TARGET_QUBITS_EDEFAULT.equals(allowsFixedTargetQubits);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE:
			return ALLOWS_CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT == null ? allowsControlQubitsIterationType != null
					: !ALLOWS_CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT.equals(allowsControlQubitsIterationType);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE:
			return ALLOWS_TARGET_QUBITS_ITERATION_TYPE_EDEFAULT == null ? allowsTargetQubitsIterationType != null
					: !ALLOWS_TARGET_QUBITS_ITERATION_TYPE_EDEFAULT.equals(allowsTargetQubitsIterationType);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE:
			return ALLOWS_CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT == null ? allowsControlQubitsBlockSize != null
					: !ALLOWS_CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT.equals(allowsControlQubitsBlockSize);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE:
			return ALLOWS_TARGET_QUBITS_BLOCK_SIZE_EDEFAULT == null ? allowsTargetQubitsBlockSize != null
					: !ALLOWS_TARGET_QUBITS_BLOCK_SIZE_EDEFAULT.equals(allowsTargetQubitsBlockSize);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS:
			return ALLOWS_INCREMENT_CONTROL_QUBITS_EDEFAULT == null ? allowsIncrementControlQubits != null
					: !ALLOWS_INCREMENT_CONTROL_QUBITS_EDEFAULT.equals(allowsIncrementControlQubits);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS:
			return ALLOWS_INCREMENT_TARGET_QUBITS_EDEFAULT == null ? allowsIncrementTargetQubits != null
					: !ALLOWS_INCREMENT_TARGET_QUBITS_EDEFAULT.equals(allowsIncrementTargetQubits);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_ITERATIONS:
			return ALLOWS_ITERATIONS_EDEFAULT == null ? allowsIterations != null
					: !ALLOWS_ITERATIONS_EDEFAULT.equals(allowsIterations);
		case QuopePackage.CONCRETE_LOOP_OPERATION__ALLOWS_MULTIPLE_OPERATIONS:
			return ALLOWS_MULTIPLE_OPERATIONS_EDEFAULT == null ? allowsMultipleOperations != null
					: !ALLOWS_MULTIPLE_OPERATIONS_EDEFAULT.equals(allowsMultipleOperations);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (allowsFixedControlQubits: ");
		result.append(allowsFixedControlQubits);
		result.append(", allowsFixedTargetQubits: ");
		result.append(allowsFixedTargetQubits);
		result.append(", allowsControlQubitsIterationType: ");
		result.append(allowsControlQubitsIterationType);
		result.append(", allowsTargetQubitsIterationType: ");
		result.append(allowsTargetQubitsIterationType);
		result.append(", allowsControlQubitsBlockSize: ");
		result.append(allowsControlQubitsBlockSize);
		result.append(", allowsTargetQubitsBlockSize: ");
		result.append(allowsTargetQubitsBlockSize);
		result.append(", allowsIncrementControlQubits: ");
		result.append(allowsIncrementControlQubits);
		result.append(", allowsIncrementTargetQubits: ");
		result.append(allowsIncrementTargetQubits);
		result.append(", allowsIterations: ");
		result.append(allowsIterations);
		result.append(", allowsMultipleOperations: ");
		result.append(allowsMultipleOperations);
		result.append(')');
		return result.toString();
	}

} //ConcreteLoopOperationImpl
