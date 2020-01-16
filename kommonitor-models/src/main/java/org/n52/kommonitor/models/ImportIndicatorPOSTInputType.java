package org.n52.kommonitor.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-16T12:53:22.647+01:00")

public class ImportIndicatorPOSTInputType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("indicatorPostBody")
  private IndicatorPOSTInputType indicatorPostBody = null;

  @JsonProperty("dataSource")
  private DataSourceDefinitionType dataSource = null;

  @JsonProperty("converter")
  private ConverterDefinitionType converter = null;

  @JsonProperty("propertyMappings")
  @Valid
  private List<IndicatorPropertyMappingType> propertyMappings = null;

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

  public ImportIndicatorPOSTInputType propertyMappings(List<IndicatorPropertyMappingType> propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  public ImportIndicatorPOSTInputType addPropertyMappingsItem(IndicatorPropertyMappingType propertyMappingsItem) {
    if (this.propertyMappings == null) {
      this.propertyMappings = new ArrayList<>();
    }
    this.propertyMappings.add(propertyMappingsItem);
    return this;
  }

  /**
   * list of property mappings for indicator values and
   * @return propertyMappings
  **/
  @ApiModelProperty(value = "list of property mappings for indicator values and")

  @Valid

  public List<IndicatorPropertyMappingType> getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(List<IndicatorPropertyMappingType> propertyMappings) {
    this.propertyMappings = propertyMappings;
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
        Objects.equals(this.propertyMappings, importIndicatorPOSTInputType.propertyMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorPostBody, dataSource, converter, propertyMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportIndicatorPOSTInputType {\n");
    
    sb.append("    indicatorPostBody: ").append(toIndentedString(indicatorPostBody)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    converter: ").append(toIndentedString(converter)).append("\n");
    sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
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

