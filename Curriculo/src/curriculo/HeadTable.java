/**
 */
package curriculo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculo.HeadTable#getHeadrow <em>Headrow</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getHeadTable()
 * @model
 * @generated
 */
public interface HeadTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Headrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headrow</em>' containment reference.
	 * @see #setHeadrow(Row)
	 * @see curriculo.CurriculoPackage#getHeadTable_Headrow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Row getHeadrow();

	/**
	 * Sets the value of the '{@link curriculo.HeadTable#getHeadrow <em>Headrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headrow</em>' containment reference.
	 * @see #getHeadrow()
	 * @generated
	 */
	void setHeadrow(Row value);

} // HeadTable
