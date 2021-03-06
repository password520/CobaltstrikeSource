package org.apache.xml.res;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class XMLErrorResources_hu extends ListResourceBundle {
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
      return new Object[][]{{"ER0000", "{0}"}, {"ER_FUNCTION_NOT_SUPPORTED", "A f??ggv??ny nem t??mogatott!"}, {"ER_CANNOT_OVERWRITE_CAUSE", "Nem lehet fel??l??rni az okot"}, {"ER_NO_DEFAULT_IMPL", "Nem tal??ltunk alap??rtelmezett megval??s??t??st "}, {"ER_CHUNKEDINTARRAY_NOT_SUPPORTED", "A ChunkedIntArray({0}) jelenleg nem t??mogatott"}, {"ER_OFFSET_BIGGER_THAN_SLOT", "Az eltol??s nagyobb mint a ny??l??s"}, {"ER_COROUTINE_NOT_AVAIL", "T??rs-szubrutin nem ??rhet?? el, id={0}"}, {"ER_COROUTINE_CO_EXIT", "CoroutineManager ??rkezett a co_exit() k??r??sre"}, {"ER_COJOINROUTINESET_FAILED", "A co_joinCoroutineSet() nem siker??lt"}, {"ER_COROUTINE_PARAM", "T??rs-szubrutin param??ter hiba ({0})"}, {"ER_PARSER_DOTERMINATE_ANSWERS", "\nV??RATLAN: elemz?? doTerminate v??laszok {0}"}, {"ER_NO_PARSE_CALL_WHILE_PARSING", "A parse-t nem h??vhatja meg a elemz??s k??zben"}, {"ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED", "Hiba: A t??pusos iter??tor a(z) {0} tengelyhez nincs megval??s??tva"}, {"ER_ITERATOR_AXIS_NOT_IMPLEMENTED", "Hiba: Az iter??tor a(z) {0} tengelyhez nincs megval??s??tva "}, {"ER_ITERATOR_CLONE_NOT_SUPPORTED", "Az iter??tor kl??nok nem t??mogatottak"}, {"ER_UNKNOWN_AXIS_TYPE", "Ismeretlen tengelytraverz??l-t??pus: {0}"}, {"ER_AXIS_NOT_SUPPORTED", "Tengelytraverz??l nem t??mogatott: {0}"}, {"ER_NO_DTMIDS_AVAIL", "Nincs t??bb DTM ID"}, {"ER_NOT_SUPPORTED", "Nem t??mogatott: {0}"}, {"ER_NODE_NON_NULL", "A csom??pint nem-null kell legyen a getDTMHandleFromNode-hoz"}, {"ER_COULD_NOT_RESOLVE_NODE", "Nem lehet a csom??pontot hivatkoz??sra feloldani"}, {"ER_STARTPARSE_WHILE_PARSING", "A startParse-t nem h??vhatja elemz??s k??zben"}, {"ER_STARTPARSE_NEEDS_SAXPARSER", "A startParse-nak nem-null SAXParser kell"}, {"ER_COULD_NOT_INIT_PARSER", "Nem lehet inicializ??lni az elemz??t ezzel"}, {"ER_EXCEPTION_CREATING_POOL", "kiv??tel egy ??j pool p??ld??ny l??trehoz??s??n??l"}, {"ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "Az el??r??i ??t ??rv??nytelen eszk??pszekvenci??t tartalmaz"}, {"ER_SCHEME_REQUIRED", "S??m??ra sz??ks??g van!"}, {"ER_NO_SCHEME_IN_URI", "Nem tal??lhat?? s??ma az URI-ban: {0}"}, {"ER_NO_SCHEME_INURI", "Nem tal??lhat?? s??ma az URI-ban"}, {"ER_PATH_INVALID_CHAR", "Az el??r??si ??t ??rv??nytelen karaktert tartalmaz: {0}"}, {"ER_SCHEME_FROM_NULL_STRING", "Nem lehet be??ll??tani a s??m??t null karakterl??ncb??l"}, {"ER_SCHEME_NOT_CONFORMANT", "A s??ma nem megfelel??."}, {"ER_HOST_ADDRESS_NOT_WELLFORMED", "A host nem j??l form??zott c??m"}, {"ER_PORT_WHEN_HOST_NULL", "A port-t nem ??ll??thatja be, ha a host null"}, {"ER_INVALID_PORT", "??rv??nytelen portsz??m"}, {"ER_FRAG_FOR_GENERIC_URI", "Darabot csak egy ??ltal??nos URI-hoz ??ll??that be"}, {"ER_FRAG_WHEN_PATH_NULL", "A darabot csak nem ??ll??thatja be, h?? az el??r??si ??t null"}, {"ER_FRAG_INVALID_CHAR", "A darab ??rv??nytelen karaktert tartalmaz"}, {"ER_PARSER_IN_USE", "Az elemz?? m??r haszn??latban van"}, {"ER_CANNOT_CHANGE_WHILE_PARSING", "Nem v??ltoztathat?? meg a(z) {0} {1} elemz??s k??zben"}, {"ER_SELF_CAUSATION_NOT_PERMITTED", "Az ??n-megokol??s nem megengedett"}, {"ER_NO_USERINFO_IF_NO_HOST", "Nem adhat meg userinfo-t, ha nem adott meg host-ot"}, {"ER_NO_PORT_IF_NO_HOST", "Nem adhat meg port-ot, ha nem adott meg host-ot"}, {"ER_NO_QUERY_STRING_IN_PATH", "Lek??rdez??si karakterl??ncot nem adhat meg el??r??si ??tban ??s lek??rdez??si karakterl??ncban"}, {"ER_NO_FRAGMENT_STRING_IN_PATH", "Darabot nem adhat meg sem az el??r??si ??tban sem a darabban"}, {"ER_CANNOT_INIT_URI_EMPTY_PARMS", "Nem inicializ??lhatja az URI-t ??res param??terekkel"}, {"ER_METHOD_NOT_SUPPORTED", "A met??dus m??g nem t??mogatott "}, {"ER_INCRSAXSRCFILTER_NOT_RESTARTABLE", "Az IncrementalSAXSource_Filter jelenleg nem ??nd??that?? ??jra"}, {"ER_XMLRDR_NOT_BEFORE_STARTPARSE", "XMLReader nem a startParse k??r??s el??tt"}, {"ER_AXIS_TRAVERSER_NOT_SUPPORTED", "Tengelytraverz??l nem t??mogatott: {0}"}, {"ER_ERRORHANDLER_CREATED_WITH_NULL_PRINTWRITER", "A ListingErrorHandler l??trej??tt null PrintWriter-rel!"}, {"ER_SYSTEMID_UNKNOWN", "Ismeretlen SystemId"}, {"ER_LOCATION_UNKNOWN", "A hiba helye ismeretlen"}, {"ER_PREFIX_MUST_RESOLVE", "Az el??tagnak egy n??vt??rre kell felold??dnia: {0}"}, {"ER_CREATEDOCUMENT_NOT_SUPPORTED", "A createDocument() nem t??mogatott az XPathContext-ben!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT", "Az attrib??tum lesz??rmazottnak nincs tulajdonos dokumentuma!"}, {"ER_CHILD_HAS_NO_OWNER_DOCUMENT_ELEMENT", "Az attrib??tum lesz??rmazottnak nincs tulajdonos dokumentum eleme!"}, {"ER_CANT_OUTPUT_TEXT_BEFORE_DOC", "Figyelmeztet??s: nem lehet sz??veget ki??rni dokumentum elem el??tt!  Figyelmen k??v??l marad..."}, {"ER_CANT_HAVE_MORE_THAN_ONE_ROOT", "Nem lehet egyn??l t??bb gy??k??r a DOM-on!"}, {"ER_ARG_LOCALNAME_NULL", "A 'localName' argumentum null"}, {"ER_ARG_LOCALNAME_INVALID", "A QNAME-beli helyi n??vnek egy ??rv??nyes NCName-nek kell lenni"}, {"ER_ARG_PREFIX_INVALID", "A QNAME-beli prefixnek egy ??rv??nyes NCName-nek kell lenni"}, {"BAD_CODE", "A createMessage param??tere nincs a megfelel?? tartom??nyban"}, {"FORMAT_FAILED", "Kiv??tel t??rt??nt a messageFormat h??v??s alatt"}, {"line", "Sor #"}, {"column", "Oszlop #"}, {"ER_SERIALIZER_NOT_CONTENTHANDLER", "A(z) ''{0}'' serializer oszt??ly nem val??s??tja meg az org.xml.sax.ContentHandler funkci??t."}, {"ER_RESOURCE_COULD_NOT_FIND", "A(z) [ {0} ] er??forr??s nem tal??lhat??.\n {1}"}, {"ER_RESOURCE_COULD_NOT_LOAD", "Az er??forr??st [ {0} ] nem lehet bet??lteni: {1} \n {2} \t {3}"}, {"ER_BUFFER_SIZE_LESSTHAN_ZERO", "Pufferm??ret <= 0"}, {"ER_INVALID_UTF16_SURROGATE", "??rv??nytelen UTF-16 helyettes??t??s: {0} ?"}, {"ER_OIERROR", "IO hiba"}, {"ER_ILLEGAL_ATTRIBUTE_POSITION", "Nem lehet {0} attrib??tumat felvenni a gyermek node-ok ut??n vagy miel??tt egy elem l??trej??nne.  Az attrib??tum figyelmen k??v??l marad."}, {"ER_NAMESPACE_PREFIX", "A(z) ''{0}'' el??tag n??vtere nem defini??lt."}, {"ER_STRAY_ATTIRBUTE", "A(z) ''{0}'' attrib??tum k??v??l esik az elemen."}, {"ER_STRAY_NAMESPACE", "A(z) ''{0}''=''{1}'' n??vt??r-deklar??ci?? k??v??l esik az elemen."}, {"ER_COULD_NOT_LOAD_RESOURCE", "Nem lehet bet??lteni ''{0}''-t (ellen??rizze a CLASSPATH be??ll??t??st), az alap??rtelmez??seket haszn??lom"}, {"ER_COULD_NOT_LOAD_METHOD_PROPERTY", "Nem lehet bet??lteni a(z) ''{0}'' tulajdons??g-f??jlt a(z) ''{1}''  (ellen??rizze a CLASSPATH be??ll??t??st)"}};
   }

   public static final XMLErrorResources loadResourceBundle(String className) throws MissingResourceException {
      Locale locale = Locale.getDefault();
      String suffix = getResourceSuffix(locale);

      try {
         return (XMLErrorResources)ResourceBundle.getBundle(className + suffix, locale);
      } catch (MissingResourceException var6) {
         try {
            return (XMLErrorResources)ResourceBundle.getBundle(className, new Locale("hu", "HU"));
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
