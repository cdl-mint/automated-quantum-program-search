/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Composite Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.AbstractCompositeGate#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getAbstractCompositeGate()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCompositeGate extends AbstractQuantumGate {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see qucircuit.QucircuitPackage#getAbstractCompositeGate_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // AbstractCompositeGate
