/**
 */
package curriculo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see curriculo.CurriculoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface CurriculoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "curriculo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/curriculo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "curriculo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CurriculoPackage eINSTANCE = curriculo.impl.CurriculoPackageImpl.init();

	/**
	 * The meta object id for the '{@link curriculo.impl.CVImpl <em>CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.CVImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getCV()
	 * @generated
	 */
	int CV = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__SECTIONS = 1;

	/**
	 * The number of structural features of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.SectionImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Diff Name Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___DIFF_NAME_SECTION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link curriculo.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.AttributeImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.TableImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODY = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Same Size Rows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link curriculo.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.InformationImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__SUPERTYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.HeadTableImpl <em>Head Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.HeadTableImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getHeadTable()
	 * @generated
	 */
	int HEAD_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Headrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABLE__HEADROW = 0;

	/**
	 * The number of structural features of the '<em>Head Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Head Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.BodyTableImpl <em>Body Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.BodyTableImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getBodyTable()
	 * @generated
	 */
	int BODY_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Bodyrow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TABLE__BODYROW = 0;

	/**
	 * The number of structural features of the '<em>Body Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Body Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.RowImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 7;

	/**
	 * The feature id for the '<em><b>Rowvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ROWVALUES = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.SuperTypeImpl <em>Super Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.SuperTypeImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getSuperType()
	 * @generated
	 */
	int SUPER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Subvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE__SUBVALUES = 0;

	/**
	 * The number of structural features of the '<em>Super Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Super Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.DataTypeImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Subvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUBVALUES = SUPER_TYPE__SUBVALUES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VALUE = SUPER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = SUPER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = SUPER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.FloatTypeImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Subvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__SUBVALUES = SUPER_TYPE__SUBVALUES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__VALUE = SUPER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = SUPER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = SUPER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link curriculo.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see curriculo.impl.StringTypeImpl
	 * @see curriculo.impl.CurriculoPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Subvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__SUBVALUES = SUPER_TYPE__SUBVALUES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__VALUE = SUPER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = SUPER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = SUPER_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link curriculo.CV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV</em>'.
	 * @see curriculo.CV
	 * @generated
	 */
	EClass getCV();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.CV#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see curriculo.CV#getVersion()
	 * @see #getCV()
	 * @generated
	 */
	EAttribute getCV_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculo.CV#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see curriculo.CV#getSections()
	 * @see #getCV()
	 * @generated
	 */
	EReference getCV_Sections();

	/**
	 * Returns the meta object for class '{@link curriculo.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see curriculo.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see curriculo.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculo.Section#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see curriculo.Section#getAttributes()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Attributes();

	/**
	 * Returns the meta object for the '{@link curriculo.Section#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Diff Name Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diff Name Section</em>' operation.
	 * @see curriculo.Section#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSection__DiffNameSection__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link curriculo.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see curriculo.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.Attribute#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see curriculo.Attribute#getTitle()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Title();

	/**
	 * Returns the meta object for class '{@link curriculo.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see curriculo.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link curriculo.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see curriculo.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Header();

	/**
	 * Returns the meta object for the containment reference '{@link curriculo.Table#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see curriculo.Table#getBody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Body();

	/**
	 * Returns the meta object for the '{@link curriculo.Table#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Same Size Rows</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Size Rows</em>' operation.
	 * @see curriculo.Table#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTable__SameSizeRows__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link curriculo.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see curriculo.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the containment reference '{@link curriculo.Information#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see curriculo.Information#getSupertype()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Supertype();

	/**
	 * Returns the meta object for class '{@link curriculo.HeadTable <em>Head Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Table</em>'.
	 * @see curriculo.HeadTable
	 * @generated
	 */
	EClass getHeadTable();

	/**
	 * Returns the meta object for the containment reference '{@link curriculo.HeadTable#getHeadrow <em>Headrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Headrow</em>'.
	 * @see curriculo.HeadTable#getHeadrow()
	 * @see #getHeadTable()
	 * @generated
	 */
	EReference getHeadTable_Headrow();

	/**
	 * Returns the meta object for class '{@link curriculo.BodyTable <em>Body Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Table</em>'.
	 * @see curriculo.BodyTable
	 * @generated
	 */
	EClass getBodyTable();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculo.BodyTable#getBodyrow <em>Bodyrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodyrow</em>'.
	 * @see curriculo.BodyTable#getBodyrow()
	 * @see #getBodyTable()
	 * @generated
	 */
	EReference getBodyTable_Bodyrow();

	/**
	 * Returns the meta object for class '{@link curriculo.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see curriculo.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculo.Row#getRowvalues <em>Rowvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rowvalues</em>'.
	 * @see curriculo.Row#getRowvalues()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Rowvalues();

	/**
	 * Returns the meta object for class '{@link curriculo.SuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Type</em>'.
	 * @see curriculo.SuperType
	 * @generated
	 */
	EClass getSuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link curriculo.SuperType#getSubvalues <em>Subvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvalues</em>'.
	 * @see curriculo.SuperType#getSubvalues()
	 * @see #getSuperType()
	 * @generated
	 */
	EReference getSuperType_Subvalues();

	/**
	 * Returns the meta object for class '{@link curriculo.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see curriculo.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.DataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see curriculo.DataType#getValue()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Value();

	/**
	 * Returns the meta object for class '{@link curriculo.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see curriculo.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.FloatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see curriculo.FloatType#getValue()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Value();

	/**
	 * Returns the meta object for class '{@link curriculo.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see curriculo.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link curriculo.StringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see curriculo.StringType#getValue()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CurriculoFactory getCurriculoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link curriculo.impl.CVImpl <em>CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.CVImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getCV()
		 * @generated
		 */
		EClass CV = eINSTANCE.getCV();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV__VERSION = eINSTANCE.getCV_Version();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV__SECTIONS = eINSTANCE.getCV_Sections();

		/**
		 * The meta object literal for the '{@link curriculo.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.SectionImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__ATTRIBUTES = eINSTANCE.getSection_Attributes();

		/**
		 * The meta object literal for the '<em><b>Diff Name Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___DIFF_NAME_SECTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSection__DiffNameSection__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link curriculo.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.AttributeImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TITLE = eINSTANCE.getAttribute_Title();

		/**
		 * The meta object literal for the '{@link curriculo.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.TableImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEADER = eINSTANCE.getTable_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BODY = eINSTANCE.getTable_Body();

		/**
		 * The meta object literal for the '<em><b>Same Size Rows</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTable__SameSizeRows__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link curriculo.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.InformationImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__SUPERTYPE = eINSTANCE.getInformation_Supertype();

		/**
		 * The meta object literal for the '{@link curriculo.impl.HeadTableImpl <em>Head Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.HeadTableImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getHeadTable()
		 * @generated
		 */
		EClass HEAD_TABLE = eINSTANCE.getHeadTable();

		/**
		 * The meta object literal for the '<em><b>Headrow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD_TABLE__HEADROW = eINSTANCE.getHeadTable_Headrow();

		/**
		 * The meta object literal for the '{@link curriculo.impl.BodyTableImpl <em>Body Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.BodyTableImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getBodyTable()
		 * @generated
		 */
		EClass BODY_TABLE = eINSTANCE.getBodyTable();

		/**
		 * The meta object literal for the '<em><b>Bodyrow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_TABLE__BODYROW = eINSTANCE.getBodyTable_Bodyrow();

		/**
		 * The meta object literal for the '{@link curriculo.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.RowImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Rowvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__ROWVALUES = eINSTANCE.getRow_Rowvalues();

		/**
		 * The meta object literal for the '{@link curriculo.impl.SuperTypeImpl <em>Super Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.SuperTypeImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getSuperType()
		 * @generated
		 */
		EClass SUPER_TYPE = eINSTANCE.getSuperType();

		/**
		 * The meta object literal for the '<em><b>Subvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_TYPE__SUBVALUES = eINSTANCE.getSuperType_Subvalues();

		/**
		 * The meta object literal for the '{@link curriculo.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.DataTypeImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__VALUE = eINSTANCE.getDataType_Value();

		/**
		 * The meta object literal for the '{@link curriculo.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.FloatTypeImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__VALUE = eINSTANCE.getFloatType_Value();

		/**
		 * The meta object literal for the '{@link curriculo.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see curriculo.impl.StringTypeImpl
		 * @see curriculo.impl.CurriculoPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__VALUE = eINSTANCE.getStringType_Value();

	}

} //CurriculoPackage
