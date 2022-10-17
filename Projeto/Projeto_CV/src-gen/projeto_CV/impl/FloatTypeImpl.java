/**
 */
package projeto_CV.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projeto_CV.FloatType;
import projeto_CV.Projeto_CVPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.impl.FloatTypeImpl#getFlt <em>Flt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatTypeImpl extends SuperTypeImpl implements FloatType {
	/**
	 * The default value of the '{@link #getFlt() <em>Flt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlt()
	 * @generated
	 * @ordered
	 */
	protected static final float FLT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFlt() <em>Flt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlt()
	 * @generated
	 * @ordered
	 */
	protected float flt = FLT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Projeto_CVPackage.Literals.FLOAT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFlt() {
		return flt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlt(float newFlt) {
		float oldFlt = flt;
		flt = newFlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Projeto_CVPackage.FLOAT_TYPE__FLT, oldFlt, flt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Projeto_CVPackage.FLOAT_TYPE__FLT:
			return getFlt();
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
		case Projeto_CVPackage.FLOAT_TYPE__FLT:
			setFlt((Float) newValue);
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
		case Projeto_CVPackage.FLOAT_TYPE__FLT:
			setFlt(FLT_EDEFAULT);
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
		case Projeto_CVPackage.FLOAT_TYPE__FLT:
			return flt != FLT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (flt: ");
		result.append(flt);
		result.append(')');
		return result.toString();
	}

} //FloatTypeImpl
