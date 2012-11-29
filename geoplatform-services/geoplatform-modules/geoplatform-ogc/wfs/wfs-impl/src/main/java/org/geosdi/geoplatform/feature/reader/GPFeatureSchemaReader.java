/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2012 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.feature.reader;

import java.io.InputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import org.geosdi.geoplatform.connector.jaxb.GPConnectorJAXBContext;
import org.geosdi.geoplatform.connector.jaxb.JAXBContextConnectorRepository;
import org.geosdi.geoplatform.connector.jaxb.WFSConnectorJAXBContext;
import org.geosdi.geoplatform.feature.geometry.GeometryBinding;
import org.geosdi.geoplatform.gui.responce.AttributeDTO;
import org.geosdi.geoplatform.gui.responce.GeometryAttributeDTO;
import org.geosdi.geoplatform.gui.responce.LayerSchemaDTO;
import org.geosdi.geoplatform.xml.xsd.v2001.ComplexContent;
import org.geosdi.geoplatform.xml.xsd.v2001.Element;
import org.geosdi.geoplatform.xml.xsd.v2001.ExplicitGroup;
import org.geosdi.geoplatform.xml.xsd.v2001.ExtensionType;
import org.geosdi.geoplatform.xml.xsd.v2001.LocalSimpleType;
import org.geosdi.geoplatform.xml.xsd.v2001.Schema;
import org.geosdi.geoplatform.xml.xsd.v2001.TopLevelComplexType;
import org.geosdi.geoplatform.xml.xsd.v2001.TopLevelElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public class GPFeatureSchemaReader implements FeatureSchemaReader {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    private static final GPConnectorJAXBContext wfsContext;

    static {
        wfsContext = JAXBContextConnectorRepository.getProvider(
                WFSConnectorJAXBContext.WFS_CONTEXT_KEY);
    }

    @Override
    public List<LayerSchemaDTO> read(final String xml) throws JAXBException {
        Unmarshaller unmarshaller = wfsContext.acquireUnmarshaller();
        StringReader stringReader = new StringReader(xml);
        JAXBElement elem = (JAXBElement) unmarshaller.unmarshal(stringReader);
        final Schema schema = (Schema) elem.getValue();
        return this.getAllFeature(schema);
    }

    @Override
    public List<LayerSchemaDTO> read(final InputStream in) throws JAXBException {
        Unmarshaller unmarshaller = wfsContext.acquireUnmarshaller();
        JAXBElement elem = (JAXBElement) unmarshaller.unmarshal(in);
        final Schema schema = (Schema) elem.getValue();
        return this.getAllFeature(schema);
    }

    @Override
    public LayerSchemaDTO read(final String xml, final String name)
            throws JAXBException {
        Unmarshaller unmarshaller = wfsContext.acquireUnmarshaller();
        StringReader stringReader = new StringReader(xml);
        JAXBElement elem = (JAXBElement) unmarshaller.unmarshal(stringReader);
        final Schema schema = (Schema) elem.getValue();
        return this.getFeature(schema, name);
    }

    @Override
    public LayerSchemaDTO read(final InputStream in, final String name)
            throws JAXBException {
        Unmarshaller unmarshaller = wfsContext.acquireUnmarshaller();
        JAXBElement elem = (JAXBElement) unmarshaller.unmarshal(in);
        final Schema schema = (Schema) elem.getValue();
        return this.getFeature(schema, name);
    }

    @Override
    public List<LayerSchemaDTO> getAllFeature(final Schema schema) {
        List<LayerSchemaDTO> layerSchemaList = new ArrayList<LayerSchemaDTO>();

        for (TopLevelElement element : schema.getTopLevelElements()) {
            QName typeName = element.getType();
            if (typeName != null) {
                LayerSchemaDTO layerSchema = this.getFeature(schema, element.getName());
                layerSchemaList.add(layerSchema);
            } else {
                logger.debug("typeName is null for element {}", element.getName());
            }
        }

        return layerSchemaList;
    }

    @Override
    public LayerSchemaDTO getFeature(final Schema schema, final String name) {
        LayerSchemaDTO layerSchema = null;
        TopLevelElement element = schema.getTopLevelElement(name);
        if (element != null) {
            QName typeName = element.getType();
            if (typeName != null) {
                TopLevelComplexType type = schema.getTopLevelComplexType(
                        typeName.getLocalPart());
                List<Element> elementAttributes = this.getElementAttributes(type);
                logger.trace("*** Element Attributes: {}", elementAttributes);

                layerSchema = new LayerSchemaDTO();
                layerSchema.setTargetNamespace(schema.getTargetNamespace());
                layerSchema.setTypeName(
                        typeName.getPrefix() + ":" + element.getName());

                List<AttributeDTO> attributes = new ArrayList<AttributeDTO>(
                        elementAttributes.size() - 1);
                for (Element attributeElement : elementAttributes) {
                    AttributeDTO attribute = this.getAttribute(attributeElement);
                    GeometryAttributeDTO geometryAttribute = this.getGeometryAttribute(
                            attribute);
                    if (geometryAttribute == null) {
                        attributes.add(attribute);
                    } else {
                        layerSchema.setGeometry(geometryAttribute);
                    }
                }
                layerSchema.setAttributes(attributes);
            } else {
                logger.debug("element {} has no type.", name);
            }
        }
        return layerSchema;
    }

    private List<Element> getElementAttributes(TopLevelComplexType type) {
        if (type != null) {
            ComplexContent content = type.getComplexContent();
            if (content != null) {
                ExtensionType ext = content.getExtension();
                if (ext != null) {
                    ExplicitGroup sequence = ext.getSequence();
                    if (sequence != null) {
                        return sequence.getElements();
                    }
                }
            }
        }
        throw new IllegalArgumentException("No element attributes.");
    }

    private AttributeDTO getAttribute(Element attributeElement) {
        QName elementType = attributeElement.getType();

        if (elementType == null && attributeElement.getSimpleType() != null) {
            LocalSimpleType simpleType = attributeElement.getSimpleType();
            if (simpleType.getRestriction() != null) {
                elementType = simpleType.getRestriction().getBase();
            }
        }

        AttributeDTO attribute = new AttributeDTO();
        attribute.setType(elementType.getLocalPart());
        attribute.setName(attributeElement.getName());
        logger.debug("\n*** {} is of type {}", attribute.getName(),
                     attribute.getType());

        BigInteger minOccurs = attributeElement.getMinOccurs();
        attribute.setMinOccurs(minOccurs == null ? 1 : minOccurs.intValue());

        String maxOccurs = attributeElement.getMaxOccurs();
        if (maxOccurs == null) {
            attribute.setMaxOccurs(1);
        } else if ("unbounded".equalsIgnoreCase(maxOccurs)) {
            attribute.setMaxOccurs(Integer.MAX_VALUE);
        } else {
            attribute.setMaxOccurs(Integer.parseInt(maxOccurs));
        }

        attribute.setNillable(attributeElement.isNillable());

        return attribute;
    }

    private GeometryAttributeDTO getGeometryAttribute(AttributeDTO attribute) {
        String type = attribute.getType();
        if (!GeometryBinding.isGMLGeometricType(type)) {
            return null;
        }
        GeometryAttributeDTO geometryAttribute = new GeometryAttributeDTO();
        geometryAttribute.setType(
                GeometryBinding.getGMLGeometry(type).getSimpleName());
        geometryAttribute.setName(attribute.getName());
        return geometryAttribute;
    }
}
