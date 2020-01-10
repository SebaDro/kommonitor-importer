/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.n52.kommonitor.importer.api;

import org.n52.kommonitor.importer.models.Error;
import org.n52.kommonitor.importer.models.ImportGeoresourcePOSTInputType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-10T14:19:13.423+01:00")

@Api(value = "georesources", description = "the georesources API")
public interface GeoresourcesApi {

    Logger log = LoggerFactory.getLogger(GeoresourcesApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Import a new geo-resource", nickname = "importGeoresource", notes = "Import a geo-resource dataset for a certain period of time. Parses Input source, extracts relevant data, performs schema mapping to KomMonitor data model and calls POST /georesources of KomMonitor Data Management API", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "georesources", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "API key is missing or invalid"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/georesources",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<List<String>> importGeoresource(@ApiParam(value = "feature data" ,required=true )  @Valid @RequestBody ImportGeoresourcePOSTInputType featureData) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default GeoresourcesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
