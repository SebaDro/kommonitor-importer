package org.n52.kommonitor.importer.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.n52.kommonitor.importer.api.exceptions.ImportException;
import org.n52.kommonitor.importer.api.handler.AbstractRequestHandler;
import org.n52.kommonitor.importer.api.handler.IndicatorImportHandler;
import org.n52.kommonitor.importer.api.handler.RequestHandlerRepository;
import org.n52.kommonitor.models.ImportIndicatorPOSTInputType;
import org.n52.kommonitor.models.ImportResponseType;
import org.n52.kommonitor.models.UpdateIndicatorPOSTInputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-02T16:59:46.021+01:00")

@Controller
public class IndicatorsApiController implements IndicatorsApi {

    private static final Logger LOG = LoggerFactory.getLogger(IndicatorsApiController.class);

    @Autowired
    private RequestHandlerRepository requestHandlerRepository;

    @Autowired
    private IndicatorImportHandler importHandler;

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IndicatorsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ImportResponseType> importIndicator(@ApiParam(value = "indicator data", required = true) @Valid @RequestBody ImportIndicatorPOSTInputType indicatorData) {
        LOG.info("Received 'importIndicator' request for dataset name: {}", indicatorData.getIndicatorPostBody().getDatasetName());
        LOG.debug("'importGeoresource' POST request body: {}", indicatorData);

        Optional<AbstractRequestHandler> requestHandlertOpt = requestHandlerRepository.getRequestHandler(indicatorData);
        if (!requestHandlertOpt.isPresent()) {
            throw new ImportException(String.format("No request handler found for request type '%s'", indicatorData.getClass()));
        }
        return requestHandlertOpt.get().handleRequest(indicatorData, indicatorData.getDataSource(), indicatorData.getConverter());
    }

    @Override
    public ResponseEntity<ImportResponseType> updateIndicator(@Valid UpdateIndicatorPOSTInputType indicatorData) {
        LOG.info("Received 'updateIndicator' request for Indicator: {}", indicatorData.getIndicatorId());
        LOG.debug("'updateGeoresource' POST request body: {}", indicatorData);

        Optional<AbstractRequestHandler> requestHandlertOpt = requestHandlerRepository.getRequestHandler(indicatorData);
        if (!requestHandlertOpt.isPresent()) {
            throw new ImportException(String.format("No request handler found for request type '%s'", indicatorData.getClass()));
        }
        return requestHandlertOpt.get().handleRequest(indicatorData, indicatorData.getDataSource(), indicatorData.getConverter());
    }


}
