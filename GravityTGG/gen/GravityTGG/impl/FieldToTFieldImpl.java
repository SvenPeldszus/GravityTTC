/**
 */
package GravityTGG.impl;

import GravityTGG.FieldToTField;
import GravityTGG.GravityTGGPackage;

import TGGRuntime.impl.AbstractCorrespondenceImpl;

import TypeGraphBasic.TField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.members.Field;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field To TField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.impl.FieldToTFieldImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GravityTGG.impl.FieldToTFieldImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldToTFieldImpl extends AbstractCorrespondenceImpl implements
		FieldToTField {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TField target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldToTFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GravityTGGPackage.Literals.FIELD_TO_TFIELD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GravityTGGPackage.FIELD_TO_TFIELD__SOURCE,
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
					GravityTGGPackage.FIELD_TO_TFIELD__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TField getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (TField) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GravityTGGPackage.FIELD_TO_TFIELD__TARGET,
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
	public TField basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TField newTarget) {
		TField oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GravityTGGPackage.FIELD_TO_TFIELD__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GravityTGGPackage.FIELD_TO_TFIELD__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case GravityTGGPackage.FIELD_TO_TFIELD__TARGET:
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
		case GravityTGGPackage.FIELD_TO_TFIELD__SOURCE:
			setSource((Field) newValue);
			return;
		case GravityTGGPackage.FIELD_TO_TFIELD__TARGET:
			setTarget((TField) newValue);
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
		case GravityTGGPackage.FIELD_TO_TFIELD__SOURCE:
			setSource((Field) null);
			return;
		case GravityTGGPackage.FIELD_TO_TFIELD__TARGET:
			setTarget((TField) null);
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
		case GravityTGGPackage.FIELD_TO_TFIELD__SOURCE:
			return source != null;
		case GravityTGGPackage.FIELD_TO_TFIELD__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldToTFieldImpl
