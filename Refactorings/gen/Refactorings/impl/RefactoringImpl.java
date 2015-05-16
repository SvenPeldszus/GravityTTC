/**
 */
package Refactorings.impl;

import Refactorings.Containers.ContainersFactory;
import Refactorings.Containers.TAccessContainer;
import Refactorings.Containers.TClassContainer;
import Refactorings.Containers.TMethodDefinitionContainer;

import Refactorings.Refactoring;
import Refactorings.RefactoringsFactory;
import Refactorings.RefactoringsPackage;
import Refactorings.Search;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMember;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
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

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Refactorings.impl.RefactoringImpl#getPg <em>Pg</em>}</li>
 *   <li>{@link Refactorings.impl.RefactoringImpl#getSearch <em>Search</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefactoringImpl extends EObjectImpl implements Refactoring {
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
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected Search search;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringsPackage.Literals.REFACTORING;
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
							RefactoringsPackage.REFACTORING__PG, oldPg, pg));
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
					RefactoringsPackage.REFACTORING__PG, oldPg, pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search getSearch() {
		if (search != null && search.eIsProxy()) {
			InternalEObject oldSearch = (InternalEObject) search;
			search = (Search) eResolveProxy(oldSearch);
			if (search != oldSearch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringsPackage.REFACTORING__SEARCH, oldSearch,
							search));
			}
		}
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search basicGetSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(Search newSearch) {
		Search oldSearch = search;
		search = newSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringsPackage.REFACTORING__SEARCH, oldSearch, search));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean csc_isApplicable(TClassContainer child, TClass new_parent) {
		// ActivityNode37
		Object[] result1_black = RefactoringImpl
				.pattern_Refactoring_0_1_blackFB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode37] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[0];
		Object[] result1_green = RefactoringImpl
				.pattern_Refactoring_0_1_greenBFB(pg, this);
		Search search = (Search) result1_green[1];

		// ActivityNode56
		Object[] result2_black = RefactoringImpl
				.pattern_Refactoring_0_2_blackBFB(pg, new_parent);
		if (result2_black != null) {
			TClass existingParent = (TClass) result2_black[1];

			// ActivityNode57
			Object[] result3_black = RefactoringImpl
					.pattern_Refactoring_0_3_blackBFBF(new_parent,
							existingParent);
			if (result3_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode57] failed");
			}
			TPackage new_parent_package = (TPackage) result3_black[1];
			TPackage existing_parent_package = (TPackage) result3_black[3];
			// ActivityNode58
			if (RefactoringImpl.pattern_Refactoring_0_4_expressionFBBB(search,
					existing_parent_package, new_parent_package)) {
				return RefactoringImpl.pattern_Refactoring_0_5_expressionF();
			} else {
			}

		} else {
		}
		// ActivityNode38
		Object[] result6_black = RefactoringImpl
				.pattern_Refactoring_0_6_blackBFF(child);
		if (result6_black != null) {
			// TClass one = (TClass) result6_black[1];
			// TClass two = (TClass) result6_black[2];
			// ForEach ActivityNode54
			for (Object[] result7_black : RefactoringImpl
					.pattern_Refactoring_0_7_blackFFB(child)) {
				TClass a = (TClass) result7_black[0];
				TClass b = (TClass) result7_black[1];
				// ActivityNode41
				Object[] result8_bindingAndBlack = RefactoringImpl
						.pattern_Refactoring_0_8_bindingAndBlackFFBBB(search,
								a, b);
				if (result8_bindingAndBlack != null) {
					// TPackage basePackageOne = (TPackage) result8_bindingAndBlack[0];
					// TPackage basePackageTwo = (TPackage) result8_bindingAndBlack[1];
					return RefactoringImpl
							.pattern_Refactoring_0_9_expressionF();
				} else {
				}

			}
			// ForEach ActivityNode39
			for (Object[] result10_black : RefactoringImpl
					.pattern_Refactoring_0_10_blackBFF(child)) {
				TClass tChildOne = (TClass) result10_black[1];
				TClass tChildTwo = (TClass) result10_black[2];
				// ActivityNode40
				Object[] result11_black = RefactoringImpl
						.pattern_Refactoring_0_11_blackBBF(tChildOne, tChildTwo);
				if (result11_black != null) {
					// TClass tParent = (TClass) result11_black[2];
				} else {
					// ForEach ActivityNode51
					for (Object[] result12_black : RefactoringImpl
							.pattern_Refactoring_0_12_blackBF(child)) {
						TClass tChild = (TClass) result12_black[1];
						// ActivityNode52
						Object[] result13_black = RefactoringImpl
								.pattern_Refactoring_0_13_blackB(tChild);
						if (result13_black != null) {
						} else {
							// ActivityNode53
							Object[] result14_black = RefactoringImpl
									.pattern_Refactoring_0_14_blackBF(tChild);
							if (result14_black != null) {
								// TClass tObject = (TClass) result14_black[1];
							} else {
								return RefactoringImpl
										.pattern_Refactoring_0_15_expressionF();
							}

						}

					}
					return RefactoringImpl
							.pattern_Refactoring_0_16_expressionF();
				}

			}
			return RefactoringImpl.pattern_Refactoring_0_17_expressionF();
		} else {
			return RefactoringImpl.pattern_Refactoring_0_18_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassContainer csc_Perform(TClassContainer child, TClass new_parent) {
		// ActivityNode41
		Object[] result1_black = RefactoringImpl
				.pattern_Refactoring_1_1_blackFB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode41] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[0];
		Object[] result1_green = RefactoringImpl
				.pattern_Refactoring_1_1_greenBFBF(pg, this);
		Search search = (Search) result1_green[1];
		TClassContainer container = (TClassContainer) result1_green[3];

		// ActivityNode42
		Object[] result2_black = RefactoringImpl
				.pattern_Refactoring_1_2_blackBBB(new_parent, pg, container);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode42] failed");
		}
		RefactoringImpl.pattern_Refactoring_1_2_greenBBB(new_parent, pg,
				container);

		// ActivityNode45
		RefactoringImpl
				.pattern_Refactoring_1_3_expressionBB(search, new_parent);
		// ActivityNode46
		Object[] result4_black = RefactoringImpl
				.pattern_Refactoring_1_4_blackBBFFB(child, new_parent,
						container);
		if (result4_black != null) {
			TClass old_tParent = (TClass) result4_black[2];
			// TClass tChild = (TClass) result4_black[3];
			RefactoringImpl.pattern_Refactoring_1_4_greenBBB(new_parent,
					old_tParent, container);

		} else {
		}
		// ForEach ActivityNode47
		for (Object[] result5_black : RefactoringImpl
				.pattern_Refactoring_1_5_blackBF(child)) {
			TClass tChildClass = (TClass) result5_black[1];
			// ActivityNode48
			Object[] result6_black = RefactoringImpl
					.pattern_Refactoring_1_6_blackBF(tChildClass);
			if (result6_black != null) {
				TClass tParent = (TClass) result6_black[1];

				// ActivityNode55
				Object[] result7_black = RefactoringImpl
						.pattern_Refactoring_1_7_blackBB(tChildClass, tParent);
				if (result7_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode55] failed");
				}
				RefactoringImpl.pattern_Refactoring_1_7_redBB(tChildClass,
						tParent);

			} else {
			}

			// ActivityNode49
			Object[] result8_black = RefactoringImpl
					.pattern_Refactoring_1_8_blackBBB(new_parent, tChildClass,
							container);
			if (result8_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode49] failed");
			}
			RefactoringImpl.pattern_Refactoring_1_8_greenBBB(new_parent,
					tChildClass, container);

		}
		return RefactoringImpl.pattern_Refactoring_1_9_expressionFB(container);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean pum_isApplicable(TMethodSignature method, TClass parent) {
		// ActivityNode4
		Object[] result1_black = RefactoringImpl
				.pattern_Refactoring_2_1_blackFB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode4] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[0];
		Object[] result1_green = RefactoringImpl
				.pattern_Refactoring_2_1_greenBFB(pg, this);
		Search search = (Search) result1_green[1];

		// ActivityNode5
		Object[] result2_black = RefactoringImpl
				.pattern_Refactoring_2_2_blackBB(method, parent);
		if (result2_black != null) {

			// ActivityNode6
			Object[] result3_bindingAndBlack = RefactoringImpl
					.pattern_Refactoring_2_3_bindingAndBlackFBB(search, parent);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode6] failed");
			}
			TPackage basePackage = (TPackage) result3_bindingAndBlack[0];

			// ActivityNode7
			Object[] result4_green = RefactoringImpl
					.pattern_Refactoring_2_4_greenF();
			if (result4_green == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode7] failed");
			}
			TMethodDefinitionContainer tDefinitions = (TMethodDefinitionContainer) result4_green[0];
			// ForEach ActivityNode8
			for (Object[] result5_black : RefactoringImpl
					.pattern_Refactoring_2_5_blackBF(parent)) {
				TClass tChild = (TClass) result5_black[1];
				// ActivityNode9
				Object[] result6_black = RefactoringImpl
						.pattern_Refactoring_2_6_blackBB(method, tChild);
				if (result6_black != null) {
					// ActivityNode10
					Object[] result7_black = RefactoringImpl
							.pattern_Refactoring_2_7_blackBBBF(method, tChild,
									tDefinitions);
					if (result7_black != null) {
						TMethodDefinition tMethodDefinition = (TMethodDefinition) result7_black[3];
						RefactoringImpl.pattern_Refactoring_2_7_greenBB(
								tDefinitions, tMethodDefinition);

					} else {
						return RefactoringImpl
								.pattern_Refactoring_2_8_expressionF();
					}

				} else {
					return RefactoringImpl
							.pattern_Refactoring_2_9_expressionF();
				}

			}
			// ForEach ActivityNode11
			for (Object[] result10_black : RefactoringImpl
					.pattern_Refactoring_2_10_blackBF(parent)) {
				TClass tChild = (TClass) result10_black[1];
				// ActivityNode12
				Object[] result11_bindingAndBlack = RefactoringImpl
						.pattern_Refactoring_2_11_bindingAndBlackBFBB(
								basePackage, search, tChild);
				if (result11_bindingAndBlack != null) {
					// TPackage childsBasePackage = (TPackage) result11_bindingAndBlack[1];
					return RefactoringImpl
							.pattern_Refactoring_2_12_expressionF();
				} else {
				}

			}

			// ActivityNode13
			Object[] result13_green = RefactoringImpl
					.pattern_Refactoring_2_13_greenF();
			if (result13_green == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode13] failed");
			}
			TAccessContainer accessedMembers = (TAccessContainer) result13_green[0];
			// ForEach ActivityNode14
			for (Object[] result14_black : RefactoringImpl
					.pattern_Refactoring_2_14_blackFBBF(parent, tDefinitions)) {
				TClass activeClass = (TClass) result14_black[0];
				TMethodDefinition tMethodDefinition = (TMethodDefinition) result14_black[3];
				// ForEach ActivityNode15
				for (Object[] result15_black : RefactoringImpl
						.pattern_Refactoring_2_15_blackFBFBB(accessedMembers,
								pg, tMethodDefinition)) {
					TMember accessed = (TMember) result15_black[0];
					TClass definingClass = (TClass) result15_black[2];
					RefactoringImpl.pattern_Refactoring_2_15_greenBB(accessed,
							accessedMembers);

					// ActivityNode16
					if (RefactoringImpl
							.pattern_Refactoring_2_16_expressionFBBB(search,
									definingClass, parent)) {
						// ActivityNode17
						if (RefactoringImpl
								.pattern_Refactoring_2_17_expressionFBBB(
										search, definingClass, activeClass)) {
						} else {
							return RefactoringImpl
									.pattern_Refactoring_2_18_expressionF();
						}

					} else {
					}

				}

			}
			return RefactoringImpl.pattern_Refactoring_2_19_expressionF();
		} else {
			return RefactoringImpl.pattern_Refactoring_2_20_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassContainer pum_Perform(TMethodSignature method, TClass parent) {
		// ActivityNode64
		Object[] result1_black = RefactoringImpl
				.pattern_Refactoring_3_1_blackBFB(parent, this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode64] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[1];
		Object[] result1_green = RefactoringImpl
				.pattern_Refactoring_3_1_greenFB(parent);
		TClassContainer container = (TClassContainer) result1_green[0];

		// ActivityNode18
		Object[] result2_black = RefactoringImpl
				.pattern_Refactoring_3_2_blackBBFFB(parent, method, container);
		if (result2_black != null) {
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[2];
			TClass tmpChild = (TClass) result2_black[3];
			RefactoringImpl.pattern_Refactoring_3_2_redBBB(method,
					tMethodDefinition, tmpChild);

			RefactoringImpl.pattern_Refactoring_3_2_greenBBBBB(parent, method,
					tMethodDefinition, tmpChild, container);

			// ForEach ActivityNode20
			for (Object[] result3_black : RefactoringImpl
					.pattern_Refactoring_3_3_blackBBFFB(parent, method,
							container)) {
				TMethodDefinition childsDefinition = (TMethodDefinition) result3_black[2];
				TClass tChild = (TClass) result3_black[3];
				RefactoringImpl.pattern_Refactoring_3_3_greenBB(tChild,
						container);

				// ForEach ActivityNode65
				for (Object[] result4_black : RefactoringImpl
						.pattern_Refactoring_3_4_blackBFBF(childsDefinition, pg)) {
					TMember accessing = (TMember) result4_black[1];
					// TClass tClass = (TClass) result4_black[3];

					// ActivityNode66
					Object[] result5_black = RefactoringImpl
							.pattern_Refactoring_3_5_blackBBB(accessing,
									tMethodDefinition, childsDefinition);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [ActivityNode66] failed");
					}
					RefactoringImpl.pattern_Refactoring_3_5_redBB(accessing,
							childsDefinition);

					RefactoringImpl.pattern_Refactoring_3_5_greenBB(accessing,
							tMethodDefinition);

				}

				// ActivityNode21
				Object[] result6_black = RefactoringImpl
						.pattern_Refactoring_3_6_blackBBB(tChild, method,
								childsDefinition);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode21] failed");
				}
				RefactoringImpl.pattern_Refactoring_3_6_redBBB(tChild, method,
						childsDefinition);

				EcoreUtil.delete(childsDefinition);
				childsDefinition = null;
				;

			}
			return RefactoringImpl
					.pattern_Refactoring_3_7_expressionFB(container);
		} else {
			return RefactoringImpl
					.pattern_Refactoring_3_8_expressionFB(container);
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
		case RefactoringsPackage.REFACTORING__PG:
			if (resolve)
				return getPg();
			return basicGetPg();
		case RefactoringsPackage.REFACTORING__SEARCH:
			if (resolve)
				return getSearch();
			return basicGetSearch();
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
		case RefactoringsPackage.REFACTORING__PG:
			setPg((TypeGraph) newValue);
			return;
		case RefactoringsPackage.REFACTORING__SEARCH:
			setSearch((Search) newValue);
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
		case RefactoringsPackage.REFACTORING__PG:
			setPg((TypeGraph) null);
			return;
		case RefactoringsPackage.REFACTORING__SEARCH:
			setSearch((Search) null);
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
		case RefactoringsPackage.REFACTORING__PG:
			return pg != null;
		case RefactoringsPackage.REFACTORING__SEARCH:
			return search != null;
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
		case RefactoringsPackage.REFACTORING___CSC_IS_APPLICABLE__TCLASSCONTAINER_TCLASS:
			return csc_isApplicable((TClassContainer) arguments.get(0),
					(TClass) arguments.get(1));
		case RefactoringsPackage.REFACTORING___CSC_PERFORM__TCLASSCONTAINER_TCLASS:
			return csc_Perform((TClassContainer) arguments.get(0),
					(TClass) arguments.get(1));
		case RefactoringsPackage.REFACTORING___PUM_IS_APPLICABLE__TMETHODSIGNATURE_TCLASS:
			return pum_isApplicable((TMethodSignature) arguments.get(0),
					(TClass) arguments.get(1));
		case RefactoringsPackage.REFACTORING___PUM_PERFORM__TMETHODSIGNATURE_TCLASS:
			return pum_Perform((TMethodSignature) arguments.get(0),
					(TClass) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Refactoring_0_1_blackFB(
			Refactoring _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { pg, _this };
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_0_1_greenBFB(TypeGraph pg,
			Refactoring _this) {
		Search search = RefactoringsFactory.eINSTANCE.createSearch();
		search.setPg(pg);
		_this.setSearch(search);
		return new Object[] { pg, search, _this };
	}

	public static final Object[] pattern_Refactoring_0_2_blackBFB(TypeGraph pg,
			TClass new_parent) {
		String new_parenttName = new_parent.getTName();
		for (TClass existingParent : pg.getClasses()) {
			if (!existingParent.equals(new_parent)) {
				String existingParenttName = existingParent.getTName();
				if (existingParenttName.equals(new_parenttName)) {
					return new Object[] { pg, existingParent, new_parent };
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_0_3_blackBFBF(
			TClass new_parent, TClass existingParent) {
		if (!existingParent.equals(new_parent)) {
			TPackage new_parent_package = new_parent.getPackage();
			if (new_parent_package != null) {
				TPackage existing_parent_package = existingParent.getPackage();
				if (existing_parent_package != null) {
					if (!existing_parent_package.equals(new_parent_package)) {
						return new Object[] { new_parent, new_parent_package,
								existingParent, existing_parent_package };
					}
				}

			}

		}
		return null;
	}

	public static final boolean pattern_Refactoring_0_4_expressionFBBB(
			Search search, TPackage existing_parent_package,
			TPackage new_parent_package) {
		boolean _localVariable_0 = search.equivalent(existing_parent_package,
				new_parent_package);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Refactoring_0_5_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Refactoring_0_6_blackBFF(
			TClassContainer child) {
		for (TClass one : child.getTClass()) {
			for (TClass two : child.getTClass()) {
				if (!one.equals(two)) {
					return new Object[] { child, one, two };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Refactoring_0_7_blackFFB(
			TClassContainer child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass b : child.getTClass()) {
			for (TClass a : child.getTClass()) {
				if (!a.equals(b)) {
					_result.add(new Object[] { a, b, child });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_0_8_bindingFFBBB(
			Search search, TClass a, TClass b) {
		TPackage _localVariable_0 = search.getBasePackage(a);
		TPackage _localVariable_1 = search.getBasePackage(b);
		TPackage basePackageOne = _localVariable_0;
		if (basePackageOne != null) {
			TPackage basePackageTwo = _localVariable_1;
			if (basePackageTwo != null) {
				return new Object[] { basePackageOne, basePackageTwo, search,
						a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_0_8_blackBB(
			TPackage basePackageOne, TPackage basePackageTwo) {
		if (!basePackageOne.equals(basePackageTwo)) {
			return new Object[] { basePackageOne, basePackageTwo };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_0_8_bindingAndBlackFFBBB(
			Search search, TClass a, TClass b) {
		Object[] result_pattern_Refactoring_0_8_binding = pattern_Refactoring_0_8_bindingFFBBB(
				search, a, b);
		if (result_pattern_Refactoring_0_8_binding != null) {
			TPackage basePackageOne = (TPackage) result_pattern_Refactoring_0_8_binding[0];
			TPackage basePackageTwo = (TPackage) result_pattern_Refactoring_0_8_binding[1];

			Object[] result_pattern_Refactoring_0_8_black = pattern_Refactoring_0_8_blackBB(
					basePackageOne, basePackageTwo);
			if (result_pattern_Refactoring_0_8_black != null) {

				return new Object[] { basePackageOne, basePackageTwo, search,
						a, b };
			}
		}
		return null;
	}

	public static final boolean pattern_Refactoring_0_9_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Iterable<Object[]> pattern_Refactoring_0_10_blackBFF(
			TClassContainer child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChildOne : child.getTClass()) {
			for (TClass tChildTwo : child.getTClass()) {
				if (!tChildOne.equals(tChildTwo)) {
					_result.add(new Object[] { child, tChildOne, tChildTwo });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_0_11_blackBBF(
			TClass tChildOne, TClass tChildTwo) {
		if (!tChildOne.equals(tChildTwo)) {
			TClass tParent = tChildOne.getParentClass();
			if (tParent != null) {
				if (!tChildOne.equals(tParent)) {
					if (!tChildTwo.equals(tParent)) {
						if (tParent.getChildClasses().contains(tChildTwo)) {
							return new Object[] { tChildOne, tChildTwo, tParent };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Refactoring_0_12_blackBF(
			TClassContainer child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : child.getTClass()) {
			_result.add(new Object[] { child, tChild });
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_0_13_black_nac_0B(
			TClass tChild) {
		TClass tParentClass = tChild.getParentClass();
		if (tParentClass != null) {
			if (!tChild.equals(tParentClass)) {
				return new Object[] { tChild };
			}
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_0_13_blackB(TClass tChild) {
		if (pattern_Refactoring_0_13_black_nac_0B(tChild) == null) {
			return new Object[] { tChild };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_0_14_blackBF(TClass tChild) {
		TClass tObject = tChild.getParentClass();
		if (tObject != null) {
			if (!tChild.equals(tObject)) {
				String tObjecttName = tObject.getTName();
				if (tObjecttName.equals("java.lang.Object")) {
					return new Object[] { tChild, tObject };
				}

			}
		}

		return null;
	}

	public static final boolean pattern_Refactoring_0_15_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_Refactoring_0_16_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Refactoring_0_17_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Refactoring_0_18_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Refactoring_1_1_blackFB(
			Refactoring _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { pg, _this };
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_1_1_greenBFBF(
			TypeGraph pg, Refactoring _this) {
		Search search = RefactoringsFactory.eINSTANCE.createSearch();
		TClassContainer container = ContainersFactory.eINSTANCE
				.createTClassContainer();
		search.setPg(pg);
		_this.setSearch(search);
		return new Object[] { pg, search, _this, container };
	}

	public static final Object[] pattern_Refactoring_1_2_blackBBB(
			TClass new_parent, TypeGraph pg, TClassContainer container) {
		return new Object[] { new_parent, pg, container };
	}

	public static final Object[] pattern_Refactoring_1_2_greenBBB(
			TClass new_parent, TypeGraph pg, TClassContainer container) {
		pg.getClasses().add(new_parent);
		container.getTClass().add(new_parent);
		return new Object[] { new_parent, pg, container };
	}

	public static final void pattern_Refactoring_1_3_expressionBB(
			Search search, TClass new_parent) {
		search.linkClass(new_parent);

	}

	public static final Object[] pattern_Refactoring_1_4_blackBBFFB(
			TClassContainer child, TClass new_parent, TClassContainer container) {
		if (!child.equals(container)) {
			for (TClass tChild : child.getTClass()) {
				if (!new_parent.equals(tChild)) {
					TClass old_tParent = tChild.getParentClass();
					if (old_tParent != null) {
						if (!new_parent.equals(old_tParent)) {
							if (!old_tParent.equals(tChild)) {
								return new Object[] { child, new_parent,
										old_tParent, tChild, container };
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_1_4_greenBBB(
			TClass new_parent, TClass old_tParent, TClassContainer container) {
		old_tParent.getChildClasses().add(new_parent);
		container.getTClass().add(old_tParent);
		return new Object[] { new_parent, old_tParent, container };
	}

	public static final Iterable<Object[]> pattern_Refactoring_1_5_blackBF(
			TClassContainer child) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChildClass : child.getTClass()) {
			_result.add(new Object[] { child, tChildClass });
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_1_6_blackBF(
			TClass tChildClass) {
		TClass tParent = tChildClass.getParentClass();
		if (tParent != null) {
			if (!tChildClass.equals(tParent)) {
				return new Object[] { tChildClass, tParent };
			}
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_1_7_blackBB(
			TClass tChildClass, TClass tParent) {
		if (!tChildClass.equals(tParent)) {
			if (tParent.equals(tChildClass.getParentClass())) {
				return new Object[] { tChildClass, tParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_1_7_redBB(
			TClass tChildClass, TClass tParent) {
		tChildClass.setParentClass(null);
		return new Object[] { tChildClass, tParent };
	}

	public static final Object[] pattern_Refactoring_1_8_blackBBB(
			TClass new_parent, TClass tChildClass, TClassContainer container) {
		if (!new_parent.equals(tChildClass)) {
			return new Object[] { new_parent, tChildClass, container };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_1_8_greenBBB(
			TClass new_parent, TClass tChildClass, TClassContainer container) {
		new_parent.getChildClasses().add(tChildClass);
		container.getTClass().add(tChildClass);
		return new Object[] { new_parent, tChildClass, container };
	}

	public static final TClassContainer pattern_Refactoring_1_9_expressionFB(
			TClassContainer container) {
		TClassContainer _result = container;
		return _result;
	}

	public static final Object[] pattern_Refactoring_2_1_blackFB(
			Refactoring _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { pg, _this };
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_2_1_greenBFB(TypeGraph pg,
			Refactoring _this) {
		Search search = RefactoringsFactory.eINSTANCE.createSearch();
		search.setPg(pg);
		_this.setSearch(search);
		return new Object[] { pg, search, _this };
	}

	public static final Object[] pattern_Refactoring_2_2_black_nac_0BB(
			TClass parent, TMethodSignature method) {
		if (parent.getSignature().contains(method)) {
			return new Object[] { parent, method };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_2_blackBB(
			TMethodSignature method, TClass parent) {
		if (pattern_Refactoring_2_2_black_nac_0BB(parent, method) == null) {
			return new Object[] { method, parent };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_3_bindingFBB(
			Search search, TClass parent) {
		TPackage _localVariable_0 = search.getBasePackage(parent);
		TPackage basePackage = _localVariable_0;
		if (basePackage != null) {
			return new Object[] { basePackage, search, parent };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_3_blackB(
			TPackage basePackage) {
		return new Object[] { basePackage };
	}

	public static final Object[] pattern_Refactoring_2_3_bindingAndBlackFBB(
			Search search, TClass parent) {
		Object[] result_pattern_Refactoring_2_3_binding = pattern_Refactoring_2_3_bindingFBB(
				search, parent);
		if (result_pattern_Refactoring_2_3_binding != null) {
			TPackage basePackage = (TPackage) result_pattern_Refactoring_2_3_binding[0];

			Object[] result_pattern_Refactoring_2_3_black = pattern_Refactoring_2_3_blackB(basePackage);
			if (result_pattern_Refactoring_2_3_black != null) {

				return new Object[] { basePackage, search, parent };
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_4_greenF() {
		TMethodDefinitionContainer tDefinitions = ContainersFactory.eINSTANCE
				.createTMethodDefinitionContainer();
		return new Object[] { tDefinitions };
	}

	public static final Iterable<Object[]> pattern_Refactoring_2_5_blackBF(
			TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : parent.getChildClasses()) {
			if (!parent.equals(tChild)) {
				_result.add(new Object[] { parent, tChild });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_2_6_blackBB(
			TMethodSignature method, TClass tChild) {
		if (tChild.getSignature().contains(method)) {
			return new Object[] { method, tChild };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_7_blackBBBF(
			TMethodSignature method, TClass tChild,
			TMethodDefinitionContainer tDefinitions) {
		for (TMethodDefinition tMethodDefinition : method.getDefinitions()) {
			if (tChild.getDefines().contains(tMethodDefinition)) {
				return new Object[] { method, tChild, tDefinitions,
						tMethodDefinition };
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_7_greenBB(
			TMethodDefinitionContainer tDefinitions,
			TMethodDefinition tMethodDefinition) {
		tDefinitions.getTMethodDefinition().add(tMethodDefinition);
		return new Object[] { tDefinitions, tMethodDefinition };
	}

	public static final boolean pattern_Refactoring_2_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_Refactoring_2_9_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Iterable<Object[]> pattern_Refactoring_2_10_blackBF(
			TClass parent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tChild : parent.getChildClasses()) {
			if (!parent.equals(tChild)) {
				_result.add(new Object[] { parent, tChild });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_2_11_bindingFBB(
			Search search, TClass tChild) {
		TPackage _localVariable_0 = search.getBasePackage(tChild);
		TPackage childsBasePackage = _localVariable_0;
		if (childsBasePackage != null) {
			return new Object[] { childsBasePackage, search, tChild };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_11_blackBB(
			TPackage basePackage, TPackage childsBasePackage) {
		if (!basePackage.equals(childsBasePackage)) {
			return new Object[] { basePackage, childsBasePackage };
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_2_11_bindingAndBlackBFBB(
			TPackage basePackage, Search search, TClass tChild) {
		Object[] result_pattern_Refactoring_2_11_binding = pattern_Refactoring_2_11_bindingFBB(
				search, tChild);
		if (result_pattern_Refactoring_2_11_binding != null) {
			TPackage childsBasePackage = (TPackage) result_pattern_Refactoring_2_11_binding[0];

			Object[] result_pattern_Refactoring_2_11_black = pattern_Refactoring_2_11_blackBB(
					basePackage, childsBasePackage);
			if (result_pattern_Refactoring_2_11_black != null) {

				return new Object[] { basePackage, childsBasePackage, search,
						tChild };
			}
		}
		return null;
	}

	public static final boolean pattern_Refactoring_2_12_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Refactoring_2_13_greenF() {
		TAccessContainer accessedMembers = ContainersFactory.eINSTANCE
				.createTAccessContainer();
		return new Object[] { accessedMembers };
	}

	public static final Iterable<Object[]> pattern_Refactoring_2_14_blackFBBF(
			TClass parent, TMethodDefinitionContainer tDefinitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass activeClass : parent.getChildClasses()) {
			if (!activeClass.equals(parent)) {
				for (TMethodDefinition tMethodDefinition : tDefinitions
						.getTMethodDefinition()) {
					if (activeClass.getDefines().contains(tMethodDefinition)) {
						_result.add(new Object[] { activeClass, parent,
								tDefinitions, tMethodDefinition });
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Refactoring_2_15_blackFBFBB(
			TAccessContainer accessedMembers, TypeGraph pg,
			TMethodDefinition tMethodDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass definingClass : pg.getClasses()) {
			for (TMember accessed : tMethodDefinition.getAccess()) {
				if (!accessed.equals(tMethodDefinition)) {
					if (definingClass.getDefines().contains(accessed)) {
						_result.add(new Object[] { accessed, accessedMembers,
								definingClass, pg, tMethodDefinition });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_2_15_greenBB(
			TMember accessed, TAccessContainer accessedMembers) {
		accessedMembers.getTMember().add(accessed);
		return new Object[] { accessed, accessedMembers };
	}

	public static final boolean pattern_Refactoring_2_16_expressionFBBB(
			Search search, TClass definingClass, TClass parent) {
		boolean _localVariable_0 = search.isChild(definingClass, parent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Refactoring_2_17_expressionFBBB(
			Search search, TClass definingClass, TClass activeClass) {
		boolean _localVariable_0 = search.isChild(definingClass, activeClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Refactoring_2_18_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_Refactoring_2_19_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Refactoring_2_20_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Refactoring_3_1_blackBFB(
			TClass parent, Refactoring _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { parent, pg, _this };
		}

		return null;
	}

	public static final Object[] pattern_Refactoring_3_1_greenFB(TClass parent) {
		TClassContainer container = ContainersFactory.eINSTANCE
				.createTClassContainer();
		container.getTClass().add(parent);
		return new Object[] { container, parent };
	}

	public static final Object[] pattern_Refactoring_3_2_blackBBFFB(
			TClass parent, TMethodSignature method, TClassContainer container) {
		for (TClass tmpChild : parent.getChildClasses()) {
			if (!parent.equals(tmpChild)) {
				if (tmpChild.getSignature().contains(method)) {
					for (TMethodDefinition tMethodDefinition : method
							.getDefinitions()) {
						if (tmpChild.getDefines().contains(tMethodDefinition)) {
							return new Object[] { parent, method,
									tMethodDefinition, tmpChild, container };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_3_2_redBBB(
			TMethodSignature method, TMethodDefinition tMethodDefinition,
			TClass tmpChild) {
		tmpChild.getDefines().remove(tMethodDefinition);
		tmpChild.getSignature().remove(method);
		return new Object[] { method, tMethodDefinition, tmpChild };
	}

	public static final Object[] pattern_Refactoring_3_2_greenBBBBB(
			TClass parent, TMethodSignature method,
			TMethodDefinition tMethodDefinition, TClass tmpChild,
			TClassContainer container) {
		parent.getDefines().add(tMethodDefinition);
		parent.getSignature().add(method);
		container.getTClass().add(tmpChild);
		return new Object[] { parent, method, tMethodDefinition, tmpChild,
				container };
	}

	public static final Iterable<Object[]> pattern_Refactoring_3_3_blackBBFFB(
			TClass parent, TMethodSignature method, TClassContainer container) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (parent.getSignature().contains(method)) {
			for (TMethodDefinition childsDefinition : method.getDefinitions()) {
				for (TClass tChild : parent.getChildClasses()) {
					if (!parent.equals(tChild)) {
						if (tChild.getSignature().contains(method)) {
							if (tChild.getDefines().contains(childsDefinition)) {
								_result.add(new Object[] { parent, method,
										childsDefinition, tChild, container });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_3_3_greenBB(TClass tChild,
			TClassContainer container) {
		container.getTClass().add(tChild);
		return new Object[] { tChild, container };
	}

	public static final Iterable<Object[]> pattern_Refactoring_3_4_blackBFBF(
			TMethodDefinition childsDefinition, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass tClass : pg.getClasses()) {
			for (TMember accessing : tClass.getDefines()) {
				if (!accessing.equals(childsDefinition)) {
					if (accessing.getAccess().contains(childsDefinition)) {
						_result.add(new Object[] { childsDefinition, accessing,
								pg, tClass });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Refactoring_3_5_blackBBB(
			TMember accessing, TMethodDefinition tMethodDefinition,
			TMethodDefinition childsDefinition) {
		if (!accessing.equals(tMethodDefinition)) {
			if (!accessing.equals(childsDefinition)) {
				if (!childsDefinition.equals(tMethodDefinition)) {
					if (accessing.getAccess().contains(childsDefinition)) {
						return new Object[] { accessing, tMethodDefinition,
								childsDefinition };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_3_5_redBB(
			TMember accessing, TMethodDefinition childsDefinition) {
		accessing.getAccess().remove(childsDefinition);
		return new Object[] { accessing, childsDefinition };
	}

	public static final Object[] pattern_Refactoring_3_5_greenBB(
			TMember accessing, TMethodDefinition tMethodDefinition) {
		accessing.getAccess().add(tMethodDefinition);
		return new Object[] { accessing, tMethodDefinition };
	}

	public static final Object[] pattern_Refactoring_3_6_blackBBB(
			TClass tChild, TMethodSignature method,
			TMethodDefinition childsDefinition) {
		if (tChild.getSignature().contains(method)) {
			if (tChild.getDefines().contains(childsDefinition)) {
				if (method.getDefinitions().contains(childsDefinition)) {
					return new Object[] { tChild, method, childsDefinition };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Refactoring_3_6_redBBB(TClass tChild,
			TMethodSignature method, TMethodDefinition childsDefinition) {
		tChild.getSignature().remove(method);
		return new Object[] { tChild, method, childsDefinition };
	}

	public static final TClassContainer pattern_Refactoring_3_7_expressionFB(
			TClassContainer container) {
		TClassContainer _result = container;
		return _result;
	}

	public static final TClassContainer pattern_Refactoring_3_8_expressionFB(
			TClassContainer container) {
		TClassContainer _result = container;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RefactoringImpl
