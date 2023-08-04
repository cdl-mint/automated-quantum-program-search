/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.AbstractQuantumGate#getControlQubits <em>Control Qubits</em>}</li>
 *   <li>{@link qucircuit.AbstractQuantumGate#getInverseForm <em>Inverse Form</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getAbstractQuantumGate()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQuantumGate extends QuantumOperation {
	/**
	 * Returns the value of the '<em><b>Control Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getAbstractQuantumGate_ControlQubits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getControlQubits();

	/**
	 * Returns the value of the '<em><b>Inverse Form</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Form</em>' attribute.
	 * @see #setInverseForm(Boolean)
	 * @see qucircuit.QucircuitPackage#getAbstractQuantumGate_InverseForm()
	 * @model default="false"
	 * @generated
	 */
	Boolean getInverseForm();

	/**
	 * Sets the value of the '{@link qucircuit.AbstractQuantumGate#getInverseForm <em>Inverse Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Form</em>' attribute.
	 * @see #getInverseForm()
	 * @generated
	 */
	void setInverseForm(Boolean value);

} // AbstractQuantumGate
