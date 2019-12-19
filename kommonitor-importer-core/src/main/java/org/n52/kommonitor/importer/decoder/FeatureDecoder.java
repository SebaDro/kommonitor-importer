package org.n52.kommonitor.importer.decoder;

import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.locationtech.jts.geom.Geometry;
import org.n52.kommonitor.importer.entities.SpatialResource;
import org.n52.kommonitor.importer.exceptions.DecodingException;
import org.n52.kommonitor.importer.models.SpatialResourcePropertyMappingType;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Helper class for decoding {@link SimpleFeature} instances into {@link SpatialResource}
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
@Component
public class FeatureDecoder {

    private static final Logger LOG = LoggerFactory.getLogger(FeatureDecoder.class);


    /**
     * Decode a {@link SimpleFeature} as {@link SpatialResource} by mapping certain properties
     * and the geometry
     *
     * @param feature         {@link SimpleFeature} to decode
     * @param propertyMapping definition of property mappings
     * @return {@link SpatialResource}
     * @throws DecodingException
     */
    public SpatialResource decodeFeature(SimpleFeature feature, SpatialResourcePropertyMappingType propertyMapping) throws DecodingException {
        String id = getPropertyValueAsString(feature, propertyMapping.getIdentifierProperty());
        String name = getPropertyValueAsString(feature, propertyMapping.getNameProperty());
        String arisenFrom = propertyMapping.getArisenFromProperty() == null ? null :
                getPropertyValueAsString(feature, propertyMapping.getArisenFromProperty());
        LocalDate startDate = propertyMapping.getValidStartDateProperty() == null ? null :
                getPropertyValueAsDate(feature, propertyMapping.getValidStartDateProperty());
        LocalDate endDate = propertyMapping.getValidEndDateProperty() == null ? null :
                getPropertyValueAsDate(feature, propertyMapping.getValidEndDateProperty());
        Geometry geom = getGeometry(feature, feature.getFeatureType());

        return new SpatialResource(id, name, geom, arisenFrom, startDate, endDate);
    }

    /**
     * Decode a {@link SimpleFeatureCollection} as {@link List<SpatialResource>} by mapping certain properties
     * and the geometry
     *
     * @param featureCollection   {@link SimpleFeatureCollection} to decode
     * @param propertyMappingType definition of property mappings
     * @return
     */
    public List<SpatialResource> decodeFeatureCollection(SimpleFeatureCollection featureCollection,
                                                         SpatialResourcePropertyMappingType propertyMappingType) {
        List<SpatialResource> result = new ArrayList<>();
        SimpleFeatureIterator iterator = featureCollection.features();
        while (iterator.hasNext()) {
            SimpleFeature feature = iterator.next();
            try {
                result.add(decodeFeature(feature, propertyMappingType));
            } catch (DecodingException e) {
                LOG.warn("Could not decode feature {}", feature.getID());
            }
        }
        return result;
    }

    /**
     * Gets the value from a {@link Geometry} property of a feature
     *
     * @param feature           the {@link SimpleFeature} to fetch the geometry from
     * @param simpleFeatureType {@link SimpleFeatureType} associated to  the {@link SimpleFeature}
     * @return {@link Geometry} of the feature
     */
    protected Geometry getGeometry(SimpleFeature feature, SimpleFeatureType simpleFeatureType) {
        String geomName = simpleFeatureType.getGeometryDescriptor().getLocalName();
        Geometry geom = (Geometry) feature.getAttribute(geomName);
        return geom;
    }

    /**
     * Gets the value from a {@link SimpleFeature} property as String
     *
     * @param feature      the {@link SimpleFeature} to fetch the property from
     * @param propertyName name of the property to fetch
     * @return the value of the fetched feature property as String
     * @throws DecodingException if the property value could not be parsed as String
     */
    protected String getPropertyValueAsString(SimpleFeature feature, String propertyName) throws DecodingException {
        Object propertyValue = getPropertyValue(feature, propertyName);
        if (!(propertyValue instanceof String)) {
            throw new DecodingException(String.format("Could not decode property '%s' as '%s'", propertyName, String.class.getName()));
        }
        return (String) propertyValue;
    }

    /**
     * * Gets the value from a {@link SimpleFeature} property as {@link LocalDate}
     *
     * @param feature      the {@link SimpleFeature} to fetch the property from
     * @param propertyName name of the property to fetch
     * @return the value of the fetched feature property as Date
     * @throws DecodingException if the property value could not be parsed as {@link LocalDate}
     */
    protected LocalDate getPropertyValueAsDate(SimpleFeature feature, String propertyName) throws DecodingException {
        Object propertyValue = getPropertyValue(feature, propertyName);
        LocalDate date = null;
        if (propertyValue instanceof String) {
            try {
                date = LocalDate.parse((String) propertyValue);
            } catch (DateTimeParseException ex) {
                throw new DecodingException(String.format("Could not decode property '%s' as '%s'", propertyName, LocalDate.class.getName()), ex);
            }
        } else if (propertyValue instanceof Date) {
            Instant instant = ((Date) propertyValue).toInstant();
            date = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        } else {
            throw new DecodingException(String.format("Could not decode property '%s' as '%s'", propertyName, LocalDate.class.getName()));
        }
        return date;
    }

    protected Object getPropertyValue(SimpleFeature feature, String propertyName) throws DecodingException {
        Object propertyValue = feature.getAttribute(propertyName);
        if (propertyValue == null) {
            throw new DecodingException(String.format("Property '%s' does not exist.", propertyName));
        }
        return propertyValue;
    }
}
