/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qucircuit.ClassicRegister;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classic Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.ClassicRegisterImpl#getNumberOfBits <em>Number Of Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassicRegisterImpl extends RegisterImpl implements ClassicRegister {
	/**
	 * The default value of the '{@link #getNumberOfBits() <em>Number Of Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfBits() <em>Number Of Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfBits = NUMBER_OF_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.CLASSIC_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfBits() {
		return numberOfBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBits(Integer newNumberOfBits) {
		Integer oldNumberOfBits = numberOfBits;
		numberOfBits = newNumberOfBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.CLASSIC_REGISTER__NUMBER_OF_BITS, oldNumberOfBits, numberOfBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.CLASSIC_REGISTER__NUMBER_OF_BITS:
				return getNumberOfBits();
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
			case QucircuitPackage.CLASSIC_REGISTER__NUMBER_OF_BITS:
				setNumberOfBits((Integer)newValue);
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
			case QucircuitPackage.CLASSIC_REGISTER__NUMBER_OF_BITS:
				setNumberOfBits(NUMBER_OF_BITS_EDEFAULT);
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
			case QucircuitPackage.CLASSIC_REGISTER__NUMBER_OF_BITS:
				return NUMBER_OF_BITS_EDEFAULT == null ? numberOfBits != null : !NUMBER_OF_BITS_EDEFAULT.equals(numberOfBits);
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
		result.append(" (numberOfBits: ");
		result.append(numberOfBits);
		result.append(')');
		return result.toString();
	}

} //ClassicRegisterImpl
