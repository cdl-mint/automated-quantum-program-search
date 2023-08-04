/**
 */
package quope;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.AbstractQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 *   <li>{@link quope.AbstractQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}</li>
 *   <li>{@link quope.AbstractQuantumOperation#getReversible <em>Reversible</em>}</li>
 *   <li>{@link quope.AbstractQuantumOperation#getType <em>Type</em>}</li>
 *   <li>{@link quope.AbstractQuantumOperation#getReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getAbstractQuantumOperation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQuantumOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #setPaletteIconPath(String)
	 * @see quope.QuopePackage#getAbstractQuantumOperation_PaletteIconPath()
	 * @model
	 * @generated
	 */
	String getPaletteIconPath();

	/**
	 * Sets the value of the '{@link quope.AbstractQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #getPaletteIconPath()
	 * @generated
	 */
	void setPaletteIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Icon Path</em>' attribute.
	 * @see #setStyleIconPath(String)
	 * @see quope.QuopePackage#getAbstractQuantumOperation_StyleIconPath()
	 * @model
	 * @generated
	 */
	String getStyleIconPath();

	/**
	 * Sets the value of the '{@link quope.AbstractQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Icon Path</em>' attribute.
	 * @see #getStyleIconPath()
	 * @generated
	 */
	void setStyleIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Reversible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversible</em>' attribute.
	 * @see #setReversible(Boolean)
	 * @see quope.QuopePackage#getAbstractQuantumOperation_Reversible()
	 * @model
	 * @generated
	 */
	Boolean getReversible();

	/**
	 * Sets the value of the '{@link quope.AbstractQuantumOperation#getReversible <em>Reversible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversible</em>' attribute.
	 * @see #getReversible()
	 * @generated
	 */
	void setReversible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see quope.QuopePackage#getAbstractQuantumOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link quope.AbstractQuantumOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' reference.
	 * @see #setReverse(AbstractQuantumOperation)
	 * @see quope.QuopePackage#getAbstractQuantumOperation_Reverse()
	 * @model
	 * @generated
	 */
	AbstractQuantumOperation getReverse();

	/**
	 * Sets the value of the '{@link quope.AbstractQuantumOperation#getReverse <em>Reverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' reference.
	 * @see #getReverse()
	 * @generated
	 */
	void setReverse(AbstractQuantumOperation value);

} // AbstractQuantumOperation
