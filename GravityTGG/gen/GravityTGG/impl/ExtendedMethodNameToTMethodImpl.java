/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedMethodName;

import GravityTGG.ExtendedMethodNameToTMethod;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Method Name To TMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.ExtendedMethodNameToTMethodImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.impl.ExtendedMethodNameToTMethodImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedMethodNameToTMethodImpl extends AbstractCorrespondenceImpl
		implements ExtendedMethodNameToTMethod {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExtendedMethodName source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMethod target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedMethodNameToTMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.EXTENDED_METHOD_NAME_TO_TMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodName getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ExtendedMethodName) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodName basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExtendedMethodName newSource) {
		ExtendedMethodName oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TMethod) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TMethod newTarget) {
		TMethod oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE:
			setSource((ExtendedMethodName) newValue);
			return;
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET:
			setTarget((TMethod) newValue);
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
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE:
			setSource((ExtendedMethodName) null);
			return;
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET:
			setTarget((TMethod) null);
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
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__SOURCE:
			return source != null;
		case GravityTGGPackage.EXTENDED_METHOD_NAME_TO_TMETHOD__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedMethodNameToTMethodImpl
