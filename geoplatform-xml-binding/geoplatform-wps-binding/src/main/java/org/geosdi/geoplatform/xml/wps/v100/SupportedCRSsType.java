//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.16 at 12:48:05 PM CEST 
//


package org.geosdi.geoplatform.xml.wps.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Listing of the Coordinate Reference System (CRS) support for this process input or output. 
 * 
 * <p>Java class for SupportedCRSsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedCRSsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Default">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CRS" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Supported" type="{http://www.opengis.net/wps/1.0.0}CRSsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedCRSsType", propOrder = {
    "_default",
    "supported"
})
public class SupportedCRSsType
    implements ToString
{

    @XmlElement(name = "Default", namespace = "", required = true)
    protected SupportedCRSsType.Default _default;
    @XmlElement(name = "Supported", namespace = "", required = true)
    protected CRSsType supported;

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCRSsType.Default }
     *     
     */
    public SupportedCRSsType.Default getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCRSsType.Default }
     *     
     */
    public void setDefault(SupportedCRSsType.Default value) {
        this._default = value;
    }

    public boolean isSetDefault() {
        return (this._default!= null);
    }

    /**
     * Gets the value of the supported property.
     * 
     * @return
     *     possible object is
     *     {@link CRSsType }
     *     
     */
    public CRSsType getSupported() {
        return supported;
    }

    /**
     * Sets the value of the supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSsType }
     *     
     */
    public void setSupported(CRSsType value) {
        this.supported = value;
    }

    public boolean isSetSupported() {
        return (this.supported!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            SupportedCRSsType.Default theDefault;
            theDefault = this.getDefault();
            strategy.appendField(locator, this, "_default", buffer, theDefault);
        }
        {
            CRSsType theSupported;
            theSupported = this.getSupported();
            strategy.appendField(locator, this, "supported", buffer, theSupported);
        }
        return buffer;
    }


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
     *         &lt;element name="CRS" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
        "crs"
    })
    public static class Default
        implements ToString
    {

        @XmlElement(name = "CRS", namespace = "", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String crs;

        /**
         * Gets the value of the crs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRS() {
            return crs;
        }

        /**
         * Sets the value of the crs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRS(String value) {
            this.crs = value;
        }

        public boolean isSetCRS() {
            return (this.crs!= null);
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theCRS;
                theCRS = this.getCRS();
                strategy.appendField(locator, this, "crs", buffer, theCRS);
            }
            return buffer;
        }

    }

}