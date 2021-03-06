/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.TClassContainer;

import TypeGraphBasic.TClass;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TClass Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.Containers.impl.TClassContainerImpl#getTClass <em>TClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TClassContainerImpl extends EObjectImpl implements TClassContainer {
	/**
	 * The cached value of the '{@link #getTClass() <em>TClass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTClass()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> tClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TClassContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TCLASS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TClass> getTClass() {
		if (tClass == null) {
			tClass = new EObjectResolvingEList<TClass>(TClass.class, this,
					ContainersPackage.TCLASS_CONTAINER__TCLASS);
		}
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContainersPackage.TCLASS_CONTAINER__TCLASS:
			return getTClass();
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
		case ContainersPackage.TCLASS_CONTAINER__TCLASS:
			getTClass().clear();
			getTClass().addAll((Collection<? extends TClass>) newValue);
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
		case ContainersPackage.TCLASS_CONTAINER__TCLASS:
			getTClass().clear();
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
		case ContainersPackage.TCLASS_CONTAINER__TCLASS:
			return tClass != null && !tClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TClassContainerImpl
