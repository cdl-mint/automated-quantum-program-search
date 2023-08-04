/**
 */
package quope.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quope.Parameter;
import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quope.impl.ParameterImpl#getTheta <em>Theta</em>}</li>
 *   <li>{@link quope.impl.ParameterImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link quope.impl.ParameterImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THETA_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected Boolean theta = THETA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PHI_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected Boolean phi = PHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LAMBDA_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected Boolean lambda = LAMBDA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuopePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTheta() {
		return theta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheta(Boolean newTheta) {
		Boolean oldTheta = theta;
		theta = newTheta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.PARAMETER__THETA, oldTheta, theta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhi(Boolean newPhi) {
		Boolean oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.PARAMETER__PHI, oldPhi, phi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambda(Boolean newLambda) {
		Boolean oldLambda = lambda;
		lambda = newLambda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuopePackage.PARAMETER__LAMBDA, oldLambda, lambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuopePackage.PARAMETER__THETA:
			return getTheta();
		case QuopePackage.PARAMETER__PHI:
			return getPhi();
		case QuopePackage.PARAMETER__LAMBDA:
			return getLambda();
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
		case QuopePackage.PARAMETER__THETA:
			setTheta((Boolean) newValue);
			return;
		case QuopePackage.PARAMETER__PHI:
			setPhi((Boolean) newValue);
			return;
		case QuopePackage.PARAMETER__LAMBDA:
			setLambda((Boolean) newValue);
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
		case QuopePackage.PARAMETER__THETA:
			setTheta(THETA_EDEFAULT);
			return;
		case QuopePackage.PARAMETER__PHI:
			setPhi(PHI_EDEFAULT);
			return;
		case QuopePackage.PARAMETER__LAMBDA:
			setLambda(LAMBDA_EDEFAULT);
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
		case QuopePackage.PARAMETER__THETA:
			return THETA_EDEFAULT == null ? theta != null : !THETA_EDEFAULT.equals(theta);
		case QuopePackage.PARAMETER__PHI:
			return PHI_EDEFAULT == null ? phi != null : !PHI_EDEFAULT.equals(phi);
		case QuopePackage.PARAMETER__LAMBDA:
			return LAMBDA_EDEFAULT == null ? lambda != null : !LAMBDA_EDEFAULT.equals(lambda);
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
		result.append(" (theta: ");
		result.append(theta);
		result.append(", phi: ");
		result.append(phi);
		result.append(", lambda: ");
		result.append(lambda);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
