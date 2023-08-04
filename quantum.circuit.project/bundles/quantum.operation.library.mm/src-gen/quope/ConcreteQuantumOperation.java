/**
 */
package quope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}</li>
 *   <li>{@link quope.ConcreteQuantumOperation#isAllowsQubo <em>Allows Qubo</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getConcreteQuantumOperation()
 * @model
 * @generated
 */
public interface ConcreteQuantumOperation extends AbstractQuantumOperation {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see quope.QuopePackage#getConcreteQuantumOperation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Fixed Quantum Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Quantum Operation</em>' containment reference.
	 * @see #setFixedQuantumOperation(FixedQuantumOperation)
	 * @see quope.QuopePackage#getConcreteQuantumOperation_FixedQuantumOperation()
	 * @model containment="true"
	 * @generated
	 */
	FixedQuantumOperation getFixedQuantumOperation();

	/**
	 * Sets the value of the '{@link quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Quantum Operation</em>' containment reference.
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	void setFixedQuantumOperation(FixedQuantumOperation value);

	/**
	 * Returns the value of the '<em><b>Allows Qubo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Qubo</em>' attribute.
	 * @see #setAllowsQubo(boolean)
	 * @see quope.QuopePackage#getConcreteQuantumOperation_AllowsQubo()
	 * @model
	 * @generated
	 */
	boolean isAllowsQubo();

	/**
	 * Sets the value of the '{@link quope.ConcreteQuantumOperation#isAllowsQubo <em>Allows Qubo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Qubo</em>' attribute.
	 * @see #isAllowsQubo()
	 * @generated
	 */
	void setAllowsQubo(boolean value);

} // ConcreteQuantumOperation
