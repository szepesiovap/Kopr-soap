
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucastnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucastnik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priezvisko" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucastnik", propOrder = {
    "id",
    "meno",
    "priezvisko"
})
public class Ucastnik {

    protected String id;
    protected String meno;
    protected String priezvisko;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the meno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeno() {
        return meno;
    }

    /**
     * Sets the value of the meno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeno(String value) {
        this.meno = value;
    }

    /**
     * Gets the value of the priezvisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriezvisko() {
        return priezvisko;
    }

    /**
     * Sets the value of the priezvisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriezvisko(String value) {
        this.priezvisko = value;
    }

}
