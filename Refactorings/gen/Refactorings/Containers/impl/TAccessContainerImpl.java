/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.TAccessContainer;

import TypeGraphBasic.TMember;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAccess Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.Containers.impl.TAccessContainerImpl#getTMember <em>TMember</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAccessContainerImpl extends EObjectImpl implements
		TAccessContainer {
	/**
	 * The cached value of the '{@link #getTMember() <em>TMember</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMember()
	 * @generated
	 * @ordered
	 */
	protected EList<TMember> tMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAccessContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TACCESS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMember> getTMember() {
		if (tMember == null) {
			tMember = new EObjectResolvingEList<TMember>(TMember.class, this,
					ContainersPackage.TACCESS_CONTAINER__TMEMBER);
		}
		return tMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContainersPackage.TACCESS_CONTAINER__TMEMBER:
			return getTMember();
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
		case ContainersPackage.TACCESS_CONTAINER__TMEMBER:
			getTMember().clear();
			getTMember().addAll((Collection<? extends TMember>) newValue);
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
		case ContainersPackage.TACCESS_CONTAINER__TMEMBER:
			getTMember().clear();
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
		case ContainersPackage.TACCESS_CONTAINER__TMEMBER:
			return tMember != null && !tMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TAccessContainerImpl
