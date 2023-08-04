/**
 */
package quope.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import quope.AbstractQuantumOperation;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quope.impl.AbstractQuantumOperationImpl#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 *   <li>{@link quope.impl.AbstractQuantumOperationImpl#getStyleIconPath <em>Style Icon Path</em>}</li>
 *   <li>{@link quope.impl.AbstractQuantumOperationImpl#getReversible <em>Reversible</em>}</li>
 *   <li>{@link quope.impl.AbstractQuantumOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link quope.impl.AbstractQuantumOperationImpl#getReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractQuantumOperationImpl extends NamedElementImpl implements AbstractQuantumOperation {
	/**
	 * The default value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected String paletteIconPath = PALETTE_ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleIconPath() <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleIconPath() <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleIconPath()
	 * @generated
	 * @ordered
	 */
	protected String styleIconPath = STYLE_ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REVERSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversible()
	 * @generated
	 * @ordered
	 */
	protected Boolean reversible = REVERSIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected AbstractQuantumOperation reverse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractQuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuopePackage.Literals.ABSTRACT_QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteIconPath() {
		return paletteIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteIconPath(String newPaletteIconPath) {
		String oldPaletteIconPath = paletteIconPath;
		paletteIconPath = newPaletteIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH, oldPaletteIconPath, paletteIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleIconPath() {
		return styleIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleIconPath(String newStyleIconPath) {
		String oldStyleIconPath = styleIconPath;
		styleIconPath = newStyleIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuopePackage.ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH, oldStyleIconPath, styleIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReversible() {
		return reversible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversible(Boolean newReversible) {
		Boolean oldReversible = reversible;
		reversible = newReversible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSIBLE,
					oldReversible, reversible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EClass) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQuantumOperation getReverse() {
		if (reverse != null && reverse.eIsProxy()) {
			InternalEObject oldReverse = (InternalEObject) reverse;
			reverse = (AbstractQuantumOperation) eResolveProxy(oldReverse);
			if (reverse != oldReverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE, oldReverse, reverse));
			}
		}
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQuantumOperation basicGetReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(AbstractQuantumOperation newReverse) {
		AbstractQuantumOperation oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE,
					oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			return getPaletteIconPath();
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH:
			return getStyleIconPath();
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSIBLE:
			return getReversible();
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE:
			if (resolve)
				return getReverse();
			return basicGetReverse();
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
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			setPaletteIconPath((String) newValue);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH:
			setStyleIconPath((String) newValue);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSIBLE:
			setReversible((Boolean) newValue);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE:
			setType((EClass) newValue);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE:
			setReverse((AbstractQuantumOperation) newValue);
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
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			setPaletteIconPath(PALETTE_ICON_PATH_EDEFAULT);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH:
			setStyleIconPath(STYLE_ICON_PATH_EDEFAULT);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSIBLE:
			setReversible(REVERSIBLE_EDEFAULT);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE:
			setType((EClass) null);
			return;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE:
			setReverse((AbstractQuantumOperation) null);
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
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			return PALETTE_ICON_PATH_EDEFAULT == null ? paletteIconPath != null
					: !PALETTE_ICON_PATH_EDEFAULT.equals(paletteIconPath);
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__STYLE_ICON_PATH:
			return STYLE_ICON_PATH_EDEFAULT == null ? styleIconPath != null
					: !STYLE_ICON_PATH_EDEFAULT.equals(styleIconPath);
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSIBLE:
			return REVERSIBLE_EDEFAULT == null ? reversible != null : !REVERSIBLE_EDEFAULT.equals(reversible);
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__TYPE:
			return type != null;
		case QuopePackage.ABSTRACT_QUANTUM_OPERATION__REVERSE:
			return reverse != null;
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
		result.append(" (paletteIconPath: ");
		result.append(paletteIconPath);
		result.append(", styleIconPath: ");
		result.append(styleIconPath);
		result.append(", reversible: ");
		result.append(reversible);
		result.append(')');
		return result.toString();
	}

} //AbstractQuantumOperationImpl
