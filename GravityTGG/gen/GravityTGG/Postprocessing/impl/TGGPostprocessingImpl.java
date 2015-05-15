/**
 */
package GravityTGG.Postprocessing.impl;

import ExtendedJamopp.ExtendedClassMethod;

import GravityTGG.ClassMethodToTMethodDefinition;

import GravityTGG.Postprocessing.MemberCorrespondence;
import GravityTGG.Postprocessing.PostprocessingPackage;
import GravityTGG.Postprocessing.TGGPostprocessing;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TField;
import TypeGraphBasic.TFieldDefinition;
import TypeGraphBasic.TFieldSignature;
import TypeGraphBasic.TMember;
import TypeGraphBasic.TMethod;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import TypeGraphBasic.TParameter;
import TypeGraphBasic.TParameterList;
import TypeGraphBasic.TypeGraph;
import TypeGraphBasic.TypeGraphBasicFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.containers.CompilationUnit;

import org.emftext.language.java.expressions.AdditiveExpression;
import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.MemberContainer;

import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;

import org.emftext.language.java.references.ElementReference;
import org.emftext.language.java.references.IdentifierReference;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferenceableElement;

import org.emftext.language.java.statements.ExpressionStatement;
import org.emftext.language.java.statements.Return;
import org.emftext.language.java.statements.Statement;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGG Postprocessing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GravityTGG.Postprocessing.impl.TGGPostprocessingImpl#getMemberCorrespondences <em>Member Correspondences</em>}</li>
 *   <li>{@link GravityTGG.Postprocessing.impl.TGGPostprocessingImpl#getPg <em>Pg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TGGPostprocessingImpl extends EObjectImpl implements
		TGGPostprocessing {
	/**
	 * The cached value of the '{@link #getMemberCorrespondences() <em>Member Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberCorrespondence> memberCorrespondences;

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
	protected TGGPostprocessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PostprocessingPackage.Literals.TGG_POSTPROCESSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberCorrespondence> getMemberCorrespondences() {
		if (memberCorrespondences == null) {
			memberCorrespondences = new EObjectContainmentEList<MemberCorrespondence>(
					MemberCorrespondence.class,
					this,
					PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES);
		}
		return memberCorrespondences;
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
							PostprocessingPackage.TGG_POSTPROCESSING__PG,
							oldPg, pg));
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
					PostprocessingPackage.TGG_POSTPROCESSING__PG, oldPg, pg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAccessEdgesForMethod(ClassMethodToTMethodDefinition match) {
		// ActivityNode1
		Object[] result1_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_0_1_blackBFFB(match, this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode1] failed");
		}
		ExtendedClassMethod jMethod = (ExtendedClassMethod) result1_black[1];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_black[2];
		// ForEach ActivityNode2
		for (Object[] result2_black : TGGPostprocessingImpl
				.pattern_TGGPostprocessing_0_2_blackBFF(jMethod)) {
			// Return returnStatement = (Return) result2_black[1];
			IdentifierReference identifierReference = (IdentifierReference) result2_black[2];
			// ActivityNode12
			TGGPostprocessingImpl.pattern_TGGPostprocessing_0_3_expressionBBB(
					this, identifierReference, tDefinition);

		}
		// ForEach ActivityNode4
		for (Object[] result4_black : TGGPostprocessingImpl
				.pattern_TGGPostprocessing_0_4_blackBFF(jMethod)) {
			// ExpressionStatement expressionStatement = (ExpressionStatement) result4_black[1];
			IdentifierReference identifierReference2 = (IdentifierReference) result4_black[2];
			// ActivityNode13
			TGGPostprocessingImpl.pattern_TGGPostprocessing_0_5_expressionBBB(
					this, identifierReference2, tDefinition);

		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleElementReference(ElementReference reference,
			TMethodDefinition tMethod) {
		// ActivityNode33
		Object[] result1_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_1_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode33] failed");
		}
		// ActivityNode6
		Object[] result2_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_1_2_blackBF(reference);
		if (result2_black != null) {
			ClassMethod method = (ClassMethod) result2_black[1];
			// ActivityNode8
			Object[] result3_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_1_3_blackBFB(this, method);
			if (result3_black != null) {
				MemberCorrespondence correspondence = (MemberCorrespondence) result3_black[1];

				// ActivityNode10
				Object[] result4_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_1_4_blackBBF(tMethod,
								correspondence);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode10] failed");
				}
				TMethodDefinition targetMethod = (TMethodDefinition) result4_black[2];
				TGGPostprocessingImpl.pattern_TGGPostprocessing_1_4_greenBB(
						tMethod, targetMethod);

			} else {
				// ActivityNode20
				TGGPostprocessingImpl
						.pattern_TGGPostprocessing_1_5_expressionFBBB(this,
								method, tMethod);

			}

		} else {
			// ActivityNode7
			Object[] result6_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_1_6_blackBF(reference);
			if (result6_black != null) {
				Field field = (Field) result6_black[1];
				// ActivityNode8
				Object[] result7_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_1_7_blackBFB(this, field);
				if (result7_black != null) {
					MemberCorrespondence correspondence2 = (MemberCorrespondence) result7_black[1];

					// ActivityNode10
					Object[] result8_black = TGGPostprocessingImpl
							.pattern_TGGPostprocessing_1_8_blackBBF(tMethod,
									correspondence2);
					if (result8_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [ActivityNode10] failed");
					}
					TFieldDefinition targetField = (TFieldDefinition) result8_black[2];
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_1_8_greenBB(tMethod,
									targetField);

				} else {
					// ActivityNode19
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_1_9_expressionFBBB(this,
									field, tMethod);

				}

			} else {
			}

		}
		// ActivityNode11
		Object[] result10_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_1_10_blackBF(reference);
		if (result10_black != null) {
			MethodCall call = (MethodCall) result10_black[1];
			// ActivityNode39
			TGGPostprocessingImpl.pattern_TGGPostprocessing_1_11_expressionBBB(
					this, call, tMethod);

		} else {
		}
		// ActivityNode38
		Object[] result12_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_1_12_blackBF(reference);
		if (result12_black != null) {
			ElementReference next = (ElementReference) result12_black[1];
			// ActivityNode15
			TGGPostprocessingImpl.pattern_TGGPostprocessing_1_13_expressionBBB(
					this, next, tMethod);
			return;
		} else {
			return;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean creadeAndLink(ClassMethod jAccessed, TMember tAccessing) {
		// ActivityNode22
		Object[] result1_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_2_1_blackFB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode22] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[0];
		// ActivityNode16
		Object[] result2_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_2_2_blackBFF(jAccessed);
		if (result2_black != null) {
			// org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];
			CompilationUnit jCompilationUnit = (CompilationUnit) result2_black[2];

			// ActivityNode24
			Object[] result3_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_3_blackB(tAccessing);
			if (result3_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode24] failed");
			}
			Object[] result3_green = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_3_greenBF(tAccessing);
			TMethodDefinition tAccessed = (TMethodDefinition) result3_green[1];

			// ActivityNode17
			Object[] result4_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_4_blackBFBB(pg, this,
							jCompilationUnit);
			if (result4_black != null) {
				TClass tClass = (TClass) result4_black[1];
				// ActivityNode18
				Object[] result5_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_5_blackBBBBB(tClass,
								tAccessed, pg, this, jCompilationUnit);
				if (result5_black != null) {
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_5_greenBBBB(tClass,
									tAccessed, this, jCompilationUnit);

				} else {
					return TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_6_expressionF();
				}

			} else {
				// ActivityNode21
				Object[] result7_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_7_blackBB(pg, tAccessed);
				if (result7_black != null) {
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_7_greenBFBBB(pg,
									tAccessed, this, jCompilationUnit);
					// TClass tClass = (TClass) result7_green[1];

				} else {
					return TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_8_expressionF();
				}

			}
			// ActivityNode25
			Object[] result9_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_9_blackBFB(pg, jAccessed);
			if (result9_black != null) {
				// TMethod tMethod = (TMethod) result9_black[1];
			} else {

				// ActivityNode26
				Object[] result10_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_10_blackB(pg);
				if (result10_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode26] failed");
				}
				TGGPostprocessingImpl.pattern_TGGPostprocessing_2_10_greenBFB(
						pg, jAccessed);
				// TMethod tMethod = (TMethod) result10_green[1];

			}
			// ActivityNode23
			Object[] result11_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_11_blackBFBB(tAccessed, pg,
							jAccessed);
			if (result11_black != null) {
				TMethod tMethod = (TMethod) result11_black[1];
				Object[] result11_green = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_11_greenBBFFB(tAccessed,
								tMethod, jAccessed);
				// TMethodSignature tNewSignature = (TMethodSignature) result11_green[2];
				TParameterList tParamList = (TParameterList) result11_green[3];

				// ForEach ActivityNode27
				for (Object[] result12_black : TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_12_blackBF(jAccessed)) {
					// OrdinaryParameter jParam = (OrdinaryParameter) result12_black[1];

					// ActivityNode30
					Object[] result13_black = TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_13_blackB(tParamList);
					if (result13_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [ActivityNode30] failed");
					}
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_2_13_greenBF(tParamList);
					// TParameter tParam = (TParameter) result13_green[1];

				}
				return TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_14_expressionF();
			} else {
				return TGGPostprocessingImpl
						.pattern_TGGPostprocessing_2_15_expressionF();
			}

		} else {
			return TGGPostprocessingImpl
					.pattern_TGGPostprocessing_2_16_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName(CompilationUnit jCompilationUnit) {
		// [user code injected with eMoflon]
		String name = jCompilationUnit.getName();
		return name.substring(0, name.length() - 5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createAndLink(Field jAccessed, TMember tAccessing) {
		// ActivityNode022
		Object[] result1_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_4_1_blackBF(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode022] failed");
		}
		TypeGraph pg = (TypeGraph) result1_black[1];
		// ActivityNode028
		Object[] result2_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_4_2_blackFFB(jAccessed);
		if (result2_black != null) {
			CompilationUnit jCompilationunit = (CompilationUnit) result2_black[0];
			// org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) result2_black[1];

			// ActivityNode029
			Object[] result3_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_3_blackB(tAccessing);
			if (result3_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode029] failed");
			}
			Object[] result3_green = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_3_greenFB(tAccessing);
			TFieldDefinition tAccessed = (TFieldDefinition) result3_green[0];

			// ActivityNode017
			Object[] result4_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_4_blackFBBB(pg, this,
							jCompilationunit);
			if (result4_black != null) {
				TClass tClass = (TClass) result4_black[0];
				// ActivityNode018
				Object[] result5_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_4_5_blackBBBBB(tClass,
								tAccessed, pg, this, jCompilationunit);
				if (result5_black != null) {
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_4_5_greenBBBB(tClass,
									tAccessed, this, jCompilationunit);

				} else {
					return TGGPostprocessingImpl
							.pattern_TGGPostprocessing_4_6_expressionF();
				}

			} else {
				// ActivityNode021
				Object[] result7_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_4_7_blackBB(pg, tAccessed);
				if (result7_black != null) {
					TGGPostprocessingImpl
							.pattern_TGGPostprocessing_4_7_greenBFBBB(pg,
									tAccessed, this, jCompilationunit);
					// TClass tClass = (TClass) result7_green[1];

				} else {
					return TGGPostprocessingImpl
							.pattern_TGGPostprocessing_4_8_expressionF();
				}

			}
			// ActivityNode025
			Object[] result9_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_9_blackBFB(pg, jAccessed);
			if (result9_black != null) {
				// TField tField = (TField) result9_black[1];
			} else {

				// ActivityNode032
				Object[] result10_black = TGGPostprocessingImpl
						.pattern_TGGPostprocessing_4_10_blackB(pg);
				if (result10_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode032] failed");
				}
				TGGPostprocessingImpl.pattern_TGGPostprocessing_4_10_greenBFB(
						pg, jAccessed);
				// TField tField = (TField) result10_green[1];

			}

			// ActivityNode031
			Object[] result11_black = TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_11_blackBFBB(pg, tAccessed,
							jAccessed);
			if (result11_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [ActivityNode031] failed");
			}
			TField tField = (TField) result11_black[1];
			TGGPostprocessingImpl.pattern_TGGPostprocessing_4_11_greenBFBB(
					tField, tAccessed, jAccessed);
			// TFieldSignature tNewSignature = (TFieldSignature) result11_green[1];

			return TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_12_expressionF();
		} else {
			return TGGPostprocessingImpl
					.pattern_TGGPostprocessing_4_13_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleArguments(MethodCall reference, TMethodDefinition tMethod) {
		// ActivityNode37
		Object[] result1_black = TGGPostprocessingImpl
				.pattern_TGGPostprocessing_5_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode37] failed");
		}
		// ForEach ActivityNode34
		for (Object[] result2_black : TGGPostprocessingImpl
				.pattern_TGGPostprocessing_5_2_blackBF(reference)) {
			AdditiveExpression additive = (AdditiveExpression) result2_black[1];
			// ForEach ActivityNode35
			for (Object[] result3_black : TGGPostprocessingImpl
					.pattern_TGGPostprocessing_5_3_blackFB(additive)) {
				IdentifierReference identifierReference = (IdentifierReference) result3_black[0];
				// ActivityNode36
				TGGPostprocessingImpl
						.pattern_TGGPostprocessing_5_4_expressionBBB(this,
								identifierReference, tMethod);

			}

		}
		return;
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
		case PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES:
			return ((InternalEList<?>) getMemberCorrespondences()).basicRemove(
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
		case PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES:
			return getMemberCorrespondences();
		case PostprocessingPackage.TGG_POSTPROCESSING__PG:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES:
			getMemberCorrespondences().clear();
			getMemberCorrespondences().addAll(
					(Collection<? extends MemberCorrespondence>) newValue);
			return;
		case PostprocessingPackage.TGG_POSTPROCESSING__PG:
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
		case PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES:
			getMemberCorrespondences().clear();
			return;
		case PostprocessingPackage.TGG_POSTPROCESSING__PG:
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
		case PostprocessingPackage.TGG_POSTPROCESSING__MEMBER_CORRESPONDENCES:
			return memberCorrespondences != null
					&& !memberCorrespondences.isEmpty();
		case PostprocessingPackage.TGG_POSTPROCESSING__PG:
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
		case PostprocessingPackage.TGG_POSTPROCESSING___CREATE_ACCESS_EDGES_FOR_METHOD__CLASSMETHODTOTMETHODDEFINITION:
			createAccessEdgesForMethod((ClassMethodToTMethodDefinition) arguments
					.get(0));
			return null;
		case PostprocessingPackage.TGG_POSTPROCESSING___HANDLE_ELEMENT_REFERENCE__ELEMENTREFERENCE_TMETHODDEFINITION:
			handleElementReference((ElementReference) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
			return null;
		case PostprocessingPackage.TGG_POSTPROCESSING___CREADE_AND_LINK__CLASSMETHOD_TMEMBER:
			return creadeAndLink((ClassMethod) arguments.get(0),
					(TMember) arguments.get(1));
		case PostprocessingPackage.TGG_POSTPROCESSING___GET_FULLY_QUALIFIED_NAME__COMPILATIONUNIT:
			return getFullyQualifiedName((CompilationUnit) arguments.get(0));
		case PostprocessingPackage.TGG_POSTPROCESSING___CREATE_AND_LINK__FIELD_TMEMBER:
			return createAndLink((Field) arguments.get(0),
					(TMember) arguments.get(1));
		case PostprocessingPackage.TGG_POSTPROCESSING___HANDLE_ARGUMENTS__METHODCALL_TMETHODDEFINITION:
			handleArguments((MethodCall) arguments.get(0),
					(TMethodDefinition) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TGGPostprocessing_0_1_blackBFFB(
			ClassMethodToTMethodDefinition match, TGGPostprocessing _this) {
		ExtendedClassMethod jMethod = match.getSource();
		if (jMethod != null) {
			TMethodDefinition tDefinition = match.getTarget();
			if (tDefinition != null) {
				return new Object[] { match, jMethod, tDefinition, _this };
			}

		}

		return null;
	}

	public static final Iterable<Object[]> pattern_TGGPostprocessing_0_2_blackBFF(
			ExtendedClassMethod jMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Statement tmpReturnStatement : jMethod.getStatements()) {
			if (tmpReturnStatement instanceof Return) {
				Return returnStatement = (Return) tmpReturnStatement;
				Expression tmpIdentifierReference = returnStatement
						.getReturnValue();
				if (tmpIdentifierReference instanceof IdentifierReference) {
					IdentifierReference identifierReference = (IdentifierReference) tmpIdentifierReference;
					_result.add(new Object[] { jMethod, returnStatement,
							identifierReference });
				}

			}
		}
		return _result;
	}

	public static final void pattern_TGGPostprocessing_0_3_expressionBBB(
			TGGPostprocessing _this, IdentifierReference identifierReference,
			TMethodDefinition tDefinition) {
		_this.handleElementReference(identifierReference, tDefinition);

	}

	public static final Iterable<Object[]> pattern_TGGPostprocessing_0_4_blackBFF(
			ExtendedClassMethod jMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Statement tmpExpressionStatement : jMethod.getStatements()) {
			if (tmpExpressionStatement instanceof ExpressionStatement) {
				ExpressionStatement expressionStatement = (ExpressionStatement) tmpExpressionStatement;
				Expression tmpIdentifierReference2 = expressionStatement
						.getExpression();
				if (tmpIdentifierReference2 instanceof IdentifierReference) {
					IdentifierReference identifierReference2 = (IdentifierReference) tmpIdentifierReference2;
					_result.add(new Object[] { jMethod, expressionStatement,
							identifierReference2 });
				}

			}
		}
		return _result;
	}

	public static final void pattern_TGGPostprocessing_0_5_expressionBBB(
			TGGPostprocessing _this, IdentifierReference identifierReference2,
			TMethodDefinition tDefinition) {
		_this.handleElementReference(identifierReference2, tDefinition);

	}

	public static final Object[] pattern_TGGPostprocessing_1_1_blackB(
			TGGPostprocessing _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TGGPostprocessing_1_2_blackBF(
			ElementReference reference) {
		ReferenceableElement tmpMethod = reference.getTarget();
		if (tmpMethod instanceof ClassMethod) {
			ClassMethod method = (ClassMethod) tmpMethod;
			return new Object[] { reference, method };
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_3_blackBFB(
			TGGPostprocessing _this, ClassMethod method) {
		for (MemberCorrespondence correspondence : _this
				.getMemberCorrespondences()) {
			if (method.equals(correspondence.getSource())) {
				return new Object[] { _this, correspondence, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_4_blackBBF(
			TMethodDefinition tMethod, MemberCorrespondence correspondence) {
		TMember tmpTargetMethod = correspondence.getTarget();
		if (tmpTargetMethod instanceof TMethodDefinition) {
			TMethodDefinition targetMethod = (TMethodDefinition) tmpTargetMethod;
			if (!tMethod.equals(targetMethod)) {
				return new Object[] { tMethod, correspondence, targetMethod };
			}
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_4_greenBB(
			TMethodDefinition tMethod, TMethodDefinition targetMethod) {
		tMethod.getAccess().add(targetMethod);
		return new Object[] { tMethod, targetMethod };
	}

	public static final boolean pattern_TGGPostprocessing_1_5_expressionFBBB(
			TGGPostprocessing _this, ClassMethod method,
			TMethodDefinition tMethod) {
		boolean _localVariable_0 = _this.creadeAndLink(method, tMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_1_6_blackBF(
			ElementReference reference) {
		ReferenceableElement tmpField = reference.getTarget();
		if (tmpField instanceof Field) {
			Field field = (Field) tmpField;
			return new Object[] { reference, field };
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_7_blackBFB(
			TGGPostprocessing _this, Field field) {
		for (MemberCorrespondence correspondence2 : _this
				.getMemberCorrespondences()) {
			if (field.equals(correspondence2.getSource())) {
				return new Object[] { _this, correspondence2, field };
			}
		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_8_blackBBF(
			TMethodDefinition tMethod, MemberCorrespondence correspondence2) {
		TMember tmpTargetField = correspondence2.getTarget();
		if (tmpTargetField instanceof TFieldDefinition) {
			TFieldDefinition targetField = (TFieldDefinition) tmpTargetField;
			return new Object[] { tMethod, correspondence2, targetField };
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_1_8_greenBB(
			TMethodDefinition tMethod, TFieldDefinition targetField) {
		tMethod.getAccess().add(targetField);
		return new Object[] { tMethod, targetField };
	}

	public static final boolean pattern_TGGPostprocessing_1_9_expressionFBBB(
			TGGPostprocessing _this, Field field, TMethodDefinition tMethod) {
		boolean _localVariable_0 = _this.createAndLink(field, tMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_1_10_blackBF(
			ElementReference reference) {
		Reference tmpCall = reference.getNext();
		if (tmpCall instanceof MethodCall) {
			MethodCall call = (MethodCall) tmpCall;
			if (!call.equals(reference)) {
				return new Object[] { reference, call };
			}
		}

		return null;
	}

	public static final void pattern_TGGPostprocessing_1_11_expressionBBB(
			TGGPostprocessing _this, MethodCall call, TMethodDefinition tMethod) {
		_this.handleArguments(call, tMethod);

	}

	public static final Object[] pattern_TGGPostprocessing_1_12_blackBF(
			ElementReference reference) {
		Reference tmpNext = reference.getNext();
		if (tmpNext instanceof ElementReference) {
			ElementReference next = (ElementReference) tmpNext;
			if (!next.equals(reference)) {
				return new Object[] { reference, next };
			}
		}

		return null;
	}

	public static final void pattern_TGGPostprocessing_1_13_expressionBBB(
			TGGPostprocessing _this, ElementReference next,
			TMethodDefinition tMethod) {
		_this.handleElementReference(next, tMethod);

	}

	public static final Object[] pattern_TGGPostprocessing_2_1_blackFB(
			TGGPostprocessing _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { pg, _this };
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_2_blackBFF(
			ClassMethod jAccessed) {
		for (MemberContainer tmpJClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jAccessed, MemberContainer.class,
						"members")) {
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				for (CompilationUnit jCompilationUnit : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jClass,
								CompilationUnit.class, "classifiers")) {
					return new Object[] { jAccessed, jClass, jCompilationUnit };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_3_blackB(
			TMember tAccessing) {
		return new Object[] { tAccessing };
	}

	public static final Object[] pattern_TGGPostprocessing_2_3_greenBF(
			TMember tAccessing) {
		TMethodDefinition tAccessed = TypeGraphBasicFactory.eINSTANCE
				.createTMethodDefinition();
		tAccessing.getAccess().add(tAccessed);
		return new Object[] { tAccessing, tAccessed };
	}

	public static final Object[] pattern_TGGPostprocessing_2_4_blackBFBB(
			TypeGraph pg, TGGPostprocessing _this,
			CompilationUnit jCompilationUnit) {
		String _localVariable_0 = _this.getFullyQualifiedName(jCompilationUnit);
		for (TClass tClass : pg.getClasses()) {
			String tClasstName = tClass.getTName();
			if (tClasstName.equals(_localVariable_0)) {
				return new Object[] { pg, tClass, _this, jCompilationUnit };
			}

		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_5_blackBBBBB(
			TClass tClass, TMethodDefinition tAccessed, TypeGraph pg,
			TGGPostprocessing _this, CompilationUnit jCompilationUnit) {
		if (pg.getClasses().contains(tClass)) {
			String _localVariable_0 = _this
					.getFullyQualifiedName(jCompilationUnit);
			String tClasstName = tClass.getTName();
			if (tClasstName.equals(_localVariable_0)) {
				return new Object[] { tClass, tAccessed, pg, _this,
						jCompilationUnit };
			}

		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_5_greenBBBB(
			TClass tClass, TMethodDefinition tAccessed,
			TGGPostprocessing _this, CompilationUnit jCompilationUnit) {
		tClass.getDefines().add(tAccessed);
		return new Object[] { tClass, tAccessed, _this, jCompilationUnit };
	}

	public static final boolean pattern_TGGPostprocessing_2_6_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_2_7_blackBB(
			TypeGraph pg, TMethodDefinition tAccessed) {
		return new Object[] { pg, tAccessed };
	}

	public static final Object[] pattern_TGGPostprocessing_2_7_greenBFBBB(
			TypeGraph pg, TMethodDefinition tAccessed, TGGPostprocessing _this,
			CompilationUnit jCompilationUnit) {
		TClass tClass = TypeGraphBasicFactory.eINSTANCE.createTClass();
		String _localVariable_0 = _this.getFullyQualifiedName(jCompilationUnit);
		pg.getClasses().add(tClass);
		tClass.getDefines().add(tAccessed);
		String tClass_tName_prime = _localVariable_0;
		tClass.setTName(tClass_tName_prime);
		return new Object[] { pg, tClass, tAccessed, _this, jCompilationUnit };
	}

	public static final boolean pattern_TGGPostprocessing_2_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_2_9_blackBFB(
			TypeGraph pg, ClassMethod jAccessed) {
		String jAccessedname = jAccessed.getName();
		for (TMethod tMethod : pg.getMethods()) {
			String tMethodtName = tMethod.getTName();
			if (tMethodtName.equals(jAccessedname)) {
				return new Object[] { pg, tMethod, jAccessed };
			}

		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_10_blackB(
			TypeGraph pg) {
		return new Object[] { pg };
	}

	public static final Object[] pattern_TGGPostprocessing_2_10_greenBFB(
			TypeGraph pg, ClassMethod jAccessed) {
		TMethod tMethod = TypeGraphBasicFactory.eINSTANCE.createTMethod();
		pg.getMethods().add(tMethod);
		String jAccessedname = jAccessed.getName();
		String tMethod_tName_prime = jAccessedname;
		tMethod.setTName(tMethod_tName_prime);
		return new Object[] { pg, tMethod, jAccessed };

	}

	public static final Object[] pattern_TGGPostprocessing_2_11_blackBFBB(
			TMethodDefinition tAccessed, TypeGraph pg, ClassMethod jAccessed) {
		String jAccessedname = jAccessed.getName();
		for (TMethod tMethod : pg.getMethods()) {
			String tMethodtName = tMethod.getTName();
			if (tMethodtName.equals(jAccessedname)) {
				return new Object[] { tAccessed, tMethod, pg, jAccessed };
			}

		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_2_11_greenBBFFB(
			TMethodDefinition tAccessed, TMethod tMethod, ClassMethod jAccessed) {
		TMethodSignature tNewSignature = TypeGraphBasicFactory.eINSTANCE
				.createTMethodSignature();
		TParameterList tParamList = TypeGraphBasicFactory.eINSTANCE
				.createTParameterList();
		tNewSignature.getDefinitions().add(tAccessed);
		tNewSignature.setMethod(tMethod);
		tNewSignature.setParamList(tParamList);
		return new Object[] { tAccessed, tMethod, tNewSignature, tParamList,
				jAccessed };
	}

	public static final Iterable<Object[]> pattern_TGGPostprocessing_2_12_blackBF(
			ClassMethod jAccessed) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Parameter tmpJParam : jAccessed.getParameters()) {
			if (tmpJParam instanceof OrdinaryParameter) {
				OrdinaryParameter jParam = (OrdinaryParameter) tmpJParam;
				_result.add(new Object[] { jAccessed, jParam });
			}
		}
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_2_13_blackB(
			TParameterList tParamList) {
		return new Object[] { tParamList };
	}

	public static final Object[] pattern_TGGPostprocessing_2_13_greenBF(
			TParameterList tParamList) {
		TParameter tParam = TypeGraphBasicFactory.eINSTANCE.createTParameter();
		tParamList.getEntries().add(tParam);
		return new Object[] { tParamList, tParam };
	}

	public static final boolean pattern_TGGPostprocessing_2_14_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TGGPostprocessing_2_15_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final boolean pattern_TGGPostprocessing_2_16_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_4_1_blackBF(
			TGGPostprocessing _this) {
		TypeGraph pg = _this.getPg();
		if (pg != null) {
			return new Object[] { _this, pg };
		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_2_blackFFB(
			Field jAccessed) {
		for (MemberContainer tmpJClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jAccessed, MemberContainer.class,
						"members")) {
			if (tmpJClass instanceof org.emftext.language.java.classifiers.Class) {
				org.emftext.language.java.classifiers.Class jClass = (org.emftext.language.java.classifiers.Class) tmpJClass;
				for (CompilationUnit jCompilationunit : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jClass,
								CompilationUnit.class, "classifiers")) {
					return new Object[] { jCompilationunit, jClass, jAccessed };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_3_blackB(
			TMember tAccessing) {
		return new Object[] { tAccessing };
	}

	public static final Object[] pattern_TGGPostprocessing_4_3_greenFB(
			TMember tAccessing) {
		TFieldDefinition tAccessed = TypeGraphBasicFactory.eINSTANCE
				.createTFieldDefinition();
		tAccessing.getAccess().add(tAccessed);
		return new Object[] { tAccessed, tAccessing };
	}

	public static final Object[] pattern_TGGPostprocessing_4_4_blackFBBB(
			TypeGraph pg, TGGPostprocessing _this,
			CompilationUnit jCompilationunit) {
		String _localVariable_0 = _this.getFullyQualifiedName(jCompilationunit);
		for (TClass tClass : pg.getClasses()) {
			String tClasstName = tClass.getTName();
			if (tClasstName.equals(_localVariable_0)) {
				return new Object[] { tClass, pg, _this, jCompilationunit };
			}

		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_5_blackBBBBB(
			TClass tClass, TFieldDefinition tAccessed, TypeGraph pg,
			TGGPostprocessing _this, CompilationUnit jCompilationunit) {
		if (pg.getClasses().contains(tClass)) {
			String _localVariable_0 = _this
					.getFullyQualifiedName(jCompilationunit);
			String tClasstName = tClass.getTName();
			if (tClasstName.equals(_localVariable_0)) {
				return new Object[] { tClass, tAccessed, pg, _this,
						jCompilationunit };
			}

		}
		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_5_greenBBBB(
			TClass tClass, TFieldDefinition tAccessed, TGGPostprocessing _this,
			CompilationUnit jCompilationunit) {
		tClass.getDefines().add(tAccessed);
		return new Object[] { tClass, tAccessed, _this, jCompilationunit };
	}

	public static final boolean pattern_TGGPostprocessing_4_6_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_4_7_blackBB(
			TypeGraph pg, TFieldDefinition tAccessed) {
		return new Object[] { pg, tAccessed };
	}

	public static final Object[] pattern_TGGPostprocessing_4_7_greenBFBBB(
			TypeGraph pg, TFieldDefinition tAccessed, TGGPostprocessing _this,
			CompilationUnit jCompilationunit) {
		TClass tClass = TypeGraphBasicFactory.eINSTANCE.createTClass();
		String _localVariable_0 = _this.getFullyQualifiedName(jCompilationunit);
		pg.getClasses().add(tClass);
		tClass.getDefines().add(tAccessed);
		String tClass_tName_prime = _localVariable_0;
		tClass.setTName(tClass_tName_prime);
		return new Object[] { pg, tClass, tAccessed, _this, jCompilationunit };
	}

	public static final boolean pattern_TGGPostprocessing_4_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_4_9_blackBFB(
			TypeGraph pg, Field jAccessed) {
		String jAccessedname = jAccessed.getName();
		for (TField tField : pg.getFields()) {
			String tFieldtName = tField.getTName();
			if (tFieldtName.equals(jAccessedname)) {
				return new Object[] { pg, tField, jAccessed };
			}

		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_10_blackB(
			TypeGraph pg) {
		return new Object[] { pg };
	}

	public static final Object[] pattern_TGGPostprocessing_4_10_greenBFB(
			TypeGraph pg, Field jAccessed) {
		TField tField = TypeGraphBasicFactory.eINSTANCE.createTField();
		pg.getFields().add(tField);
		String jAccessedname = jAccessed.getName();
		String tField_tName_prime = jAccessedname;
		tField.setTName(tField_tName_prime);
		return new Object[] { pg, tField, jAccessed };

	}

	public static final Object[] pattern_TGGPostprocessing_4_11_blackBFBB(
			TypeGraph pg, TFieldDefinition tAccessed, Field jAccessed) {
		String jAccessedname = jAccessed.getName();
		for (TField tField : pg.getFields()) {
			String tFieldtName = tField.getTName();
			if (tFieldtName.equals(jAccessedname)) {
				return new Object[] { pg, tField, tAccessed, jAccessed };
			}

		}

		return null;
	}

	public static final Object[] pattern_TGGPostprocessing_4_11_greenBFBB(
			TField tField, TFieldDefinition tAccessed, Field jAccessed) {
		TFieldSignature tNewSignature = TypeGraphBasicFactory.eINSTANCE
				.createTFieldSignature();
		tNewSignature.setField(tField);
		tNewSignature.getDefinitions().add(tAccessed);
		return new Object[] { tField, tNewSignature, tAccessed, jAccessed };
	}

	public static final boolean pattern_TGGPostprocessing_4_12_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TGGPostprocessing_4_13_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TGGPostprocessing_5_1_blackB(
			TGGPostprocessing _this) {
		return new Object[] { _this };
	}

	public static final Iterable<Object[]> pattern_TGGPostprocessing_5_2_blackBF(
			MethodCall reference) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Expression tmpAdditive : reference.getArguments()) {
			if (tmpAdditive instanceof AdditiveExpression) {
				AdditiveExpression additive = (AdditiveExpression) tmpAdditive;
				_result.add(new Object[] { reference, additive });
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TGGPostprocessing_5_3_blackFB(
			AdditiveExpression additive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AdditiveExpressionChild tmpIdentifierReference : additive
				.getChildren()) {
			if (tmpIdentifierReference instanceof IdentifierReference) {
				IdentifierReference identifierReference = (IdentifierReference) tmpIdentifierReference;
				_result.add(new Object[] { identifierReference, additive });
			}
		}
		return _result;
	}

	public static final void pattern_TGGPostprocessing_5_4_expressionBBB(
			TGGPostprocessing _this, IdentifierReference identifierReference,
			TMethodDefinition tMethod) {
		_this.handleElementReference(identifierReference, tMethod);

	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TGGPostprocessingImpl
