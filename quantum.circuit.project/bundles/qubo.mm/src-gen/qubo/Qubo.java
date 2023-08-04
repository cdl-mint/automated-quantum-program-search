/**
 */
package qubo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qubo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qubo.Qubo#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see qubo.QuboPackage#getQubo()
 * @model
 * @generated
 */
public interface Qubo extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see qubo.QuboPackage#getQubo_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link qubo.Qubo#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

} // Qubo
