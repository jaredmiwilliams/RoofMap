//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.27 at 04:45:41 PM EDT 
//


package generated.dmv;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nysdmv.dmvamsws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CARROUTE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "CAR_ROUTE");
    private final static QName _MAINPOSTATE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "MAIN_PO_STATE");
    private final static QName _CARRRT_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "CARR_RT");
    private final static QName _STDSTATE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STD_STATE");
    private final static QName _RECTYPE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "REC_TYPE");
    private final static QName _RETURNCDE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "RETURN_CDE");
    private final static QName _FIPSCODE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "FIPS_CODE");
    private final static QName _STDCITY_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STD_CITY");
    private final static QName _CONGRESSDIST_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "CONGRESS_DIST");
    private final static QName _PRIMHIGH_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "PRIM_HIGH");
    private final static QName _DELPOINTCODE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "DEL_POINT_CODE");
    private final static QName _CITY_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "CITY");
    private final static QName _PRIMLOW_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "PRIM_LOW");
    private final static QName _ADDONLOW_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ADDON_LOW");
    private final static QName _SUFFIX_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "SUFFIX");
    private final static QName _ADDRESS_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ADDRESS");
    private final static QName _ZIPCODE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ZIP_CODE");
    private final static QName _ZIPADDON_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ZIP_ADDON");
    private final static QName _STRNAME_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STR_NAME");
    private final static QName _STDDELIVADDR_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STD_DELIV_ADDR");
    private final static QName _MESSAGETEXT1_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "MESSAGE_TEXT1");
    private final static QName _ZIP_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ZIP");
    private final static QName _COUNTYNO_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "COUNTY_NO");
    private final static QName _MAINPOCITY_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "MAIN_PO_CITY");
    private final static QName _LASTLINE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "LAST_LINE");
    private final static QName _DISPOSITION_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "DISPOSITION");
    private final static QName _ACTIONCODE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ACTION_CODE");
    private final static QName _NUMBERRESPONSES_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "NUMBER_RESPONSES");
    private final static QName _STATE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STATE");
    private final static QName _PRIMCODE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "PRIM_CODE");
    private final static QName _FINANCE_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "FINANCE");
    private final static QName _ADDONHIGH_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "ADDON_HIGH");
    private final static QName _STDCSZ_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "STD_CSZ");
    private final static QName _PRIMARYNUMBER_QNAME = new QName("http://www.nysdmv.com/DMVAMSWS/", "PRIMARY_NUMBER");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nysdmv.dmvamsws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ADDRESSRECORDS }
     * 
     */
    public ADDRESSRECORDS createADDRESSRECORDS() {
        return new ADDRESSRECORDS();
    }

    /**
     * Create an instance of {@link ADMINUSER }
     * 
     */
    public ADMINUSER createADMINUSER() {
        return new ADMINUSER();
    }

    /**
     * Create an instance of {@link AmsValidateResponse }
     * 
     */
    public AmsValidateResponse createAmsValidateResponse() {
        return new AmsValidateResponse();
    }

    /**
     * Create an instance of {@link BASEALTCODE }
     * 
     */
    public BASEALTCODE createBASEALTCODE() {
        return new BASEALTCODE();
    }

    /**
     * Create an instance of {@link SECLOW }
     * 
     */
    public SECLOW createSECLOW() {
        return new SECLOW();
    }

    /**
     * Create an instance of {@link INPUT }
     * 
     */
    public INPUT createINPUT() {
        return new INPUT();
    }

    /**
     * Create an instance of {@link SECONDSTDDELIVADDR }
     * 
     */
    public SECONDSTDDELIVADDR createSECONDSTDDELIVADDR() {
        return new SECONDSTDDELIVADDR();
    }

    /**
     * Create an instance of {@link STDFIRMNAME }
     * 
     */
    public STDFIRMNAME createSTDFIRMNAME() {
        return new STDFIRMNAME();
    }

    /**
     * Create an instance of {@link ADDRESSRECORD }
     * 
     */
    public ADDRESSRECORD createADDRESSRECORD() {
        return new ADDRESSRECORD();
    }

    /**
     * Create an instance of {@link UNIT }
     * 
     */
    public UNIT createUNIT() {
        return new UNIT();
    }

    /**
     * Create an instance of {@link MUNICIPALITY }
     * 
     */
    public MUNICIPALITY createMUNICIPALITY() {
        return new MUNICIPALITY();
    }

    /**
     * Create an instance of {@link POSTDIR }
     * 
     */
    public POSTDIR createPOSTDIR() {
        return new POSTDIR();
    }

    /**
     * Create an instance of {@link UPDATEKEY }
     * 
     */
    public UPDATEKEY createUPDATEKEY() {
        return new UPDATEKEY();
    }

    /**
     * Create an instance of {@link SECONDARYNUMBER }
     * 
     */
    public SECONDARYNUMBER createSECONDARYNUMBER() {
        return new SECONDARYNUMBER();
    }

    /**
     * Create an instance of {@link PREDIR }
     * 
     */
    public PREDIR createPREDIR() {
        return new PREDIR();
    }

    /**
     * Create an instance of {@link SECHIGH }
     * 
     */
    public SECHIGH createSECHIGH() {
        return new SECHIGH();
    }

    /**
     * Create an instance of {@link SYSTEMMESSAGES }
     * 
     */
    public SYSTEMMESSAGES createSYSTEMMESSAGES() {
        return new SYSTEMMESSAGES();
    }

    /**
     * Create an instance of {@link SECNAME }
     * 
     */
    public SECNAME createSECNAME() {
        return new SECNAME();
    }

    /**
     * Create an instance of {@link AmsValidateResult }
     * 
     */
    public AmsValidateResult createAmsValidateResult() {
        return new AmsValidateResult();
    }

    /**
     * Create an instance of {@link STATEABBREV }
     * 
     */
    public STATEABBREV createSTATEABBREV() {
        return new STATEABBREV();
    }

    /**
     * Create an instance of {@link OUTPUT }
     * 
     */
    public OUTPUT createOUTPUT() {
        return new OUTPUT();
    }

    /**
     * Create an instance of {@link SECCODE }
     * 
     */
    public SECCODE createSECCODE() {
        return new SECCODE();
    }

    /**
     * Create an instance of {@link URBANIZATION }
     * 
     */
    public URBANIZATION createURBANIZATION() {
        return new URBANIZATION();
    }

    /**
     * Create an instance of {@link ADMINTRANSACTION }
     * 
     */
    public ADMINTRANSACTION createADMINTRANSACTION() {
        return new ADMINTRANSACTION();
    }

    /**
     * Create an instance of {@link STDCITYABBRV }
     * 
     */
    public STDCITYABBRV createSTDCITYABBRV() {
        return new STDCITYABBRV();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "CAR_ROUTE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCARROUTE(String value) {
        return new JAXBElement<String>(_CARROUTE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "MAIN_PO_STATE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMAINPOSTATE(String value) {
        return new JAXBElement<String>(_MAINPOSTATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "CARR_RT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCARRRT(String value) {
        return new JAXBElement<String>(_CARRRT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STD_STATE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSTDSTATE(String value) {
        return new JAXBElement<String>(_STDSTATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "REC_TYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRECTYPE(String value) {
        return new JAXBElement<String>(_RECTYPE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "RETURN_CDE")
    public JAXBElement<BigInteger> createRETURNCDE(BigInteger value) {
        return new JAXBElement<BigInteger>(_RETURNCDE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "FIPS_CODE")
    public JAXBElement<BigInteger> createFIPSCODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_FIPSCODE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STD_CITY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSTDCITY(String value) {
        return new JAXBElement<String>(_STDCITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "CONGRESS_DIST")
    public JAXBElement<BigInteger> createCONGRESSDIST(BigInteger value) {
        return new JAXBElement<BigInteger>(_CONGRESSDIST_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "PRIM_HIGH")
    public JAXBElement<BigInteger> createPRIMHIGH(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRIMHIGH_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "DEL_POINT_CODE")
    public JAXBElement<BigInteger> createDELPOINTCODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_DELPOINTCODE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "CITY")
    public JAXBElement<String> createCITY(String value) {
        return new JAXBElement<String>(_CITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "PRIM_LOW")
    public JAXBElement<BigInteger> createPRIMLOW(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRIMLOW_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ADDON_LOW")
    public JAXBElement<BigInteger> createADDONLOW(BigInteger value) {
        return new JAXBElement<BigInteger>(_ADDONLOW_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "SUFFIX")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSUFFIX(String value) {
        return new JAXBElement<String>(_SUFFIX_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ADDRESS")
    public JAXBElement<String> createADDRESS(String value) {
        return new JAXBElement<String>(_ADDRESS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ZIP_CODE")
    public JAXBElement<BigInteger> createZIPCODE(BigInteger value) {
        return new JAXBElement<BigInteger>(_ZIPCODE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ZIP_ADDON")
    public JAXBElement<BigInteger> createZIPADDON(BigInteger value) {
        return new JAXBElement<BigInteger>(_ZIPADDON_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STR_NAME")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSTRNAME(String value) {
        return new JAXBElement<String>(_STRNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STD_DELIV_ADDR")
    public JAXBElement<String> createSTDDELIVADDR(String value) {
        return new JAXBElement<String>(_STDDELIVADDR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "MESSAGE_TEXT1")
    public JAXBElement<String> createMESSAGETEXT1(String value) {
        return new JAXBElement<String>(_MESSAGETEXT1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ZIP")
    public JAXBElement<String> createZIP(String value) {
        return new JAXBElement<String>(_ZIP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "COUNTY_NO")
    public JAXBElement<BigInteger> createCOUNTYNO(BigInteger value) {
        return new JAXBElement<BigInteger>(_COUNTYNO_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "MAIN_PO_CITY")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMAINPOCITY(String value) {
        return new JAXBElement<String>(_MAINPOCITY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "LAST_LINE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLASTLINE(String value) {
        return new JAXBElement<String>(_LASTLINE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "DISPOSITION")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDISPOSITION(String value) {
        return new JAXBElement<String>(_DISPOSITION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ACTION_CODE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createACTIONCODE(String value) {
        return new JAXBElement<String>(_ACTIONCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "NUMBER_RESPONSES")
    public JAXBElement<BigInteger> createNUMBERRESPONSES(BigInteger value) {
        return new JAXBElement<BigInteger>(_NUMBERRESPONSES_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STATE")
    public JAXBElement<String> createSTATE(String value) {
        return new JAXBElement<String>(_STATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "PRIM_CODE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPRIMCODE(String value) {
        return new JAXBElement<String>(_PRIMCODE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "FINANCE")
    public JAXBElement<BigInteger> createFINANCE(BigInteger value) {
        return new JAXBElement<BigInteger>(_FINANCE_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "ADDON_HIGH")
    public JAXBElement<BigInteger> createADDONHIGH(BigInteger value) {
        return new JAXBElement<BigInteger>(_ADDONHIGH_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "STD_CSZ")
    public JAXBElement<String> createSTDCSZ(String value) {
        return new JAXBElement<String>(_STDCSZ_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nysdmv.com/DMVAMSWS/", name = "PRIMARY_NUMBER")
    public JAXBElement<BigInteger> createPRIMARYNUMBER(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRIMARYNUMBER_QNAME, BigInteger.class, null, value);
    }

}
