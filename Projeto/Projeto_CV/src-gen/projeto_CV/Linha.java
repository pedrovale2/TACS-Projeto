/**
 */
package projeto_CV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Linha#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getLinha()
 * @model
 * @generated
 */
public interface Linha extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.SuperType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getLinha_Supertype()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperType> getSupertype();

} // Linha
