/**
 */
package curriculo.impl;

import curriculo.CurriculoPackage;
import curriculo.Information;
import curriculo.SuperType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link curriculo.impl.InformationImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationImpl extends AttributeImpl implements Information {
	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected SuperType supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CurriculoPackage.Literals.INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperType getSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertype(SuperType newSupertype, NotificationChain msgs) {
		SuperType oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CurriculoPackage.INFORMATION__SUPERTYPE, oldSupertype, newSupertype);
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
	public void setSupertype(SuperType newSupertype) {
		if (newSupertype != supertype) {
			NotificationChain msgs = null;
			if (supertype != null)
				msgs = ((InternalEObject) supertype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.INFORMATION__SUPERTYPE, null, msgs);
			if (newSupertype != null)
				msgs = ((InternalEObject) newSupertype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CurriculoPackage.INFORMATION__SUPERTYPE, null, msgs);
			msgs = basicSetSupertype(newSupertype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CurriculoPackage.INFORMATION__SUPERTYPE, newSupertype,
					newSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CurriculoPackage.INFORMATION__SUPERTYPE:
			return basicSetSupertype(null, msgs);
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
		case CurriculoPackage.INFORMATION__SUPERTYPE:
			return getSupertype();
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
		case CurriculoPackage.INFORMATION__SUPERTYPE:
			setSupertype((SuperType) newValue);
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
		case CurriculoPackage.INFORMATION__SUPERTYPE:
			setSupertype((SuperType) null);
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
		case CurriculoPackage.INFORMATION__SUPERTYPE:
			return supertype != null;
		}
		return super.eIsSet(featureID);
	}

} //InformationImpl
