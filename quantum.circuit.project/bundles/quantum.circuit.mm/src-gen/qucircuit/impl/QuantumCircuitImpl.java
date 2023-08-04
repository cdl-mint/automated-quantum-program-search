/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qucircuit.ClassicRegister;
import qucircuit.Layer;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getQuantumRegisters <em>Quantum Registers</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getClassicRegisters <em>Classic Registers</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getNrOfGates <em>Nr Of Gates</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getNrOfNonlocalGates <em>Nr Of Nonlocal Gates</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getNrOfParams <em>Nr Of Params</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getOverlap <em>Overlap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumCircuitImpl extends NamedElementImpl implements QuantumCircuit {
	/**
	 * The cached value of the '{@link #getQuantumRegisters() <em>Quantum Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantumRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantumRegister> quantumRegisters;

	/**
	 * The cached value of the '{@link #getClassicRegisters() <em>Classic Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassicRegister> classicRegisters;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The default value of the '{@link #getNrOfGates() <em>Nr Of Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGates()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_GATES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfGates() <em>Nr Of Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfGates()
	 * @generated
	 * @ordered
	 */
	protected int nrOfGates = NR_OF_GATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfNonlocalGates() <em>Nr Of Nonlocal Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNonlocalGates()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_NONLOCAL_GATES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfNonlocalGates() <em>Nr Of Nonlocal Gates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfNonlocalGates()
	 * @generated
	 * @ordered
	 */
	protected int nrOfNonlocalGates = NR_OF_NONLOCAL_GATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfParams() <em>Nr Of Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfParams()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_PARAMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfParams() <em>Nr Of Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfParams()
	 * @generated
	 * @ordered
	 */
	protected int nrOfParams = NR_OF_PARAMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlap() <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlap()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERLAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverlap() <em>Overlap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlap()
	 * @generated
	 * @ordered
	 */
	protected double overlap = OVERLAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.QUANTUM_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantumRegister> getQuantumRegisters() {
		if (quantumRegisters == null) {
			quantumRegisters = new EObjectContainmentEList<QuantumRegister>(QuantumRegister.class, this, QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS);
		}
		return quantumRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassicRegister> getClassicRegisters() {
		if (classicRegisters == null) {
			classicRegisters = new EObjectContainmentEList<ClassicRegister>(ClassicRegister.class, this, QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS);
		}
		return classicRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, QucircuitPackage.QUANTUM_CIRCUIT__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfGates() {
		return nrOfGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfGates(int newNrOfGates) {
		int oldNrOfGates = nrOfGates;
		nrOfGates = newNrOfGates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES, oldNrOfGates, nrOfGates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_CIRCUIT__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfNonlocalGates() {
		return nrOfNonlocalGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfNonlocalGates(int newNrOfNonlocalGates) {
		int oldNrOfNonlocalGates = nrOfNonlocalGates;
		nrOfNonlocalGates = newNrOfNonlocalGates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES, oldNrOfNonlocalGates, nrOfNonlocalGates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfParams() {
		return nrOfParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfParams(int newNrOfParams) {
		int oldNrOfParams = nrOfParams;
		nrOfParams = newNrOfParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS, oldNrOfParams, nrOfParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverlap() {
		return overlap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlap(double newOverlap) {
		double oldOverlap = overlap;
		overlap = newOverlap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP, oldOverlap, overlap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return ((InternalEList<?>)getQuantumRegisters()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return ((InternalEList<?>)getClassicRegisters()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return getQuantumRegisters();
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return getClassicRegisters();
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return getLayers();
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES:
				return getNrOfGates();
			case QucircuitPackage.QUANTUM_CIRCUIT__DEPTH:
				return getDepth();
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES:
				return getNrOfNonlocalGates();
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS:
				return getNrOfParams();
			case QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP:
				return getOverlap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				getQuantumRegisters().clear();
				getQuantumRegisters().addAll((Collection<? extends QuantumRegister>)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				getClassicRegisters().clear();
				getClassicRegisters().addAll((Collection<? extends ClassicRegister>)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES:
				setNrOfGates((Integer)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__DEPTH:
				setDepth((Integer)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES:
				setNrOfNonlocalGates((Integer)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS:
				setNrOfParams((Integer)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP:
				setOverlap((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				getQuantumRegisters().clear();
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				getClassicRegisters().clear();
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				getLayers().clear();
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES:
				setNrOfGates(NR_OF_GATES_EDEFAULT);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES:
				setNrOfNonlocalGates(NR_OF_NONLOCAL_GATES_EDEFAULT);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS:
				setNrOfParams(NR_OF_PARAMS_EDEFAULT);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP:
				setOverlap(OVERLAP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return quantumRegisters != null && !quantumRegisters.isEmpty();
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return classicRegisters != null && !classicRegisters.isEmpty();
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return layers != null && !layers.isEmpty();
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_GATES:
				return nrOfGates != NR_OF_GATES_EDEFAULT;
			case QucircuitPackage.QUANTUM_CIRCUIT__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_NONLOCAL_GATES:
				return nrOfNonlocalGates != NR_OF_NONLOCAL_GATES_EDEFAULT;
			case QucircuitPackage.QUANTUM_CIRCUIT__NR_OF_PARAMS:
				return nrOfParams != NR_OF_PARAMS_EDEFAULT;
			case QucircuitPackage.QUANTUM_CIRCUIT__OVERLAP:
				return overlap != OVERLAP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nrOfGates: ");
		result.append(nrOfGates);
		result.append(", depth: ");
		result.append(depth);
		result.append(", nrOfNonlocalGates: ");
		result.append(nrOfNonlocalGates);
		result.append(", nrOfParams: ");
		result.append(nrOfParams);
		result.append(", overlap: ");
		result.append(overlap);
		result.append(')');
		return result.toString();
	}

} //QuantumCircuitImpl
