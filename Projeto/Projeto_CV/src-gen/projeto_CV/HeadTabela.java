/**
 */
package projeto_CV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head Tabela</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.HeadTabela#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getHeadTabela()
 * @model
 * @generated
 */
public interface HeadTabela extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference.
	 * @see #setRow(Row)
	 * @see projeto_CV.Projeto_CVPackage#getHeadTabela_Row()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Row getRow();

	/**
	 * Sets the value of the '{@link projeto_CV.HeadTabela#getRow <em>Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' containment reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(Row value);

} // HeadTabela
