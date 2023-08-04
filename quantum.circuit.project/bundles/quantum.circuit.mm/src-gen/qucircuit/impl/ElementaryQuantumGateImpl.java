/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qucircuit.AngleParameter;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elementary Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.ElementaryQuantumGateImpl#getAngleParameter <em>Angle Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementaryQuantumGateImpl extends AbstractQuantumGateImpl implements ElementaryQuantumGate {
	/**
	 * The cached value of the '{@link #getAngleParameter() <em>Angle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleParameter()
	 * @generated
	 * @ordered
	 */
	protected AngleParameter angleParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryQuantumGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.ELEMENTARY_QUANTUM_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleParameter getAngleParameter() {
		return angleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleParameter(AngleParameter newAngleParameter, NotificationChain msgs) {
		AngleParameter oldAngleParameter = angleParameter;
		angleParameter = newAngleParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER, oldAngleParameter, newAngleParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleParameter(AngleParameter newAngleParameter) {
		if (newAngleParameter != angleParameter) {
			NotificationChain msgs = null;
			if (angleParameter != null)
				msgs = ((InternalEObject)angleParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER, null, msgs);
			if (newAngleParameter != null)
				msgs = ((InternalEObject)newAngleParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER, null, msgs);
			msgs = basicSetAngleParameter(newAngleParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER, newAngleParameter, newAngleParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER:
				return basicSetAngleParameter(null, msgs);
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
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER:
				return getAngleParameter();
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
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER:
				setAngleParameter((AngleParameter)newValue);
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
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER:
				setAngleParameter((AngleParameter)null);
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
			case QucircuitPackage.ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER:
				return angleParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementaryQuantumGateImpl
