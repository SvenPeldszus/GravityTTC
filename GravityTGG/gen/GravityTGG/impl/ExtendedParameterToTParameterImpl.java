/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedParameter;

import GravityTGG.ExtendedParameterToTParameter;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter To TParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.ExtendedParameterToTParameterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.impl.ExtendedParameterToTParameterImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedParameterToTParameterImpl extends
		AbstractCorrespondenceImpl implements ExtendedParameterToTParameter {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameter source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TParameter target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedParameterToTParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.EXTENDED_PARAMETER_TO_TPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ExtendedParameter) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE,
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
	public ExtendedParameter basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExtendedParameter newSource) {
		ExtendedParameter oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE,
					oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TParameter) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET,
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
	public TParameter basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TParameter newTarget) {
		TParameter oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET,
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
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET:
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
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE:
			setSource((ExtendedParameter) newValue);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET:
			setTarget((TParameter) newValue);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE:
			setSource((ExtendedParameter) null);
			return;
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET:
			setTarget((TParameter) null);
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
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__SOURCE:
			return source != null;
		case GravityTGGPackage.EXTENDED_PARAMETER_TO_TPARAMETER__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedParameterToTParameterImpl
