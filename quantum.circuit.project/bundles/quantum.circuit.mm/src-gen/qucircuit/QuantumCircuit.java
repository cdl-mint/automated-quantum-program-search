/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumCircuit#getQuantumRegisters <em>Quantum Registers</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getClassicRegisters <em>Classic Registers</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getLayers <em>Layers</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getNrOfGates <em>Nr Of Gates</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getDepth <em>Depth</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getNrOfNonlocalGates <em>Nr Of Nonlocal Gates</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getNrOfParams <em>Nr Of Params</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getOverlap <em>Overlap</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getQuantumCircuit()
 * @model
 * @generated
 */
public interface QuantumCircuit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Quantum Registers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.QuantumRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantum Registers</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_QuantumRegisters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuantumRegister> getQuantumRegisters();

	/**
	 * Returns the value of the '<em><b>Classic Registers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.ClassicRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Registers</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_ClassicRegisters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassicRegister> getClassicRegisters();

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Nr Of Gates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Gates</em>' attribute.
	 * @see #setNrOfGates(int)
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_NrOfGates()
	 * @model
	 * @generated
	 */
	int getNrOfGates();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumCircuit#getNrOfGates <em>Nr Of Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Gates</em>' attribute.
	 * @see #getNrOfGates()
	 * @generated
	 */
	void setNrOfGates(int value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_Depth()
	 * @model
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumCircuit#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Nr Of Nonlocal Gates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Nonlocal Gates</em>' attribute.
	 * @see #setNrOfNonlocalGates(int)
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_NrOfNonlocalGates()
	 * @model
	 * @generated
	 */
	int getNrOfNonlocalGates();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumCircuit#getNrOfNonlocalGates <em>Nr Of Nonlocal Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Nonlocal Gates</em>' attribute.
	 * @see #getNrOfNonlocalGates()
	 * @generated
	 */
	void setNrOfNonlocalGates(int value);

	/**
	 * Returns the value of the '<em><b>Nr Of Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Params</em>' attribute.
	 * @see #setNrOfParams(int)
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_NrOfParams()
	 * @model
	 * @generated
	 */
	int getNrOfParams();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumCircuit#getNrOfParams <em>Nr Of Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Params</em>' attribute.
	 * @see #getNrOfParams()
	 * @generated
	 */
	void setNrOfParams(int value);

	/**
	 * Returns the value of the '<em><b>Overlap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlap</em>' attribute.
	 * @see #setOverlap(double)
	 * @see qucircuit.QucircuitPackage#getQuantumCircuit_Overlap()
	 * @model
	 * @generated
	 */
	double getOverlap();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumCircuit#getOverlap <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlap</em>' attribute.
	 * @see #getOverlap()
	 * @generated
	 */
	void setOverlap(double value);

} // QuantumCircuit
