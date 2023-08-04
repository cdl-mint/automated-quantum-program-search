/**
 */
package qucircuit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qucircuit.QuantumCircuit;
import qucircuit.QucircuitFactory;
import qucircuit.QucircuitPackage;

/**
 * This is the item provider adapter for a {@link qucircuit.QuantumCircuit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantumCircuitItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumCircuitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNrOfGatesPropertyDescriptor(object);
			addDepthPropertyDescriptor(object);
			addNrOfNonlocalGatesPropertyDescriptor(object);
			addNrOfParamsPropertyDescriptor(object);
			addOverlapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nr Of Gates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrOfGatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantumCircuit_nrOfGates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantumCircuit_nrOfGates_feature", "_UI_QuantumCircuit_type"),
				 QucircuitPackage.Literals.QUANTUM_CIRCUIT__NR_OF_GATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantumCircuit_depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantumCircuit_depth_feature", "_UI_QuantumCircuit_type"),
				 QucircuitPackage.Literals.QUANTUM_CIRCUIT__DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Of Nonlocal Gates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrOfNonlocalGatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantumCircuit_nrOfNonlocalGates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantumCircuit_nrOfNonlocalGates_feature", "_UI_QuantumCircuit_type"),
				 QucircuitPackage.Literals.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nr Of Params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrOfParamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantumCircuit_nrOfParams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantumCircuit_nrOfParams_feature", "_UI_QuantumCircuit_type"),
				 QucircuitPackage.Literals.QUANTUM_CIRCUIT__NR_OF_PARAMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overlap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuantumCircuit_overlap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuantumCircuit_overlap_feature", "_UI_QuantumCircuit_type"),
				 QucircuitPackage.Literals.QUANTUM_CIRCUIT__OVERLAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QucircuitPackage.Literals.QUANTUM_CIRCUIT__QUANTUM_REGISTERS);
			childrenFeatures.add(QucircuitPackage.Literals.QUANTUM_CIRCUIT__CLASSIC_REGISTERS);
			childrenFeatures.add(QucircuitPackage.Literals.QUANTUM_CIRCUIT__LAYERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns QuantumCircuit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QuantumCircuit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QuantumCircuit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_QuantumCircuit_type") :
			getString("_UI_QuantumCircuit_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(QuantumCircuit.class)) {
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES:
			case QucircuitPackage.QUANTUM_CIRCUIT__DEPTH:
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES:
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS:
			case QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(QucircuitPackage.Literals.QUANTUM_CIRCUIT__QUANTUM_REGISTERS,
				 QucircuitFactory.eINSTANCE.createQuantumRegister()));

		newChildDescriptors.add
			(createChildParameter
				(QucircuitPackage.Literals.QUANTUM_CIRCUIT__CLASSIC_REGISTERS,
				 QucircuitFactory.eINSTANCE.createClassicRegister()));

		newChildDescriptors.add
			(createChildParameter
				(QucircuitPackage.Literals.QUANTUM_CIRCUIT__LAYERS,
				 QucircuitFactory.eINSTANCE.createLayer()));
	}

}
