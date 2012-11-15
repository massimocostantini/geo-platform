//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.02 at 06:49:13 PM CET 
//
package org.geosdi.geoplatform.xml.xsd.v2001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 * <p>Java class for attribute complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="attribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;sequence>
 *         &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="use" default="optional">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="prohibited"/>
 *             &lt;enumeration value="optional"/>
 *             &lt;enumeration value="required"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}formChoice" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attribute", propOrder = {
    "simpleType"
})
@XmlSeeAlso({
    TopLevelAttribute.class
})
public class Attribute
        extends Annotated
        implements ToString {

    protected LocalSimpleType simpleType;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "use")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String use;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "fixed")
    protected String fixed;
    @XmlAttribute(name = "form")
    protected FormChoice form;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;

    /**
     * Gets the value of the simpleType property.
     *
     * @return possible object is {@link LocalSimpleType }
     *
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * Sets the value of the simpleType property.
     *
     * @param value allowed object is {@link LocalSimpleType }
     *
     */
    public void setSimpleType(LocalSimpleType value) {
        this.simpleType = value;
    }

    public boolean isSetSimpleType() {
        return (this.simpleType != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link QName }
     *
     */
    public QName getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link QName }
     *
     */
    public void setType(QName value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the use property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUse() {
        if (use == null) {
            return "optional";
        } else {
            return use;
        }
    }

    /**
     * Sets the value of the use property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUse(String value) {
        this.use = value;
    }

    public boolean isSetUse() {
        return (this.use != null);
    }

    /**
     * Gets the value of the default property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDefault(String value) {
        this._default = value;
    }

    public boolean isSetDefault() {
        return (this._default != null);
    }

    /**
     * Gets the value of the fixed property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFixed(String value) {
        this.fixed = value;
    }

    public boolean isSetFixed() {
        return (this.fixed != null);
    }

    /**
     * Gets the value of the form property.
     *
     * @return possible object is {@link FormChoice }
     *
     */
    public FormChoice getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     *
     * @param value allowed object is {@link FormChoice }
     *
     */
    public void setForm(FormChoice value) {
        this.form = value;
    }

    public boolean isSetForm() {
        return (this.form != null);
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    /**
     * Gets the value of the ref property.
     *
     * @return possible object is {@link QName }
     *
     */
    public QName getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value allowed object is {@link QName }
     *
     */
    public void setRef(QName value) {
        this.ref = value;
    }

    public boolean isSetRef() {
        return (this.ref != null);
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
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType);
        }
        {
            QName theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theUse;
            theUse = this.getUse();
            strategy.appendField(locator, this, "use", buffer, theUse);
        }
        {
            String theDefault;
            theDefault = this.getDefault();
            strategy.appendField(locator, this, "_default", buffer, theDefault);
        }
        {
            String theFixed;
            theFixed = this.getFixed();
            strategy.appendField(locator, this, "fixed", buffer, theFixed);
        }
        {
            FormChoice theForm;
            theForm = this.getForm();
            strategy.appendField(locator, this, "form", buffer, theForm);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            QName theRef;
            theRef = this.getRef();
            strategy.appendField(locator, this, "ref", buffer, theRef);
        }
        return buffer;
    }
}