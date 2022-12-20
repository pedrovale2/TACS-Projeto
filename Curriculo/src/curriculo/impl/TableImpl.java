/**
 */
package curriculo.impl;

import curriculo.BodyTable;
import curriculo.CurriculoPackage;
import curriculo.CurriculoTables;
import curriculo.HeadTable;
import curriculo.Row;
import curriculo.SuperType;
import curriculo.Table;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculo.impl.TableImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link curriculo.impl.TableImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends AttributeImpl implements Table {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeadTable header;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodyTable body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurriculoPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadTable getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeadTable newHeader, NotificationChain msgs) {
		HeadTable oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CurriculoPackage.TABLE__HEADER, oldHeader, newHeader);
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
	public void setHeader(HeadTable newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject) header).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.TABLE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject) newHeader).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.TABLE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurriculoPackage.TABLE__HEADER, newHeader,
					newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyTable getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyTable newBody, NotificationChain msgs) {
		BodyTable oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CurriculoPackage.TABLE__BODY,
					oldBody, newBody);
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
	public void setBody(BodyTable newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.TABLE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.TABLE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurriculoPackage.TABLE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sameSizeRows(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Table::sameSizeRows";
		try {
			/**
			 *
			 * inv sameSizeRows:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.body.bodyrow->forAll(r |
			 *           r.rowvalues->size() =
			 *           self.header.headrow.rowvalues->size())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					CurriculoPackage.Literals.TABLE___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, CurriculoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ BodyTable body = this.getBody();
					if (body == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://www.example.org/curriculo\'::BodyTable::bodyrow\'");
					}
					final /*@Thrown*/ List<Row> bodyrow = body.getBodyrow();
					final /*@Thrown*/ OrderedSetValue BOXED_bodyrow = idResolver
							.createOrderedSetOfAll(CurriculoTables.ORD_CLSSid_Row, bodyrow);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_r = BOXED_bodyrow.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_r.hasNext()) {
							if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Row r = (Row) ITERATOR_r.next();
						/**
						 * r.rowvalues->size() = self.header.headrow.rowvalues->size()
						 */
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ List<SuperType> rowvalues = r.getRowvalues();
							final /*@NonInvalid*/ OrderedSetValue BOXED_rowvalues = idResolver
									.createOrderedSetOfAll(CurriculoTables.ORD_CLSSid_SuperType, rowvalues);
							final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_rowvalues);
							final /*@NonInvalid*/ HeadTable header = this.getHeader();
							if (header == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/curriculo\'::HeadTable::headrow\'");
							}
							final /*@Thrown*/ Row headrow = header.getHeadrow();
							final /*@Thrown*/ List<SuperType> rowvalues_0 = headrow.getRowvalues();
							final /*@Thrown*/ OrderedSetValue BOXED_rowvalues_0 = idResolver
									.createOrderedSetOfAll(CurriculoTables.ORD_CLSSid_SuperType, rowvalues_0);
							final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_rowvalues_0);
							final /*@Thrown*/ boolean eq = size.equals(size_0);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_eq instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_eq; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, CurriculoTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurriculoPackage.TABLE__HEADER:
			return basicSetHeader(null, msgs);
		case CurriculoPackage.TABLE__BODY:
			return basicSetBody(null, msgs);
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
		case CurriculoPackage.TABLE__HEADER:
			return getHeader();
		case CurriculoPackage.TABLE__BODY:
			return getBody();
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
		case CurriculoPackage.TABLE__HEADER:
			setHeader((HeadTable) newValue);
			return;
		case CurriculoPackage.TABLE__BODY:
			setBody((BodyTable) newValue);
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
		case CurriculoPackage.TABLE__HEADER:
			setHeader((HeadTable) null);
			return;
		case CurriculoPackage.TABLE__BODY:
			setBody((BodyTable) null);
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
		case CurriculoPackage.TABLE__HEADER:
			return header != null;
		case CurriculoPackage.TABLE__BODY:
			return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CurriculoPackage.TABLE___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP:
			return sameSizeRows((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableImpl
