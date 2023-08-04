/**
 */
package qucircuit.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qucircuit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qucircuit.QucircuitPackage
 * @generated
 */
public class QucircuitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QucircuitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QucircuitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QucircuitPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QucircuitSwitch<Adapter> modelSwitch =
		new QucircuitSwitch<Adapter>() {
			@Override
			public Adapter caseQuantumCircuit(QuantumCircuit object) {
				return createQuantumCircuitAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseQuantumRegister(QuantumRegister object) {
				return createQuantumRegisterAdapter();
			}
			@Override
			public Adapter caseClassicRegister(ClassicRegister object) {
				return createClassicRegisterAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseClassicControl(ClassicControl object) {
				return createClassicControlAdapter();
			}
			@Override
			public Adapter caseQuantumOperation(QuantumOperation object) {
				return createQuantumOperationAdapter();
			}
			@Override
			public Adapter caseAbstractQuantumGate(AbstractQuantumGate object) {
				return createAbstractQuantumGateAdapter();
			}
			@Override
			public Adapter caseStatePreparation(StatePreparation object) {
				return createStatePreparationAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseElementaryQuantumGate(ElementaryQuantumGate object) {
				return createElementaryQuantumGateAdapter();
			}
			@Override
			public Adapter caseCompositeQuantumGate(CompositeQuantumGate object) {
				return createCompositeQuantumGateAdapter();
			}
			@Override
			public Adapter caseAngleParameter(AngleParameter object) {
				return createAngleParameterAdapter();
			}
			@Override
			public Adapter caseAbstractCompositeGate(AbstractCompositeGate object) {
				return createAbstractCompositeGateAdapter();
			}
			@Override
			public Adapter caseLoopOperation(LoopOperation object) {
				return createLoopOperationAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object) {
				return createSelectorAdapter();
			}
			@Override
			public Adapter caseElementSelector(ElementSelector object) {
				return createElementSelectorAdapter();
			}
			@Override
			public Adapter caseRangeSelector(RangeSelector object) {
				return createRangeSelectorAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.QuantumCircuit <em>Quantum Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.QuantumCircuit
	 * @generated
	 */
	public Adapter createQuantumCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.QuantumRegister <em>Quantum Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.QuantumRegister
	 * @generated
	 */
	public Adapter createQuantumRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.ClassicRegister <em>Classic Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.ClassicRegister
	 * @generated
	 */
	public Adapter createClassicRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.ClassicControl <em>Classic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.ClassicControl
	 * @generated
	 */
	public Adapter createClassicControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.QuantumOperation <em>Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.QuantumOperation
	 * @generated
	 */
	public Adapter createQuantumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.AbstractQuantumGate <em>Abstract Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.AbstractQuantumGate
	 * @generated
	 */
	public Adapter createAbstractQuantumGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.StatePreparation <em>State Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.StatePreparation
	 * @generated
	 */
	public Adapter createStatePreparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.ElementaryQuantumGate <em>Elementary Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.ElementaryQuantumGate
	 * @generated
	 */
	public Adapter createElementaryQuantumGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.CompositeQuantumGate <em>Composite Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.CompositeQuantumGate
	 * @generated
	 */
	public Adapter createCompositeQuantumGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.AngleParameter <em>Angle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.AngleParameter
	 * @generated
	 */
	public Adapter createAngleParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.AbstractCompositeGate <em>Abstract Composite Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.AbstractCompositeGate
	 * @generated
	 */
	public Adapter createAbstractCompositeGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.LoopOperation <em>Loop Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.LoopOperation
	 * @generated
	 */
	public Adapter createLoopOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.ElementSelector <em>Element Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.ElementSelector
	 * @generated
	 */
	public Adapter createElementSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.RangeSelector <em>Range Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.RangeSelector
	 * @generated
	 */
	public Adapter createRangeSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qucircuit.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qucircuit.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QucircuitAdapterFactory
