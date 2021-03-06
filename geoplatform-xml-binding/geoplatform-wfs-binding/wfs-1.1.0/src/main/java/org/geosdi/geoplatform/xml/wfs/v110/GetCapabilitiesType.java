//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.26 at 03:16:42 PM CEST 
//
package org.geosdi.geoplatform.xml.wfs.v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

/**
 *
 * Request to a WFS to perform the GetCapabilities operation. This operation
 * allows a client to retrieve a Capabilities XML document providing metadata
 * for the specific WFS server.
 *
 * The GetCapapbilities element is used to request that a Web Feature Service
 * generate an XML document describing the organization providing the service,
 * the WFS operations that the service supports, a list of feature types that
 * the service can operate on and list of filtering capabilities that the
 * service support. Such an XML document is called a capabilities document.
 *
 *
 * <p>Java class for GetCapabilitiesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="GetCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/ows}GetCapabilitiesType">
 *       &lt;attribute name="service" type="{http://www.opengis.net/ows}ServiceType" default="WFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "GetCapabilities")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCapabilitiesType")
public class GetCapabilitiesType
        extends org.geosdi.geoplatform.xml.ows.v100.GetCapabilitiesType
        implements ToString {

    @XmlAttribute(name = "service")
    protected String service;

    public GetCapabilitiesType() {
    }

    /**
     * Gets the value of the service property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getService() {
        if (service == null) {
            return "WFS";
        } else {
            return service;
        }
    }

    /**
     * Sets the value of the service property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setService(String value) {
        this.service = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator,
            StringBuilder buffer,
            ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator,
            StringBuilder buffer,
            ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        return buffer;
    }
}
