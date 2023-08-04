/**
 */
package quope;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see quope.QuopePackage
 * @generated
 */
public interface QuopeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuopeFactory eINSTANCE = quope.impl.QuopeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quantum Operation Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantum Operation Library</em>'.
	 * @generated
	 */
	QuantumOperationLibrary createQuantumOperationLibrary();

	/**
	 * Returns a new object of class '<em>Concrete Quantum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Quantum Operation</em>'.
	 * @generated
	 */
	ConcreteQuantumOperation createConcreteQuantumOperation();

	/**
	 * Returns a new object of class '<em>Fixed Quantum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Quantum Operation</em>'.
	 * @generated
	 */
	FixedQuantumOperation createFixedQuantumOperation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Concrete Loop Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Loop Operation</em>'.
	 * @generated
	 */
	ConcreteLoopOperation createConcreteLoopOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuopePackage getQuopePackage();

} //QuopeFactory
