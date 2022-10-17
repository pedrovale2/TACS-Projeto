/**
 */
package projeto_CV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Informacao#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link projeto_CV.Informacao#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getInformacao()
 * @model
 * @generated
 */
public interface Informacao extends Atributo {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see projeto_CV.Projeto_CVPackage#getInformacao_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link projeto_CV.Informacao#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference.
	 * @see #setSupertype(SuperType)
	 * @see projeto_CV.Projeto_CVPackage#getInformacao_Supertype()
	 * @model containment="true"
	 * @generated
	 */
	SuperType getSupertype();

	/**
	 * Sets the value of the '{@link projeto_CV.Informacao#getSupertype <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' containment reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(SuperType value);

} // Informacao
