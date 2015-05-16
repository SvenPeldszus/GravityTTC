/**
 */
package Refactorings.impl;

import Refactorings.RefactoringsPackage;
import Refactorings.Search;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TPackage;
import TypeGraphBasic.TypeGraph;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.impl.SearchImpl#getPg <em>Pg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchImpl extends EObjectImpl implements Search {
	/**
	 * The cached value of the '{@link #getPg() <em>Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPg()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph pg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getPg() {
		if (pg != null && pg.eIsProxy()) {
			InternalEObject oldPg = (InternalEObject) pg;
			pg = (TypeGraph) eResolveProxy(oldPg);
			if (pg != oldPg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringsPackage.SEARCH__PG, oldPg, pg));
			}
		}
		return pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph basicGetPg() {
		return pg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPg(TypeGraph newPg) {
		TypeGraph oldPg = pg;
		pg = newPg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringsPackage.SEARCH__PG, oldPg, pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getBasePackage(TClass tClass) {
		// ActivityNode33
		Object[] result1_black = SearchImpl.pattern_Search_0_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode33] failed");
		}
		// ActivityNode34
		Object[] result2_black = SearchImpl.pattern_Search_0_2_blackBF(tClass);
		if (result2_black != null) {
			TPackage tPackage = (TPackage) result2_black[1];
			return SearchImpl.pattern_Search_0_3_expressionFBB(this, tPackage);
		} else {
			return SearchImpl.pattern_Search_0_4_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPackage getBasePackage(TPackage tPackage) {
		// ActivityNode35
		Object[] result1_black = SearchImpl.pattern_Search_1_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode35] failed");
		}
		// ActivityNode36
		Object[] result2_black = SearchImpl
				.pattern_Search_1_2_blackFB(tPackage);
		if (result2_black != null) {
			TPackage parent = (TPackage) result2_black[0];
			return SearchImpl.pattern_Search_1_3_expressionFBB(this, parent);
		} else {
			return SearchImpl.pattern_Search_1_4_expressionFB(tPackage);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChild(TClass child, TClass parent) {
		// ActivityNode30
		Object[] result1_black = SearchImpl.pattern_Search_2_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode30] failed");
		}
		// ActivityNode31
		Object[] result2_black = SearchImpl.pattern_Search_2_2_blackBB(child,
				parent);
		if (result2_black != null) {
			return SearchImpl.pattern_Search_2_3_expressionF();
		} else {
			// ForEach ActivityNode32
			for (Object[] result4_black : SearchImpl
					.pattern_Search_2_4_blackFB(parent)) {
				TClass new_parent = (TClass) result4_black[0];
				// ActivityNode50
				if (SearchImpl.pattern_Search_2_5_expressionFBBB(this, child,
						new_parent)) {
					return SearchImpl.pattern_Search_2_6_expressionF();
				} else {
				}

			}
			return SearchImpl.pattern_Search_2_7_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void linkClass(TClass tClass) {
		// [user code injected with eMoflon]
		TPackage next = this.getBasePackage(tClass.getPackage());
		TPackage match = null;
		for (TPackage p : pg.getPackages()) {
			if (p.getTName().compareTo(next.getTName()) == 0) {
				match = p;
			}
		}
		if (match == null) {
			pg.getPackages().add(next);
			return;
		} else {
			EList<TPackage> packages = match.getSubpackage();
			while (packages.size() > 0) {
				EList<TPackage> next_child = next.getSubpackage();
				if (next_child.size() > 0) {
					next = next_child.get(0);
					boolean success = false;
					for (TPackage p : packages) {
						if (p.getTName().compareTo(next.getTName()) == 0) {
							packages = p.getSubpackage();
							match = p;
							success = true;
							break;
						}
					}
					if (!success) {
						break;
					}
				} else {
					match.getContainedClasses().add(tClass);
					return;
				}
			}
			EList<TPackage> next_child = next.getSubpackage();
			if (next_child.size() > 0) {
				match.getSubpackage().add(next_child.get(0));
			} else {
				match.getContainedClasses().add(tClass);
			}
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equivalent(TPackage package2, TPackage package1) {// ActivityNode59
		Object[] result1_black = SearchImpl.pattern_Search_4_1_blackBBB(
				package1, package2, this);
		if (result1_black != null) {
			// ActivityNode60
			Object[] result2_black = SearchImpl.pattern_Search_4_2_blackBB(
					package1, package2);
			if (result2_black != null) {
				// ActivityNode61
				Object[] result3_black = SearchImpl
						.pattern_Search_4_3_blackBF(package1);
				if (result3_black != null) {
					TPackage child1 = (TPackage) result3_black[1];
					// ActivityNode62
					Object[] result4_black = SearchImpl
							.pattern_Search_4_4_blackBF(package2);
					if (result4_black != null) {
						TPackage child2 = (TPackage) result4_black[1];
						return SearchImpl.pattern_Search_4_5_expressionFBBB(
								this, child1, child2);
					} else {
						return SearchImpl.pattern_Search_4_6_expressionF();
					}

				} else {
					// ActivityNode63
					Object[] result7_black = SearchImpl
							.pattern_Search_4_7_blackBF(package2);
					if (result7_black != null) {
						// TPackage child2 = (TPackage) result7_black[1];
						return SearchImpl.pattern_Search_4_8_expressionF();
					} else {
						return SearchImpl.pattern_Search_4_9_expressionF();
					}

				}

			} else {
				return SearchImpl.pattern_Search_4_10_expressionF();
			}

		} else {
			return SearchImpl.pattern_Search_4_11_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringsPackage.SEARCH__PG:
			if (resolve)
				return getPg();
			return basicGetPg();
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
		case RefactoringsPackage.SEARCH__PG:
			setPg((TypeGraph) newValue);
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
		case RefactoringsPackage.SEARCH__PG:
			setPg((TypeGraph) null);
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
		case RefactoringsPackage.SEARCH__PG:
			return pg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RefactoringsPackage.SEARCH___GET_BASE_PACKAGE__TCLASS:
			return getBasePackage((TClass) arguments.get(0));
		case RefactoringsPackage.SEARCH___GET_BASE_PACKAGE__TPACKAGE:
			return getBasePackage((TPackage) arguments.get(0));
		case RefactoringsPackage.SEARCH___IS_CHILD__TCLASS_TCLASS:
			return isChild((TClass) arguments.get(0), (TClass) arguments.get(1));
		case RefactoringsPackage.SEARCH___LINK_CLASS__TCLASS:
			linkClass((TClass) arguments.get(0));
			return null;
		case RefactoringsPackage.SEARCH___EQUIVALENT__TPACKAGE_TPACKAGE:
			return equivalent((TPackage) arguments.get(0),
					(TPackage) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Search_0_1_blackB(Search _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Search_0_2_blackBF(TClass tClass) {
		TPackage tPackage = tClass.getPackage();
		if (tPackage != null) {
			return new Object[] { tClass, tPackage };
		}

		return null;
	}

	public static final TPackage pattern_Search_0_3_expressionFBB(Search _this,
			TPackage tPackage) {
		TPackage _localVariable_0 = _this.getBasePackage(tPackage);
		TPackage _result = _localVariable_0;
		return _result;
	}

	public static final TPackage pattern_Search_0_4_expressionF() {
		TPackage _result = null;
		return _result;
	}

	public static final Object[] pattern_Search_1_1_blackB(Search _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Search_1_2_blackFB(TPackage tPackage) {
		TPackage parent = tPackage.getParent();
		if (parent != null) {
			if (!parent.equals(tPackage)) {
				return new Object[] { parent, tPackage };
			}
		}

		return null;
	}

	public static final TPackage pattern_Search_1_3_expressionFBB(Search _this,
			TPackage parent) {
		TPackage _localVariable_0 = _this.getBasePackage(parent);
		TPackage _result = _localVariable_0;
		return _result;
	}

	public static final TPackage pattern_Search_1_4_expressionFB(
			TPackage tPackage) {
		TPackage _result = tPackage;
		return _result;
	}

	public static final Object[] pattern_Search_2_1_blackB(Search _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Search_2_2_blackBB(TClass child,
			TClass parent) {
		if (!child.equals(parent)) {
			if (parent.equals(child.getParentClass())) {
				return new Object[] { child, parent };
			}
		}
		return null;
	}

	public static final boolean pattern_Search_2_3_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Search_2_4_blackFB(
			TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass new_parent : parent.getChildClasses()) {
			if (!new_parent.equals(parent)) {
				_result.add(new Object[] { new_parent, parent });
			}
		}
		return _result;
	}

	public static final boolean pattern_Search_2_5_expressionFBBB(Search _this,
			TClass child, TClass new_parent) {
		boolean _localVariable_0 = _this.isChild(child, new_parent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Search_2_6_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Search_2_7_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Search_4_1_blackBBB(TPackage package1,
			TPackage package2, Search _this) {
		if (!package1.equals(package2)) {
			return new Object[] { package1, package2, _this };
		}
		return null;
	}

	public static final Object[] pattern_Search_4_2_blackBB(TPackage package1,
			TPackage package2) {
		if (!package1.equals(package2)) {
			String package1tName = package1.getTName();
			String package2tName = package2.getTName();
			if (package1tName.equals(package2tName)) {
				return new Object[] { package1, package2 };
			}

		}
		return null;
	}

	public static final Object[] pattern_Search_4_3_blackBF(TPackage package1) {
		for (TPackage child1 : package1.getSubpackage()) {
			if (!child1.equals(package1)) {
				return new Object[] { package1, child1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_Search_4_4_blackBF(TPackage package2) {
		for (TPackage child2 : package2.getSubpackage()) {
			if (!child2.equals(package2)) {
				return new Object[] { package2, child2 };
			}
		}
		return null;
	}

	public static final boolean pattern_Search_4_5_expressionFBBB(Search _this,
			TPackage child1, TPackage child2) {
		boolean _localVariable_0 = _this.equivalent(child1, child2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Search_4_6_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Search_4_7_blackBF(TPackage package2) {
		for (TPackage child2 : package2.getSubpackage()) {
			if (!child2.equals(package2)) {
				return new Object[] { package2, child2 };
			}
		}
		return null;
	}

	public static final boolean pattern_Search_4_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_Search_4_9_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Search_4_10_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_Search_4_11_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SearchImpl
