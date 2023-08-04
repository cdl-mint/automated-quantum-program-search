/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qucircuit.AngleParameter;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.AngleParameterImpl#getTheta <em>Theta</em>}</li>
 *   <li>{@link qucircuit.impl.AngleParameterImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link qucircuit.impl.AngleParameterImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleParameterImpl extends MinimalEObjectImpl.Container implements AngleParameter {
	/**
	 * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected static final Double THETA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected Double theta = THETA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected static final Double PHI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected Double phi = PHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected static final Double LAMBDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected Double lambda = LAMBDA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.ANGLE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTheta() {
		return theta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheta(Double newTheta) {
		Double oldTheta = theta;
		theta = newTheta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.ANGLE_PARAMETER__THETA, oldTheta, theta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhi(Double newPhi) {
		Double oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.ANGLE_PARAMETER__PHI, oldPhi, phi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambda(Double newLambda) {
		Double oldLambda = lambda;
		lambda = newLambda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.ANGLE_PARAMETER__LAMBDA, oldLambda, lambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.ANGLE_PARAMETER__THETA:
				return getTheta();
			case QucircuitPackage.ANGLE_PARAMETER__PHI:
				return getPhi();
			case QucircuitPackage.ANGLE_PARAMETER__LAMBDA:
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
			case QucircuitPackage.ANGLE_PARAMETER__THETA:
				setTheta((Double)newValue);
				return;
			case QucircuitPackage.ANGLE_PARAMETER__PHI:
				setPhi((Double)newValue);
				return;
			case QucircuitPackage.ANGLE_PARAMETER__LAMBDA:
				setLambda((Double)newValue);
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
			case QucircuitPackage.ANGLE_PARAMETER__THETA:
				setTheta(THETA_EDEFAULT);
				return;
			case QucircuitPackage.ANGLE_PARAMETER__PHI:
				setPhi(PHI_EDEFAULT);
				return;
			case QucircuitPackage.ANGLE_PARAMETER__LAMBDA:
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
			case QucircuitPackage.ANGLE_PARAMETER__THETA:
				return THETA_EDEFAULT == null ? theta != null : !THETA_EDEFAULT.equals(theta);
			case QucircuitPackage.ANGLE_PARAMETER__PHI:
				return PHI_EDEFAULT == null ? phi != null : !PHI_EDEFAULT.equals(phi);
			case QucircuitPackage.ANGLE_PARAMETER__LAMBDA:
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
		if (eIsProxy()) return super.toString();

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

} //AngleParameterImpl
