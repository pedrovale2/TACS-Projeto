/**
 */
package curriculo.impl;

import curriculo.BodyTable;
import curriculo.CurriculoPackage;
import curriculo.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculo.impl.BodyTableImpl#getBodyrow <em>Bodyrow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyTableImpl extends MinimalEObjectImpl.Container implements BodyTable {
	/**
	 * The cached value of the '{@link #getBodyrow() <em>Bodyrow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> bodyrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurriculoPackage.Literals.BODY_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getBodyrow() {
		if (bodyrow == null) {
			bodyrow = new EObjectContainmentEList<Row>(Row.class, this, CurriculoPackage.BODY_TABLE__BODYROW);
		}
		return bodyrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurriculoPackage.BODY_TABLE__BODYROW:
			return ((InternalEList<?>) getBodyrow()).basicRemove(otherEnd, msgs);
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
		case CurriculoPackage.BODY_TABLE__BODYROW:
			return getBodyrow();
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
		case CurriculoPackage.BODY_TABLE__BODYROW:
			getBodyrow().clear();
			getBodyrow().addAll((Collection<? extends Row>) newValue);
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
		case CurriculoPackage.BODY_TABLE__BODYROW:
			getBodyrow().clear();
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
		case CurriculoPackage.BODY_TABLE__BODYROW:
			return bodyrow != null && !bodyrow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyTableImpl
