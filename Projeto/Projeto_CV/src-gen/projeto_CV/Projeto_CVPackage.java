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
	 * The feature id for the '<em><b>Seccao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV__SECCAO = 0;

	/**
	 * The number of structural features of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.SeccaoImpl <em>Seccao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.SeccaoImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSeccao()
	 * @generated
	 */
	int SECCAO = 1;

	/**
	 * The feature id for the '<em><b>Seccao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO__SECCAO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO__ATRIBUTO = 2;

	/**
	 * The number of structural features of the '<em>Seccao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Diff Name Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO___DIFF_NAME_SECTION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Seccao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECCAO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.AtributoImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.InformacaoImpl <em>Informacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.InformacaoImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getInformacao()
	 * @generated
	 */
	int INFORMACAO = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMACAO__TITULO = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMACAO__SUPERTYPE = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Informacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMACAO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Informacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMACAO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.TabelaImpl <em>Tabela</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.TabelaImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getTabela()
	 * @generated
	 */
	int TABELA = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__TITULO = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__HEADER = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA__BODY = ATRIBUTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Same Size Rows</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Titulo Not Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA___TITULO_NOT_NULL__DIAGNOSTICCHAIN_MAP = ATRIBUTO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABELA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link projeto_CV.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projeto_CV.impl.BodyImpl
	 * @see projeto_CV.impl.Projeto_CVPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ROW = 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATE = SUPER_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__STR = SUPER_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Flt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__FLT = SUPER_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA__ROW = 1;

	/**
	 * The number of structural features of the '<em>Head Tabela</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_TABELA_FEATURE_COUNT = 2;

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
	 * Returns the meta object for the containment reference list '{@link projeto_CV.CV#getSeccao <em>Seccao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seccao</em>'.
	 * @see projeto_CV.CV#getSeccao()
	 * @see #getCV()
	 * @generated
	 */
	EReference getCV_Seccao();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Seccao <em>Seccao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seccao</em>'.
	 * @see projeto_CV.Seccao
	 * @generated
	 */
	EClass getSeccao();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Seccao#getSeccao <em>Seccao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seccao</em>'.
	 * @see projeto_CV.Seccao#getSeccao()
	 * @see #getSeccao()
	 * @generated
	 */
	EReference getSeccao_Seccao();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.Seccao#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see projeto_CV.Seccao#getNome()
	 * @see #getSeccao()
	 * @generated
	 */
	EAttribute getSeccao_Nome();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Seccao#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributo</em>'.
	 * @see projeto_CV.Seccao#getAtributo()
	 * @see #getSeccao()
	 * @generated
	 */
	EReference getSeccao_Atributo();

	/**
	 * Returns the meta object for the '{@link projeto_CV.Seccao#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Diff Name Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diff Name Section</em>' operation.
	 * @see projeto_CV.Seccao#diffNameSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSeccao__DiffNameSection__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see projeto_CV.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Informacao <em>Informacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informacao</em>'.
	 * @see projeto_CV.Informacao
	 * @generated
	 */
	EClass getInformacao();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.Informacao#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see projeto_CV.Informacao#getTitulo()
	 * @see #getInformacao()
	 * @generated
	 */
	EAttribute getInformacao_Titulo();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Informacao#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see projeto_CV.Informacao#getSupertype()
	 * @see #getInformacao()
	 * @generated
	 */
	EReference getInformacao_Supertype();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Tabela <em>Tabela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabela</em>'.
	 * @see projeto_CV.Tabela
	 * @generated
	 */
	EClass getTabela();

	/**
	 * Returns the meta object for the attribute '{@link projeto_CV.Tabela#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see projeto_CV.Tabela#getTitulo()
	 * @see #getTabela()
	 * @generated
	 */
	EAttribute getTabela_Titulo();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Tabela#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see projeto_CV.Tabela#getHeader()
	 * @see #getTabela()
	 * @generated
	 */
	EReference getTabela_Header();

	/**
	 * Returns the meta object for the containment reference '{@link projeto_CV.Tabela#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see projeto_CV.Tabela#getBody()
	 * @see #getTabela()
	 * @generated
	 */
	EReference getTabela_Body();

	/**
	 * Returns the meta object for the '{@link projeto_CV.Tabela#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Same Size Rows</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Size Rows</em>' operation.
	 * @see projeto_CV.Tabela#sameSizeRows(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTabela__SameSizeRows__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link projeto_CV.Tabela#tituloNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Titulo Not Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Titulo Not Null</em>' operation.
	 * @see projeto_CV.Tabela#tituloNotNull(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTabela__TituloNotNull__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link projeto_CV.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see projeto_CV.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link projeto_CV.Body#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see projeto_CV.Body#getRow()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Row();

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
	 * Returns the meta object for the attribute '{@link projeto_CV.DataType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see projeto_CV.DataType#getDate()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Date();

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
	 * Returns the meta object for the attribute '{@link projeto_CV.StringType#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see projeto_CV.StringType#getStr()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Str();

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
	 * Returns the meta object for the attribute '{@link projeto_CV.FloatType#getFlt <em>Flt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flt</em>'.
	 * @see projeto_CV.FloatType#getFlt()
	 * @see #getFloatType()
	 * @generated
	 */
	EAttribute getFloatType_Flt();

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
	 * Returns the meta object for the attribute '{@link projeto_CV.HeadTabela#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see projeto_CV.HeadTabela#getNome()
	 * @see #getHeadTabela()
	 * @generated
	 */
	EAttribute getHeadTabela_Nome();

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
		 * The meta object literal for the '<em><b>Seccao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CV__SECCAO = eINSTANCE.getCV_Seccao();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.SeccaoImpl <em>Seccao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.SeccaoImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getSeccao()
		 * @generated
		 */
		EClass SECCAO = eINSTANCE.getSeccao();

		/**
		 * The meta object literal for the '<em><b>Seccao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECCAO__SECCAO = eINSTANCE.getSeccao_Seccao();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECCAO__NOME = eINSTANCE.getSeccao_Nome();

		/**
		 * The meta object literal for the '<em><b>Atributo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECCAO__ATRIBUTO = eINSTANCE.getSeccao_Atributo();

		/**
		 * The meta object literal for the '<em><b>Diff Name Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECCAO___DIFF_NAME_SECTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSeccao__DiffNameSection__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.AtributoImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.InformacaoImpl <em>Informacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.InformacaoImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getInformacao()
		 * @generated
		 */
		EClass INFORMACAO = eINSTANCE.getInformacao();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMACAO__TITULO = eINSTANCE.getInformacao_Titulo();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMACAO__SUPERTYPE = eINSTANCE.getInformacao_Supertype();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.TabelaImpl <em>Tabela</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.TabelaImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getTabela()
		 * @generated
		 */
		EClass TABELA = eINSTANCE.getTabela();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABELA__TITULO = eINSTANCE.getTabela_Titulo();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABELA__HEADER = eINSTANCE.getTabela_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABELA__BODY = eINSTANCE.getTabela_Body();

		/**
		 * The meta object literal for the '<em><b>Same Size Rows</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABELA___SAME_SIZE_ROWS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTabela__SameSizeRows__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Titulo Not Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABELA___TITULO_NOT_NULL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTabela__TituloNotNull__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link projeto_CV.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projeto_CV.impl.BodyImpl
		 * @see projeto_CV.impl.Projeto_CVPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__ROW = eINSTANCE.getBody_Row();

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
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DATE = eINSTANCE.getDataType_Date();

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
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__STR = eINSTANCE.getStringType_Str();

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
		 * The meta object literal for the '<em><b>Flt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_TYPE__FLT = eINSTANCE.getFloatType_Flt();

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
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_TABELA__NOME = eINSTANCE.getHeadTabela_Nome();

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
