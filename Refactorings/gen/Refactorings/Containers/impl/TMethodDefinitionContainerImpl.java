/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.TMethodDefinitionContainer;

import TypeGraphBasic.TMethodDefinition;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Definition Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.Containers.impl.TMethodDefinitionContainerImpl#getTMethodDefinition <em>TMethod Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMethodDefinitionContainerImpl extends EObjectImpl implements
		TMethodDefinitionContainer {
	/**
	 * The cached value of the '{@link #getTMethodDefinition() <em>TMethod Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMethodDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> tMethodDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodDefinitionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.TMETHOD_DEFINITION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getTMethodDefinition() {
		if (tMethodDefinition == null) {
			tMethodDefinition = new EObjectResolvingEList<TMethodDefinition>(
					TMethodDefinition.class,
					this,
					ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION);
		}
		return tMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION:
			return getTMethodDefinition();
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
		case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION:
			getTMethodDefinition().clear();
			getTMethodDefinition().addAll(
					(Collection<? extends TMethodDefinition>) newValue);
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
		case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION:
			getTMethodDefinition().clear();
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
		case ContainersPackage.TMETHOD_DEFINITION_CONTAINER__TMETHOD_DEFINITION:
			return tMethodDefinition != null && !tMethodDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMethodDefinitionContainerImpl
