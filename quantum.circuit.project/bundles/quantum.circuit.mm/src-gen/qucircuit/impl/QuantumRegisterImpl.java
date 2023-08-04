/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qucircuit.QuantumRegister;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.QuantumRegisterImpl#getNumberOfQubits <em>Number Of Qubits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumRegisterImpl extends RegisterImpl implements QuantumRegister {
	/**
	 * The default value of the '{@link #getNumberOfQubits() <em>Number Of Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfQubits() <em>Number Of Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfQubits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfQubits = NUMBER_OF_QUBITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.QUANTUM_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfQubits() {
		return numberOfQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfQubits(Integer newNumberOfQubits) {
		Integer oldNumberOfQubits = numberOfQubits;
		numberOfQubits = newNumberOfQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_REGISTER__NUMBER_OF_QUBITS, oldNumberOfQubits, numberOfQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_REGISTER__NUMBER_OF_QUBITS:
				return getNumberOfQubits();
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
			case QucircuitPackage.QUANTUM_REGISTER__NUMBER_OF_QUBITS:
				setNumberOfQubits((Integer)newValue);
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
			case QucircuitPackage.QUANTUM_REGISTER__NUMBER_OF_QUBITS:
				setNumberOfQubits(NUMBER_OF_QUBITS_EDEFAULT);
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
			case QucircuitPackage.QUANTUM_REGISTER__NUMBER_OF_QUBITS:
				return NUMBER_OF_QUBITS_EDEFAULT == null ? numberOfQubits != null : !NUMBER_OF_QUBITS_EDEFAULT.equals(numberOfQubits);
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
		result.append(" (numberOfQubits: ");
		result.append(numberOfQubits);
		result.append(')');
		return result.toString();
	}

} //QuantumRegisterImpl
