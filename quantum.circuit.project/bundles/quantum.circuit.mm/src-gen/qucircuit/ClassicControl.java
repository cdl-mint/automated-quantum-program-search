/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classic Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.ClassicControl#getValue <em>Value</em>}</li>
 *   <li>{@link qucircuit.ClassicControl#getClassicRegister <em>Classic Register</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getClassicControl()
 * @model
 * @generated
 */
public interface ClassicControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see qucircuit.QucircuitPackage#getClassicControl_Value()
	 * @model
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link qucircuit.ClassicControl#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Classic Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Register</em>' reference.
	 * @see #setClassicRegister(ClassicRegister)
	 * @see qucircuit.QucircuitPackage#getClassicControl_ClassicRegister()
	 * @model required="true"
	 * @generated
	 */
	ClassicRegister getClassicRegister();

	/**
	 * Sets the value of the '{@link qucircuit.ClassicControl#getClassicRegister <em>Classic Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classic Register</em>' reference.
	 * @see #getClassicRegister()
	 * @generated
	 */
	void setClassicRegister(ClassicRegister value);

} // ClassicControl
