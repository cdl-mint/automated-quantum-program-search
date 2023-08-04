/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumOperation#getClassicControl <em>Classic Control</em>}</li>
 *   <li>{@link qucircuit.QuantumOperation#getOperations <em>Operations</em>}</li>
 *   <li>{@link qucircuit.QuantumOperation#getTargetQubits <em>Target Qubits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getQuantumOperation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel"
 * @generated
 */
public interface QuantumOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Control</em>' containment reference.
	 * @see #setClassicControl(ClassicControl)
	 * @see qucircuit.QucircuitPackage#getQuantumOperation_ClassicControl()
	 * @model containment="true"
	 * @generated
	 */
	ClassicControl getClassicControl();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumOperation#getClassicControl <em>Classic Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classic Control</em>' containment reference.
	 * @see #getClassicControl()
	 * @generated
	 */
	void setClassicControl(ClassicControl value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getQuantumOperation_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Target Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getQuantumOperation_TargetQubits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Selector> getTargetQubits();

} // QuantumOperation
