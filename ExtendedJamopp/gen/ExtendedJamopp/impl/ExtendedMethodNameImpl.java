/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedClassMethod;
import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedMethodName;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Method Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedMethodNameImpl#getExtendedClassMethod <em>Extended Class Method</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedMethodNameImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedMethodNameImpl extends EObjectImpl implements
		ExtendedMethodName {
	/**
	 * The cached value of the '{@link #getExtendedClassMethod() <em>Extended Class Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClassMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedClassMethod> extendedClassMethod;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedMethodNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_METHOD_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedClassMethod> getExtendedClassMethod() {
		if (extendedClassMethod == null) {
			extendedClassMethod = new EObjectWithInverseResolvingEList<ExtendedClassMethod>(
					ExtendedClassMethod.class,
					this,
					ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD,
					ExtendedJamoppPackage.EXTENDED_CLASS_METHOD__EXTENDED_METHOD_NAME);
		}
		return extendedClassMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_METHOD_NAME__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtendedClassMethod())
					.basicAdd(otherEnd, msgs);
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
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			return ((InternalEList<?>) getExtendedClassMethod()).basicRemove(
					otherEnd, msgs);
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
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			return getExtendedClassMethod();
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			getExtendedClassMethod().clear();
			getExtendedClassMethod().addAll(
					(Collection<? extends ExtendedClassMethod>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__NAME:
			setName((String) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			getExtendedClassMethod().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__NAME:
			setName(NAME_EDEFAULT);
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
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__EXTENDED_CLASS_METHOD:
			return extendedClassMethod != null
					&& !extendedClassMethod.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_METHOD_NAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedMethodNameImpl
