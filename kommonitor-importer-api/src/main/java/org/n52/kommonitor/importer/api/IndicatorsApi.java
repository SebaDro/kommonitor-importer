/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.n52.kommonitor.importer.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.n52.kommonitor.models.Error;
import org.n52.kommonitor.models.ImportIndicatorPOSTInputType;
import org.n52.kommonitor.models.UpdateIndicatorPOSTInputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T18:43:47.021+01:00")

@Api(value = "indicators", description = "the indicators API")
public interface IndicatorsApi {

    Logger log = LoggerFactory.getLogger(IndicatorsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Import a new indicator dataset", nickname = "importIndicator", notes = "Import an indicator dataset for a certain period of time and spatial unit/level. Parses Input source, extracts relevant data, performs schema mapping to KomMonitor data model and calls POST /indicators of KomMonitor Data Management API", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "indicators", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "API key is missing or invalid"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/indicators",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<List<String>> importIndicator(@ApiParam(value = "indicator data" ,required=true )  @Valid @RequestBody ImportIndicatorPOSTInputType indicatorData) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IndicatorsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update a new indicator dataset", nickname = "importIndicator", notes = "Update an indicator dataset for a certain period of time and spatial unit/level. Parses Input source, extracts relevant data, performs schema mapping to KomMonitor data model and calls PUT /indicators of KomMonitor Data Management API", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "indicators", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "API key is missing or invalid"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/indicators/update",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<List<String>> importIndicator(@ApiParam(value = "indicator data" ,required=true )  @Valid @RequestBody UpdateIndicatorPOSTInputType indicatorData) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default IndicatorsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
