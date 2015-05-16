/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedParameterList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterListImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterListImpl#getValues <em>Values</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterListImpl#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedParameterListImpl extends EObjectImpl implements
		ExtendedParameterList {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedClassMethod> methods;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedParameter> values;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameter first;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedClassMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList<ExtendedClassMethod>(
					ExtendedClassMethod.class, this,
					ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedParameter> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ExtendedParameter>(
					ExtendedParameter.class, this,
					ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject) first;
			first = (ExtendedParameter) eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST,
							oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(ExtendedParameter newFirst) {
		ExtendedParameter oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST,
					oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			return ((InternalEList<?>) getMethods())
					.basicRemove(otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES:
			return ((InternalEList<?>) getValues()).basicRemove(otherEnd, msgs);
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			return getMethods();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES:
			return getValues();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST:
			if (resolve)
				return getFirst();
			return basicGetFirst();
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			getMethods().clear();
			getMethods().addAll(
					(Collection<? extends ExtendedClassMethod>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES:
			getValues().clear();
			getValues().addAll(
					(Collection<? extends ExtendedParameter>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST:
			setFirst((ExtendedParameter) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			getMethods().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES:
			getValues().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST:
			setFirst((ExtendedParameter) null);
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS:
			return methods != null && !methods.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__VALUES:
			return values != null && !values.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__FIRST:
			return first != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedParameterListImpl
