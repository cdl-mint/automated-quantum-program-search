/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.AngleParameter#getTheta <em>Theta</em>}</li>
 *   <li>{@link qucircuit.AngleParameter#getPhi <em>Phi</em>}</li>
 *   <li>{@link qucircuit.AngleParameter#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getAngleParameter()
 * @model
 * @generated
 */
public interface AngleParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(Double)
	 * @see qucircuit.QucircuitPackage#getAngleParameter_Theta()
	 * @model
	 * @generated
	 */
	Double getTheta();

	/**
	 * Sets the value of the '{@link qucircuit.AngleParameter#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(Double value);

	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see #setPhi(Double)
	 * @see qucircuit.QucircuitPackage#getAngleParameter_Phi()
	 * @model
	 * @generated
	 */
	Double getPhi();

	/**
	 * Sets the value of the '{@link qucircuit.AngleParameter#getPhi <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' attribute.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(Double value);

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(Double)
	 * @see qucircuit.QucircuitPackage#getAngleParameter_Lambda()
	 * @model
	 * @generated
	 */
	Double getLambda();

	/**
	 * Sets the value of the '{@link qucircuit.AngleParameter#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(Double value);

} // AngleParameter
