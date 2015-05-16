/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.PUMContainer;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PUM Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.Containers.impl.PUMContainerImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link Refactorings.Containers.impl.PUMContainerImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PUMContainerImpl extends RefactoringContainerImpl implements
		PUMContainer {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected TClass parent;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PUMContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.PUM_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (TClass) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ContainersPackage.PUM_CONTAINER__PARENT, oldParent,
							parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TClass newParent) {
		TClass oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ContainersPackage.PUM_CONTAINER__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject) method;
			method = (TMethodSignature) eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ContainersPackage.PUM_CONTAINER__METHOD, oldMethod,
							method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(TMethodSignature newMethod) {
		TMethodSignature oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ContainersPackage.PUM_CONTAINER__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContainersPackage.PUM_CONTAINER__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case ContainersPackage.PUM_CONTAINER__METHOD:
			if (resolve)
				return getMethod();
			return basicGetMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ContainersPackage.PUM_CONTAINER__PARENT:
			setParent((TClass) newValue);
			return;
		case ContainersPackage.PUM_CONTAINER__METHOD:
			setMethod((TMethodSignature) newValue);
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
		case ContainersPackage.PUM_CONTAINER__PARENT:
			setParent((TClass) null);
			return;
		case ContainersPackage.PUM_CONTAINER__METHOD:
			setMethod((TMethodSignature) null);
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
		case ContainersPackage.PUM_CONTAINER__PARENT:
			return parent != null;
		case ContainersPackage.PUM_CONTAINER__METHOD:
			return method != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PUMContainerImpl
