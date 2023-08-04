/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Layer#getQuantumOperations <em>Quantum Operations</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getLayer()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel"
 * @generated
 */
public interface Layer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Quantum Operations</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.QuantumOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantum Operations</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getLayer_QuantumOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuantumOperation> getQuantumOperations();

} // Layer
