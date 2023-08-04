/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Measurement#getClassicBits <em>Classic Bits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends QuantumOperation {
	/**
	 * Returns the value of the '<em><b>Classic Bits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Bits</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getMeasurement_ClassicBits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Selector> getClassicBits();

} // Measurement
