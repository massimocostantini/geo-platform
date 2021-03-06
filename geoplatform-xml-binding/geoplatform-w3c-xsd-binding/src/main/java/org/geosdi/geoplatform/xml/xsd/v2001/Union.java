//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.02 at 06:49:13 PM CET 
//
package org.geosdi.geoplatform.xml.xsd.v2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 *
 * memberTypes attribute must be non-empty or there must be at least one
 * simpleType child
 *
 *
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;sequence>
 *         &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="memberTypes">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}QName" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleType"
})
@XmlRootElement(name = "union")
public class Union
        extends Annotated
        implements ToString {

    protected List<LocalSimpleType> simpleType;
    @XmlAttribute(name = "memberTypes")
    protected List<QName> memberTypes;

    /**
     * Gets the value of the simpleType property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the simpleType property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleType().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link LocalSimpleType }
     *
     *
     */
    public List<LocalSimpleType> getSimpleType() {
        if (simpleType == null) {
            simpleType = new ArrayList<LocalSimpleType>();
        }
        return this.simpleType;
    }

    public boolean isSetSimpleType() {
        return ((this.simpleType != null) && (!this.simpleType.isEmpty()));
    }

    public void unsetSimpleType() {
        this.simpleType = null;
    }

    /**
     * Gets the value of the memberTypes property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the memberTypes property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getMemberTypes().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link QName }
     *
     *
     */
    public List<QName> getMemberTypes() {
        if (memberTypes == null) {
            memberTypes = new ArrayList<QName>();
        }
        return this.memberTypes;
    }

    public boolean isSetMemberTypes() {
        return ((this.memberTypes != null) && (!this.memberTypes.isEmpty()));
    }

    public void unsetMemberTypes() {
        this.memberTypes = null;
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
            List<LocalSimpleType> theSimpleType;
            theSimpleType = (this.isSetSimpleType() ? this.getSimpleType() : null);
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType);
        }
        {
            List<QName> theMemberTypes;
            theMemberTypes = (this.isSetMemberTypes() ? this.getMemberTypes() : null);
            strategy.appendField(locator, this, "memberTypes", buffer, theMemberTypes);
        }
        return buffer;
    }

    public void setSimpleType(List<LocalSimpleType> value) {
        this.simpleType = null;
        List<LocalSimpleType> draftl = this.getSimpleType();
        draftl.addAll(value);
    }

    public void setMemberTypes(List<QName> value) {
        this.memberTypes = null;
        List<QName> draftl = this.getMemberTypes();
        draftl.addAll(value);
    }
}
