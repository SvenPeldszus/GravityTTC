/**
 */
package TypeGraphBasic.impl;

import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraphBasicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TypeGraphBasic.impl.TMethodSignatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodSignatureImpl#getParamList <em>Param List</em>}</li>
 *   <li>{@link TypeGraphBasic.impl.TMethodSignatureImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TMethodSignatureImpl extends TSignatureImpl implements
		TMethodSignature {
	/**
	 * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamList()
	 * @generated
	 * @ordered
	 */
	protected TParameterList paramList;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<TMethodDefinition> definitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeGraphBasicPackage.Literals.TMETHOD_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethod getMethod() {
		if (eContainerFeatureID() != TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD)
			return null;
		return (TMethod) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(TMethod newMethod,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMethod,
				TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(TMethod newMethod) {
		if (newMethod != eInternalContainer()
				|| (eContainerFeatureID() != TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD && newMethod != null)) {
			if (EcoreUtil.isAncestor(this, newMethod))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this,
						TypeGraphBasicPackage.TMETHOD__SIGNATURES,
						TMethod.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD, newMethod,
					newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameterList getParamList() {
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamList(TParameterList newParamList,
			NotificationChain msgs) {
		TParameterList oldParamList = paramList;
		paramList = newParamList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST,
					oldParamList, newParamList);
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
	public void setParamList(TParameterList newParamList) {
		if (newParamList != paramList) {
			NotificationChain msgs = null;
			if (paramList != null)
				msgs = ((InternalEObject) paramList)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST,
								null, msgs);
			if (newParamList != null)
				msgs = ((InternalEObject) newParamList)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST,
								null, msgs);
			msgs = basicSetParamList(newParamList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST,
					newParamList, newParamList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMethodDefinition> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectWithInverseResolvingEList<TMethodDefinition>(
					TMethodDefinition.class, this,
					TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS,
					TypeGraphBasicPackage.TMETHOD_DEFINITION__SIGNATURE);
		}
		return definitions;
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
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMethod((TMethod) otherEnd, msgs);
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDefinitions())
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
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			return basicSetMethod(null, msgs);
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return basicSetParamList(null, msgs);
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return ((InternalEList<?>) getDefinitions()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			return eInternalContainer().eInverseRemove(this,
					TypeGraphBasicPackage.TMETHOD__SIGNATURES, TMethod.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			return getMethod();
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return getParamList();
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return getDefinitions();
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
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			setMethod((TMethod) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			setParamList((TParameterList) newValue);
			return;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			getDefinitions().clear();
			getDefinitions().addAll(
					(Collection<? extends TMethodDefinition>) newValue);
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
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			setMethod((TMethod) null);
			return;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			setParamList((TParameterList) null);
			return;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			getDefinitions().clear();
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
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__METHOD:
			return getMethod() != null;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__PARAM_LIST:
			return paramList != null;
		case TypeGraphBasicPackage.TMETHOD_SIGNATURE__DEFINITIONS:
			return definitions != null && !definitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TMethodSignatureImpl
