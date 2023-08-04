/**
 */
package quope.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quope.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuopeFactoryImpl extends EFactoryImpl implements QuopeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuopeFactory init() {
		try {
			QuopeFactory theQuopeFactory = (QuopeFactory) EPackage.Registry.INSTANCE.getEFactory(QuopePackage.eNS_URI);
			if (theQuopeFactory != null) {
				return theQuopeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuopeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuopeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QuopePackage.QUANTUM_OPERATION_LIBRARY:
			return createQuantumOperationLibrary();
		case QuopePackage.CONCRETE_QUANTUM_OPERATION:
			return createConcreteQuantumOperation();
		case QuopePackage.FIXED_QUANTUM_OPERATION:
			return createFixedQuantumOperation();
		case QuopePackage.PARAMETER:
			return createParameter();
		case QuopePackage.CONCRETE_LOOP_OPERATION:
			return createConcreteLoopOperation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumOperationLibrary createQuantumOperationLibrary() {
		QuantumOperationLibraryImpl quantumOperationLibrary = new QuantumOperationLibraryImpl();
		return quantumOperationLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation createConcreteQuantumOperation() {
		ConcreteQuantumOperationImpl concreteQuantumOperation = new ConcreteQuantumOperationImpl();
		return concreteQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedQuantumOperation createFixedQuantumOperation() {
		FixedQuantumOperationImpl fixedQuantumOperation = new FixedQuantumOperationImpl();
		return fixedQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteLoopOperation createConcreteLoopOperation() {
		ConcreteLoopOperationImpl concreteLoopOperation = new ConcreteLoopOperationImpl();
		return concreteLoopOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuopePackage getQuopePackage() {
		return (QuopePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuopePackage getPackage() {
		return QuopePackage.eINSTANCE;
	}

} //QuopeFactoryImpl
