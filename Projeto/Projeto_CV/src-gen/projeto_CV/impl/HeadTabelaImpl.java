/**
 */
package projeto_CV.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projeto_CV.HeadTabela;
import projeto_CV.Projeto_CVPackage;
import projeto_CV.Row;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Tabela</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.impl.HeadTabelaImpl#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadTabelaImpl extends MinimalEObjectImpl.Container implements HeadTabela {
	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected Row row;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadTabelaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Projeto_CVPackage.Literals.HEAD_TABELA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRow(Row newRow, NotificationChain msgs) {
		Row oldRow = row;
		row = newRow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Projeto_CVPackage.HEAD_TABELA__ROW, oldRow, newRow);
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
	public void setRow(Row newRow) {
		if (newRow != row) {
			NotificationChain msgs = null;
			if (row != null)
				msgs = ((InternalEObject) row).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Projeto_CVPackage.HEAD_TABELA__ROW, null, msgs);
			if (newRow != null)
				msgs = ((InternalEObject) newRow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Projeto_CVPackage.HEAD_TABELA__ROW, null, msgs);
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Projeto_CVPackage.HEAD_TABELA__ROW, newRow, newRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Projeto_CVPackage.HEAD_TABELA__ROW:
			return basicSetRow(null, msgs);
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
		case Projeto_CVPackage.HEAD_TABELA__ROW:
			return getRow();
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
		case Projeto_CVPackage.HEAD_TABELA__ROW:
			setRow((Row) newValue);
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
		case Projeto_CVPackage.HEAD_TABELA__ROW:
			setRow((Row) null);
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
		case Projeto_CVPackage.HEAD_TABELA__ROW:
			return row != null;
		}
		return super.eIsSet(featureID);
	}

} //HeadTabelaImpl
