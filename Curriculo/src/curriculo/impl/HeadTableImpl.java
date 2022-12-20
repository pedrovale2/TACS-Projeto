/**
 */
package curriculo.impl;

import curriculo.CurriculoPackage;
import curriculo.HeadTable;
import curriculo.Row;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculo.impl.HeadTableImpl#getHeadrow <em>Headrow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadTableImpl extends MinimalEObjectImpl.Container implements HeadTable {
	/**
	 * The cached value of the '{@link #getHeadrow() <em>Headrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadrow()
	 * @generated
	 * @ordered
	 */
	protected Row headrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurriculoPackage.Literals.HEAD_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row getHeadrow() {
		return headrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeadrow(Row newHeadrow, NotificationChain msgs) {
		Row oldHeadrow = headrow;
		headrow = newHeadrow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CurriculoPackage.HEAD_TABLE__HEADROW, oldHeadrow, newHeadrow);
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
	public void setHeadrow(Row newHeadrow) {
		if (newHeadrow != headrow) {
			NotificationChain msgs = null;
			if (headrow != null)
				msgs = ((InternalEObject) headrow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.HEAD_TABLE__HEADROW, null, msgs);
			if (newHeadrow != null)
				msgs = ((InternalEObject) newHeadrow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.HEAD_TABLE__HEADROW, null, msgs);
			msgs = basicSetHeadrow(newHeadrow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurriculoPackage.HEAD_TABLE__HEADROW, newHeadrow,
					newHeadrow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurriculoPackage.HEAD_TABLE__HEADROW:
			return basicSetHeadrow(null, msgs);
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
		case CurriculoPackage.HEAD_TABLE__HEADROW:
			return getHeadrow();
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
		case CurriculoPackage.HEAD_TABLE__HEADROW:
			setHeadrow((Row) newValue);
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
		case CurriculoPackage.HEAD_TABLE__HEADROW:
			setHeadrow((Row) null);
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
		case CurriculoPackage.HEAD_TABLE__HEADROW:
			return headrow != null;
		}
		return super.eIsSet(featureID);
	}

} //HeadTableImpl
