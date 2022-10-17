/**
 */
package projeto_CV;

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
 *   <li>{@link projeto_CV.Row#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.SuperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getRow_Supertype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SuperType> getSupertype();

} // Row
