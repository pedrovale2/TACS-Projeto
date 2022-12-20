/**
 */
package curriculo.impl;

import curriculo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CurriculoFactoryImpl extends EFactoryImpl implements CurriculoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CurriculoFactory init() {
		try {
			CurriculoFactory theCurriculoFactory = (CurriculoFactory) EPackage.Registry.INSTANCE
					.getEFactory(CurriculoPackage.eNS_URI);
			if (theCurriculoFactory != null) {
				return theCurriculoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CurriculoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurriculoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CurriculoPackage.CV:
			return createCV();
		case CurriculoPackage.SECTION:
			return createSection();
		case CurriculoPackage.ATTRIBUTE:
			return createAttribute();
		case CurriculoPackage.TABLE:
			return createTable();
		case CurriculoPackage.INFORMATION:
			return createInformation();
		case CurriculoPackage.HEAD_TABLE:
			return createHeadTable();
		case CurriculoPackage.BODY_TABLE:
			return createBodyTable();
		case CurriculoPackage.ROW:
			return createRow();
		case CurriculoPackage.SUPER_TYPE:
			return createSuperType();
		case CurriculoPackage.DATA_TYPE:
			return createDataType();
		case CurriculoPackage.FLOAT_TYPE:
			return createFloatType();
		case CurriculoPackage.STRING_TYPE:
			return createStringType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CV createCV() {
		CVImpl cv = new CVImpl();
		return cv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadTable createHeadTable() {
		HeadTableImpl headTable = new HeadTableImpl();
		return headTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyTable createBodyTable() {
		BodyTableImpl bodyTable = new BodyTableImpl();
		return bodyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperType createSuperType() {
		SuperTypeImpl superType = new SuperTypeImpl();
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurriculoPackage getCurriculoPackage() {
		return (CurriculoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CurriculoPackage getPackage() {
		return CurriculoPackage.eINSTANCE;
	}

} //CurriculoFactoryImpl
