//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.12 at 02:01:34 PM EDT 
//


package generated.usps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Number"/>
 *         &lt;element ref="{}Source"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}HelpFile"/>
 *         &lt;element ref="{}HelpContext"/>
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
    "number",
    "source",
    "description",
    "helpFile",
    "helpContext"
})
@XmlRootElement(name = "Error")
public class Error {

    @XmlElement(name = "Number", required = true)
    protected int number;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "HelpFile", required = true)
    protected HelpFile helpFile;
    @XmlElement(name = "HelpContext", required = true)
    protected int helpContext;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the helpFile property.
     * 
     * @return
     *     possible object is
     *     {@link HelpFile }
     *     
     */
    public HelpFile getHelpFile() {
        return helpFile;
    }

    /**
     * Sets the value of the helpFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpFile }
     *     
     */
    public void setHelpFile(HelpFile value) {
        this.helpFile = value;
    }

    /**
     * Gets the value of the helpContext property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getHelpContext() {
        return helpContext;
    }

    /**
     * Sets the value of the helpContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setHelpContext(int value) {
        this.helpContext = value;
    }

}
