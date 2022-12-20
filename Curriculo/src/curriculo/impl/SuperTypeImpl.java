/**
 */
package curriculo.impl;

import curriculo.CurriculoPackage;
import curriculo.SuperType;

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
 * An implementation of the model object '<em><b>Super Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculo.impl.SuperTypeImpl#getSubvalues <em>Subvalues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperTypeImpl extends MinimalEObjectImpl.Container implements SuperType {
	/**
	 * The cached value of the '{@link #getSubvalues() <em>Subvalues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvalues()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperType> subvalues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurriculoPackage.Literals.SUPER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperType> getSubvalues() {
		if (subvalues == null) {
			subvalues = new EObjectContainmentEList<SuperType>(SuperType.class, this,
					CurriculoPackage.SUPER_TYPE__SUBVALUES);
		}
		return subvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurriculoPackage.SUPER_TYPE__SUBVALUES:
			return ((InternalEList<?>) getSubvalues()).basicRemove(otherEnd, msgs);
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
		case CurriculoPackage.SUPER_TYPE__SUBVALUES:
			return getSubvalues();
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
		case CurriculoPackage.SUPER_TYPE__SUBVALUES:
			getSubvalues().clear();
			getSubvalues().addAll((Collection<? extends SuperType>) newValue);
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
		case CurriculoPackage.SUPER_TYPE__SUBVALUES:
			getSubvalues().clear();
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
		case CurriculoPackage.SUPER_TYPE__SUBVALUES:
			return subvalues != null && !subvalues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SuperTypeImpl
