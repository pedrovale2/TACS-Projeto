/**
 */
package projeto_CV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.CV#getSeccao <em>Seccao</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getCV()
 * @model
 * @generated
 */
public interface CV extends EObject {
	/**
	 * Returns the value of the '<em><b>Seccao</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.Seccao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seccao</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getCV_Seccao()
	 * @model containment="true"
	 * @generated
	 */
	EList<Seccao> getSeccao();

} // CV
