/**
 */
package projeto_CV;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seccao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Seccao#getSeccao <em>Seccao</em>}</li>
 *   <li>{@link projeto_CV.Seccao#getNome <em>Nome</em>}</li>
 *   <li>{@link projeto_CV.Seccao#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getSeccao()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='diffNameSection'"
 * @generated
 */
public interface Seccao extends EObject {
	/**
	 * Returns the value of the '<em><b>Seccao</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.Seccao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seccao</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getSeccao_Seccao()
	 * @model containment="true"
	 * @generated
	 */
	EList<Seccao> getSeccao();

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see projeto_CV.Projeto_CVPackage#getSeccao_Nome()
	 * @model
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link projeto_CV.Seccao#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Atributo</b></em>' containment reference list.
	 * The list contents are of type {@link projeto_CV.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' containment reference list.
	 * @see projeto_CV.Projeto_CVPackage#getSeccao_Atributo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Seccao.allInstances()-&gt;isUnique(nome)'"
	 * @generated
	 */
	boolean diffNameSection(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Seccao
