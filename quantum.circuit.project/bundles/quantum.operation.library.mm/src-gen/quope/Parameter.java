/**
 */
package quope;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.Parameter#getTheta <em>Theta</em>}</li>
 *   <li>{@link quope.Parameter#getPhi <em>Phi</em>}</li>
 *   <li>{@link quope.Parameter#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(Boolean)
	 * @see quope.QuopePackage#getParameter_Theta()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTheta();

	/**
	 * Sets the value of the '{@link quope.Parameter#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(Boolean value);

	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see #setPhi(Boolean)
	 * @see quope.QuopePackage#getParameter_Phi()
	 * @model default="false"
	 * @generated
	 */
	Boolean getPhi();

	/**
	 * Sets the value of the '{@link quope.Parameter#getPhi <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' attribute.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(Boolean)
	 * @see quope.QuopePackage#getParameter_Lambda()
	 * @model default="false"
	 * @generated
	 */
	Boolean getLambda();

	/**
	 * Sets the value of the '{@link quope.Parameter#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(Boolean value);

} // Parameter
