package org.n52.kommonitor.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.n52.kommonitor.models.ConverterDefinitionType;
import org.n52.kommonitor.models.DataSourceDefinitionType;
import org.n52.kommonitor.models.IndicatorPOSTInputType;
import org.n52.kommonitor.models.IndicatorPropertyMappingType;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Definitions for importing an new indicator from a certain datasource
 */
@ApiModel(description = "Definitions for importing an new indicator from a certain datasource")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-28T13:12:59.357+01:00")

public class ImportIndicatorPOSTInputType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("indicatorPostBody")
  private IndicatorPOSTInputType indicatorPostBody = null;

  @JsonProperty("dataSource")
  private DataSourceDefinitionType dataSource = null;

  @JsonProperty("converter")
  private ConverterDefinitionType converter = null;

  @JsonProperty("propertyMapping")
  private IndicatorPropertyMappingType propertyMapping = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  public ImportIndicatorPOSTInputType indicatorPostBody(IndicatorPOSTInputType indicatorPostBody) {
    this.indicatorPostBody = indicatorPostBody;
    return this;
  }

  /**
   * Get indicatorPostBody
   * @return indicatorPostBody
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public IndicatorPOSTInputType getIndicatorPostBody() {
    return indicatorPostBody;
  }

  public void setIndicatorPostBody(IndicatorPOSTInputType indicatorPostBody) {
    this.indicatorPostBody = indicatorPostBody;
  }

  public ImportIndicatorPOSTInputType dataSource(DataSourceDefinitionType dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   * @return dataSource
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DataSourceDefinitionType getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSourceDefinitionType dataSource) {
    this.dataSource = dataSource;
  }

  public ImportIndicatorPOSTInputType converter(ConverterDefinitionType converter) {
    this.converter = converter;
    return this;
  }

  /**
   * Get converter
   * @return converter
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ConverterDefinitionType getConverter() {
    return converter;
  }

  public void setConverter(ConverterDefinitionType converter) {
    this.converter = converter;
  }

  public ImportIndicatorPOSTInputType propertyMapping(IndicatorPropertyMappingType propertyMapping) {
    this.propertyMapping = propertyMapping;
    return this;
  }

  /**
   * Get propertyMapping
   * @return propertyMapping
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public IndicatorPropertyMappingType getPropertyMapping() {
    return propertyMapping;
  }

  public void setPropertyMapping(IndicatorPropertyMappingType propertyMapping) {
    this.propertyMapping = propertyMapping;
  }

  public ImportIndicatorPOSTInputType dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Indicate wether to perform a dry run ('true') or not (default 'false'). If true the import will be performed without doing a POST request to the Data Management API. However, the response contains information about the entitites that would have been imported and possbile import errors.
   * @return dryRun
  **/
  @ApiModelProperty(required = true, value = "Indicate wether to perform a dry run ('true') or not (default 'false'). If true the import will be performed without doing a POST request to the Data Management API. However, the response contains information about the entitites that would have been imported and possbile import errors.")
  @NotNull


  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportIndicatorPOSTInputType importIndicatorPOSTInputType = (ImportIndicatorPOSTInputType) o;
    return Objects.equals(this.indicatorPostBody, importIndicatorPOSTInputType.indicatorPostBody) &&
        Objects.equals(this.dataSource, importIndicatorPOSTInputType.dataSource) &&
        Objects.equals(this.converter, importIndicatorPOSTInputType.converter) &&
        Objects.equals(this.propertyMapping, importIndicatorPOSTInputType.propertyMapping) &&
        Objects.equals(this.dryRun, importIndicatorPOSTInputType.dryRun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorPostBody, dataSource, converter, propertyMapping, dryRun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportIndicatorPOSTInputType {\n");
    
    sb.append("    indicatorPostBody: ").append(toIndentedString(indicatorPostBody)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    converter: ").append(toIndentedString(converter)).append("\n");
    sb.append("    propertyMapping: ").append(toIndentedString(propertyMapping)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

