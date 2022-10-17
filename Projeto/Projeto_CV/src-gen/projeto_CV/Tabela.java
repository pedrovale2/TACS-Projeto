/**
 */
package projeto_CV;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabela</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Tabela#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link projeto_CV.Tabela#getHeader <em>Header</em>}</li>
 *   <li>{@link projeto_CV.Tabela#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getTabela()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tituloNotNull'"
 * @generated
 */
public interface Tabela extends Atributo {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see projeto_CV.Projeto_CVPackage#getTabela_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link projeto_CV.Tabela#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeadTabela)
	 * @see projeto_CV.Projeto_CVPackage#getTabela_Header()
	 * @model containment="true"
	 * @generated
	 */
	HeadTabela getHeader();

	/**
	 * Sets the value of the '{@link projeto_CV.Tabela#getHeader <em>Header</em>}' containment reference.
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
	 * @see #setBody(Body)
	 * @see projeto_CV.Projeto_CVPackage#getTabela_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link projeto_CV.Tabela#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.body.row-&gt;forAll(r | r.supertype-&gt;size() = self.header.row.supertype-&gt;size())'"
	 * @generated
	 */
	boolean sameSizeRows(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.titulo-&gt;notEmpty()'"
	 * @generated
	 */
	boolean tituloNotNull(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tabela
