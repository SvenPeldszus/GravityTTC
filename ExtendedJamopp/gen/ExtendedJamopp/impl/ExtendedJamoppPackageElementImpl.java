/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedJamoppPackageElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.containers.CompilationUnit;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl#getPredessor <em>Predessor</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppPackageElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedJamoppPackageElementImpl extends EObjectImpl implements
		ExtendedJamoppPackageElement {
	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedJamoppPackageElement> successor;

	/**
	 * The cached value of the '{@link #getPredessor() <em>Predessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredessor()
	 * @generated
	 * @ordered
	 */
	protected ExtendedJamoppPackageElement predessor;

	/**
	 * The cached value of the '{@link #getCompilationUnit() <em>Compilation Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnit;

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
	protected ExtendedJamoppPackageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_JAMOPP_PACKAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedJamoppPackageElement> getSuccessor() {
		if (successor == null) {
			successor = new EObjectWithInverseResolvingEList<ExtendedJamoppPackageElement>(
					ExtendedJamoppPackageElement.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR);
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackageElement getPredessor() {
		if (predessor != null && predessor.eIsProxy()) {
			InternalEObject oldPredessor = (InternalEObject) predessor;
			predessor = (ExtendedJamoppPackageElement) eResolveProxy(oldPredessor);
			if (predessor != oldPredessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR,
							oldPredessor, predessor));
			}
		}
		return predessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedJamoppPackageElement basicGetPredessor() {
		return predessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredessor(
			ExtendedJamoppPackageElement newPredessor, NotificationChain msgs) {
		ExtendedJamoppPackageElement oldPredessor = predessor;
		predessor = newPredessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR,
					oldPredessor, newPredessor);
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
	public void setPredessor(ExtendedJamoppPackageElement newPredessor) {
		if (newPredessor != predessor) {
			NotificationChain msgs = null;
			if (predessor != null)
				msgs = ((InternalEObject) predessor)
						.eInverseRemove(
								this,
								ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR,
								ExtendedJamoppPackageElement.class, msgs);
			if (newPredessor != null)
				msgs = ((InternalEObject) newPredessor)
						.eInverseAdd(
								this,
								ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR,
								ExtendedJamoppPackageElement.class, msgs);
			msgs = basicSetPredessor(newPredessor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR,
					newPredessor, newPredessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnit() {
		if (compilationUnit == null) {
			compilationUnit = new EObjectResolvingEList<CompilationUnit>(
					CompilationUnit.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT);
		}
		return compilationUnit;
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
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME,
					oldName, name));
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuccessor())
					.basicAdd(otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			if (predessor != null)
				msgs = ((InternalEObject) predessor)
						.eInverseRemove(
								this,
								ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR,
								ExtendedJamoppPackageElement.class, msgs);
			return basicSetPredessor((ExtendedJamoppPackageElement) otherEnd,
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			return ((InternalEList<?>) getSuccessor()).basicRemove(otherEnd,
					msgs);
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			return basicSetPredessor(null, msgs);
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			return getSuccessor();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			if (resolve)
				return getPredessor();
			return basicGetPredessor();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT:
			return getCompilationUnit();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME:
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			getSuccessor().clear();
			getSuccessor()
					.addAll((Collection<? extends ExtendedJamoppPackageElement>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			setPredessor((ExtendedJamoppPackageElement) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT:
			getCompilationUnit().clear();
			getCompilationUnit().addAll(
					(Collection<? extends CompilationUnit>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME:
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			getSuccessor().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			setPredessor((ExtendedJamoppPackageElement) null);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT:
			getCompilationUnit().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME:
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__SUCCESSOR:
			return successor != null && !successor.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__PREDESSOR:
			return predessor != null;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__COMPILATION_UNIT:
			return compilationUnit != null && !compilationUnit.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_PACKAGE_ELEMENT__NAME:
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
} //ExtendedJamoppPackageElementImpl
