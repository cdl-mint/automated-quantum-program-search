/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qucircuit.ITERATION_TYPE;
import qucircuit.LoopOperation;
import qucircuit.QucircuitPackage;
import qucircuit.Selector;

import quope.ConcreteLoopOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getFixedControlQubits <em>Fixed Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getFixedTargetQubits <em>Fixed Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIncrementControlQubits <em>Increment Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIncrementTargetQubits <em>Increment Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getLoopTargetQubits <em>Loop Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getLoopControlQubits <em>Loop Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIncrementBlockTargetQubits <em>Increment Block Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIncrementBlockControlQubits <em>Increment Block Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopOperationImpl#getIncrementBy <em>Increment By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopOperationImpl extends AbstractCompositeGateImpl implements LoopOperation {
	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixedControlQubits() <em>Fixed Control Qubits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedControlQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Selector> fixedControlQubits;

	/**
	 * The cached value of the '{@link #getFixedTargetQubits() <em>Fixed Target Qubits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Selector> fixedTargetQubits;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected ConcreteLoopOperation loop;

	/**
	 * The default value of the '{@link #getIncrementControlQubits() <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_CONTROL_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncrementControlQubits() <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementControlQubits = INCREMENT_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementTargetQubits() <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_TARGET_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncrementTargetQubits() <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementTargetQubits = INCREMENT_TARGET_QUBITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopTargetQubits() <em>Loop Target Qubits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Selector> loopTargetQubits;

	/**
	 * The cached value of the '{@link #getLoopControlQubits() <em>Loop Control Qubits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopControlQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Selector> loopControlQubits;

	/**
	 * The default value of the '{@link #getTargetQubitsBlockSize() <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_QUBITS_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetQubitsBlockSize() <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Integer targetQubitsBlockSize = TARGET_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlQubitsBlockSize() <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlQubitsBlockSize() <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Integer controlQubitsBlockSize = CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlQubitsIterationType() <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final ITERATION_TYPE CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT = ITERATION_TYPE.NONE;

	/**
	 * The cached value of the '{@link #getControlQubitsIterationType() <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected ITERATION_TYPE controlQubitsIterationType = CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetQubitsIterationType() <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final ITERATION_TYPE TARGET_QUBITS_ITERATION_TYPE_EDEFAULT = ITERATION_TYPE.NONE;

	/**
	 * The cached value of the '{@link #getTargetQubitsIterationType() <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected ITERATION_TYPE targetQubitsIterationType = TARGET_QUBITS_ITERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBlockTargetQubits() <em>Increment Block Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBlockTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_BLOCK_TARGET_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementBlockTargetQubits() <em>Increment Block Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBlockTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementBlockTargetQubits = INCREMENT_BLOCK_TARGET_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBlockControlQubits() <em>Increment Block Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBlockControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_BLOCK_CONTROL_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementBlockControlQubits() <em>Increment Block Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBlockControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementBlockControlQubits = INCREMENT_BLOCK_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCREMENT_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementBy() <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementBy()
	 * @generated
	 * @ordered
	 */
	protected Integer incrementBy = INCREMENT_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.LOOP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selector> getFixedControlQubits() {
		if (fixedControlQubits == null) {
			fixedControlQubits = new EObjectContainmentEList<Selector>(Selector.class, this, QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS);
		}
		return fixedControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selector> getFixedTargetQubits() {
		if (fixedTargetQubits == null) {
			fixedTargetQubits = new EObjectContainmentEList<Selector>(Selector.class, this, QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS);
		}
		return fixedTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteLoopOperation getLoop() {
		if (loop != null && loop.eIsProxy()) {
			InternalEObject oldLoop = (InternalEObject)loop;
			loop = (ConcreteLoopOperation)eResolveProxy(oldLoop);
			if (loop != oldLoop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QucircuitPackage.LOOP_OPERATION__LOOP, oldLoop, loop));
			}
		}
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteLoopOperation basicGetLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(ConcreteLoopOperation newLoop) {
		ConcreteLoopOperation oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementControlQubits() {
		return incrementControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementControlQubits(Boolean newIncrementControlQubits) {
		Boolean oldIncrementControlQubits = incrementControlQubits;
		incrementControlQubits = newIncrementControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__INCREMENT_CONTROL_QUBITS, oldIncrementControlQubits, incrementControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementTargetQubits() {
		return incrementTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementTargetQubits(Boolean newIncrementTargetQubits) {
		Boolean oldIncrementTargetQubits = incrementTargetQubits;
		incrementTargetQubits = newIncrementTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__INCREMENT_TARGET_QUBITS, oldIncrementTargetQubits, incrementTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selector> getLoopTargetQubits() {
		if (loopTargetQubits == null) {
			loopTargetQubits = new EObjectContainmentEList<Selector>(Selector.class, this, QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS);
		}
		return loopTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selector> getLoopControlQubits() {
		if (loopControlQubits == null) {
			loopControlQubits = new EObjectContainmentEList<Selector>(Selector.class, this, QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS);
		}
		return loopControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetQubitsBlockSize() {
		return targetQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetQubitsBlockSize(Integer newTargetQubitsBlockSize) {
		Integer oldTargetQubitsBlockSize = targetQubitsBlockSize;
		targetQubitsBlockSize = newTargetQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE, oldTargetQubitsBlockSize, targetQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getControlQubitsBlockSize() {
		return controlQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlQubitsBlockSize(Integer newControlQubitsBlockSize) {
		Integer oldControlQubitsBlockSize = controlQubitsBlockSize;
		controlQubitsBlockSize = newControlQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE, oldControlQubitsBlockSize, controlQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITERATION_TYPE getControlQubitsIterationType() {
		return controlQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlQubitsIterationType(ITERATION_TYPE newControlQubitsIterationType) {
		ITERATION_TYPE oldControlQubitsIterationType = controlQubitsIterationType;
		controlQubitsIterationType = newControlQubitsIterationType == null ? CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT : newControlQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE, oldControlQubitsIterationType, controlQubitsIterationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITERATION_TYPE getTargetQubitsIterationType() {
		return targetQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetQubitsIterationType(ITERATION_TYPE newTargetQubitsIterationType) {
		ITERATION_TYPE oldTargetQubitsIterationType = targetQubitsIterationType;
		targetQubitsIterationType = newTargetQubitsIterationType == null ? TARGET_QUBITS_ITERATION_TYPE_EDEFAULT : newTargetQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE, oldTargetQubitsIterationType, targetQubitsIterationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementBlockTargetQubits() {
		return incrementBlockTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBlockTargetQubits(Boolean newIncrementBlockTargetQubits) {
		Boolean oldIncrementBlockTargetQubits = incrementBlockTargetQubits;
		incrementBlockTargetQubits = newIncrementBlockTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS, oldIncrementBlockTargetQubits, incrementBlockTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementBlockControlQubits() {
		return incrementBlockControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBlockControlQubits(Boolean newIncrementBlockControlQubits) {
		Boolean oldIncrementBlockControlQubits = incrementBlockControlQubits;
		incrementBlockControlQubits = newIncrementBlockControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS, oldIncrementBlockControlQubits, incrementBlockControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIncrementBy() {
		return incrementBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementBy(Integer newIncrementBy) {
		Integer oldIncrementBy = incrementBy;
		incrementBy = newIncrementBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.LOOP_OPERATION__INCREMENT_BY, oldIncrementBy, incrementBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS:
				return ((InternalEList<?>)getFixedControlQubits()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS:
				return ((InternalEList<?>)getFixedTargetQubits()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS:
				return ((InternalEList<?>)getLoopTargetQubits()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS:
				return ((InternalEList<?>)getLoopControlQubits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.LOOP_OPERATION__ITERATIONS:
				return getIterations();
			case QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS:
				return getFixedControlQubits();
			case QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS:
				return getFixedTargetQubits();
			case QucircuitPackage.LOOP_OPERATION__LOOP:
				if (resolve) return getLoop();
				return basicGetLoop();
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_CONTROL_QUBITS:
				return getIncrementControlQubits();
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_TARGET_QUBITS:
				return getIncrementTargetQubits();
			case QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS:
				return getLoopTargetQubits();
			case QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS:
				return getLoopControlQubits();
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE:
				return getTargetQubitsBlockSize();
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE:
				return getControlQubitsBlockSize();
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE:
				return getControlQubitsIterationType();
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE:
				return getTargetQubitsIterationType();
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS:
				return getIncrementBlockTargetQubits();
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS:
				return getIncrementBlockControlQubits();
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BY:
				return getIncrementBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QucircuitPackage.LOOP_OPERATION__ITERATIONS:
				setIterations((Integer)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS:
				getFixedControlQubits().clear();
				getFixedControlQubits().addAll((Collection<? extends Selector>)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS:
				getFixedTargetQubits().clear();
				getFixedTargetQubits().addAll((Collection<? extends Selector>)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP:
				setLoop((ConcreteLoopOperation)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_CONTROL_QUBITS:
				setIncrementControlQubits((Boolean)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_TARGET_QUBITS:
				setIncrementTargetQubits((Boolean)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS:
				getLoopTargetQubits().clear();
				getLoopTargetQubits().addAll((Collection<? extends Selector>)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS:
				getLoopControlQubits().clear();
				getLoopControlQubits().addAll((Collection<? extends Selector>)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE:
				setTargetQubitsBlockSize((Integer)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE:
				setControlQubitsBlockSize((Integer)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE:
				setControlQubitsIterationType((ITERATION_TYPE)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE:
				setTargetQubitsIterationType((ITERATION_TYPE)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS:
				setIncrementBlockTargetQubits((Boolean)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS:
				setIncrementBlockControlQubits((Boolean)newValue);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BY:
				setIncrementBy((Integer)newValue);
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
			case QucircuitPackage.LOOP_OPERATION__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS:
				getFixedControlQubits().clear();
				return;
			case QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS:
				getFixedTargetQubits().clear();
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP:
				setLoop((ConcreteLoopOperation)null);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_CONTROL_QUBITS:
				setIncrementControlQubits(INCREMENT_CONTROL_QUBITS_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_TARGET_QUBITS:
				setIncrementTargetQubits(INCREMENT_TARGET_QUBITS_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS:
				getLoopTargetQubits().clear();
				return;
			case QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS:
				getLoopControlQubits().clear();
				return;
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE:
				setTargetQubitsBlockSize(TARGET_QUBITS_BLOCK_SIZE_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE:
				setControlQubitsBlockSize(CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE:
				setControlQubitsIterationType(CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE:
				setTargetQubitsIterationType(TARGET_QUBITS_ITERATION_TYPE_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS:
				setIncrementBlockTargetQubits(INCREMENT_BLOCK_TARGET_QUBITS_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS:
				setIncrementBlockControlQubits(INCREMENT_BLOCK_CONTROL_QUBITS_EDEFAULT);
				return;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BY:
				setIncrementBy(INCREMENT_BY_EDEFAULT);
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
			case QucircuitPackage.LOOP_OPERATION__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
			case QucircuitPackage.LOOP_OPERATION__FIXED_CONTROL_QUBITS:
				return fixedControlQubits != null && !fixedControlQubits.isEmpty();
			case QucircuitPackage.LOOP_OPERATION__FIXED_TARGET_QUBITS:
				return fixedTargetQubits != null && !fixedTargetQubits.isEmpty();
			case QucircuitPackage.LOOP_OPERATION__LOOP:
				return loop != null;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_CONTROL_QUBITS:
				return INCREMENT_CONTROL_QUBITS_EDEFAULT == null ? incrementControlQubits != null : !INCREMENT_CONTROL_QUBITS_EDEFAULT.equals(incrementControlQubits);
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_TARGET_QUBITS:
				return INCREMENT_TARGET_QUBITS_EDEFAULT == null ? incrementTargetQubits != null : !INCREMENT_TARGET_QUBITS_EDEFAULT.equals(incrementTargetQubits);
			case QucircuitPackage.LOOP_OPERATION__LOOP_TARGET_QUBITS:
				return loopTargetQubits != null && !loopTargetQubits.isEmpty();
			case QucircuitPackage.LOOP_OPERATION__LOOP_CONTROL_QUBITS:
				return loopControlQubits != null && !loopControlQubits.isEmpty();
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE:
				return TARGET_QUBITS_BLOCK_SIZE_EDEFAULT == null ? targetQubitsBlockSize != null : !TARGET_QUBITS_BLOCK_SIZE_EDEFAULT.equals(targetQubitsBlockSize);
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE:
				return CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT == null ? controlQubitsBlockSize != null : !CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT.equals(controlQubitsBlockSize);
			case QucircuitPackage.LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE:
				return controlQubitsIterationType != CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT;
			case QucircuitPackage.LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE:
				return targetQubitsIterationType != TARGET_QUBITS_ITERATION_TYPE_EDEFAULT;
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS:
				return INCREMENT_BLOCK_TARGET_QUBITS_EDEFAULT == null ? incrementBlockTargetQubits != null : !INCREMENT_BLOCK_TARGET_QUBITS_EDEFAULT.equals(incrementBlockTargetQubits);
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS:
				return INCREMENT_BLOCK_CONTROL_QUBITS_EDEFAULT == null ? incrementBlockControlQubits != null : !INCREMENT_BLOCK_CONTROL_QUBITS_EDEFAULT.equals(incrementBlockControlQubits);
			case QucircuitPackage.LOOP_OPERATION__INCREMENT_BY:
				return INCREMENT_BY_EDEFAULT == null ? incrementBy != null : !INCREMENT_BY_EDEFAULT.equals(incrementBy);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (iterations: ");
		result.append(iterations);
		result.append(", incrementControlQubits: ");
		result.append(incrementControlQubits);
		result.append(", incrementTargetQubits: ");
		result.append(incrementTargetQubits);
		result.append(", targetQubitsBlockSize: ");
		result.append(targetQubitsBlockSize);
		result.append(", controlQubitsBlockSize: ");
		result.append(controlQubitsBlockSize);
		result.append(", controlQubitsIterationType: ");
		result.append(controlQubitsIterationType);
		result.append(", targetQubitsIterationType: ");
		result.append(targetQubitsIterationType);
		result.append(", incrementBlockTargetQubits: ");
		result.append(incrementBlockTargetQubits);
		result.append(", incrementBlockControlQubits: ");
		result.append(incrementBlockControlQubits);
		result.append(", incrementBy: ");
		result.append(incrementBy);
		result.append(')');
		return result.toString();
	}

} //LoopOperationImpl
