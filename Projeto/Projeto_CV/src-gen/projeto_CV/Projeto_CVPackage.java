/**
 */
package projeto_CV;

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
 * @see projeto_CV.Projeto_CVFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Projeto_CVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projeto_CV";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projeto_CV";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projeto_CV";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Projeto_CVPackage eINSTANCE = projeto_CV.impl.Projeto_CVPackageImpl.init();

	/**
	 * The meta object id for the '{@link projeto_CV.impl.CVImpl <em>CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.CVImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getCV()
	 * @generated
	 */
	int CV = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__VERSION = 1;

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
	 * The meta object id for the '{@link projeto_CV.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.SectionImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link projeto_CV.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.AttributeImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TITULO = 0;

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
	 * The meta object id for the '{@link projeto_CV.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.InformationImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TITULO = ATTRIBUTE__TITULO;

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
	 * The meta object id for the '{@link projeto_CV.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.TableImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITULO = ATTRIBUTE__TITULO;

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
	 * The meta object id for the '{@link projeto_CV.impl.BodyTableImpl <em>Body Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.BodyTableImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getBodyTable()
	 * @generated
	 */
	int BODY_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TABLE__ROW = 0;

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
	 * The meta object id for the '{@link projeto_CV.impl.SuperTypeImpl <em>Super Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.SuperTypeImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSuperType()
	 * @generated
	 */
	int SUPER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TYPE__SUPERTYPE = 0;

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
	 * The meta object id for the '{@link projeto_CV.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.DataTypeImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUPERTYPE = SUPER_TYPE__SUPERTYPE;

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
	 * The meta object id for the '{@link projeto_CV.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.StringTypeImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__SUPERTYPE = SUPER_TYPE__SUPERTYPE;

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
	 * The meta object id for the '{@link projeto_CV.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.FloatTypeImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__SUPERTYPE = SUPER_TYPE__SUPERTYPE;

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
	 * The meta object id for the '{@link projeto_CV.impl.HeadTabelaImpl <em>Head Tabela</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.HeadTabelaImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getHeadTabela()
	 * @generated
	 */
	int HEAD_TABELA = 9;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA__ROW = 0;

	/**
	 * The number of structural features of the '<em>Head Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Head Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.RowImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 11;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SUPERTYPE = 0;

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
	 * Returns the meta object for class '{@link projeto_CV.CV <em>CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CV</em>'.
	 * @see projeto_CV.CV
	 * @generated
	 */
	EClass getCV();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.CV#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see projeto_CV.CV#getSections()
	 * @see #getCV()
	 * @generated
	 */
	EReference getCV_Sections();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.CV#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see projeto_CV.CV#getVersion()
	 * @see #getCV()
	 * @generated
	 */
	EAttribute getCV_Version();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see projeto_CV.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Section#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see projeto_CV.Section#getSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Sections();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projeto_CV.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Section#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see projeto_CV.Section#getAttributes()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Attributes();

	/**
	 * Returns the meta object for the '{@link projeto_CV.Section#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Diff Name Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diff Name Section</em>' operation.
	 * @see projeto_CV.Section#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSection__DiffNameSection__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see projeto_CV.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.Attribute#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see projeto_CV.Attribute#getTitulo()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Titulo();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see projeto_CV.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Information#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see projeto_CV.Information#getSupertype()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Supertype();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see projeto_CV.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see projeto_CV.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Header();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Table#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see projeto_CV.Table#getBody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Body();

	/**
	 * Returns the meta object for the '{@link projeto_CV.Table#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Same Size Rows</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Size Rows</em>' operation.
	 * @see projeto_CV.Table#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTable__SameSizeRows__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link projeto_CV.BodyTable <em>Body Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Table</em>'.
	 * @see projeto_CV.BodyTable
	 * @generated
	 */
	EClass getBodyTable();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.BodyTable#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see projeto_CV.BodyTable#getRow()
	 * @see #getBodyTable()
	 * @generated
	 */
	EReference getBodyTable_Row();

	/**
	 * Returns the meta object for class '{@link projeto_CV.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see projeto_CV.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.DataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projeto_CV.DataType#getValue()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Value();

	/**
	 * Returns the meta object for class '{@link projeto_CV.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see projeto_CV.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.StringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projeto_CV.StringType#getValue()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Value();

	/**
	 * Returns the meta object for class '{@link projeto_CV.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see projeto_CV.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.FloatType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projeto_CV.FloatType#getValue()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Value();

	/**
	 * Returns the meta object for class '{@link projeto_CV.HeadTabela <em>Head Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head Tabela</em>'.
	 * @see projeto_CV.HeadTabela
	 * @generated
	 */
	EClass getHeadTabela();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.HeadTabela#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Row</em>'.
	 * @see projeto_CV.HeadTabela#getRow()
	 * @see #getHeadTabela()
	 * @generated
	 */
	EReference getHeadTabela_Row();

	/**
	 * Returns the meta object for class '{@link projeto_CV.SuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Type</em>'.
	 * @see projeto_CV.SuperType
	 * @generated
	 */
	EClass getSuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.SuperType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supertype</em>'.
	 * @see projeto_CV.SuperType#getSupertype()
	 * @see #getSuperType()
	 * @generated
	 */
	EReference getSuperType_Supertype();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see projeto_CV.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Row#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supertype</em>'.
	 * @see projeto_CV.Row#getSupertype()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Supertype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Projeto_CVFactory getProjeto_CVFactory();

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
		 * The meta object literal for the '{@link projeto_CV.impl.CVImpl <em>CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.CVImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getCV()
		 * @generated
		 */
		EClass CV = eINSTANCE.getCV();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV__SECTIONS = eINSTANCE.getCV_Sections();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV__VERSION = eINSTANCE.getCV_Version();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.SectionImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SECTIONS = eINSTANCE.getSection_Sections();

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
		 * The meta object literal for the '{@link projeto_CV.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.AttributeImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TITULO = eINSTANCE.getAttribute_Titulo();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.InformationImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getInformation()
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
		 * The meta object literal for the '{@link projeto_CV.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.TableImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getTable()
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
		 * The meta object literal for the '{@link projeto_CV.impl.BodyTableImpl <em>Body Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.BodyTableImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getBodyTable()
		 * @generated
		 */
		EClass BODY_TABLE = eINSTANCE.getBodyTable();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_TABLE__ROW = eINSTANCE.getBodyTable_Row();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.DataTypeImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getDataType()
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
		 * The meta object literal for the '{@link projeto_CV.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.StringTypeImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getStringType()
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

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.FloatTypeImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getFloatType()
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
		 * The meta object literal for the '{@link projeto_CV.impl.HeadTabelaImpl <em>Head Tabela</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.HeadTabelaImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getHeadTabela()
		 * @generated
		 */
		EClass HEAD_TABELA = eINSTANCE.getHeadTabela();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD_TABELA__ROW = eINSTANCE.getHeadTabela_Row();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.SuperTypeImpl <em>Super Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.SuperTypeImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSuperType()
		 * @generated
		 */
		EClass SUPER_TYPE = eINSTANCE.getSuperType();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_TYPE__SUPERTYPE = eINSTANCE.getSuperType_Supertype();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.RowImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SUPERTYPE = eINSTANCE.getRow_Supertype();

	}

} //Projeto_CVPackage
