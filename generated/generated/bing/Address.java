//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.29 at 04:21:09 PM EDT 
//


package generated.bing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/search/local/ws/rest/v1}AdminDistrict"/>
 *         &lt;element ref="{http://schemas.microsoft.com/search/local/ws/rest/v1}AdminDistrict2"/>
 *         &lt;element ref="{http://schemas.microsoft.com/search/local/ws/rest/v1}CountryRegion"/>
 *         &lt;element ref="{http://schemas.microsoft.com/search/local/ws/rest/v1}FormattedAddress"/>
 *         &lt;element ref="{http://schemas.microsoft.com/search/local/ws/rest/v1}Locality"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adminDistrict",
    "adminDistrict2",
    "countryRegion",
    "formattedAddress",
    "locality"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "AdminDistrict", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String adminDistrict;
    @XmlElement(name = "AdminDistrict2", required = true)
    protected String adminDistrict2;
    @XmlElement(name = "CountryRegion", required = true)
    protected String countryRegion;
    @XmlElement(name = "FormattedAddress", required = true)
    protected String formattedAddress;
    @XmlElement(name = "Locality", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String locality;

    /**
     * Gets the value of the adminDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminDistrict() {
        return adminDistrict;
    }

    /**
     * Sets the value of the adminDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminDistrict(String value) {
        this.adminDistrict = value;
    }

    /**
     * Gets the value of the adminDistrict2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminDistrict2() {
        return adminDistrict2;
    }

    /**
     * Sets the value of the adminDistrict2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminDistrict2(String value) {
        this.adminDistrict2 = value;
    }

    /**
     * Gets the value of the countryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegion() {
        return countryRegion;
    }

    /**
     * Sets the value of the countryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegion(String value) {
        this.countryRegion = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

}
