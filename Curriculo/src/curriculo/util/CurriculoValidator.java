/**
 */
package curriculo.util;

import curriculo.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see curriculo.CurriculoPackage
 * @generated
 */
public class CurriculoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CurriculoValidator INSTANCE = new CurriculoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "curriculo";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Diff Name Section' of 'Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECTION__DIFF_NAME_SECTION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Size Rows' of 'Table'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLE__SAME_SIZE_ROWS = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

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
	public CurriculoValidator() {
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
		return CurriculoPackage.eINSTANCE;
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
		case CurriculoPackage.CV:
			return validateCV((CV) value, diagnostics, context);
		case CurriculoPackage.SECTION:
			return validateSection((Section) value, diagnostics, context);
		case CurriculoPackage.ATTRIBUTE:
			return validateAttribute((Attribute) value, diagnostics, context);
		case CurriculoPackage.TABLE:
			return validateTable((Table) value, diagnostics, context);
		case CurriculoPackage.INFORMATION:
			return validateInformation((Information) value, diagnostics, context);
		case CurriculoPackage.HEAD_TABLE:
			return validateHeadTable((HeadTable) value, diagnostics, context);
		case CurriculoPackage.BODY_TABLE:
			return validateBodyTable((BodyTable) value, diagnostics, context);
		case CurriculoPackage.ROW:
			return validateRow((Row) value, diagnostics, context);
		case CurriculoPackage.SUPER_TYPE:
			return validateSuperType((SuperType) value, diagnostics, context);
		case CurriculoPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case CurriculoPackage.FLOAT_TYPE:
			return validateFloatType((FloatType) value, diagnostics, context);
		case CurriculoPackage.STRING_TYPE:
			return validateStringType((StringType) value, diagnostics, context);
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
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSection_diffNameSection(section, diagnostics, context);
		return result;
	}

	/**
	 * Validates the diffNameSection constraint of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection_diffNameSection(Section section, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return section.diffNameSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_sameSizeRows(table, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameSizeRows constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_sameSizeRows(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return table.sameSizeRows(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformation(Information information, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(information, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadTable(HeadTable headTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyTable(BodyTable bodyTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyTable, diagnostics, context);
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
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
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
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
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

} //CurriculoValidator
