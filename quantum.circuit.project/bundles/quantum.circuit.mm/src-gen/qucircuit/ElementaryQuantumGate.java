/**
 */
package qucircuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.ElementaryQuantumGate#getAngleParameter <em>Angle Parameter</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getElementaryQuantumGate()
 * @model
 * @generated
 */
public interface ElementaryQuantumGate extends AbstractQuantumGate {
	/**
	 * Returns the value of the '<em><b>Angle Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Parameter</em>' containment reference.
	 * @see #setAngleParameter(AngleParameter)
	 * @see qucircuit.QucircuitPackage#getElementaryQuantumGate_AngleParameter()
	 * @model containment="true"
	 * @generated
	 */
	AngleParameter getAngleParameter();

	/**
	 * Sets the value of the '{@link qucircuit.ElementaryQuantumGate#getAngleParameter <em>Angle Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Parameter</em>' containment reference.
	 * @see #getAngleParameter()
	 * @generated
	 */
	void setAngleParameter(AngleParameter value);

} // ElementaryQuantumGate
