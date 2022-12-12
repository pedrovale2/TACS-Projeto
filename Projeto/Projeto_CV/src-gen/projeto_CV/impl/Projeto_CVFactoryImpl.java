/**
 */
package projeto_CV.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projeto_CV.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Projeto_CVFactoryImpl extends EFactoryImpl implements Projeto_CVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Projeto_CVFactory init() {
		try {
			Projeto_CVFactory theProjeto_CVFactory = (Projeto_CVFactory) EPackage.Registry.INSTANCE
					.getEFactory(Projeto_CVPackage.eNS_URI);
			if (theProjeto_CVFactory != null) {
				return theProjeto_CVFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Projeto_CVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projeto_CVFactoryImpl() {
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
		case Projeto_CVPackage.CV:
			return createCV();
		case Projeto_CVPackage.SECTION:
			return createSection();
		case Projeto_CVPackage.ATTRIBUTE:
			return createAttribute();
		case Projeto_CVPackage.INFORMATION:
			return createInformation();
		case Projeto_CVPackage.TABLE:
			return createTable();
		case Projeto_CVPackage.BODY_TABLE:
			return createBodyTable();
		case Projeto_CVPackage.DATA_TYPE:
			return createDataType();
		case Projeto_CVPackage.STRING_TYPE:
			return createStringType();
		case Projeto_CVPackage.FLOAT_TYPE:
			return createFloatType();
		case Projeto_CVPackage.HEAD_TABELA:
			return createHeadTabela();
		case Projeto_CVPackage.SUPER_TYPE:
			return createSuperType();
		case Projeto_CVPackage.ROW:
			return createRow();
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
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
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
	public BodyTable createBodyTable() {
		BodyTableImpl bodyTable = new BodyTableImpl();
		return bodyTable;
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
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
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
	public HeadTabela createHeadTabela() {
		HeadTabelaImpl headTabela = new HeadTabelaImpl();
		return headTabela;
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
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projeto_CVPackage getProjeto_CVPackage() {
		return (Projeto_CVPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Projeto_CVPackage getPackage() {
		return Projeto_CVPackage.eINSTANCE;
	}

} //Projeto_CVFactoryImpl
