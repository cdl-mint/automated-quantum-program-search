/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qucircuit.ClassicControl;
import qucircuit.ClassicRegister;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classic Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.ClassicControlImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qucircuit.impl.ClassicControlImpl#getClassicRegister <em>Classic Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassicControlImpl extends MinimalEObjectImpl.Container implements ClassicControl {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassicRegister() <em>Classic Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicRegister()
	 * @generated
	 * @ordered
	 */
	protected ClassicRegister classicRegister;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.CLASSIC_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.CLASSIC_CONTROL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicRegister getClassicRegister() {
		if (classicRegister != null && classicRegister.eIsProxy()) {
			InternalEObject oldClassicRegister = (InternalEObject)classicRegister;
			classicRegister = (ClassicRegister)eResolveProxy(oldClassicRegister);
			if (classicRegister != oldClassicRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER, oldClassicRegister, classicRegister));
			}
		}
		return classicRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicRegister basicGetClassicRegister() {
		return classicRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassicRegister(ClassicRegister newClassicRegister) {
		ClassicRegister oldClassicRegister = classicRegister;
		classicRegister = newClassicRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER, oldClassicRegister, classicRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.CLASSIC_CONTROL__VALUE:
				return getValue();
			case QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER:
				if (resolve) return getClassicRegister();
				return basicGetClassicRegister();
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
			case QucircuitPackage.CLASSIC_CONTROL__VALUE:
				setValue((Double)newValue);
				return;
			case QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER:
				setClassicRegister((ClassicRegister)newValue);
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
			case QucircuitPackage.CLASSIC_CONTROL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER:
				setClassicRegister((ClassicRegister)null);
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
			case QucircuitPackage.CLASSIC_CONTROL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case QucircuitPackage.CLASSIC_CONTROL__CLASSIC_REGISTER:
				return classicRegister != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ClassicControlImpl
