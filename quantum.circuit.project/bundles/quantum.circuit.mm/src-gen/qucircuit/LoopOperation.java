/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

import quope.ConcreteLoopOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.LoopOperation#getIterations <em>Iterations</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getFixedControlQubits <em>Fixed Control Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getFixedTargetQubits <em>Fixed Target Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getLoop <em>Loop</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getIncrementControlQubits <em>Increment Control Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getIncrementTargetQubits <em>Increment Target Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getLoopTargetQubits <em>Loop Target Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getLoopControlQubits <em>Loop Control Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getIncrementBlockTargetQubits <em>Increment Block Target Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getIncrementBlockControlQubits <em>Increment Block Control Qubits</em>}</li>
 *   <li>{@link qucircuit.LoopOperation#getIncrementBy <em>Increment By</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getLoopOperation()
 * @model
 * @generated
 */
public interface LoopOperation extends AbstractCompositeGate {
	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_Iterations()
	 * @model
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * Returns the value of the '<em><b>Fixed Control Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Control Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getLoopOperation_FixedControlQubits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getFixedControlQubits();

	/**
	 * Returns the value of the '<em><b>Fixed Target Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Target Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getLoopOperation_FixedTargetQubits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getFixedTargetQubits();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(ConcreteLoopOperation)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_Loop()
	 * @model required="true"
	 * @generated
	 */
	ConcreteLoopOperation getLoop();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(ConcreteLoopOperation value);

	/**
	 * Returns the value of the '<em><b>Increment Control Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Control Qubits</em>' attribute.
	 * @see #setIncrementControlQubits(Boolean)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_IncrementControlQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncrementControlQubits();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIncrementControlQubits <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Control Qubits</em>' attribute.
	 * @see #getIncrementControlQubits()
	 * @generated
	 */
	void setIncrementControlQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Increment Target Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Target Qubits</em>' attribute.
	 * @see #setIncrementTargetQubits(Boolean)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_IncrementTargetQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncrementTargetQubits();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIncrementTargetQubits <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Target Qubits</em>' attribute.
	 * @see #getIncrementTargetQubits()
	 * @generated
	 */
	void setIncrementTargetQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Loop Target Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Target Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getLoopOperation_LoopTargetQubits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Selector> getLoopTargetQubits();

	/**
	 * Returns the value of the '<em><b>Loop Control Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Control Qubits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getLoopOperation_LoopControlQubits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getLoopControlQubits();

	/**
	 * Returns the value of the '<em><b>Target Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits Block Size</em>' attribute.
	 * @see #setTargetQubitsBlockSize(Integer)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_TargetQubitsBlockSize()
	 * @model
	 * @generated
	 */
	Integer getTargetQubitsBlockSize();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Qubits Block Size</em>' attribute.
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 */
	void setTargetQubitsBlockSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits Block Size</em>' attribute.
	 * @see #setControlQubitsBlockSize(Integer)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_ControlQubitsBlockSize()
	 * @model
	 * @generated
	 */
	Integer getControlQubitsBlockSize();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Qubits Block Size</em>' attribute.
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 */
	void setControlQubitsBlockSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Qubits Iteration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qucircuit.ITERATION_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #setControlQubitsIterationType(ITERATION_TYPE)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_ControlQubitsIterationType()
	 * @model
	 * @generated
	 */
	ITERATION_TYPE getControlQubitsIterationType();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #getControlQubitsIterationType()
	 * @generated
	 */
	void setControlQubitsIterationType(ITERATION_TYPE value);

	/**
	 * Returns the value of the '<em><b>Target Qubits Iteration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qucircuit.ITERATION_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #setTargetQubitsIterationType(ITERATION_TYPE)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_TargetQubitsIterationType()
	 * @model
	 * @generated
	 */
	ITERATION_TYPE getTargetQubitsIterationType();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 */
	void setTargetQubitsIterationType(ITERATION_TYPE value);

	/**
	 * Returns the value of the '<em><b>Increment Block Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Block Target Qubits</em>' attribute.
	 * @see #setIncrementBlockTargetQubits(Boolean)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_IncrementBlockTargetQubits()
	 * @model
	 * @generated
	 */
	Boolean getIncrementBlockTargetQubits();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIncrementBlockTargetQubits <em>Increment Block Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Block Target Qubits</em>' attribute.
	 * @see #getIncrementBlockTargetQubits()
	 * @generated
	 */
	void setIncrementBlockTargetQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Increment Block Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Block Control Qubits</em>' attribute.
	 * @see #setIncrementBlockControlQubits(Boolean)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_IncrementBlockControlQubits()
	 * @model
	 * @generated
	 */
	Boolean getIncrementBlockControlQubits();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIncrementBlockControlQubits <em>Increment Block Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Block Control Qubits</em>' attribute.
	 * @see #getIncrementBlockControlQubits()
	 * @generated
	 */
	void setIncrementBlockControlQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment By</em>' attribute.
	 * @see #setIncrementBy(Integer)
	 * @see qucircuit.QucircuitPackage#getLoopOperation_IncrementBy()
	 * @model
	 * @generated
	 */
	Integer getIncrementBy();

	/**
	 * Sets the value of the '{@link qucircuit.LoopOperation#getIncrementBy <em>Increment By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment By</em>' attribute.
	 * @see #getIncrementBy()
	 * @generated
	 */
	void setIncrementBy(Integer value);

} // LoopOperation
