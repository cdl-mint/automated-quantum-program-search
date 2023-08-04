/**
 */
package qucircuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumRegister#getNumberOfQubits <em>Number Of Qubits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getQuantumRegister()
 * @model
 * @generated
 */
public interface QuantumRegister extends Register {
	/**
	 * Returns the value of the '<em><b>Number Of Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Qubits</em>' attribute.
	 * @see #setNumberOfQubits(Integer)
	 * @see qucircuit.QucircuitPackage#getQuantumRegister_NumberOfQubits()
	 * @model
	 * @generated
	 */
	Integer getNumberOfQubits();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumRegister#getNumberOfQubits <em>Number Of Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Qubits</em>' attribute.
	 * @see #getNumberOfQubits()
	 * @generated
	 */
	void setNumberOfQubits(Integer value);

} // QuantumRegister
