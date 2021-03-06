//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.29 at 04:21:09 PM EDT 
//


package generated.bing;

import java.math.BigDecimal;
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
 * generated in the com.microsoft.schemas.search.local.ws.rest.v1 package. 
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

    private final static QName _FormattedAddress_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "FormattedAddress");
    private final static QName _AdminDistrict_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "AdminDistrict");
    private final static QName _Confidence_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Confidence");
    private final static QName _StatusCode_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "StatusCode");
    private final static QName _EastLongitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "EastLongitude");
    private final static QName _CountryRegion_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "CountryRegion");
    private final static QName _TraceId_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "TraceId");
    private final static QName _EntityType_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "EntityType");
    private final static QName _Copyright_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Copyright");
    private final static QName _Latitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Latitude");
    private final static QName _BrandLogoUri_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "BrandLogoUri");
    private final static QName _Longitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Longitude");
    private final static QName _AuthenticationResultCode_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "AuthenticationResultCode");
    private final static QName _EstimatedTotal_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "EstimatedTotal");
    private final static QName _SouthLatitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "SouthLatitude");
    private final static QName _WestLongitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "WestLongitude");
    private final static QName _Name_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Name");
    private final static QName _Locality_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "Locality");
    private final static QName _AdminDistrict2_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "AdminDistrict2");
    private final static QName _NorthLatitude_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "NorthLatitude");
    private final static QName _StatusDescription_QNAME = new QName("http://schemas.microsoft.com/search/local/ws/rest/v1", "StatusDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.search.local.ws.rest.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link BoundingBox }
     * 
     */
    public BoundingBox createBoundingBox() {
        return new BoundingBox();
    }

    /**
     * Create an instance of {@link ResourceSets }
     * 
     */
    public ResourceSets createResourceSets() {
        return new ResourceSets();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResourceSet }
     * 
     */
    public ResourceSet createResourceSet() {
        return new ResourceSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "FormattedAddress")
    public JAXBElement<String> createFormattedAddress(String value) {
        return new JAXBElement<String>(_FormattedAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "AdminDistrict")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdminDistrict(String value) {
        return new JAXBElement<String>(_AdminDistrict_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Confidence")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConfidence(String value) {
        return new JAXBElement<String>(_Confidence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "StatusCode")
    public JAXBElement<BigInteger> createStatusCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_StatusCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "EastLongitude")
    public JAXBElement<BigDecimal> createEastLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EastLongitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "CountryRegion")
    public JAXBElement<String> createCountryRegion(String value) {
        return new JAXBElement<String>(_CountryRegion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "TraceId")
    public JAXBElement<String> createTraceId(String value) {
        return new JAXBElement<String>(_TraceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "EntityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEntityType(String value) {
        return new JAXBElement<String>(_EntityType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Latitude")
    public JAXBElement<BigDecimal> createLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Latitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "BrandLogoUri")
    public JAXBElement<String> createBrandLogoUri(String value) {
        return new JAXBElement<String>(_BrandLogoUri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Longitude")
    public JAXBElement<BigDecimal> createLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Longitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "AuthenticationResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthenticationResultCode(String value) {
        return new JAXBElement<String>(_AuthenticationResultCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "EstimatedTotal")
    public JAXBElement<BigInteger> createEstimatedTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_EstimatedTotal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "SouthLatitude")
    public JAXBElement<BigDecimal> createSouthLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SouthLatitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "WestLongitude")
    public JAXBElement<BigDecimal> createWestLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WestLongitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "Locality")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocality(String value) {
        return new JAXBElement<String>(_Locality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "AdminDistrict2")
    public JAXBElement<String> createAdminDistrict2(String value) {
        return new JAXBElement<String>(_AdminDistrict2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "NorthLatitude")
    public JAXBElement<BigDecimal> createNorthLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NorthLatitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/search/local/ws/rest/v1", name = "StatusDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatusDescription(String value) {
        return new JAXBElement<String>(_StatusDescription_QNAME, String.class, null, value);
    }

}
