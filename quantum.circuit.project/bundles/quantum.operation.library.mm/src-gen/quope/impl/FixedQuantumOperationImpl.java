/**
 */
package quope.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quope.FixedQuantumOperation;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quope.impl.FixedQuantumOperationImpl#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}</li>
 *   <li>{@link quope.impl.FixedQuantumOperationImpl#getNumberOfControlQubits <em>Number Of Control Qubits</em>}</li>
 *   <li>{@link quope.impl.FixedQuantumOperationImpl#getNumberOfClassicBits <em>Number Of Classic Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedQuantumOperationImpl extends MinimalEObjectImpl.Container implements FixedQuantumOperation {
	/**
	 * The default value of the '{@link #getNumberOfTargetQubits() <em>Number Of Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_TARGET_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfTargetQubits() <em>Number Of Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfTargetQubits = NUMBER_OF_TARGET_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfControlQubits() <em>Number Of Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CONTROL_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfControlQubits() <em>Number Of Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfControlQubits = NUMBER_OF_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfClassicBits() <em>Number Of Classic Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfClassicBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CLASSIC_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfClassicBits() <em>Number Of Classic Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfClassicBits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfClassicBits = NUMBER_OF_CLASSIC_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedQuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuopePackage.Literals.FIXED_QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfTargetQubits() {
		return numberOfTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTargetQubits(Integer newNumberOfTargetQubits) {
		Integer oldNumberOfTargetQubits = numberOfTargetQubits;
		numberOfTargetQubits = newNumberOfTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS, oldNumberOfTargetQubits,
					numberOfTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfControlQubits() {
		return numberOfControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfControlQubits(Integer newNumberOfControlQubits) {
		Integer oldNumberOfControlQubits = numberOfControlQubits;
		numberOfControlQubits = newNumberOfControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS, oldNumberOfControlQubits,
					numberOfControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfClassicBits() {
		return numberOfClassicBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfClassicBits(Integer newNumberOfClassicBits) {
		Integer oldNumberOfClassicBits = numberOfClassicBits;
		numberOfClassicBits = newNumberOfClassicBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS, oldNumberOfClassicBits,
					numberOfClassicBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			return getNumberOfTargetQubits();
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			return getNumberOfControlQubits();
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS:
			return getNumberOfClassicBits();
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
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			setNumberOfTargetQubits((Integer) newValue);
			return;
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			setNumberOfControlQubits((Integer) newValue);
			return;
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS:
			setNumberOfClassicBits((Integer) newValue);
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
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			setNumberOfTargetQubits(NUMBER_OF_TARGET_QUBITS_EDEFAULT);
			return;
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			setNumberOfControlQubits(NUMBER_OF_CONTROL_QUBITS_EDEFAULT);
			return;
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS:
			setNumberOfClassicBits(NUMBER_OF_CLASSIC_BITS_EDEFAULT);
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
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			return NUMBER_OF_TARGET_QUBITS_EDEFAULT == null ? numberOfTargetQubits != null
					: !NUMBER_OF_TARGET_QUBITS_EDEFAULT.equals(numberOfTargetQubits);
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			return NUMBER_OF_CONTROL_QUBITS_EDEFAULT == null ? numberOfControlQubits != null
					: !NUMBER_OF_CONTROL_QUBITS_EDEFAULT.equals(numberOfControlQubits);
		case QuopePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CLASSIC_BITS:
			return NUMBER_OF_CLASSIC_BITS_EDEFAULT == null ? numberOfClassicBits != null
					: !NUMBER_OF_CLASSIC_BITS_EDEFAULT.equals(numberOfClassicBits);
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
		result.append(" (numberOfTargetQubits: ");
		result.append(numberOfTargetQubits);
		result.append(", numberOfControlQubits: ");
		result.append(numberOfControlQubits);
		result.append(", numberOfClassicBits: ");
		result.append(numberOfClassicBits);
		result.append(')');
		return result.toString();
	}

} //FixedQuantumOperationImpl
