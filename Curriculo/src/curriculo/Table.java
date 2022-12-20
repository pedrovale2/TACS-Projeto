/**
 */
package curriculo;

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
 *   <li>{@link curriculo.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link curriculo.Table#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see curriculo.CurriculoPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameSizeRows'"
 * @generated
 */
public interface Table extends Attribute {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeadTable)
	 * @see curriculo.CurriculoPackage#getTable_Header()
	 * @model containment="true"
	 * @generated
	 */
	HeadTable getHeader();

	/**
	 * Sets the value of the '{@link curriculo.Table#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeadTable value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyTable)
	 * @see curriculo.CurriculoPackage#getTable_Body()
	 * @model containment="true"
	 * @generated
	 */
	BodyTable getBody();

	/**
	 * Sets the value of the '{@link curriculo.Table#getBody <em>Body</em>}' containment reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.body.bodyrow-&gt;forAll(r | r.rowvalues-&gt;size() = self.header.headrow.rowvalues-&gt;size())'"
	 * @generated
	 */
	boolean sameSizeRows(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Table
