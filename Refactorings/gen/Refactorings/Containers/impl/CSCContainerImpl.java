/**
 */
package Refactorings.Containers.impl;

import Refactorings.Containers.CSCContainer;
import Refactorings.Containers.ContainersPackage;
import Refactorings.Containers.TClassContainer;

import TypeGraphBasic.TClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSC Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.Containers.impl.CSCContainerImpl#getNew_parent <em>New parent</em>}</li>
 *   <li>{@link Refactorings.Containers.impl.CSCContainerImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSCContainerImpl extends RefactoringContainerImpl implements
		CSCContainer {
	/**
	 * The cached value of the '{@link #getNew_parent() <em>New parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_parent()
	 * @generated
	 * @ordered
	 */
	protected TClass new_parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected TClassContainer child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSCContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.CSC_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getNew_parent() {
		if (new_parent != null && new_parent.eIsProxy()) {
			InternalEObject oldNew_parent = (InternalEObject) new_parent;
			new_parent = (TClass) eResolveProxy(oldNew_parent);
			if (new_parent != oldNew_parent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ContainersPackage.CSC_CONTAINER__NEW_PARENT,
							oldNew_parent, new_parent));
			}
		}
		return new_parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetNew_parent() {
		return new_parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_parent(TClass newNew_parent) {
		TClass oldNew_parent = new_parent;
		new_parent = newNew_parent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ContainersPackage.CSC_CONTAINER__NEW_PARENT, oldNew_parent,
					new_parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassContainer getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject) child;
			child = (TClassContainer) eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ContainersPackage.CSC_CONTAINER__CHILD, oldChild,
							child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassContainer basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(TClassContainer newChild) {
		TClassContainer oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ContainersPackage.CSC_CONTAINER__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContainersPackage.CSC_CONTAINER__NEW_PARENT:
			if (resolve)
				return getNew_parent();
			return basicGetNew_parent();
		case ContainersPackage.CSC_CONTAINER__CHILD:
			if (resolve)
				return getChild();
			return basicGetChild();
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
		case ContainersPackage.CSC_CONTAINER__NEW_PARENT:
			setNew_parent((TClass) newValue);
			return;
		case ContainersPackage.CSC_CONTAINER__CHILD:
			setChild((TClassContainer) newValue);
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
		case ContainersPackage.CSC_CONTAINER__NEW_PARENT:
			setNew_parent((TClass) null);
			return;
		case ContainersPackage.CSC_CONTAINER__CHILD:
			setChild((TClassContainer) null);
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
		case ContainersPackage.CSC_CONTAINER__NEW_PARENT:
			return new_parent != null;
		case ContainersPackage.CSC_CONTAINER__CHILD:
			return child != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CSCContainerImpl
