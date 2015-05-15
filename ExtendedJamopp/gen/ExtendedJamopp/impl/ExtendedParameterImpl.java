/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedParameter;
import ExtendedJamopp.ExtendedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterImpl#getNext <em>Next</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedParameterImpl#getExtendedParameterType <em>Extended Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedParameterImpl extends EObjectImpl implements
		ExtendedParameter {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameter next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameter previous;

	/**
	 * The cached value of the '{@link #getExtendedParameterType() <em>Extended Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedParameterType()
	 * @generated
	 * @ordered
	 */
	protected ExtendedType extendedParameterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (ExtendedParameter) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT,
							oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(ExtendedParameter newNext,
			NotificationChain msgs) {
		ExtendedParameter oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT, oldNext,
					newNext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ExtendedParameter newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
						ExtendedParameter.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
						ExtendedParameter.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT, newNext,
					newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (ExtendedParameter) eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
							oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(ExtendedParameter newPrevious,
			NotificationChain msgs) {
		ExtendedParameter oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
					oldPrevious, newPrevious);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ExtendedParameter newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT,
						ExtendedParameter.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT,
						ExtendedParameter.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
					newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedType getExtendedParameterType() {
		return extendedParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedParameterType(
			ExtendedType newExtendedParameterType, NotificationChain msgs) {
		ExtendedType oldExtendedParameterType = extendedParameterType;
		extendedParameterType = newExtendedParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE,
					oldExtendedParameterType, newExtendedParameterType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedParameterType(ExtendedType newExtendedParameterType) {
		if (newExtendedParameterType != extendedParameterType) {
			NotificationChain msgs = null;
			if (extendedParameterType != null)
				msgs = ((InternalEObject) extendedParameterType)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE,
								null, msgs);
			if (newExtendedParameterType != null)
				msgs = ((InternalEObject) newExtendedParameterType)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE,
								null, msgs);
			msgs = basicSetExtendedParameterType(newExtendedParameterType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE,
					newExtendedParameterType, newExtendedParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS,
						ExtendedParameter.class, msgs);
			return basicSetNext((ExtendedParameter) otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT,
						ExtendedParameter.class, msgs);
			return basicSetPrevious((ExtendedParameter) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			return basicSetNext(null, msgs);
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			return basicSetPrevious(null, msgs);
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE:
			return basicSetExtendedParameterType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE:
			return getExtendedParameterType();
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			setNext((ExtendedParameter) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			setPrevious((ExtendedParameter) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE:
			setExtendedParameterType((ExtendedType) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			setNext((ExtendedParameter) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			setPrevious((ExtendedParameter) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE:
			setExtendedParameterType((ExtendedType) null);
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
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__NEXT:
			return next != null;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__PREVIOUS:
			return previous != null;
		case ExtendedJamoppPackage.EXTENDED_PARAMETER__EXTENDED_PARAMETER_TYPE:
			return extendedParameterType != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedParameterImpl
