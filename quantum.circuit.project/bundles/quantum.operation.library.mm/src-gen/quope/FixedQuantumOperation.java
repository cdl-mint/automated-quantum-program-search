/**
 */
package quope;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.FixedQuantumOperation#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}</li>
 *   <li>{@link quope.FixedQuantumOperation#getNumberOfControlQubits <em>Number Of Control Qubits</em>}</li>
 *   <li>{@link quope.FixedQuantumOperation#getNumberOfClassicBits <em>Number Of Classic Bits</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getFixedQuantumOperation()
 * @model
 * @generated
 */
public interface FixedQuantumOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Target Qubits</em>' attribute.
	 * @see #setNumberOfTargetQubits(Integer)
	 * @see quope.QuopePackage#getFixedQuantumOperation_NumberOfTargetQubits()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumberOfTargetQubits();

	/**
	 * Sets the value of the '{@link quope.FixedQuantumOperation#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Target Qubits</em>' attribute.
	 * @see #getNumberOfTargetQubits()
	 * @generated
	 */
	void setNumberOfTargetQubits(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Control Qubits</em>' attribute.
	 * @see #setNumberOfControlQubits(Integer)
	 * @see quope.QuopePackage#getFixedQuantumOperation_NumberOfControlQubits()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumberOfControlQubits();

	/**
	 * Sets the value of the '{@link quope.FixedQuantumOperation#getNumberOfControlQubits <em>Number Of Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Control Qubits</em>' attribute.
	 * @see #getNumberOfControlQubits()
	 * @generated
	 */
	void setNumberOfControlQubits(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Classic Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Classic Bits</em>' attribute.
	 * @see #setNumberOfClassicBits(Integer)
	 * @see quope.QuopePackage#getFixedQuantumOperation_NumberOfClassicBits()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumberOfClassicBits();

	/**
	 * Sets the value of the '{@link quope.FixedQuantumOperation#getNumberOfClassicBits <em>Number Of Classic Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Classic Bits</em>' attribute.
	 * @see #getNumberOfClassicBits()
	 * @generated
	 */
	void setNumberOfClassicBits(Integer value);

} // FixedQuantumOperation
