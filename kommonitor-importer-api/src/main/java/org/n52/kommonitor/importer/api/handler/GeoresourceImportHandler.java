package org.n52.kommonitor.importer.api.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.n52.kommonitor.datamanagement.api.client.GeoresourcesApi;
import org.n52.kommonitor.datamanagement.api.models.GeoresourcePOSTInputType;
import org.n52.kommonitor.importer.api.encoder.GeoresourceEncoder;
import org.n52.kommonitor.importer.converter.AbstractConverter;
import org.n52.kommonitor.importer.entities.Dataset;
import org.n52.kommonitor.importer.entities.SpatialResource;
import org.n52.kommonitor.importer.exceptions.ConverterException;

import org.n52.kommonitor.importer.exceptions.ImportParameterException;
import org.n52.kommonitor.importer.models.ConverterDefinitionType;
import org.n52.kommonitor.importer.models.ImportGeoresourcePOSTInputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.util.List;

/**
 * Handles a georesource import request by converting a {@link Dataset} into a {@link List<SpatialResource>} and
 * mapping
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
@Component
public class GeoresourceImportHandler extends AbstractImportHandler<ImportGeoresourcePOSTInputType> {
    private static final String LOCATION_HEADER_KEY = "location";

    private final static Logger LOG = LoggerFactory.getLogger(GeoresourceImportHandler.class);

    @Autowired
    private GeoresourceEncoder encoder;

    @Autowired
    private GeoresourcesApi apiClient;

    @Override
    public ResponseEntity<List<String>> importResource(ImportGeoresourcePOSTInputType importResourceType,
                                                       AbstractConverter converter,
                                                       ConverterDefinitionType converterDefinition,
                                                       Dataset dataset)
            throws ConverterException, RestClientException, ImportParameterException {
        LOG.info("Converting dataset with converter: {}", converter.getName());
        LOG.debug("Converter definition: {}", converterDefinition);
        List<SpatialResource> spatialResources = converter.convertSpatialResources(
                converterDefinition,
                dataset,
                importResourceType.getPropertyMapping());
        GeoresourcePOSTInputType georesourcePostInput = null;
        try {
            georesourcePostInput = encoder.encode(importResourceType, spatialResources);
        } catch (JsonProcessingException ex) {
            throw new ImportParameterException("Could not encode SpatialResoure.", ex);
        }

        LOG.info("Perform 'addGeoresource' request for georesource dataset: {}", georesourcePostInput.getDatasetName());
        LOG.debug("'addGeoresource' request POST body: {}", georesourcePostInput);
        ResponseEntity<Void> response = apiClient.addGeoresourceAsBodyWithHttpInfo(georesourcePostInput);
        List<String> locations = response.getHeaders().get(LOCATION_HEADER_KEY);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(locations);
    }
}
