//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20070417.gmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for CT_CrsCatalogue_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_CrsCatalogue_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmx}AbstractCT_Catalogue_Type">
 *       &lt;sequence>
 *         &lt;element name="crs" type="{http://www.isotc211.org/2005/gmx}CT_CRS_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="coordinateSystem" type="{http://www.isotc211.org/2005/gmx}CT_CoordinateSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="axis" type="{http://www.isotc211.org/2005/gmx}CT_CoordinateSystemAxis_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.isotc211.org/2005/gmx}CT_Datum_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ellipsoid" type="{http://www.isotc211.org/2005/gmx}CT_Ellipsoid_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primeMeridian" type="{http://www.isotc211.org/2005/gmx}CT_PrimeMeridian_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://www.isotc211.org/2005/gmx}CT_Operation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operationMethod" type="{http://www.isotc211.org/2005/gmx}CT_OperationMethod_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.isotc211.org/2005/gmx}CT_OperationParameters_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CrsCatalogue_Type", propOrder = {
    "crs",
    "coordinateSystem",
    "axis",
    "datum",
    "ellipsoid",
    "primeMeridian",
    "operation",
    "operationMethod",
    "parameters"
})
public class CTCrsCatalogueType
    extends AbstractCTCatalogueType
    implements ToString
{

    @XmlElement(required = true)
    protected List<CTCRSPropertyType> crs;
    protected List<CTCoordinateSystemPropertyType> coordinateSystem;
    protected List<CTCoordinateSystemAxisPropertyType> axis;
    protected List<CTDatumPropertyType> datum;
    protected List<CTEllipsoidPropertyType> ellipsoid;
    protected List<CTPrimeMeridianPropertyType> primeMeridian;
    protected List<CTOperationPropertyType> operation;
    protected List<CTOperationMethodPropertyType> operationMethod;
    protected List<CTOperationParametersPropertyType> parameters;

    /**
     * Gets the value of the crs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCRSPropertyType }
     * 
     * 
     */
    public List<CTCRSPropertyType> getCrs() {
        if (crs == null) {
            crs = new ArrayList<CTCRSPropertyType>();
        }
        return this.crs;
    }

    public boolean isSetCrs() {
        return ((this.crs!= null)&&(!this.crs.isEmpty()));
    }

    public void unsetCrs() {
        this.crs = null;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCoordinateSystemPropertyType }
     * 
     * 
     */
    public List<CTCoordinateSystemPropertyType> getCoordinateSystem() {
        if (coordinateSystem == null) {
            coordinateSystem = new ArrayList<CTCoordinateSystemPropertyType>();
        }
        return this.coordinateSystem;
    }

    public boolean isSetCoordinateSystem() {
        return ((this.coordinateSystem!= null)&&(!this.coordinateSystem.isEmpty()));
    }

    public void unsetCoordinateSystem() {
        this.coordinateSystem = null;
    }

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCoordinateSystemAxisPropertyType }
     * 
     * 
     */
    public List<CTCoordinateSystemAxisPropertyType> getAxis() {
        if (axis == null) {
            axis = new ArrayList<CTCoordinateSystemAxisPropertyType>();
        }
        return this.axis;
    }

    public boolean isSetAxis() {
        return ((this.axis!= null)&&(!this.axis.isEmpty()));
    }

    public void unsetAxis() {
        this.axis = null;
    }

    /**
     * Gets the value of the datum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDatumPropertyType }
     * 
     * 
     */
    public List<CTDatumPropertyType> getDatum() {
        if (datum == null) {
            datum = new ArrayList<CTDatumPropertyType>();
        }
        return this.datum;
    }

    public boolean isSetDatum() {
        return ((this.datum!= null)&&(!this.datum.isEmpty()));
    }

    public void unsetDatum() {
        this.datum = null;
    }

    /**
     * Gets the value of the ellipsoid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ellipsoid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEllipsoid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEllipsoidPropertyType }
     * 
     * 
     */
    public List<CTEllipsoidPropertyType> getEllipsoid() {
        if (ellipsoid == null) {
            ellipsoid = new ArrayList<CTEllipsoidPropertyType>();
        }
        return this.ellipsoid;
    }

    public boolean isSetEllipsoid() {
        return ((this.ellipsoid!= null)&&(!this.ellipsoid.isEmpty()));
    }

    public void unsetEllipsoid() {
        this.ellipsoid = null;
    }

    /**
     * Gets the value of the primeMeridian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primeMeridian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimeMeridian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPrimeMeridianPropertyType }
     * 
     * 
     */
    public List<CTPrimeMeridianPropertyType> getPrimeMeridian() {
        if (primeMeridian == null) {
            primeMeridian = new ArrayList<CTPrimeMeridianPropertyType>();
        }
        return this.primeMeridian;
    }

    public boolean isSetPrimeMeridian() {
        return ((this.primeMeridian!= null)&&(!this.primeMeridian.isEmpty()));
    }

    public void unsetPrimeMeridian() {
        this.primeMeridian = null;
    }

    /**
     * Gets the value of the operation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationPropertyType }
     * 
     * 
     */
    public List<CTOperationPropertyType> getOperation() {
        if (operation == null) {
            operation = new ArrayList<CTOperationPropertyType>();
        }
        return this.operation;
    }

    public boolean isSetOperation() {
        return ((this.operation!= null)&&(!this.operation.isEmpty()));
    }

    public void unsetOperation() {
        this.operation = null;
    }

    /**
     * Gets the value of the operationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationMethodPropertyType }
     * 
     * 
     */
    public List<CTOperationMethodPropertyType> getOperationMethod() {
        if (operationMethod == null) {
            operationMethod = new ArrayList<CTOperationMethodPropertyType>();
        }
        return this.operationMethod;
    }

    public boolean isSetOperationMethod() {
        return ((this.operationMethod!= null)&&(!this.operationMethod.isEmpty()));
    }

    public void unsetOperationMethod() {
        this.operationMethod = null;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTOperationParametersPropertyType }
     * 
     * 
     */
    public List<CTOperationParametersPropertyType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<CTOperationParametersPropertyType>();
        }
        return this.parameters;
    }

    public boolean isSetParameters() {
        return ((this.parameters!= null)&&(!this.parameters.isEmpty()));
    }

    public void unsetParameters() {
        this.parameters = null;
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
            List<CTCRSPropertyType> theCrs;
            theCrs = (this.isSetCrs()?this.getCrs():null);
            strategy.appendField(locator, this, "crs", buffer, theCrs);
        }
        {
            List<CTCoordinateSystemPropertyType> theCoordinateSystem;
            theCoordinateSystem = (this.isSetCoordinateSystem()?this.getCoordinateSystem():null);
            strategy.appendField(locator, this, "coordinateSystem", buffer, theCoordinateSystem);
        }
        {
            List<CTCoordinateSystemAxisPropertyType> theAxis;
            theAxis = (this.isSetAxis()?this.getAxis():null);
            strategy.appendField(locator, this, "axis", buffer, theAxis);
        }
        {
            List<CTDatumPropertyType> theDatum;
            theDatum = (this.isSetDatum()?this.getDatum():null);
            strategy.appendField(locator, this, "datum", buffer, theDatum);
        }
        {
            List<CTEllipsoidPropertyType> theEllipsoid;
            theEllipsoid = (this.isSetEllipsoid()?this.getEllipsoid():null);
            strategy.appendField(locator, this, "ellipsoid", buffer, theEllipsoid);
        }
        {
            List<CTPrimeMeridianPropertyType> thePrimeMeridian;
            thePrimeMeridian = (this.isSetPrimeMeridian()?this.getPrimeMeridian():null);
            strategy.appendField(locator, this, "primeMeridian", buffer, thePrimeMeridian);
        }
        {
            List<CTOperationPropertyType> theOperation;
            theOperation = (this.isSetOperation()?this.getOperation():null);
            strategy.appendField(locator, this, "operation", buffer, theOperation);
        }
        {
            List<CTOperationMethodPropertyType> theOperationMethod;
            theOperationMethod = (this.isSetOperationMethod()?this.getOperationMethod():null);
            strategy.appendField(locator, this, "operationMethod", buffer, theOperationMethod);
        }
        {
            List<CTOperationParametersPropertyType> theParameters;
            theParameters = (this.isSetParameters()?this.getParameters():null);
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        return buffer;
    }

    public void setCrs(List<CTCRSPropertyType> value) {
        this.crs = null;
        List<CTCRSPropertyType> draftl = this.getCrs();
        draftl.addAll(value);
    }

    public void setCoordinateSystem(List<CTCoordinateSystemPropertyType> value) {
        this.coordinateSystem = null;
        List<CTCoordinateSystemPropertyType> draftl = this.getCoordinateSystem();
        draftl.addAll(value);
    }

    public void setAxis(List<CTCoordinateSystemAxisPropertyType> value) {
        this.axis = null;
        List<CTCoordinateSystemAxisPropertyType> draftl = this.getAxis();
        draftl.addAll(value);
    }

    public void setDatum(List<CTDatumPropertyType> value) {
        this.datum = null;
        List<CTDatumPropertyType> draftl = this.getDatum();
        draftl.addAll(value);
    }

    public void setEllipsoid(List<CTEllipsoidPropertyType> value) {
        this.ellipsoid = null;
        List<CTEllipsoidPropertyType> draftl = this.getEllipsoid();
        draftl.addAll(value);
    }

    public void setPrimeMeridian(List<CTPrimeMeridianPropertyType> value) {
        this.primeMeridian = null;
        List<CTPrimeMeridianPropertyType> draftl = this.getPrimeMeridian();
        draftl.addAll(value);
    }

    public void setOperation(List<CTOperationPropertyType> value) {
        this.operation = null;
        List<CTOperationPropertyType> draftl = this.getOperation();
        draftl.addAll(value);
    }

    public void setOperationMethod(List<CTOperationMethodPropertyType> value) {
        this.operationMethod = null;
        List<CTOperationMethodPropertyType> draftl = this.getOperationMethod();
        draftl.addAll(value);
    }

    public void setParameters(List<CTOperationParametersPropertyType> value) {
        this.parameters = null;
        List<CTOperationParametersPropertyType> draftl = this.getParameters();
        draftl.addAll(value);
    }

}
