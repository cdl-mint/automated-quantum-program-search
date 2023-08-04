/**
 */
package quope.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quope.ConcreteQuantumOperation;
import quope.FixedQuantumOperation;
import quope.Parameter;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quope.impl.ConcreteQuantumOperationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link quope.impl.ConcreteQuantumOperationImpl#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}</li>
 *   <li>{@link quope.impl.ConcreteQuantumOperationImpl#isAllowsQubo <em>Allows Qubo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteQuantumOperationImpl extends AbstractQuantumOperationImpl implements ConcreteQuantumOperation {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getFixedQuantumOperation() <em>Fixed Quantum Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedQuantumOperation()
	 * @generated
	 * @ordered
	 */
	protected FixedQuantumOperation fixedQuantumOperation;

	/**
	 * The default value of the '{@link #isAllowsQubo() <em>Allows Qubo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsQubo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOWS_QUBO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowsQubo() <em>Allows Qubo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowsQubo()
	 * @generated
	 * @ordered
	 */
	protected boolean allowsQubo = ALLOWS_QUBO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteQuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, oldParameter, newParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER,
					newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedQuantumOperation getFixedQuantumOperation() {
		return fixedQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedQuantumOperation(FixedQuantumOperation newFixedQuantumOperation,
			NotificationChain msgs) {
		FixedQuantumOperation oldFixedQuantumOperation = fixedQuantumOperation;
		fixedQuantumOperation = newFixedQuantumOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, oldFixedQuantumOperation,
					newFixedQuantumOperation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedQuantumOperation(FixedQuantumOperation newFixedQuantumOperation) {
		if (newFixedQuantumOperation != fixedQuantumOperation) {
			NotificationChain msgs = null;
			if (fixedQuantumOperation != null)
				msgs = ((InternalEObject) fixedQuantumOperation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, null,
						msgs);
			if (newFixedQuantumOperation != null)
				msgs = ((InternalEObject) newFixedQuantumOperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, null,
						msgs);
			msgs = basicSetFixedQuantumOperation(newFixedQuantumOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, newFixedQuantumOperation,
					newFixedQuantumOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowsQubo() {
		return allowsQubo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowsQubo(boolean newAllowsQubo) {
		boolean oldAllowsQubo = allowsQubo;
		allowsQubo = newAllowsQubo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO,
					oldAllowsQubo, allowsQubo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return basicSetParameter(null, msgs);
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return basicSetFixedQuantumOperation(null, msgs);
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
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return getParameter();
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return getFixedQuantumOperation();
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO:
			return isAllowsQubo();
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
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			setParameter((Parameter) newValue);
			return;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			setFixedQuantumOperation((FixedQuantumOperation) newValue);
			return;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO:
			setAllowsQubo((Boolean) newValue);
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
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			setParameter((Parameter) null);
			return;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			setFixedQuantumOperation((FixedQuantumOperation) null);
			return;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO:
			setAllowsQubo(ALLOWS_QUBO_EDEFAULT);
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
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return parameter != null;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return fixedQuantumOperation != null;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__ALLOWS_QUBO:
			return allowsQubo != ALLOWS_QUBO_EDEFAULT;
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
		result.append(" (allowsQubo: ");
		result.append(allowsQubo);
		result.append(')');
		return result.toString();
	}

} //ConcreteQuantumOperationImpl
