/**
 */
package projeto_CV;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link projeto_CV.Table#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameSizeRows'"
 * @generated
 */
public interface Table extends Attribute {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeadTabela)
	 * @see projeto_CV.Projeto_CVPackage#getTable_Header()
	 * @model containment="true"
	 * @generated
	 */
	HeadTabela getHeader();

	/**
	 * Sets the value of the '{@link projeto_CV.Table#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeadTabela value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyTable)
	 * @see projeto_CV.Projeto_CVPackage#getTable_Body()
	 * @model containment="true"
	 * @generated
	 */
	BodyTable getBody();

	/**
	 * Sets the value of the '{@link projeto_CV.Table#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyTable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.body.row-&gt;forAll(r | r.supertype-&gt;size() = self.header.row.supertype-&gt;size())'"
	 * @generated
	 */
	boolean sameSizeRows(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
