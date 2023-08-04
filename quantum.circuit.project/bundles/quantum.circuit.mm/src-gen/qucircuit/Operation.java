/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EObject;

import qubo.Qubo;

import quope.ConcreteQuantumOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Operation#getQubo <em>Qubo</em>}</li>
 *   <li>{@link qucircuit.Operation#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Qubo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qubo</em>' reference.
	 * @see #setQubo(Qubo)
	 * @see qucircuit.QucircuitPackage#getOperation_Qubo()
	 * @model
	 * @generated
	 */
	Qubo getQubo();

	/**
	 * Sets the value of the '{@link qucircuit.Operation#getQubo <em>Qubo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qubo</em>' reference.
	 * @see #getQubo()
	 * @generated
	 */
	void setQubo(Qubo value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(ConcreteQuantumOperation)
	 * @see qucircuit.QucircuitPackage#getOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	ConcreteQuantumOperation getOperation();

	/**
	 * Sets the value of the '{@link qucircuit.Operation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ConcreteQuantumOperation value);

} // Operation
