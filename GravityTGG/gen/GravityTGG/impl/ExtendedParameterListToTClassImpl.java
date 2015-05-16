/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedParameterListToTClass;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter List To TClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.ExtendedParameterListToTClassImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.impl.ExtendedParameterListToTClassImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedParameterListToTClassImpl extends
		AbstractCorrespondenceImpl implements ExtendedParameterListToTClass {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TClass target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameterList source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedParameterListToTClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.EXTENDED_PARAMETER_LIST_TO_TCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TClass) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET,
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
	public TClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TClass newTarget) {
		TClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterList getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ExtendedParameterList) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE,
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
	public ExtendedParameterList basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExtendedParameterList newSource) {
		ExtendedParameterList oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET:
			setTarget((TClass) newValue);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE:
			setSource((ExtendedParameterList) newValue);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET:
			setTarget((TClass) null);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE:
			setSource((ExtendedParameterList) null);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__TARGET:
			return target != null;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TCLASS__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedParameterListToTClassImpl
