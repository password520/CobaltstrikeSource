package org.apache.xml.res;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class XMLErrorResources_cs extends ListResourceBundle {
   public static final int MAX_CODE = 61;
   public static final int MAX_WARNING = 0;
   public static final int MAX_OTHERS = 4;
   public static final int MAX_MESSAGES = 62;
   public static final String ER_FUNCTION_NOT_SUPPORTED = "ER_FUNCTION_NOT_SUPPORTED";
   public static final String ER_CANNOT_OVERWRITE_CAUSE = "ER_CANNOT_OVERWRITE_CAUSE";
   public static final String ER_NO_DEFAULT_IMPL = "ER_NO_DEFAULT_IMPL";
   public static final String ER_CHUNKEDINTARRAY_NOT_SUPPORTED = "ER_CHUNKEDINTARRAY_NOT_SUPPORTED";
   public static final String ER_OFFSET_BIGGER_THAN_SLOT = "ER_OFFSET_BIGGER_THAN_SLOT";
   public static final String ER_COROUTINE_NOT_AVAIL = "ER_COROUTINE_NOT_AVAIL";
   public static final String ER_COROUTINE_CO_EXIT = "ER_COROUTINE_CO_EXIT";
   public static final String ER_COJOINROUTINESET_FAILED = "ER_COJOINROUTINESET_FAILED";
   public static final String ER_COROUTINE_PARAM = "ER_COROUTINE_PARAM";
   public static final String ER_PARSER_DOTERMINATE_ANSWERS = "ER_PARSER_DOTERMINATE_ANSWERS";
   public static final String ER_NO_PARSE_CALL_WHILE_PARSING = "ER_NO_PARSE_CALL_WHILE_PARSING";
   public static final String ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED = "ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED";
   public static final String ER_ITERATOR_AXIS_NOT_IMPLEMENTED = "ER_ITERATOR_AXIS_NOT_IMPLEMENTED";
   public static final String ER_ITERATOR_CLONE_NOT_SUPPORTED = "ER_ITERATOR_CLONE_NOT_SUPPORTED";
   public static final String ER_UNKNOWN_AXIS_TYPE = "ER_UNKNOWN_AXIS_TYPE";
   public static final String ER_AXIS_NOT_SUPPORTED = "ER_AXIS_NOT_SUPPORTED";
   public static final String ER_NO_DTMIDS_AVAIL = "ER_NO_DTMIDS_AVAIL";
   public static final String ER_NOT_SUPPORTED = "ER_NOT_SUPPORTED";
   public static final String ER_NODE_NON_NULL = "ER_NODE_NON_NULL";
   public static final String ER_COULD_NOT_RESOLVE_NODE = "ER_COULD_NOT_RESOLVE_NODE";
   public static final String ER_STARTPARSE_WHILE_PARSING = "ER_STARTPARSE_WHILE_PARSING";
   public static final String ER_STARTPARSE_NEEDS_SAXPARSER = "ER_STARTPARSE_NEEDS_SAXPARSER";
   public static final String ER_COULD_NOT_INIT_PARSER = "ER_COULD_NOT_INIT_PARSER";
   public static final String ER_EXCEPTION_CREATING_POOL = "ER_EXCEPTION_CREATING_POOL";
   public static final String ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE = "ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE";
   public static final String ER_SCHEME_REQUIRED = "ER_SCHEME_REQUIRED";
   public static final String ER_NO_SCHEME_IN_URI = "ER_NO_SCHEME_IN_URI";
   public static final String ER_NO_SCHEME_INURI = "ER_NO_SCHEME_INURI";
   public static final String ER_PATH_INVALID_CHAR = "ER_PATH_INVALID_CHAR";
   public static final String ER_SCHEME_FROM_NULL_STRING = "ER_SCHEME_FROM_NULL_STRING";
   public static final String ER_SCHEME_NOT_CONFORMANT = "ER_SCHEME_NOT_CONFORMANT";
   public static final String ER_HOST_ADDRESS_NOT_WELLFORMED = "ER_HOST_ADDRESS_NOT_WELLFORMED";
   public static final String ER_PORT_WHEN_HOST_NULL = "ER_PORT_WHEN_HOST_NULL";
   public static final String ER_INVALID_PORT = "ER_INVALID_PORT";
   public static final String ER_FRAG_FOR_GENERIC_URI = "ER_FRAG_FOR_GENERIC_URI";
   public static final String ER_FRAG_WHEN_PATH_NULL = "ER_FRAG_WHEN_PATH_NULL";
   public static final String ER_FRAG_INVALID_CHAR = "ER_FRAG_INVALID_CHAR";
   public static final String ER_PARSER_IN_USE = "ER_PARSER_IN_USE";
   public static final String ER_CANNOT_CHANGE_WHILE_PARSING = "ER_CANNOT_CHANGE_WHILE_PARSING";
   public static final String ER_SELF_CAUSATION_NOT_PERMITTED = "ER_SELF_CAUSATION_NOT_PERMITTED";
   public static final String ER_NO_USERINFO_IF_NO_HOST = "ER_NO_USERINFO_IF_NO_HOST";
   public static final String ER_NO_PORT_IF_NO_HOST = "ER_NO_PORT_IF_NO_HOST";
   public static final String ER_NO_QUERY_STRING_IN_PATH = "ER_NO_QUERY_STRING_IN_PATH";
   public static final String ER_NO_FRAGMENT_STRING_IN_PATH = "ER_NO_FRAGMENT_STRING_IN_PATH";
   public static final String ER_CANNOT_INIT_URI_EMPTY_PARMS = "ER_CANNOT_INIT_URI_EMPTY_PARMS";
   public static final String ER_METHOD_NOT_SUPPORTED = "ER_METHOD_NOT_SUPPORTED";
   public static final String ER_INCRSAXSRCFILTER_NOT_RESTARTABLE = "ER_INCRSAXSRCFILTER_NOT_RESTARTABLE";
   public static final String ER_XMLRDR_NOT_BEFORE_STARTPARSE = "ER_XMLRDR_NOT_BEFORE_STARTPARSE";
   public static final String ER_AXIS_TRAVERSER_NOT_SUPPORTED = "ER_AXIS_TRAVERSER_NOT_SUPPORTED";
   public static final String ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER = "ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER";
   public static final String ER_SYSTEMID_UNKNOWN = "ER_SYSTEMID_UNKNOWN";
   public static final String ER_LOCATION_UNKNOWN = "ER_LOCATION_UNKNOWN";
   public static final String ER_PREFIX_MUST_RESOLVE = "ER_PREFIX_MUST_RESOLVE";
   public static final String ER_CREATEDOCUMENT_NOT_SUPPORTED = "ER_CREATEDOCUMENT_NOT_SUPPORTED";
   public static final String ER_CHILD_HAS_NO_OWNER_DOCUMENT = "ER_CHILD_HAS_NO_OWNER_DOCUMENT";
   public static final String ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT = "ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT";
   public static final String ER_CANT_OUTPUT_TEXT_BEFORE_DOC = "ER_CANT_OUTPUT_TEXT_BEFORE_DOC";
   public static final String ER_CANT_HAVE_MORE_THAN_ONE_ROOT = "ER_CANT_HAVE_MORE_THAN_ONE_ROOT";
   public static final String ER_ARG_LOCALNAME_NULL = "ER_ARG_LOCALNAME_NULL";
   public static final String ER_ARG_LOCALNAME_INVALID = "ER_ARG_LOCALNAME_INVALID";
   public static final String ER_ARG_PREFIX_INVALID = "ER_ARG_PREFIX_INVALID";
   public static final String ER_RESOURCE_COULD_NOT_FIND = "ER_RESOURCE_COULD_NOT_FIND";
   public static final String ER_RESOURCE_COULD_NOT_LOAD = "ER_RESOURCE_COULD_NOT_LOAD";
   public static final String ER_BUFFER_SIZE_LESSTHAN_ZERO = "ER_BUFFER_SIZE_LESSTHAN_ZERO";
   public static final String ER_INVALID_UTF16_SURROGATE = "ER_INVALID_UTF16_SURROGATE";
   public static final String ER_OIERROR = "ER_OIERROR";
   public static final String ER_NAMESPACE_PREFIX = "ER_NAMESPACE_PREFIX";
   public static final String ER_STRAY_ATTRIBUTE = "ER_STRAY_ATTIRBUTE";
   public static final String ER_STRAY_NAMESPACE = "ER_STRAY_NAMESPACE";
   public static final String ER_COULD_NOT_LOAD_RESOURCE = "ER_COULD_NOT_LOAD_RESOURCE";
   public static final String ER_COULD_NOT_LOAD_METHOD_PROPERTY = "ER_COULD_NOT_LOAD_METHOD_PROPERTY";
   public static final String ER_SERIALIZER_NOT_CONTENTHANDLER = "ER_SERIALIZER_NOT_CONTENTHANDLER";
   public static final String ER_ILLEGAL_ATTRIBUTE_POSITION = "ER_ILLEGAL_ATTRIBUTE_POSITION";

   public Object[][] getContents() {
      return new Object[][]{{"ER0000", "{0}"}, {"ER_FUNCTION_NOT_SUPPORTED", "Nepodporovan?? funkce!"}, {"ER_CANNOT_OVERWRITE_CAUSE", "P??????inu nelze p??epsat"}, {"ER_NO_DEFAULT_IMPL", "Nebyla nalezena v??choz?? implementace. "}, {"ER_CHUNKEDINTARRAY_NOT_SUPPORTED", "Funkce ChunkedIntArray({0}) nen?? aktu??ln?? podporov??na."}, {"ER_OFFSET_BIGGER_THAN_SLOT", "Offset je v??t???? ne?? slot."}, {"ER_COROUTINE_NOT_AVAIL", "Spole??n?? rutina nen?? k dispozici, id={0}"}, {"ER_COROUTINE_CO_EXIT", "Funkce CoroutineManager obdr??ela po??adavek co_exit()"}, {"ER_COJOINROUTINESET_FAILED", "Selhala funkce co_joinCoroutineSet()"}, {"ER_COROUTINE_PARAM", "Chyba parametru spole??n?? rutiny ({0})"}, {"ER_PARSER_DOTERMINATE_ANSWERS", "\nNeo??ek??van??: odpov??di funkce analyz??toru doTerminate {0}"}, {"ER_NO_PARSE_CALL_WHILE_PARSING", "b??hem anal??zy nelze volat analyz??tor"}, {"ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED", "Chyba: zadan?? iter??tor osy {0} nen?? implementov??n"}, {"ER_ITERATOR_AXIS_NOT_IMPLEMENTED", "Chyba: zadan?? iter??tor osy {0} nen?? implementov??n "}, {"ER_ITERATOR_CLONE_NOT_SUPPORTED", "Nepodporovan?? klon iter??toru."}, {"ER_UNKNOWN_AXIS_TYPE", "Nezn??m?? typ osy pr??chodu: {0}"}, {"ER_AXIS_NOT_SUPPORTED", "Nepodporovan?? osa pr??chodu: {0}"}, {"ER_NO_DTMIDS_AVAIL", "????dn?? dal???? ID DTM nejsou k dispozici"}, {"ER_NOT_SUPPORTED", "Nepodporov??no: {0}"}, {"ER_NODE_NON_NULL", "Uzel pou??it?? ve funkci getDTMHandleFromNode mus?? m??t hodnotu not-null"}, {"ER_COULD_NOT_RESOLVE_NODE", "Uzel nelze p??elo??it do manipul??toru"}, {"ER_STARTPARSE_WHILE_PARSING", "B??hem anal??zy nelze volat funkci startParse."}, {"ER_STARTPARSE_NEEDS_SAXPARSER", "Funkce startParse vy??aduje SAXParser s hodnotou not-null."}, {"ER_COULD_NOT_INIT_PARSER", "nelze inicializovat analyz??tor s: "}, {"ER_EXCEPTION_CREATING_POOL", "v??jimka p??i vytv????en?? nov?? instance spole??n?? oblasti"}, {"ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "Cesta obsahuje neplatnou escape sekvenci"}, {"ER_SCHEME_REQUIRED", "Je vy??adov??no sch??ma!"}, {"ER_NO_SCHEME_IN_URI", "V URI nebylo nalezeno ????dn?? sch??ma: {0}"}, {"ER_NO_SCHEME_INURI", "V URI nebylo nalezeno ????dn?? sch??ma"}, {"ER_PATH_INVALID_CHAR", "Cesta obsahuje neplatn?? znak: {0}"}, {"ER_SCHEME_FROM_NULL_STRING", "Nelze nastavit sch??ma ??et??zce s hodnotou null."}, {"ER_SCHEME_NOT_CONFORMANT", "Sch??ma nevyhovuje."}, {"ER_HOST_ADDRESS_NOT_WELLFORMED", "Adresa hostitele m?? nespr??vn?? form??t."}, {"ER_PORT_WHEN_HOST_NULL", "M??-li hostitel hodnotu null, nelze nastavit port."}, {"ER_INVALID_PORT", "Neplatn?? ????slo portu."}, {"ER_FRAG_FOR_GENERIC_URI", "Fragment lze nastavit jen u generick??ho URI."}, {"ER_FRAG_WHEN_PATH_NULL", "M??-li cesta hodnotu null, nelze nastavit fragment."}, {"ER_FRAG_INVALID_CHAR", "Fragment obsahuje neplatn?? znak."}, {"ER_PARSER_IN_USE", "Analyz??tor se ji?? pou????v??."}, {"ER_CANNOT_CHANGE_WHILE_PARSING", "B??hem anal??zy nelze m??nit {0} {1}."}, {"ER_SELF_CAUSATION_NOT_PERMITTED", "Zp??soben?? sama sebe (self-causation) nen?? povoleno"}, {"ER_NO_USERINFO_IF_NO_HOST", "Nen??-li ur??en hostitel, nelze zadat ??daje o u??ivateli."}, {"ER_NO_PORT_IF_NO_HOST", "Nen??-li ur??en hostitel, nelze zadat port."}, {"ER_NO_QUERY_STRING_IN_PATH", "V ??et??zci cesty a dotazu nelze zadat ??et??zec dotazu."}, {"ER_NO_FRAGMENT_STRING_IN_PATH", "Fragment nelze ur??it z??rove?? v cest?? i ve fragmentu."}, {"ER_CANNOT_INIT_URI_EMPTY_PARMS", "URI nelze inicializovat s pr??zdn??mi parametry."}, {"ER_METHOD_NOT_SUPPORTED", "Prozat??m nepodporovan?? metoda. "}, {"ER_INCRSAXSRCFILTER_NOT_RESTARTABLE", "Filtr IncrementalSAXSource_Filter nelze aktu??ln?? znovu spustit."}, {"ER_XMLRDR_NOT_BEFORE_STARTPARSE", "P??ed po??adavkem startParse nen?? XMLReader."}, {"ER_AXIS_TRAVERSER_NOT_SUPPORTED", "Nepodporovan?? osa pr??chodu: {0}"}, {"ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER", "Prvek ListingErrorHandler byl vytvo??en s funkc?? PrintWriter s hodnotou null!"}, {"ER_SYSTEMID_UNKNOWN", "Nezn??m?? identifik??tor SystemId"}, {"ER_LOCATION_UNKNOWN", "Chyba se vyskytla na nezn??m??m m??st??"}, {"ER_PREFIX_MUST_RESOLVE", "P??edponu mus?? b??t mo??no p??elo??it do oboru n??zv??: {0}"}, {"ER_CREATEDOCUMENT_NOT_SUPPORTED", "Funkce XPathContext nepodporuje funkci createDocument()!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT", "Potomek atributu nem?? dokument vlastn??ka!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT", "Potomek atributu nem?? prvek dokumentu vlastn??ka!"}, {"ER_CANT_OUTPUT_TEXT_BEFORE_DOC", "Varov??n??: v??stup textu nem????e p??edch??zet prvku dokumentu! Ignorov??no..."}, {"ER_CANT_HAVE_MORE_THAN_ONE_ROOT", "DOM nem????e m??t n??kolik ko??en??!"}, {"ER_ARG_LOCALNAME_NULL", "Argument 'localName' m?? hodnotu null"}, {"ER_ARG_LOCALNAME_INVALID", "Hodnota Localname ve funkci QNAME by m??la b??t platn??m prvkem NCName"}, {"ER_ARG_PREFIX_INVALID", "P??edpona ve funkci QNAME by m??la b??t platn??m prvkem NCName"}, {"BAD_CODE", "Parametr funkce createMessage je mimo limit"}, {"FORMAT_FAILED", "P??i vol??n?? funkce messageFormat do??lo k v??jimce"}, {"line", "????dek #"}, {"column", "Sloupec #"}, {"ER_SERIALIZER_NOT_CONTENTHANDLER", "T????da serializace ''{0}'' neimplementuje org.xml.sax.ContentHandler."}, {"ER_RESOURCE_COULD_NOT_FIND", "Nelze naj??t zdroj [ {0} ].\n {1}"}, {"ER_RESOURCE_COULD_NOT_LOAD", "Nelze zav??st zdroj [ {0} ]: {1} \n {2} \t {3}"}, {"ER_BUFFER_SIZE_LESSTHAN_ZERO", "Velikost vyrovn??vac?? pam??ti <=0"}, {"ER_INVALID_UTF16_SURROGATE", "Byla zji??t??na neplatn?? n??hrada UTF-16: {0} ?"}, {"ER_OIERROR", "Chyba vstupu/v??stupu"}, {"ER_ILLEGAL_ATTRIBUTE_POSITION", "Nelze p??idat atribut {0} po uzlech potomk?? ani p??ed t??m, ne?? je vytvo??en prvek. Atribut bude ignorov??n."}, {"ER_NAMESPACE_PREFIX", "Obor n??zv?? pro p??edponu ''{0}'' nebyl deklarov??n."}, {"ER_STRAY_ATTIRBUTE", "Atribut ''{0}'' je vn?? prvku."}, {"ER_STRAY_NAMESPACE", "Deklarace oboru n??zv?? ''{0}''=''{1}'' je vn?? prvku."}, {"ER_COULD_NOT_LOAD_RESOURCE", "Nelze zav??st ''{0}'' (zkontrolujte prom??nnou CLASSPATH), proto se pou????vaj?? pouze v??choz?? hodnoty"}, {"ER_COULD_NOT_LOAD_METHOD_PROPERTY", "Nelze na????st soubor vlastnost?? ''{0}'' pro v??stupn?? metodu ''{1}'' (zkontrolujte prom??nnou CLASSPATH)."}};
   }

   public static final XMLErrorResources loadResourceBundle(String className) throws MissingResourceException {
      Locale locale = Locale.getDefault();
      String suffix = getResourceSuffix(locale);

      try {
         return (XMLErrorResources)ResourceBundle.getBundle(className + suffix, locale);
      } catch (MissingResourceException var6) {
         try {
            return (XMLErrorResources)ResourceBundle.getBundle(className, new Locale("cs", "CZ"));
         } catch (MissingResourceException var5) {
            throw new MissingResourceException("Could not load any resource bundles.", className, "");
         }
      }
   }

   private static final String getResourceSuffix(Locale locale) {
      String suffix = "_" + locale.getLanguage();
      String country = locale.getCountry();
      if (country.equals("TW")) {
         suffix = suffix + "_" + country;
      }

      return suffix;
   }
}
