/**
 */
package curriculo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculo.Row#getRowvalues <em>Rowvalues</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Rowvalues</b></em>' containment reference list.
	 * The list contents are of type {@link curriculo.SuperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowvalues</em>' containment reference list.
	 * @see curriculo.CurriculoPackage#getRow_Rowvalues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SuperType> getRowvalues();

} // Row
