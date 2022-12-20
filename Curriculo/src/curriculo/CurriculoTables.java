/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Curriculo/model/curriculo.ecore
 * using:
 *   /Curriculo/model/curriculo.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package curriculo;

// import curriculo.CurriculoPackage;
// import curriculo.CurriculoTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CurriculoTables provides the dispatch tables for the curriculo for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CurriculoTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CurriculoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_curriculo = IdManager.getNsURIPackageId("http://www.example.org/curriculo", null, CurriculoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_BodyTable = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("BodyTable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CV = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("CV", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = CurriculoTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_HeadTable = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("HeadTable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Information = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("Information", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Row = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("Row", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Section = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("Section", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SuperType = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("SuperType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = CurriculoTables.PACKid_http_c_s_s_www_example_org_s_curriculo.getClassId("Table", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = CurriculoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = CurriculoTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(CurriculoTables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Row = TypeId.ORDERED_SET.getSpecializedId(CurriculoTables.CLSSid_Row);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Section = TypeId.ORDERED_SET.getSpecializedId(CurriculoTables.CLSSid_Section);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SuperType = TypeId.ORDERED_SET.getSpecializedId(CurriculoTables.CLSSid_SuperType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Section = TypeId.SET.getSpecializedId(CurriculoTables.CLSSid_Section);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CurriculoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(CurriculoPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _BodyTable = new EcoreExecutorType(CurriculoPackage.Literals.BODY_TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _CV = new EcoreExecutorType(CurriculoPackage.Literals.CV, PACKAGE, 0);
		public static final EcoreExecutorType _DataType = new EcoreExecutorType(CurriculoPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _FloatType = new EcoreExecutorType(CurriculoPackage.Literals.FLOAT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _HeadTable = new EcoreExecutorType(CurriculoPackage.Literals.HEAD_TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Information = new EcoreExecutorType(CurriculoPackage.Literals.INFORMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Row = new EcoreExecutorType(CurriculoPackage.Literals.ROW, PACKAGE, 0);
		public static final EcoreExecutorType _Section = new EcoreExecutorType(CurriculoPackage.Literals.SECTION, PACKAGE, 0);
		public static final EcoreExecutorType _StringType = new EcoreExecutorType(CurriculoPackage.Literals.STRING_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _SuperType = new EcoreExecutorType(CurriculoPackage.Literals.SUPER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(CurriculoPackage.Literals.TABLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_BodyTable,
			_CV,
			_DataType,
			_FloatType,
			_HeadTable,
			_Information,
			_Row,
			_Section,
			_StringType,
			_SuperType,
			_Table
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, CurriculoTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BodyTable__BodyTable = new ExecutorFragment(Types._BodyTable, CurriculoTables.Types._BodyTable);
		private static final ExecutorFragment _BodyTable__OclAny = new ExecutorFragment(Types._BodyTable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BodyTable__OclElement = new ExecutorFragment(Types._BodyTable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CV__CV = new ExecutorFragment(Types._CV, CurriculoTables.Types._CV);
		private static final ExecutorFragment _CV__OclAny = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CV__OclElement = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, CurriculoTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__SuperType = new ExecutorFragment(Types._DataType, CurriculoTables.Types._SuperType);

		private static final ExecutorFragment _FloatType__FloatType = new ExecutorFragment(Types._FloatType, CurriculoTables.Types._FloatType);
		private static final ExecutorFragment _FloatType__OclAny = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FloatType__OclElement = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FloatType__SuperType = new ExecutorFragment(Types._FloatType, CurriculoTables.Types._SuperType);

		private static final ExecutorFragment _HeadTable__HeadTable = new ExecutorFragment(Types._HeadTable, CurriculoTables.Types._HeadTable);
		private static final ExecutorFragment _HeadTable__OclAny = new ExecutorFragment(Types._HeadTable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HeadTable__OclElement = new ExecutorFragment(Types._HeadTable, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Information__Attribute = new ExecutorFragment(Types._Information, CurriculoTables.Types._Attribute);
		private static final ExecutorFragment _Information__Information = new ExecutorFragment(Types._Information, CurriculoTables.Types._Information);
		private static final ExecutorFragment _Information__OclAny = new ExecutorFragment(Types._Information, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Information__OclElement = new ExecutorFragment(Types._Information, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Row__OclAny = new ExecutorFragment(Types._Row, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Row__OclElement = new ExecutorFragment(Types._Row, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Row__Row = new ExecutorFragment(Types._Row, CurriculoTables.Types._Row);

		private static final ExecutorFragment _Section__OclAny = new ExecutorFragment(Types._Section, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Section__OclElement = new ExecutorFragment(Types._Section, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Section__Section = new ExecutorFragment(Types._Section, CurriculoTables.Types._Section);

		private static final ExecutorFragment _StringType__OclAny = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringType__OclElement = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringType__StringType = new ExecutorFragment(Types._StringType, CurriculoTables.Types._StringType);
		private static final ExecutorFragment _StringType__SuperType = new ExecutorFragment(Types._StringType, CurriculoTables.Types._SuperType);

		private static final ExecutorFragment _SuperType__OclAny = new ExecutorFragment(Types._SuperType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SuperType__OclElement = new ExecutorFragment(Types._SuperType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SuperType__SuperType = new ExecutorFragment(Types._SuperType, CurriculoTables.Types._SuperType);

		private static final ExecutorFragment _Table__Attribute = new ExecutorFragment(Types._Table, CurriculoTables.Types._Attribute);
		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, CurriculoTables.Types._Table);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Attribute__title = new EcoreExecutorProperty(CurriculoPackage.Literals.ATTRIBUTE__TITLE, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__Section__attributes = new ExecutorPropertyWithImplementation("Section", Types._Attribute, 1, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.SECTION__ATTRIBUTES));

		public static final ExecutorProperty _BodyTable__bodyrow = new EcoreExecutorProperty(CurriculoPackage.Literals.BODY_TABLE__BODYROW, Types._BodyTable, 0);
		public static final ExecutorProperty _BodyTable__Table__body = new ExecutorPropertyWithImplementation("Table", Types._BodyTable, 1, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.TABLE__BODY));

		public static final ExecutorProperty _CV__sections = new EcoreExecutorProperty(CurriculoPackage.Literals.CV__SECTIONS, Types._CV, 0);
		public static final ExecutorProperty _CV__version = new EcoreExecutorProperty(CurriculoPackage.Literals.CV__VERSION, Types._CV, 1);

		public static final ExecutorProperty _DataType__value = new EcoreExecutorProperty(CurriculoPackage.Literals.DATA_TYPE__VALUE, Types._DataType, 0);

		public static final ExecutorProperty _FloatType__value = new EcoreExecutorProperty(CurriculoPackage.Literals.FLOAT_TYPE__VALUE, Types._FloatType, 0);

		public static final ExecutorProperty _HeadTable__headrow = new EcoreExecutorProperty(CurriculoPackage.Literals.HEAD_TABLE__HEADROW, Types._HeadTable, 0);
		public static final ExecutorProperty _HeadTable__Table__header = new ExecutorPropertyWithImplementation("Table", Types._HeadTable, 1, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.TABLE__HEADER));

		public static final ExecutorProperty _Information__supertype = new EcoreExecutorProperty(CurriculoPackage.Literals.INFORMATION__SUPERTYPE, Types._Information, 0);

		public static final ExecutorProperty _Row__rowvalues = new EcoreExecutorProperty(CurriculoPackage.Literals.ROW__ROWVALUES, Types._Row, 0);
		public static final ExecutorProperty _Row__BodyTable__bodyrow = new ExecutorPropertyWithImplementation("BodyTable", Types._Row, 1, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.BODY_TABLE__BODYROW));
		public static final ExecutorProperty _Row__HeadTable__headrow = new ExecutorPropertyWithImplementation("HeadTable", Types._Row, 2, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.HEAD_TABLE__HEADROW));

		public static final ExecutorProperty _Section__attributes = new EcoreExecutorProperty(CurriculoPackage.Literals.SECTION__ATTRIBUTES, Types._Section, 0);
		public static final ExecutorProperty _Section__name = new EcoreExecutorProperty(CurriculoPackage.Literals.SECTION__NAME, Types._Section, 1);
		public static final ExecutorProperty _Section__subsections = new EcoreExecutorProperty(CurriculoPackage.Literals.SECTION__SUBSECTIONS, Types._Section, 2);
		public static final ExecutorProperty _Section__CV__sections = new ExecutorPropertyWithImplementation("CV", Types._Section, 3, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.CV__SECTIONS));
		public static final ExecutorProperty _Section__Section__subsections = new ExecutorPropertyWithImplementation("Section", Types._Section, 4, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.SECTION__SUBSECTIONS));

		public static final ExecutorProperty _StringType__value = new EcoreExecutorProperty(CurriculoPackage.Literals.STRING_TYPE__VALUE, Types._StringType, 0);

		public static final ExecutorProperty _SuperType__subvalues = new EcoreExecutorProperty(CurriculoPackage.Literals.SUPER_TYPE__SUBVALUES, Types._SuperType, 0);
		public static final ExecutorProperty _SuperType__Information__supertype = new ExecutorPropertyWithImplementation("Information", Types._SuperType, 1, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.INFORMATION__SUPERTYPE));
		public static final ExecutorProperty _SuperType__Row__rowvalues = new ExecutorPropertyWithImplementation("Row", Types._SuperType, 2, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.ROW__ROWVALUES));
		public static final ExecutorProperty _SuperType__SuperType__subvalues = new ExecutorPropertyWithImplementation("SuperType", Types._SuperType, 3, new EcoreLibraryOppositeProperty(CurriculoPackage.Literals.SUPER_TYPE__SUBVALUES));

		public static final ExecutorProperty _Table__body = new EcoreExecutorProperty(CurriculoPackage.Literals.TABLE__BODY, Types._Table, 0);
		public static final ExecutorProperty _Table__header = new EcoreExecutorProperty(CurriculoPackage.Literals.TABLE__HEADER, Types._Table, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__Attribute /* 2 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BodyTable =
			{
				Fragments._BodyTable__OclAny /* 0 */,
				Fragments._BodyTable__OclElement /* 1 */,
				Fragments._BodyTable__BodyTable /* 2 */
			};
		private static final int /*@NonNull*/ [] __BodyTable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CV =
			{
				Fragments._CV__OclAny /* 0 */,
				Fragments._CV__OclElement /* 1 */,
				Fragments._CV__CV /* 2 */
			};
		private static final int /*@NonNull*/ [] __CV = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__SuperType /* 2 */,
				Fragments._DataType__DataType /* 3 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FloatType =
			{
				Fragments._FloatType__OclAny /* 0 */,
				Fragments._FloatType__OclElement /* 1 */,
				Fragments._FloatType__SuperType /* 2 */,
				Fragments._FloatType__FloatType /* 3 */
			};
		private static final int /*@NonNull*/ [] __FloatType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HeadTable =
			{
				Fragments._HeadTable__OclAny /* 0 */,
				Fragments._HeadTable__OclElement /* 1 */,
				Fragments._HeadTable__HeadTable /* 2 */
			};
		private static final int /*@NonNull*/ [] __HeadTable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Information =
			{
				Fragments._Information__OclAny /* 0 */,
				Fragments._Information__OclElement /* 1 */,
				Fragments._Information__Attribute /* 2 */,
				Fragments._Information__Information /* 3 */
			};
		private static final int /*@NonNull*/ [] __Information = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Row =
			{
				Fragments._Row__OclAny /* 0 */,
				Fragments._Row__OclElement /* 1 */,
				Fragments._Row__Row /* 2 */
			};
		private static final int /*@NonNull*/ [] __Row = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Section =
			{
				Fragments._Section__OclAny /* 0 */,
				Fragments._Section__OclElement /* 1 */,
				Fragments._Section__Section /* 2 */
			};
		private static final int /*@NonNull*/ [] __Section = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringType =
			{
				Fragments._StringType__OclAny /* 0 */,
				Fragments._StringType__OclElement /* 1 */,
				Fragments._StringType__SuperType /* 2 */,
				Fragments._StringType__StringType /* 3 */
			};
		private static final int /*@NonNull*/ [] __StringType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SuperType =
			{
				Fragments._SuperType__OclAny /* 0 */,
				Fragments._SuperType__OclElement /* 1 */,
				Fragments._SuperType__SuperType /* 2 */
			};
		private static final int /*@NonNull*/ [] __SuperType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__Attribute /* 2 */,
				Fragments._Table__Table /* 3 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._BodyTable.initFragments(_BodyTable, __BodyTable);
			Types._CV.initFragments(_CV, __CV);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._FloatType.initFragments(_FloatType, __FloatType);
			Types._HeadTable.initFragments(_HeadTable, __HeadTable);
			Types._Information.initFragments(_Information, __Information);
			Types._Row.initFragments(_Row, __Row);
			Types._Section.initFragments(_Section, __Section);
			Types._StringType.initFragments(_StringType, __StringType);
			Types._SuperType.initFragments(_SuperType, __SuperType);
			Types._Table.initFragments(_Table, __Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BodyTable__BodyTable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BodyTable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BodyTable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CV__CV = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CV__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CV__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__SuperType = {};

		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__FloatType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatType__SuperType = {};

		private static final ExecutorOperation /*@NonNull*/ [] _HeadTable__HeadTable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HeadTable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HeadTable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Information__Information = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Information__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Information__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Information__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Row__Row = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Row__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Row__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Section__Section = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Section__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Section__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StringType__StringType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringType__SuperType = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SuperType__SuperType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SuperType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SuperType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._BodyTable__BodyTable.initOperations(_BodyTable__BodyTable);
			Fragments._BodyTable__OclAny.initOperations(_BodyTable__OclAny);
			Fragments._BodyTable__OclElement.initOperations(_BodyTable__OclElement);

			Fragments._CV__CV.initOperations(_CV__CV);
			Fragments._CV__OclAny.initOperations(_CV__OclAny);
			Fragments._CV__OclElement.initOperations(_CV__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__SuperType.initOperations(_DataType__SuperType);

			Fragments._FloatType__FloatType.initOperations(_FloatType__FloatType);
			Fragments._FloatType__OclAny.initOperations(_FloatType__OclAny);
			Fragments._FloatType__OclElement.initOperations(_FloatType__OclElement);
			Fragments._FloatType__SuperType.initOperations(_FloatType__SuperType);

			Fragments._HeadTable__HeadTable.initOperations(_HeadTable__HeadTable);
			Fragments._HeadTable__OclAny.initOperations(_HeadTable__OclAny);
			Fragments._HeadTable__OclElement.initOperations(_HeadTable__OclElement);

			Fragments._Information__Attribute.initOperations(_Information__Attribute);
			Fragments._Information__Information.initOperations(_Information__Information);
			Fragments._Information__OclAny.initOperations(_Information__OclAny);
			Fragments._Information__OclElement.initOperations(_Information__OclElement);

			Fragments._Row__OclAny.initOperations(_Row__OclAny);
			Fragments._Row__OclElement.initOperations(_Row__OclElement);
			Fragments._Row__Row.initOperations(_Row__Row);

			Fragments._Section__OclAny.initOperations(_Section__OclAny);
			Fragments._Section__OclElement.initOperations(_Section__OclElement);
			Fragments._Section__Section.initOperations(_Section__Section);

			Fragments._StringType__OclAny.initOperations(_StringType__OclAny);
			Fragments._StringType__OclElement.initOperations(_StringType__OclElement);
			Fragments._StringType__StringType.initOperations(_StringType__StringType);
			Fragments._StringType__SuperType.initOperations(_StringType__SuperType);

			Fragments._SuperType__OclAny.initOperations(_SuperType__OclAny);
			Fragments._SuperType__OclElement.initOperations(_SuperType__OclElement);
			Fragments._SuperType__SuperType.initOperations(_SuperType__SuperType);

			Fragments._Table__Attribute.initOperations(_Table__Attribute);
			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._Attribute__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BodyTable = {
			CurriculoTables.Properties._BodyTable__bodyrow,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CV = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._CV__sections,
			CurriculoTables.Properties._CV__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._SuperType__subvalues,
			CurriculoTables.Properties._DataType__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FloatType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._SuperType__subvalues,
			CurriculoTables.Properties._FloatType__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HeadTable = {
			CurriculoTables.Properties._HeadTable__headrow,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Information = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._Information__supertype,
			CurriculoTables.Properties._Attribute__title
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Row = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._Row__rowvalues
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Section = {
			CurriculoTables.Properties._Section__attributes,
			CurriculoTables.Properties._Section__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._Section__subsections
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._SuperType__subvalues,
			CurriculoTables.Properties._StringType__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SuperType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._SuperType__subvalues
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			CurriculoTables.Properties._Table__body,
			CurriculoTables.Properties._Table__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CurriculoTables.Properties._Attribute__title
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._BodyTable__BodyTable.initProperties(_BodyTable);
			Fragments._CV__CV.initProperties(_CV);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._FloatType__FloatType.initProperties(_FloatType);
			Fragments._HeadTable__HeadTable.initProperties(_HeadTable);
			Fragments._Information__Information.initProperties(_Information);
			Fragments._Row__Row.initProperties(_Row);
			Fragments._Section__Section.initProperties(_Section);
			Fragments._StringType__StringType.initProperties(_StringType);
			Fragments._SuperType__SuperType.initProperties(_SuperType);
			Fragments._Table__Table.initProperties(_Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CurriculoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CurriculoTables();
	}

	private CurriculoTables() {
		super(CurriculoPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		CurriculoPackage.Literals.SECTION
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
