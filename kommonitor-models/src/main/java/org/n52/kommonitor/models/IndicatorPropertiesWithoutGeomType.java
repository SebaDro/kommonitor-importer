package org.n52.kommonitor.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * IndicatorPropertiesWithoutGeomType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T17:03:30.872+01:00")

public class IndicatorPropertiesWithoutGeomType extends HashMap<String, String> implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("NAME")
  private String NAME = null;

  @JsonProperty("validStartDate")
  private String validStartDate = null;

  @JsonProperty("validEndDate")
  private String validEndDate = null;

  public IndicatorPropertiesWithoutGeomType ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * the id of the spatial feature
   * @return ID
  **/
  @ApiModelProperty(required = true, value = "the id of the spatial feature")
  @NotNull


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public IndicatorPropertiesWithoutGeomType NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  /**
   * the name of the spatial feature
   * @return NAME
  **/
  @ApiModelProperty(required = true, value = "the name of the spatial feature")
  @NotNull


  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public IndicatorPropertiesWithoutGeomType validStartDate(String validStartDate) {
    this.validStartDate = validStartDate;
    return this;
  }

  /**
   * the start date from which on the spatial feature is valid
   * @return validStartDate
  **/
  @ApiModelProperty(required = true, value = "the start date from which on the spatial feature is valid")
  @NotNull


  public String getValidStartDate() {
    return validStartDate;
  }

  public void setValidStartDate(String validStartDate) {
    this.validStartDate = validStartDate;
  }

  public IndicatorPropertiesWithoutGeomType validEndDate(String validEndDate) {
    this.validEndDate = validEndDate;
    return this;
  }

  /**
   * the end date until the spatial feature is valid - or null if not set
   * @return validEndDate
  **/
  @ApiModelProperty(value = "the end date until the spatial feature is valid - or null if not set")


  public String getValidEndDate() {
    return validEndDate;
  }

  public void setValidEndDate(String validEndDate) {
    this.validEndDate = validEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorPropertiesWithoutGeomType indicatorPropertiesWithoutGeomType = (IndicatorPropertiesWithoutGeomType) o;
    return Objects.equals(this.ID, indicatorPropertiesWithoutGeomType.ID) &&
        Objects.equals(this.NAME, indicatorPropertiesWithoutGeomType.NAME) &&
        Objects.equals(this.validStartDate, indicatorPropertiesWithoutGeomType.validStartDate) &&
        Objects.equals(this.validEndDate, indicatorPropertiesWithoutGeomType.validEndDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, NAME, validStartDate, validEndDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorPropertiesWithoutGeomType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
    sb.append("    validStartDate: ").append(toIndentedString(validStartDate)).append("\n");
    sb.append("    validEndDate: ").append(toIndentedString(validEndDate)).append("\n");
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

