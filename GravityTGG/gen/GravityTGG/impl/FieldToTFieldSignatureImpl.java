/**
 */
package GravityTGG.impl;

import GravityTGG.FieldToTFieldSignature;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TFieldSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.members.Field;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field To TField Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.FieldToTFieldSignatureImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GravityTGG.impl.FieldToTFieldSignatureImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldToTFieldSignatureImpl extends AbstractCorrespondenceImpl
		implements FieldToTFieldSignature {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TFieldSignature target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Field source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldToTFieldSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.FIELD_TO_TFIELD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFieldSignature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TFieldSignature) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET,
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
	public TFieldSignature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TFieldSignature newTarget) {
		TFieldSignature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Field) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE,
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
	public Field basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Field newSource) {
		Field oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE,
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
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE:
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
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET:
			setTarget((TFieldSignature) newValue);
			return;
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE:
			setSource((Field) newValue);
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
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET:
			setTarget((TFieldSignature) null);
			return;
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE:
			setSource((Field) null);
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
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__TARGET:
			return target != null;
		case GravityTGGPackage.FIELD_TO_TFIELD_SIGNATURE__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldToTFieldSignatureImpl
