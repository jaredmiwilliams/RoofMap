//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.12 at 02:01:34 PM EDT 
//


package generated.usps;

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
 * generated in the generated package. 
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

    private final static QName _Source_QNAME = new QName("", "Source");
    private final static QName _Zip4_QNAME = new QName("", "Zip4");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _State_QNAME = new QName("", "State");
    private final static QName _Address1_QNAME = new QName("", "Address1");
    private final static QName _Address2_QNAME = new QName("", "Address2");
    private final static QName _Zip5_QNAME = new QName("", "Zip5");
    private final static QName _Number_QNAME = new QName("", "Number");
    private final static QName _HelpContext_QNAME = new QName("", "HelpContext");
    private final static QName _City_QNAME = new QName("", "City");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelpFile }
     * 
     */
    public HelpFile createHelpFile() {
        return new HelpFile();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressValidateResponse }
     * 
     */
    public AddressValidateResponse createAddressValidateResponse() {
        return new AddressValidateResponse();
    }

    /**
     * Create an instance of {@link CityStateLookupResponse }
     * 
     */
    public CityStateLookupResponse createCityStateLookupResponse() {
        return new CityStateLookupResponse();
    }

    /**
     * Create an instance of {@link ZipCodeLookupResponse }
     * 
     */
    public ZipCodeLookupResponse createZipCodeLookupResponse() {
        return new ZipCodeLookupResponse();
    }
    
    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ZipCode }
     * 
     */
    public ZipCode createZipCode() {
        return new ZipCode();
    }
    
    /**
     * Create an instance of {@link HelpContext }
     * 
     */
    public HelpContext createHelpContext() {
        return new HelpContext();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Zip4")
    public JAXBElement<BigInteger> createZip4(BigInteger value) {
        return new JAXBElement<BigInteger>(_Zip4_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address1")
    public JAXBElement<String> createAddress1(String value) {
        return new JAXBElement<String>(_Address1_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address2")
    public JAXBElement<String> createAddress2(String value) {
        return new JAXBElement<String>(_Address2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Zip5")
    public JAXBElement<BigInteger> createZip5(BigInteger value) {
        return new JAXBElement<BigInteger>(_Zip5_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Number")
    public JAXBElement<BigInteger> createNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_Number_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HelpContext")
    public JAXBElement<BigInteger> createHelpContext(BigInteger value) {
        return new JAXBElement<BigInteger>(_HelpContext_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

}
