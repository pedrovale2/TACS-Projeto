/**
 */
package projeto_CV;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projeto_CV.Information#getSupertype <em>Supertype</em>}</li>
 * </ul>
 *
 * @see projeto_CV.Projeto_CVPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends Attribute {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference.
	 * @see #setSupertype(SuperType)
	 * @see projeto_CV.Projeto_CVPackage#getInformation_Supertype()
	 * @model containment="true"
	 * @generated
	 */
	SuperType getSupertype();

	/**
	 * Sets the value of the '{@link projeto_CV.Information#getSupertype <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' containment reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(SuperType value);

} // Information
