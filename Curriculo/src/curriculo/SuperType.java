/**
 */
package curriculo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link curriculo.SuperType#getSubvalues <em>Subvalues</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getSuperType()
 * @model
 * @generated
 */
public interface SuperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subvalues</b></em>' containment reference list.
	 * The list contents are of type {@link curriculo.SuperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvalues</em>' containment reference list.
	 * @see curriculo.CurriculoPackage#getSuperType_Subvalues()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperType> getSubvalues();

} // SuperType
