/**
 */
package curriculo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculo.BodyTable#getBodyrow <em>Bodyrow</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getBodyTable()
 * @model
 * @generated
 */
public interface BodyTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Bodyrow</b></em>' containment reference list.
	 * The list contents are of type {@link curriculo.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodyrow</em>' containment reference list.
	 * @see curriculo.CurriculoPackage#getBodyTable_Bodyrow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Row> getBodyrow();

} // BodyTable
