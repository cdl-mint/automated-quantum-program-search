/**
 */
package qucircuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.RangeSelector#getBegin <em>Begin</em>}</li>
 *   <li>{@link qucircuit.RangeSelector#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getRangeSelector()
 * @model
 * @generated
 */
public interface RangeSelector extends Selector {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(Integer)
	 * @see qucircuit.QucircuitPackage#getRangeSelector_Begin()
	 * @model
	 * @generated
	 */
	Integer getBegin();

	/**
	 * Sets the value of the '{@link qucircuit.RangeSelector#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Integer)
	 * @see qucircuit.QucircuitPackage#getRangeSelector_End()
	 * @model
	 * @generated
	 */
	Integer getEnd();

	/**
	 * Sets the value of the '{@link qucircuit.RangeSelector#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Integer value);

} // RangeSelector
