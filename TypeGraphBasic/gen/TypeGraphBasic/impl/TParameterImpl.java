/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TParameter;
import TypeGraphBasic.TypeGraphBasicPackage;

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
 * An implementation of the model object '<em><b>TParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TParameterImpl#getNext <em>Next</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TParameterImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TParameterImpl#getTClass <em>TClass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TParameterImpl extends EObjectImpl implements TParameter {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected TParameter next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected TParameter previous;

	/**
	 * The cached value of the '{@link #getTClass() <em>TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTClass()
	 * @generated
	 * @ordered
	 */
	protected TClass tClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TPARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (TParameter) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TypeGraphBasicPackage.TPARAMETER__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(TParameter newNext,
			NotificationChain msgs) {
		TParameter oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TypeGraphBasicPackage.TPARAMETER__NEXT,
					oldNext, newNext);
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
	public void setNext(TParameter newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						TypeGraphBasicPackage.TPARAMETER__PREVIOUS,
						TParameter.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this,
						TypeGraphBasicPackage.TPARAMETER__PREVIOUS,
						TParameter.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TPARAMETER__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject) previous;
			previous = (TParameter) eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TypeGraphBasicPackage.TPARAMETER__PREVIOUS,
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
	public TParameter basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(TParameter newPrevious,
			NotificationChain msgs) {
		TParameter oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					TypeGraphBasicPackage.TPARAMETER__PREVIOUS, oldPrevious,
					newPrevious);
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
	public void setPrevious(TParameter newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						TypeGraphBasicPackage.TPARAMETER__NEXT,
						TParameter.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject) newPrevious).eInverseAdd(this,
						TypeGraphBasicPackage.TPARAMETER__NEXT,
						TParameter.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TPARAMETER__PREVIOUS, newPrevious,
					newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass getTClass() {
		if (tClass != null && tClass.eIsProxy()) {
			InternalEObject oldTClass = (InternalEObject) tClass;
			tClass = (TClass) eResolveProxy(oldTClass);
			if (tClass != oldTClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TypeGraphBasicPackage.TPARAMETER__TCLASS,
							oldTClass, tClass));
			}
		}
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClass basicGetTClass() {
		return tClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTClass(TClass newTClass) {
		TClass oldTClass = tClass;
		tClass = newTClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TPARAMETER__TCLASS, oldTClass, tClass));
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this,
						TypeGraphBasicPackage.TPARAMETER__PREVIOUS,
						TParameter.class, msgs);
			return basicSetNext((TParameter) otherEnd, msgs);
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			if (previous != null)
				msgs = ((InternalEObject) previous).eInverseRemove(this,
						TypeGraphBasicPackage.TPARAMETER__NEXT,
						TParameter.class, msgs);
			return basicSetPrevious((TParameter) otherEnd, msgs);
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			return basicSetNext(null, msgs);
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			return basicSetPrevious(null, msgs);
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			if (resolve)
				return getPrevious();
			return basicGetPrevious();
		case TypeGraphBasicPackage.TPARAMETER__TCLASS:
			if (resolve)
				return getTClass();
			return basicGetTClass();
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			setNext((TParameter) newValue);
			return;
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			setPrevious((TParameter) newValue);
			return;
		case TypeGraphBasicPackage.TPARAMETER__TCLASS:
			setTClass((TClass) newValue);
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			setNext((TParameter) null);
			return;
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			setPrevious((TParameter) null);
			return;
		case TypeGraphBasicPackage.TPARAMETER__TCLASS:
			setTClass((TClass) null);
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
		case TypeGraphBasicPackage.TPARAMETER__NEXT:
			return next != null;
		case TypeGraphBasicPackage.TPARAMETER__PREVIOUS:
			return previous != null;
		case TypeGraphBasicPackage.TPARAMETER__TCLASS:
			return tClass != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TParameterImpl
