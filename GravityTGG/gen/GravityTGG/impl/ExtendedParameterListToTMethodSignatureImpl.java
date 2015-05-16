/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedParameterList;

import GravityTGG.ExtendedParameterListToTMethodSignature;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TMethodSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter List To TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.impl.ExtendedParameterListToTMethodSignatureImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedParameterListToTMethodSignatureImpl extends
		AbstractCorrespondenceImpl implements
		ExtendedParameterListToTMethodSignature {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TMethodSignature target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedParameterListToTMethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE;
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
							GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE,
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
					GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TMethodSignature) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET,
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
	public TMethodSignature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TMethodSignature newTarget) {
		TMethodSignature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET,
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET:
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE:
			setSource((ExtendedParameterList) newValue);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET:
			setTarget((TMethodSignature) newValue);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE:
			setSource((ExtendedParameterList) null);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET:
			setTarget((TMethodSignature) null);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__SOURCE:
			return source != null;
		case GravityTGGPackage.EXTENDED_PARAMETER_LIST_TO_TMETHOD_SIGNATURE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedParameterListToTMethodSignatureImpl
