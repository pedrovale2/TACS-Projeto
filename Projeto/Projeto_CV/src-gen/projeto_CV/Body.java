/**
 */
package projeto_CV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Body#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getBody_Row()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Row> getRow();

} // Body