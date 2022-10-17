/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Projeto_CV/model/projeto_CV.ecore
 * using:
 *   /Projeto_CV/model/projeto_CV.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package projeto_CV;

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
// import projeto_CV.Projeto_CVPackage;
// import projeto_CV.Projeto_CVTables;

/**
 * Projeto_CVTables provides the dispatch tables for the projeto_CV for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Projeto_CVTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Projeto_CVPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_projeto_CV = IdManager.getNsURIPackageId("http://www.example.org/projeto_CV", null, Projeto_CVPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Atributo = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Atributo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Body = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Body", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CV = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("CV", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Projeto_CVTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_HeadTabela = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("HeadTabela", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Informacao = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Informacao", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Row = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Row", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Seccao = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Seccao", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SuperType = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("SuperType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tabela = Projeto_CVTables.PACKid_http_c_s_s_www_example_org_s_projeto_CV.getClassId("Tabela", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Projeto_CVTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = Projeto_CVTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Atributo = TypeId.ORDERED_SET.getSpecializedId(Projeto_CVTables.CLSSid_Atributo);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Row = TypeId.ORDERED_SET.getSpecializedId(Projeto_CVTables.CLSSid_Row);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Seccao = TypeId.ORDERED_SET.getSpecializedId(Projeto_CVTables.CLSSid_Seccao);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SuperType = TypeId.ORDERED_SET.getSpecializedId(Projeto_CVTables.CLSSid_SuperType);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Seccao = TypeId.SET.getSpecializedId(Projeto_CVTables.CLSSid_Seccao);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Projeto_CVTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Atributo = new EcoreExecutorType(Projeto_CVPackage.Literals.ATRIBUTO, PACKAGE, 0);
		public static final EcoreExecutorType _Body = new EcoreExecutorType(Projeto_CVPackage.Literals.BODY, PACKAGE, 0);
		public static final EcoreExecutorType _CV = new EcoreExecutorType(Projeto_CVPackage.Literals.CV, PACKAGE, 0);
		public static final EcoreExecutorType _DataType = new EcoreExecutorType(Projeto_CVPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _FloatType = new EcoreExecutorType(Projeto_CVPackage.Literals.FLOAT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _HeadTabela = new EcoreExecutorType(Projeto_CVPackage.Literals.HEAD_TABELA, PACKAGE, 0);
		public static final EcoreExecutorType _Informacao = new EcoreExecutorType(Projeto_CVPackage.Literals.INFORMACAO, PACKAGE, 0);
		public static final EcoreExecutorType _Row = new EcoreExecutorType(Projeto_CVPackage.Literals.ROW, PACKAGE, 0);
		public static final EcoreExecutorType _Seccao = new EcoreExecutorType(Projeto_CVPackage.Literals.SECCAO, PACKAGE, 0);
		public static final EcoreExecutorType _StringType = new EcoreExecutorType(Projeto_CVPackage.Literals.STRING_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _SuperType = new EcoreExecutorType(Projeto_CVPackage.Literals.SUPER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Tabela = new EcoreExecutorType(Projeto_CVPackage.Literals.TABELA, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Atributo,
			_Body,
			_CV,
			_DataType,
			_FloatType,
			_HeadTabela,
			_Informacao,
			_Row,
			_Seccao,
			_StringType,
			_SuperType,
			_Tabela
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Atributo__Atributo = new ExecutorFragment(Types._Atributo, Projeto_CVTables.Types._Atributo);
		private static final ExecutorFragment _Atributo__OclAny = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Atributo__OclElement = new ExecutorFragment(Types._Atributo, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Body__Body = new ExecutorFragment(Types._Body, Projeto_CVTables.Types._Body);
		private static final ExecutorFragment _Body__OclAny = new ExecutorFragment(Types._Body, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Body__OclElement = new ExecutorFragment(Types._Body, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CV__CV = new ExecutorFragment(Types._CV, Projeto_CVTables.Types._CV);
		private static final ExecutorFragment _CV__OclAny = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CV__OclElement = new ExecutorFragment(Types._CV, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, Projeto_CVTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__SuperType = new ExecutorFragment(Types._DataType, Projeto_CVTables.Types._SuperType);

		private static final ExecutorFragment _FloatType__FloatType = new ExecutorFragment(Types._FloatType, Projeto_CVTables.Types._FloatType);
		private static final ExecutorFragment _FloatType__OclAny = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FloatType__OclElement = new ExecutorFragment(Types._FloatType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FloatType__SuperType = new ExecutorFragment(Types._FloatType, Projeto_CVTables.Types._SuperType);

		private static final ExecutorFragment _HeadTabela__HeadTabela = new ExecutorFragment(Types._HeadTabela, Projeto_CVTables.Types._HeadTabela);
		private static final ExecutorFragment _HeadTabela__OclAny = new ExecutorFragment(Types._HeadTabela, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HeadTabela__OclElement = new ExecutorFragment(Types._HeadTabela, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Informacao__Atributo = new ExecutorFragment(Types._Informacao, Projeto_CVTables.Types._Atributo);
		private static final ExecutorFragment _Informacao__Informacao = new ExecutorFragment(Types._Informacao, Projeto_CVTables.Types._Informacao);
		private static final ExecutorFragment _Informacao__OclAny = new ExecutorFragment(Types._Informacao, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Informacao__OclElement = new ExecutorFragment(Types._Informacao, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Row__OclAny = new ExecutorFragment(Types._Row, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Row__OclElement = new ExecutorFragment(Types._Row, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Row__Row = new ExecutorFragment(Types._Row, Projeto_CVTables.Types._Row);

		private static final ExecutorFragment _Seccao__OclAny = new ExecutorFragment(Types._Seccao, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Seccao__OclElement = new ExecutorFragment(Types._Seccao, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Seccao__Seccao = new ExecutorFragment(Types._Seccao, Projeto_CVTables.Types._Seccao);

		private static final ExecutorFragment _StringType__OclAny = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringType__OclElement = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringType__StringType = new ExecutorFragment(Types._StringType, Projeto_CVTables.Types._StringType);
		private static final ExecutorFragment _StringType__SuperType = new ExecutorFragment(Types._StringType, Projeto_CVTables.Types._SuperType);

		private static final ExecutorFragment _SuperType__OclAny = new ExecutorFragment(Types._SuperType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SuperType__OclElement = new ExecutorFragment(Types._SuperType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SuperType__SuperType = new ExecutorFragment(Types._SuperType, Projeto_CVTables.Types._SuperType);

		private static final ExecutorFragment _Tabela__Atributo = new ExecutorFragment(Types._Tabela, Projeto_CVTables.Types._Atributo);
		private static final ExecutorFragment _Tabela__OclAny = new ExecutorFragment(Types._Tabela, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tabela__OclElement = new ExecutorFragment(Types._Tabela, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tabela__Tabela = new ExecutorFragment(Types._Tabela, Projeto_CVTables.Types._Tabela);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of Projeto_CVTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of Projeto_CVTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Atributo__Seccao__atributo = new ExecutorPropertyWithImplementation("Seccao", Types._Atributo, 0, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.SECCAO__ATRIBUTO));

		public static final ExecutorProperty _Body__row = new EcoreExecutorProperty(Projeto_CVPackage.Literals.BODY__ROW, Types._Body, 0);
		public static final ExecutorProperty _Body__Tabela__body = new ExecutorPropertyWithImplementation("Tabela", Types._Body, 1, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.TABELA__BODY));

		public static final ExecutorProperty _CV__seccao = new EcoreExecutorProperty(Projeto_CVPackage.Literals.CV__SECCAO, Types._CV, 0);

		public static final ExecutorProperty _DataType__date = new EcoreExecutorProperty(Projeto_CVPackage.Literals.DATA_TYPE__DATE, Types._DataType, 0);

		public static final ExecutorProperty _FloatType__flt = new EcoreExecutorProperty(Projeto_CVPackage.Literals.FLOAT_TYPE__FLT, Types._FloatType, 0);

		public static final ExecutorProperty _HeadTabela__nome = new EcoreExecutorProperty(Projeto_CVPackage.Literals.HEAD_TABELA__NOME, Types._HeadTabela, 0);
		public static final ExecutorProperty _HeadTabela__row = new EcoreExecutorProperty(Projeto_CVPackage.Literals.HEAD_TABELA__ROW, Types._HeadTabela, 1);
		public static final ExecutorProperty _HeadTabela__Tabela__header = new ExecutorPropertyWithImplementation("Tabela", Types._HeadTabela, 2, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.TABELA__HEADER));

		public static final ExecutorProperty _Informacao__supertype = new EcoreExecutorProperty(Projeto_CVPackage.Literals.INFORMACAO__SUPERTYPE, Types._Informacao, 0);
		public static final ExecutorProperty _Informacao__titulo = new EcoreExecutorProperty(Projeto_CVPackage.Literals.INFORMACAO__TITULO, Types._Informacao, 1);

		public static final ExecutorProperty _Row__supertype = new EcoreExecutorProperty(Projeto_CVPackage.Literals.ROW__SUPERTYPE, Types._Row, 0);
		public static final ExecutorProperty _Row__Body__row = new ExecutorPropertyWithImplementation("Body", Types._Row, 1, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.BODY__ROW));
		public static final ExecutorProperty _Row__HeadTabela__row = new ExecutorPropertyWithImplementation("HeadTabela", Types._Row, 2, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.HEAD_TABELA__ROW));

		public static final ExecutorProperty _Seccao__atributo = new EcoreExecutorProperty(Projeto_CVPackage.Literals.SECCAO__ATRIBUTO, Types._Seccao, 0);
		public static final ExecutorProperty _Seccao__nome = new EcoreExecutorProperty(Projeto_CVPackage.Literals.SECCAO__NOME, Types._Seccao, 1);
		public static final ExecutorProperty _Seccao__seccao = new EcoreExecutorProperty(Projeto_CVPackage.Literals.SECCAO__SECCAO, Types._Seccao, 2);
		public static final ExecutorProperty _Seccao__CV__seccao = new ExecutorPropertyWithImplementation("CV", Types._Seccao, 3, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.CV__SECCAO));
		public static final ExecutorProperty _Seccao__Seccao__seccao = new ExecutorPropertyWithImplementation("Seccao", Types._Seccao, 4, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.SECCAO__SECCAO));

		public static final ExecutorProperty _StringType__str = new EcoreExecutorProperty(Projeto_CVPackage.Literals.STRING_TYPE__STR, Types._StringType, 0);

		public static final ExecutorProperty _SuperType__supertype = new EcoreExecutorProperty(Projeto_CVPackage.Literals.SUPER_TYPE__SUPERTYPE, Types._SuperType, 0);
		public static final ExecutorProperty _SuperType__Informacao__supertype = new ExecutorPropertyWithImplementation("Informacao", Types._SuperType, 1, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.INFORMACAO__SUPERTYPE));
		public static final ExecutorProperty _SuperType__Row__supertype = new ExecutorPropertyWithImplementation("Row", Types._SuperType, 2, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.ROW__SUPERTYPE));
		public static final ExecutorProperty _SuperType__SuperType__supertype = new ExecutorPropertyWithImplementation("SuperType", Types._SuperType, 3, new EcoreLibraryOppositeProperty(Projeto_CVPackage.Literals.SUPER_TYPE__SUPERTYPE));

		public static final ExecutorProperty _Tabela__body = new EcoreExecutorProperty(Projeto_CVPackage.Literals.TABELA__BODY, Types._Tabela, 0);
		public static final ExecutorProperty _Tabela__header = new EcoreExecutorProperty(Projeto_CVPackage.Literals.TABELA__HEADER, Types._Tabela, 1);
		public static final ExecutorProperty _Tabela__titulo = new EcoreExecutorProperty(Projeto_CVPackage.Literals.TABELA__TITULO, Types._Tabela, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Atributo =
			{
				Fragments._Atributo__OclAny /* 0 */,
				Fragments._Atributo__OclElement /* 1 */,
				Fragments._Atributo__Atributo /* 2 */
			};
		private static final int /*@NonNull*/ [] __Atributo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Body =
			{
				Fragments._Body__OclAny /* 0 */,
				Fragments._Body__OclElement /* 1 */,
				Fragments._Body__Body /* 2 */
			};
		private static final int /*@NonNull*/ [] __Body = { 1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _HeadTabela =
			{
				Fragments._HeadTabela__OclAny /* 0 */,
				Fragments._HeadTabela__OclElement /* 1 */,
				Fragments._HeadTabela__HeadTabela /* 2 */
			};
		private static final int /*@NonNull*/ [] __HeadTabela = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Informacao =
			{
				Fragments._Informacao__OclAny /* 0 */,
				Fragments._Informacao__OclElement /* 1 */,
				Fragments._Informacao__Atributo /* 2 */,
				Fragments._Informacao__Informacao /* 3 */
			};
		private static final int /*@NonNull*/ [] __Informacao = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Row =
			{
				Fragments._Row__OclAny /* 0 */,
				Fragments._Row__OclElement /* 1 */,
				Fragments._Row__Row /* 2 */
			};
		private static final int /*@NonNull*/ [] __Row = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Seccao =
			{
				Fragments._Seccao__OclAny /* 0 */,
				Fragments._Seccao__OclElement /* 1 */,
				Fragments._Seccao__Seccao /* 2 */
			};
		private static final int /*@NonNull*/ [] __Seccao = { 1,1,1 };

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

		private static final ExecutorFragment /*@NonNull*/ [] _Tabela =
			{
				Fragments._Tabela__OclAny /* 0 */,
				Fragments._Tabela__OclElement /* 1 */,
				Fragments._Tabela__Atributo /* 2 */,
				Fragments._Tabela__Tabela /* 3 */
			};
		private static final int /*@NonNull*/ [] __Tabela = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Atributo.initFragments(_Atributo, __Atributo);
			Types._Body.initFragments(_Body, __Body);
			Types._CV.initFragments(_CV, __CV);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._FloatType.initFragments(_FloatType, __FloatType);
			Types._HeadTabela.initFragments(_HeadTabela, __HeadTabela);
			Types._Informacao.initFragments(_Informacao, __Informacao);
			Types._Row.initFragments(_Row, __Row);
			Types._Seccao.initFragments(_Seccao, __Seccao);
			Types._StringType.initFragments(_StringType, __StringType);
			Types._SuperType.initFragments(_SuperType, __SuperType);
			Types._Tabela.initFragments(_Tabela, __Tabela);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Atributo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Body__Body = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Body__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Body__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _HeadTabela__HeadTabela = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HeadTabela__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _HeadTabela__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Informacao__Informacao = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Informacao__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Informacao__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Informacao__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Seccao__Seccao = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Seccao__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Seccao__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Tabela__Tabela = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tabela__Atributo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tabela__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Tabela__OclElement = {
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
			Fragments._Atributo__Atributo.initOperations(_Atributo__Atributo);
			Fragments._Atributo__OclAny.initOperations(_Atributo__OclAny);
			Fragments._Atributo__OclElement.initOperations(_Atributo__OclElement);

			Fragments._Body__Body.initOperations(_Body__Body);
			Fragments._Body__OclAny.initOperations(_Body__OclAny);
			Fragments._Body__OclElement.initOperations(_Body__OclElement);

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

			Fragments._HeadTabela__HeadTabela.initOperations(_HeadTabela__HeadTabela);
			Fragments._HeadTabela__OclAny.initOperations(_HeadTabela__OclAny);
			Fragments._HeadTabela__OclElement.initOperations(_HeadTabela__OclElement);

			Fragments._Informacao__Atributo.initOperations(_Informacao__Atributo);
			Fragments._Informacao__Informacao.initOperations(_Informacao__Informacao);
			Fragments._Informacao__OclAny.initOperations(_Informacao__OclAny);
			Fragments._Informacao__OclElement.initOperations(_Informacao__OclElement);

			Fragments._Row__OclAny.initOperations(_Row__OclAny);
			Fragments._Row__OclElement.initOperations(_Row__OclElement);
			Fragments._Row__Row.initOperations(_Row__Row);

			Fragments._Seccao__OclAny.initOperations(_Seccao__OclAny);
			Fragments._Seccao__OclElement.initOperations(_Seccao__OclElement);
			Fragments._Seccao__Seccao.initOperations(_Seccao__Seccao);

			Fragments._StringType__OclAny.initOperations(_StringType__OclAny);
			Fragments._StringType__OclElement.initOperations(_StringType__OclElement);
			Fragments._StringType__StringType.initOperations(_StringType__StringType);
			Fragments._StringType__SuperType.initOperations(_StringType__SuperType);

			Fragments._SuperType__OclAny.initOperations(_SuperType__OclAny);
			Fragments._SuperType__OclElement.initOperations(_SuperType__OclElement);
			Fragments._SuperType__SuperType.initOperations(_SuperType__SuperType);

			Fragments._Tabela__Atributo.initOperations(_Tabela__Atributo);
			Fragments._Tabela__OclAny.initOperations(_Tabela__OclAny);
			Fragments._Tabela__OclElement.initOperations(_Tabela__OclElement);
			Fragments._Tabela__Tabela.initOperations(_Tabela__Tabela);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Atributo = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Body = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._Body__row
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CV = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._CV__seccao
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			Projeto_CVTables.Properties._DataType__date,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._SuperType__supertype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FloatType = {
			Projeto_CVTables.Properties._FloatType__flt,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._SuperType__supertype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HeadTabela = {
			Projeto_CVTables.Properties._HeadTabela__nome,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._HeadTabela__row
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Informacao = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._Informacao__supertype,
			Projeto_CVTables.Properties._Informacao__titulo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Row = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._Row__supertype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Seccao = {
			Projeto_CVTables.Properties._Seccao__atributo,
			Projeto_CVTables.Properties._Seccao__nome,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._Seccao__seccao
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._StringType__str,
			Projeto_CVTables.Properties._SuperType__supertype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SuperType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._SuperType__supertype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tabela = {
			Projeto_CVTables.Properties._Tabela__body,
			Projeto_CVTables.Properties._Tabela__header,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Projeto_CVTables.Properties._Tabela__titulo
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Atributo__Atributo.initProperties(_Atributo);
			Fragments._Body__Body.initProperties(_Body);
			Fragments._CV__CV.initProperties(_CV);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._FloatType__FloatType.initProperties(_FloatType);
			Fragments._HeadTabela__HeadTabela.initProperties(_HeadTabela);
			Fragments._Informacao__Informacao.initProperties(_Informacao);
			Fragments._Row__Row.initProperties(_Row);
			Fragments._Seccao__Seccao.initProperties(_Seccao);
			Fragments._StringType__StringType.initProperties(_StringType);
			Fragments._SuperType__SuperType.initProperties(_SuperType);
			Fragments._Tabela__Tabela.initProperties(_Tabela);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Projeto_CVTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of Projeto_CVTables::EnumerationLiterals and all preceding sub-packages.
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
		new Projeto_CVTables();
	}

	private Projeto_CVTables() {
		super(Projeto_CVPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Projeto_CVPackage.Literals.SECCAO
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
