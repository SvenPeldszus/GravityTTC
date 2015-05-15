/**
 */
package ExtendedJamopp.impl;

import ExtendedJamopp.ExtendedJamoppJavaContainer;
import ExtendedJamopp.ExtendedJamoppPackage;
import ExtendedJamopp.ExtendedJamoppPackageElement;
import ExtendedJamopp.ExtendedMethodName;
import ExtendedJamopp.ExtendedParameterList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.containers.CompilationUnit;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl#getExtendedJamoppPackageElement <em>Extended Jamopp Package Element</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl#getExtendedParameterList <em>Extended Parameter List</em>}</li>
 *   <li>{@link ExtendedJamopp.impl.ExtendedJamoppJavaContainerImpl#getExtendedMethodName <em>Extended Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedJamoppJavaContainerImpl extends EObjectImpl implements
		ExtendedJamoppJavaContainer {
	/**
	 * The cached value of the '{@link #getCompilationUnit() <em>Compilation Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnit;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedJamoppPackageElement> roots;

	/**
	 * The cached value of the '{@link #getExtendedJamoppPackageElement() <em>Extended Jamopp Package Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedJamoppPackageElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedJamoppPackageElement> extendedJamoppPackageElement;

	/**
	 * The cached value of the '{@link #getExtendedParameterList() <em>Extended Parameter List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedParameterList()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedParameterList> extendedParameterList;

	/**
	 * The cached value of the '{@link #getExtendedMethodName() <em>Extended Method Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedMethodName()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedMethodName> extendedMethodName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedJamoppJavaContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedJamoppPackage.Literals.EXTENDED_JAMOPP_JAVA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnit() {
		if (compilationUnit == null) {
			compilationUnit = new EObjectContainmentEList<CompilationUnit>(
					CompilationUnit.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT);
		}
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedJamoppPackageElement> getRoots() {
		if (roots == null) {
			roots = new EObjectResolvingEList<ExtendedJamoppPackageElement>(
					ExtendedJamoppPackageElement.class, this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedJamoppPackageElement> getExtendedJamoppPackageElement() {
		if (extendedJamoppPackageElement == null) {
			extendedJamoppPackageElement = new EObjectContainmentEList<ExtendedJamoppPackageElement>(
					ExtendedJamoppPackageElement.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT);
		}
		return extendedJamoppPackageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedParameterList> getExtendedParameterList() {
		if (extendedParameterList == null) {
			extendedParameterList = new EObjectContainmentEList<ExtendedParameterList>(
					ExtendedParameterList.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST);
		}
		return extendedParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedMethodName> getExtendedMethodName() {
		if (extendedMethodName == null) {
			extendedMethodName = new EObjectContainmentEList<ExtendedMethodName>(
					ExtendedMethodName.class,
					this,
					ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME);
		}
		return extendedMethodName;
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT:
			return ((InternalEList<?>) getCompilationUnit()).basicRemove(
					otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			return ((InternalEList<?>) getExtendedJamoppPackageElement())
					.basicRemove(otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST:
			return ((InternalEList<?>) getExtendedParameterList()).basicRemove(
					otherEnd, msgs);
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME:
			return ((InternalEList<?>) getExtendedMethodName()).basicRemove(
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT:
			return getCompilationUnit();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS:
			return getRoots();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			return getExtendedJamoppPackageElement();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST:
			return getExtendedParameterList();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME:
			return getExtendedMethodName();
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT:
			getCompilationUnit().clear();
			getCompilationUnit().addAll(
					(Collection<? extends CompilationUnit>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS:
			getRoots().clear();
			getRoots()
					.addAll((Collection<? extends ExtendedJamoppPackageElement>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			getExtendedJamoppPackageElement().clear();
			getExtendedJamoppPackageElement()
					.addAll((Collection<? extends ExtendedJamoppPackageElement>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST:
			getExtendedParameterList().clear();
			getExtendedParameterList().addAll(
					(Collection<? extends ExtendedParameterList>) newValue);
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME:
			getExtendedMethodName().clear();
			getExtendedMethodName().addAll(
					(Collection<? extends ExtendedMethodName>) newValue);
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT:
			getCompilationUnit().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS:
			getRoots().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			getExtendedJamoppPackageElement().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST:
			getExtendedParameterList().clear();
			return;
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME:
			getExtendedMethodName().clear();
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
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__COMPILATION_UNIT:
			return compilationUnit != null && !compilationUnit.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__ROOTS:
			return roots != null && !roots.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_JAMOPP_PACKAGE_ELEMENT:
			return extendedJamoppPackageElement != null
					&& !extendedJamoppPackageElement.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_PARAMETER_LIST:
			return extendedParameterList != null
					&& !extendedParameterList.isEmpty();
		case ExtendedJamoppPackage.EXTENDED_JAMOPP_JAVA_CONTAINER__EXTENDED_METHOD_NAME:
			return extendedMethodName != null && !extendedMethodName.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExtendedJamoppJavaContainerImpl
