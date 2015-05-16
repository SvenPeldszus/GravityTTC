/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.java.types.Type;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedTypeImpl#isIsFromLib <em>Is From Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedTypeImpl extends EObjectImpl implements ExtendedType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFromLib() <em>Is From Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFromLib()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FROM_LIB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFromLib() <em>Is From Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFromLib()
	 * @generated
	 * @ordered
	 */
	protected boolean isFromLib = IS_FROM_LIB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_TYPE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_TYPE__TYPE_NAME,
					oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFromLib() {
		return isFromLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFromLib(boolean newIsFromLib) {
		boolean oldIsFromLib = isFromLib;
		isFromLib = newIsFromLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtendedJamoppPackage.EXTENDED_TYPE__IS_FROM_LIB,
					oldIsFromLib, isFromLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE_NAME:
			return getTypeName();
		case ExtendedJamoppPackage.EXTENDED_TYPE__IS_FROM_LIB:
			return isIsFromLib();
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
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE:
			setType((Type) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE_NAME:
			setTypeName((String) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_TYPE__IS_FROM_LIB:
			setIsFromLib((Boolean) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE:
			setType((Type) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE_NAME:
			setTypeName(TYPE_NAME_EDEFAULT);
			return;
		case ExtendedJamoppPackage.EXTENDED_TYPE__IS_FROM_LIB:
			setIsFromLib(IS_FROM_LIB_EDEFAULT);
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
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE:
			return type != null;
		case ExtendedJamoppPackage.EXTENDED_TYPE__TYPE_NAME:
			return TYPE_NAME_EDEFAULT == null ? typeName != null
					: !TYPE_NAME_EDEFAULT.equals(typeName);
		case ExtendedJamoppPackage.EXTENDED_TYPE__IS_FROM_LIB:
			return isFromLib != IS_FROM_LIB_EDEFAULT;
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", isFromLib: ");
		result.append(isFromLib);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedTypeImpl
