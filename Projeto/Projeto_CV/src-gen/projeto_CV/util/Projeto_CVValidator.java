/**
 */
package projeto_CV.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import projeto_CV.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see projeto_CV.Projeto_CVPackage
 * @generated
 */
public class Projeto_CVValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Projeto_CVValidator INSTANCE = new Projeto_CVValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "projeto_CV";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Diff Name Section' of 'Seccao'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECCAO__DIFF_NAME_SECTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Size Rows' of 'Tabela'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABELA__SAME_SIZE_ROWS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Titulo Not Null' of 'Tabela'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABELA__TITULO_NOT_NULL = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projeto_CVValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Projeto_CVPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Projeto_CVPackage.CV:
			return validateCV((CV) value, diagnostics, context);
		case Projeto_CVPackage.SECCAO:
			return validateSeccao((Seccao) value, diagnostics, context);
		case Projeto_CVPackage.ATRIBUTO:
			return validateAtributo((Atributo) value, diagnostics, context);
		case Projeto_CVPackage.INFORMACAO:
			return validateInformacao((Informacao) value, diagnostics, context);
		case Projeto_CVPackage.TABELA:
			return validateTabela((Tabela) value, diagnostics, context);
		case Projeto_CVPackage.BODY:
			return validateBody((Body) value, diagnostics, context);
		case Projeto_CVPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case Projeto_CVPackage.STRING_TYPE:
			return validateStringType((StringType) value, diagnostics, context);
		case Projeto_CVPackage.FLOAT_TYPE:
			return validateFloatType((FloatType) value, diagnostics, context);
		case Projeto_CVPackage.HEAD_TABELA:
			return validateHeadTabela((HeadTabela) value, diagnostics, context);
		case Projeto_CVPackage.SUPER_TYPE:
			return validateSuperType((SuperType) value, diagnostics, context);
		case Projeto_CVPackage.ROW:
			return validateRow((Row) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cv, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeccao(Seccao seccao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(seccao, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(seccao, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSeccao_diffNameSection(seccao, diagnostics, context);
		return result;
	}

	/**
	 * Validates the diffNameSection constraint of '<em>Seccao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeccao_diffNameSection(Seccao seccao, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return seccao.diffNameSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atributo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformacao(Informacao informacao, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informacao, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabela(Tabela tabela, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tabela, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTabela_tituloNotNull(tabela, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTabela_sameSizeRows(tabela, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tituloNotNull constraint of '<em>Tabela</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabela_tituloNotNull(Tabela tabela, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return tabela.tituloNotNull(diagnostics, context);
	}

	/**
	 * Validates the sameSizeRows constraint of '<em>Tabela</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabela_sameSizeRows(Tabela tabela, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return tabela.sameSizeRows(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(Body body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(body, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatType(FloatType floatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadTabela(HeadTabela headTabela, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headTabela, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperType(SuperType superType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(row, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Projeto_CVValidator
