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
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for LI_Source_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LI_Source_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="scaleDenominator" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceReferenceSystem" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceExtent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sourceStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_Source_Type", propOrder = {
    "description",
    "scaleDenominator",
    "sourceReferenceSystem",
    "sourceCitation",
    "sourceExtent",
    "sourceStep"
})
public class LISourceType
    extends AbstractObjectType
    implements ToString
{

    protected CharacterStringPropertyType description;
    protected MDRepresentativeFractionPropertyType scaleDenominator;
    protected MDReferenceSystemPropertyType sourceReferenceSystem;
    protected CICitationPropertyType sourceCitation;
    protected List<EXExtentPropertyType> sourceExtent;
    protected List<LIProcessStepPropertyType> sourceStep;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the scaleDenominator property.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getScaleDenominator() {
        return scaleDenominator;
    }

    /**
     * Sets the value of the scaleDenominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setScaleDenominator(MDRepresentativeFractionPropertyType value) {
        this.scaleDenominator = value;
    }

    public boolean isSetScaleDenominator() {
        return (this.scaleDenominator!= null);
    }

    /**
     * Gets the value of the sourceReferenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public MDReferenceSystemPropertyType getSourceReferenceSystem() {
        return sourceReferenceSystem;
    }

    /**
     * Sets the value of the sourceReferenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public void setSourceReferenceSystem(MDReferenceSystemPropertyType value) {
        this.sourceReferenceSystem = value;
    }

    public boolean isSetSourceReferenceSystem() {
        return (this.sourceReferenceSystem!= null);
    }

    /**
     * Gets the value of the sourceCitation property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSourceCitation() {
        return sourceCitation;
    }

    /**
     * Sets the value of the sourceCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSourceCitation(CICitationPropertyType value) {
        this.sourceCitation = value;
    }

    public boolean isSetSourceCitation() {
        return (this.sourceCitation!= null);
    }

    /**
     * Gets the value of the sourceExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getSourceExtent() {
        if (sourceExtent == null) {
            sourceExtent = new ArrayList<EXExtentPropertyType>();
        }
        return this.sourceExtent;
    }

    public boolean isSetSourceExtent() {
        return ((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()));
    }

    public void unsetSourceExtent() {
        this.sourceExtent = null;
    }

    /**
     * Gets the value of the sourceStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getSourceStep() {
        if (sourceStep == null) {
            sourceStep = new ArrayList<LIProcessStepPropertyType>();
        }
        return this.sourceStep;
    }

    public boolean isSetSourceStep() {
        return ((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()));
    }

    public void unsetSourceStep() {
        this.sourceStep = null;
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
            CharacterStringPropertyType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            MDRepresentativeFractionPropertyType theScaleDenominator;
            theScaleDenominator = this.getScaleDenominator();
            strategy.appendField(locator, this, "scaleDenominator", buffer, theScaleDenominator);
        }
        {
            MDReferenceSystemPropertyType theSourceReferenceSystem;
            theSourceReferenceSystem = this.getSourceReferenceSystem();
            strategy.appendField(locator, this, "sourceReferenceSystem", buffer, theSourceReferenceSystem);
        }
        {
            CICitationPropertyType theSourceCitation;
            theSourceCitation = this.getSourceCitation();
            strategy.appendField(locator, this, "sourceCitation", buffer, theSourceCitation);
        }
        {
            List<EXExtentPropertyType> theSourceExtent;
            theSourceExtent = (this.isSetSourceExtent()?this.getSourceExtent():null);
            strategy.appendField(locator, this, "sourceExtent", buffer, theSourceExtent);
        }
        {
            List<LIProcessStepPropertyType> theSourceStep;
            theSourceStep = (this.isSetSourceStep()?this.getSourceStep():null);
            strategy.appendField(locator, this, "sourceStep", buffer, theSourceStep);
        }
        return buffer;
    }

    public void setSourceExtent(List<EXExtentPropertyType> value) {
        this.sourceExtent = null;
        List<EXExtentPropertyType> draftl = this.getSourceExtent();
        draftl.addAll(value);
    }

    public void setSourceStep(List<LIProcessStepPropertyType> value) {
        this.sourceStep = null;
        List<LIProcessStepPropertyType> draftl = this.getSourceStep();
        draftl.addAll(value);
    }

}