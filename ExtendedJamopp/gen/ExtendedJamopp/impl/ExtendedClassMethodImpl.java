/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameterList;
import ExtendedJamopp.ExtendedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.members.impl.ClassMethodImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Class Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedClassMethodImpl#getExtendedMethodName <em>Extended Method Name</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedClassMethodImpl#getParameter_list <em>Parameter list</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedClassMethodImpl#getExtendedReturnType <em>Extended Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedClassMethodImpl extends ClassMethodImpl implements
		ExtendedClassMethod {
	/**
	 * The cached value of the '{@link #getExtendedMethodName() <em>Extended Method Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedMethodName()
	 * @generated
	 * @ordered
	 */
	protected ExtendedMethodName extendedMethodName;

	/**
	 * The cached value of the '{@link #getParameter_list() <em>Parameter list</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_list()
	 * @generated
	 * @ordered
	 */
	protected ExtendedParameterList parameter_list;

	/**
	 * The cached value of the '{@link #getExtendedReturnType() <em>Extended Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedReturnType()
	 * @generated
	 * @ordered
	 */
	protected ExtendedType extendedReturnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedClassMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_CLASS_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodName getExtendedMethodName() {
		if (extendedMethodName != null && extendedMethodName.eIsProxy()) {
			InternalEObject oldExtendedMethodName = (InternalEObject) extendedMethodName;
			extendedMethodName = (ExtendedMethodName) eResolveProxy(oldExtendedMethodName);
			if (extendedMethodName != oldExtendedMethodName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME,
							oldExtendedMethodName, extendedMethodName));
			}
		}
		return extendedMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedMethodName basicGetExtendedMethodName() {
		return extendedMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedMethodName(
			ExtendedMethodName newExtendedMethodName, NotificationChain msgs) {
		ExtendedMethodName oldExtendedMethodName = extendedMethodName;
		extendedMethodName = newExtendedMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME,
					oldExtendedMethodName, newExtendedMethodName);
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
	public void setExtendedMethodName(ExtendedMethodName newExtendedMethodName) {
		if (newExtendedMethodName != extendedMethodName) {
			NotificationChain msgs = null;
			if (extendedMethodName != null)
				msgs = ((InternalEObject) extendedMethodName)
						.eInverseRemove(
								this,
								ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD,
								ExtendedMethodName.class, msgs);
			if (newExtendedMethodName != null)
				msgs = ((InternalEObject) newExtendedMethodName)
						.eInverseAdd(
								this,
								ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD,
								ExtendedMethodName.class, msgs);
			msgs = basicSetExtendedMethodName(newExtendedMethodName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME,
					newExtendedMethodName, newExtendedMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterList getParameter_list() {
		if (parameter_list != null && parameter_list.eIsProxy()) {
			InternalEObject oldParameter_list = (InternalEObject) parameter_list;
			parameter_list = (ExtendedParameterList) eResolveProxy(oldParameter_list);
			if (parameter_list != oldParameter_list) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST,
							oldParameter_list, parameter_list));
			}
		}
		return parameter_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameterList basicGetParameter_list() {
		return parameter_list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter_list(
			ExtendedParameterList newParameter_list, NotificationChain msgs) {
		ExtendedParameterList oldParameter_list = parameter_list;
		parameter_list = newParameter_list;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST,
					oldParameter_list, newParameter_list);
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
	public void setParameter_list(ExtendedParameterList newParameter_list) {
		if (newParameter_list != parameter_list) {
			NotificationChain msgs = null;
			if (parameter_list != null)
				msgs = ((InternalEObject) parameter_list).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS,
						ExtendedParameterList.class, msgs);
			if (newParameter_list != null)
				msgs = ((InternalEObject) newParameter_list).eInverseAdd(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS,
						ExtendedParameterList.class, msgs);
			msgs = basicSetParameter_list(newParameter_list, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST,
					newParameter_list, newParameter_list));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedType getExtendedReturnType() {
		return extendedReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedReturnType(
			ExtendedType newExtendedReturnType, NotificationChain msgs) {
		ExtendedType oldExtendedReturnType = extendedReturnType;
		extendedReturnType = newExtendedReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE,
					oldExtendedReturnType, newExtendedReturnType);
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
	public void setExtendedReturnType(ExtendedType newExtendedReturnType) {
		if (newExtendedReturnType != extendedReturnType) {
			NotificationChain msgs = null;
			if (extendedReturnType != null)
				msgs = ((InternalEObject) extendedReturnType)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE,
								null, msgs);
			if (newExtendedReturnType != null)
				msgs = ((InternalEObject) newExtendedReturnType)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE,
								null, msgs);
			msgs = basicSetExtendedReturnType(newExtendedReturnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE,
					newExtendedReturnType, newExtendedReturnType));
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			if (extendedMethodName != null)
				msgs = ((InternalEObject) extendedMethodName)
						.eInverseRemove(
								this,
								ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD,
								ExtendedMethodName.class, msgs);
			return basicSetExtendedMethodName((ExtendedMethodName) otherEnd,
					msgs);
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			if (parameter_list != null)
				msgs = ((InternalEObject) parameter_list).eInverseRemove(this,
						ExtendedJamoppPackage.EXTENDED_PARAMETER_LIST__METHODS,
						ExtendedParameterList.class, msgs);
			return basicSetParameter_list((ExtendedParameterList) otherEnd,
					msgs);
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			return basicSetExtendedMethodName(null, msgs);
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			return basicSetParameter_list(null, msgs);
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE:
			return basicSetExtendedReturnType(null, msgs);
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			if (resolve)
				return getExtendedMethodName();
			return basicGetExtendedMethodName();
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			if (resolve)
				return getParameter_list();
			return basicGetParameter_list();
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE:
			return getExtendedReturnType();
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			setExtendedMethodName((ExtendedMethodName) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			setParameter_list((ExtendedParameterList) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE:
			setExtendedReturnType((ExtendedType) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			setExtendedMethodName((ExtendedMethodName) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			setParameter_list((ExtendedParameterList) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE:
			setExtendedReturnType((ExtendedType) null);
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
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME:
			return extendedMethodName != null;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__PARAMETER_LIST:
			return parameter_list != null;
		case ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_RETURN_TYPE:
			return extendedReturnType != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedClassMethodImpl
