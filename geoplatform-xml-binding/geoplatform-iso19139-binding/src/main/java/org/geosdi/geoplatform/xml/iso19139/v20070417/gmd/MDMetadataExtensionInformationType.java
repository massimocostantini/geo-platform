//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20070417.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.AbstractObjectType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Information describing metadata extensions.
 * 
 * <p>Java class for MD_MetadataExtensionInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_MetadataExtensionInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="extensionOnLineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         &lt;element name="extendedElementInformation" type="{http://www.isotc211.org/2005/gmd}MD_ExtendedElementInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MetadataExtensionInformation_Type", propOrder = {
    "extensionOnLineResource",
    "extendedElementInformation"
})
public class MDMetadataExtensionInformationType
    extends AbstractObjectType
    implements ToString
{

    protected CIOnlineResourcePropertyType extensionOnLineResource;
    protected List<MDExtendedElementInformationPropertyType> extendedElementInformation;

    /**
     * Gets the value of the extensionOnLineResource property.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getExtensionOnLineResource() {
        return extensionOnLineResource;
    }

    /**
     * Sets the value of the extensionOnLineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setExtensionOnLineResource(CIOnlineResourcePropertyType value) {
        this.extensionOnLineResource = value;
    }

    public boolean isSetExtensionOnLineResource() {
        return (this.extensionOnLineResource!= null);
    }

    /**
     * Gets the value of the extendedElementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedElementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedElementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDExtendedElementInformationPropertyType }
     * 
     * 
     */
    public List<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
        if (extendedElementInformation == null) {
            extendedElementInformation = new ArrayList<MDExtendedElementInformationPropertyType>();
        }
        return this.extendedElementInformation;
    }

    public boolean isSetExtendedElementInformation() {
        return ((this.extendedElementInformation!= null)&&(!this.extendedElementInformation.isEmpty()));
    }

    public void unsetExtendedElementInformation() {
        this.extendedElementInformation = null;
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
        super.appendFields(locator, buffer, strategy);
        {
            CIOnlineResourcePropertyType theExtensionOnLineResource;
            theExtensionOnLineResource = this.getExtensionOnLineResource();
            strategy.appendField(locator, this, "extensionOnLineResource", buffer, theExtensionOnLineResource);
        }
        {
            List<MDExtendedElementInformationPropertyType> theExtendedElementInformation;
            theExtendedElementInformation = (this.isSetExtendedElementInformation()?this.getExtendedElementInformation():null);
            strategy.appendField(locator, this, "extendedElementInformation", buffer, theExtendedElementInformation);
        }
        return buffer;
    }

    public void setExtendedElementInformation(List<MDExtendedElementInformationPropertyType> value) {
        this.extendedElementInformation = null;
        List<MDExtendedElementInformationPropertyType> draftl = this.getExtendedElementInformation();
        draftl.addAll(value);
    }

}
