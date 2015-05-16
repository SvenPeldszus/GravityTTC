/**
 */
package GravityTGG.impl;

import ExtendedJamopp.ExtendedJamoppPackageElement;

import GravityTGG.ExtendedJamoppPackageElementToTPackage;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Jamopp Package Element To TPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.impl.ExtendedJamoppPackageElementToTPackageImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedJamoppPackageElementToTPackageImpl extends
		AbstractCorrespondenceImpl implements
		ExtendedJamoppPackageElementToTPackage {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TPackage target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExtendedJamoppPackageElement source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedJamoppPackageElementToTPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TPackage) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET,
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
	public TPackage basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TPackage newTarget) {
		TPackage oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackageElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ExtendedJamoppPackageElement) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE,
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
	public ExtendedJamoppPackageElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExtendedJamoppPackageElement newSource) {
		ExtendedJamoppPackageElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE,
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
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE:
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
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET:
			setTarget((TPackage) newValue);
			return;
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE:
			setSource((ExtendedJamoppPackageElement) newValue);
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
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET:
			setTarget((TPackage) null);
			return;
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE:
			setSource((ExtendedJamoppPackageElement) null);
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
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__TARGET:
			return target != null;
		case GravityTGGPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT_TO_TPACKAGE__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedJamoppPackageElementToTPackageImpl
