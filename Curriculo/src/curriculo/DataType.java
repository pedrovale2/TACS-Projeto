/**
 */
package curriculo;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculo.DataType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends SuperType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see curriculo.CurriculoPackage#getDataType_Value()
	 * @model
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link curriculo.DataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

} // DataType
