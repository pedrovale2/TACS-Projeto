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
 *   <li>{@link projeto_CV.CV#getSections <em>Sections</em>}</li>
 *   <li>{@link projeto_CV.CV#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getCV()
 * @model
 * @generated
 */
public interface CV extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getCV_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(float)
	 * @see projeto_CV.Projeto_CVPackage#getCV_Version()
	 * @model required="true"
	 * @generated
	 */
	float getVersion();

	/**
	 * Sets the value of the '{@link projeto_CV.CV#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(float value);

} // CV
