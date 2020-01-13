/*
 * KomMonitor Data Access API
 * erster Entwurf einer Datenzugriffs-API, die den Zugriff auf die KomMonitor-Datenhaltungsschicht kapselt.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: christian.danowski-buhren@hs-bochum.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.n52.kommonitor.datamanagement.api.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.n52.kommonitor.datamanagement.api.models.CommonMetadataType;
import org.n52.kommonitor.datamanagement.api.models.DefaultClassificationMappingType;
import org.n52.kommonitor.datamanagement.api.models.GeoresourceReferenceType;
import org.n52.kommonitor.datamanagement.api.models.IndicatorReferenceType;
import org.n52.kommonitor.datamanagement.api.models.OgcServicesType;

/**
 * IndicatorOverviewType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-13T15:34:17.820+01:00")
public class IndicatorOverviewType {
  @JsonProperty("indicatorName")
  private String indicatorName = null;

  @JsonProperty("characteristicValue")
  private String characteristicValue = null;

  @JsonProperty("indicatorId")
  private String indicatorId = null;

  /**
   * indicates whether the indicator is a status indicator (values represent the extent of the watched phenomenon for a certain point in time) or a dynamic indicator (values represent the change of extent of the watched phenomenon within a certain period of time)
   */
  public enum IndicatorTypeEnum {
    STATUS_ABSOLUTE("STATUS_ABSOLUTE"),
    
    DYNAMIC_ABSOLUTE("DYNAMIC_ABSOLUTE"),
    
    STATUS_RELATIVE("STATUS_RELATIVE"),
    
    DYNAMIC_RELATIVE("DYNAMIC_RELATIVE"),
    
    STATUS_STANDARDIZED("STATUS_STANDARDIZED"),
    
    DYNAMIC_STANDARDIZED("DYNAMIC_STANDARDIZED");

    private String value;

    IndicatorTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IndicatorTypeEnum fromValue(String text) {
      for (IndicatorTypeEnum b : IndicatorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("indicatorType")
  private IndicatorTypeEnum indicatorType = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("metadata")
  private CommonMetadataType metadata = null;

  @JsonProperty("processDescription")
  private String processDescription = null;

  @JsonProperty("applicableSpatialUnits")
  private List<String> applicableSpatialUnits = new ArrayList<>();

  @JsonProperty("applicableDates")
  private List<String> applicableDates = new ArrayList<>();

  @JsonProperty("topicReference")
  private String topicReference = null;

  @JsonProperty("allowedRoles")
  private List<String> allowedRoles = null;

  @JsonProperty("referencedIndicators")
  private List<IndicatorReferenceType> referencedIndicators = null;

  @JsonProperty("referencedGeoresources")
  private List<GeoresourceReferenceType> referencedGeoresources = null;

  /**
   * indicates if the data is simply inserted (INSERTION), computed by an automated script (COMPUTATION) or automatically aggregated by a script (AGGREGATION)
   */
  public enum CreationTypeEnum {
    INSERTION("INSERTION"),
    
    COMPUTATION("COMPUTATION"),
    
    AGGREGATION("AGGREGATION");

    private String value;

    CreationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreationTypeEnum fromValue(String text) {
      for (CreationTypeEnum b : CreationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("creationType")
  private CreationTypeEnum creationType = null;

  @JsonProperty("lowestSpatialUnitForComputation")
  private String lowestSpatialUnitForComputation = null;

  @JsonProperty("defaultClassificationMapping")
  private DefaultClassificationMappingType defaultClassificationMapping = null;

  @JsonProperty("ogcServices")
  private List<OgcServicesType> ogcServices = new ArrayList<>();

  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("interpretation")
  private String interpretation = null;

  @JsonProperty("isHeadlineIndicator")
  private Boolean isHeadlineIndicator = false;

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<>();

  public IndicatorOverviewType indicatorName(String indicatorName) {
    this.indicatorName = indicatorName;
    return this;
  }

   /**
   * name of the indicator
   * @return indicatorName
  **/
  @ApiModelProperty(required = true, value = "name of the indicator")
  public String getIndicatorName() {
    return indicatorName;
  }

  public void setIndicatorName(String indicatorName) {
    this.indicatorName = indicatorName;
  }

  public IndicatorOverviewType characteristicValue(String characteristicValue) {
    this.characteristicValue = characteristicValue;
    return this;
  }

   /**
   * the distuingishing characteristic value of the indicator
   * @return characteristicValue
  **/
  @ApiModelProperty(required = true, value = "the distuingishing characteristic value of the indicator")
  public String getCharacteristicValue() {
    return characteristicValue;
  }

  public void setCharacteristicValue(String characteristicValue) {
    this.characteristicValue = characteristicValue;
  }

  public IndicatorOverviewType indicatorId(String indicatorId) {
    this.indicatorId = indicatorId;
    return this;
  }

   /**
   * unique identifier of this resource
   * @return indicatorId
  **/
  @ApiModelProperty(required = true, value = "unique identifier of this resource")
  public String getIndicatorId() {
    return indicatorId;
  }

  public void setIndicatorId(String indicatorId) {
    this.indicatorId = indicatorId;
  }

  public IndicatorOverviewType indicatorType(IndicatorTypeEnum indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

   /**
   * indicates whether the indicator is a status indicator (values represent the extent of the watched phenomenon for a certain point in time) or a dynamic indicator (values represent the change of extent of the watched phenomenon within a certain period of time)
   * @return indicatorType
  **/
  @ApiModelProperty(value = "indicates whether the indicator is a status indicator (values represent the extent of the watched phenomenon for a certain point in time) or a dynamic indicator (values represent the change of extent of the watched phenomenon within a certain period of time)")
  public IndicatorTypeEnum getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(IndicatorTypeEnum indicatorType) {
    this.indicatorType = indicatorType;
  }

  public IndicatorOverviewType unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * unit of the indicator values
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "unit of the indicator values")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public IndicatorOverviewType metadata(CommonMetadataType metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "")
  public CommonMetadataType getMetadata() {
    return metadata;
  }

  public void setMetadata(CommonMetadataType metadata) {
    this.metadata = metadata;
  }

  public IndicatorOverviewType processDescription(String processDescription) {
    this.processDescription = processDescription;
    return this;
  }

   /**
   * description about how the indicator was computed
   * @return processDescription
  **/
  @ApiModelProperty(required = true, value = "description about how the indicator was computed")
  public String getProcessDescription() {
    return processDescription;
  }

  public void setProcessDescription(String processDescription) {
    this.processDescription = processDescription;
  }

  public IndicatorOverviewType applicableSpatialUnits(List<String> applicableSpatialUnits) {
    this.applicableSpatialUnits = applicableSpatialUnits;
    return this;
  }

  public IndicatorOverviewType addApplicableSpatialUnitsItem(String applicableSpatialUnitsItem) {
    this.applicableSpatialUnits.add(applicableSpatialUnitsItem);
    return this;
  }

   /**
   * array of spatial unit levels for which the dataset is applicable
   * @return applicableSpatialUnits
  **/
  @ApiModelProperty(required = true, value = "array of spatial unit levels for which the dataset is applicable")
  public List<String> getApplicableSpatialUnits() {
    return applicableSpatialUnits;
  }

  public void setApplicableSpatialUnits(List<String> applicableSpatialUnits) {
    this.applicableSpatialUnits = applicableSpatialUnits;
  }

  public IndicatorOverviewType applicableDates(List<String> applicableDates) {
    this.applicableDates = applicableDates;
    return this;
  }

  public IndicatorOverviewType addApplicableDatesItem(String applicableDatesItem) {
    this.applicableDates.add(applicableDatesItem);
    return this;
  }

   /**
   * array of applicable dates (year and month and day as YEAR-MONTH-DAY) according to ISO 8601 (e.g. 2018-01-30)
   * @return applicableDates
  **/
  @ApiModelProperty(required = true, value = "array of applicable dates (year and month and day as YEAR-MONTH-DAY) according to ISO 8601 (e.g. 2018-01-30)")
  public List<String> getApplicableDates() {
    return applicableDates;
  }

  public void setApplicableDates(List<String> applicableDates) {
    this.applicableDates = applicableDates;
  }

  public IndicatorOverviewType topicReference(String topicReference) {
    this.topicReference = topicReference;
    return this;
  }

   /**
   * id of the last topic hierarchy entity 
   * @return topicReference
  **/
  @ApiModelProperty(required = true, value = "id of the last topic hierarchy entity ")
  public String getTopicReference() {
    return topicReference;
  }

  public void setTopicReference(String topicReference) {
    this.topicReference = topicReference;
  }

  public IndicatorOverviewType allowedRoles(List<String> allowedRoles) {
    this.allowedRoles = allowedRoles;
    return this;
  }

  public IndicatorOverviewType addAllowedRolesItem(String allowedRolesItem) {
    if (this.allowedRoles == null) {
      this.allowedRoles = new ArrayList<>();
    }
    this.allowedRoles.add(allowedRolesItem);
    return this;
  }

   /**
   * list of role identifiers that have read access rights for this dataset
   * @return allowedRoles
  **/
  @ApiModelProperty(value = "list of role identifiers that have read access rights for this dataset")
  public List<String> getAllowedRoles() {
    return allowedRoles;
  }

  public void setAllowedRoles(List<String> allowedRoles) {
    this.allowedRoles = allowedRoles;
  }

  public IndicatorOverviewType referencedIndicators(List<IndicatorReferenceType> referencedIndicators) {
    this.referencedIndicators = referencedIndicators;
    return this;
  }

  public IndicatorOverviewType addReferencedIndicatorsItem(IndicatorReferenceType referencedIndicatorsItem) {
    if (this.referencedIndicators == null) {
      this.referencedIndicators = new ArrayList<>();
    }
    this.referencedIndicators.add(referencedIndicatorsItem);
    return this;
  }

   /**
   * list of references to other indicators
   * @return referencedIndicators
  **/
  @ApiModelProperty(value = "list of references to other indicators")
  public List<IndicatorReferenceType> getReferencedIndicators() {
    return referencedIndicators;
  }

  public void setReferencedIndicators(List<IndicatorReferenceType> referencedIndicators) {
    this.referencedIndicators = referencedIndicators;
  }

  public IndicatorOverviewType referencedGeoresources(List<GeoresourceReferenceType> referencedGeoresources) {
    this.referencedGeoresources = referencedGeoresources;
    return this;
  }

  public IndicatorOverviewType addReferencedGeoresourcesItem(GeoresourceReferenceType referencedGeoresourcesItem) {
    if (this.referencedGeoresources == null) {
      this.referencedGeoresources = new ArrayList<>();
    }
    this.referencedGeoresources.add(referencedGeoresourcesItem);
    return this;
  }

   /**
   * list of references to georesources
   * @return referencedGeoresources
  **/
  @ApiModelProperty(value = "list of references to georesources")
  public List<GeoresourceReferenceType> getReferencedGeoresources() {
    return referencedGeoresources;
  }

  public void setReferencedGeoresources(List<GeoresourceReferenceType> referencedGeoresources) {
    this.referencedGeoresources = referencedGeoresources;
  }

  public IndicatorOverviewType creationType(CreationTypeEnum creationType) {
    this.creationType = creationType;
    return this;
  }

   /**
   * indicates if the data is simply inserted (INSERTION), computed by an automated script (COMPUTATION) or automatically aggregated by a script (AGGREGATION)
   * @return creationType
  **/
  @ApiModelProperty(required = true, value = "indicates if the data is simply inserted (INSERTION), computed by an automated script (COMPUTATION) or automatically aggregated by a script (AGGREGATION)")
  public CreationTypeEnum getCreationType() {
    return creationType;
  }

  public void setCreationType(CreationTypeEnum creationType) {
    this.creationType = creationType;
  }

  public IndicatorOverviewType lowestSpatialUnitForComputation(String lowestSpatialUnitForComputation) {
    this.lowestSpatialUnitForComputation = lowestSpatialUnitForComputation;
    return this;
  }

   /**
   * identifier/name of the lowest spatial unit for which the indicator can be computed and thus is available (only necessary for computable indicators)
   * @return lowestSpatialUnitForComputation
  **/
  @ApiModelProperty(value = "identifier/name of the lowest spatial unit for which the indicator can be computed and thus is available (only necessary for computable indicators)")
  public String getLowestSpatialUnitForComputation() {
    return lowestSpatialUnitForComputation;
  }

  public void setLowestSpatialUnitForComputation(String lowestSpatialUnitForComputation) {
    this.lowestSpatialUnitForComputation = lowestSpatialUnitForComputation;
  }

  public IndicatorOverviewType defaultClassificationMapping(DefaultClassificationMappingType defaultClassificationMapping) {
    this.defaultClassificationMapping = defaultClassificationMapping;
    return this;
  }

   /**
   * Get defaultClassificationMapping
   * @return defaultClassificationMapping
  **/
  @ApiModelProperty(value = "")
  public DefaultClassificationMappingType getDefaultClassificationMapping() {
    return defaultClassificationMapping;
  }

  public void setDefaultClassificationMapping(DefaultClassificationMappingType defaultClassificationMapping) {
    this.defaultClassificationMapping = defaultClassificationMapping;
  }

  public IndicatorOverviewType ogcServices(List<OgcServicesType> ogcServices) {
    this.ogcServices = ogcServices;
    return this;
  }

  public IndicatorOverviewType addOgcServicesItem(OgcServicesType ogcServicesItem) {
    this.ogcServices.add(ogcServicesItem);
    return this;
  }

   /**
   * list of available OGC services for that indicator for different spatial units
   * @return ogcServices
  **/
  @ApiModelProperty(required = true, value = "list of available OGC services for that indicator for different spatial units")
  public List<OgcServicesType> getOgcServices() {
    return ogcServices;
  }

  public void setOgcServices(List<OgcServicesType> ogcServices) {
    this.ogcServices = ogcServices;
  }

  public IndicatorOverviewType abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * abbreviated mark of the indicator
   * @return abbreviation
  **/
  @ApiModelProperty(required = true, value = "abbreviated mark of the indicator")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public IndicatorOverviewType interpretation(String interpretation) {
    this.interpretation = interpretation;
    return this;
  }

   /**
   * interpretation of the indicator values
   * @return interpretation
  **/
  @ApiModelProperty(required = true, value = "interpretation of the indicator values")
  public String getInterpretation() {
    return interpretation;
  }

  public void setInterpretation(String interpretation) {
    this.interpretation = interpretation;
  }

  public IndicatorOverviewType isHeadlineIndicator(Boolean isHeadlineIndicator) {
    this.isHeadlineIndicator = isHeadlineIndicator;
    return this;
  }

   /**
   * boolean value indicating if the indicator is a headline indicator
   * @return isHeadlineIndicator
  **/
  @ApiModelProperty(required = true, value = "boolean value indicating if the indicator is a headline indicator")
  public Boolean isIsHeadlineIndicator() {
    return isHeadlineIndicator;
  }

  public void setIsHeadlineIndicator(Boolean isHeadlineIndicator) {
    this.isHeadlineIndicator = isHeadlineIndicator;
  }

  public IndicatorOverviewType tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IndicatorOverviewType addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * list of tag labels for the indicator
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "list of tag labels for the indicator")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorOverviewType indicatorOverviewType = (IndicatorOverviewType) o;
    return Objects.equals(this.indicatorName, indicatorOverviewType.indicatorName) &&
        Objects.equals(this.characteristicValue, indicatorOverviewType.characteristicValue) &&
        Objects.equals(this.indicatorId, indicatorOverviewType.indicatorId) &&
        Objects.equals(this.indicatorType, indicatorOverviewType.indicatorType) &&
        Objects.equals(this.unit, indicatorOverviewType.unit) &&
        Objects.equals(this.metadata, indicatorOverviewType.metadata) &&
        Objects.equals(this.processDescription, indicatorOverviewType.processDescription) &&
        Objects.equals(this.applicableSpatialUnits, indicatorOverviewType.applicableSpatialUnits) &&
        Objects.equals(this.applicableDates, indicatorOverviewType.applicableDates) &&
        Objects.equals(this.topicReference, indicatorOverviewType.topicReference) &&
        Objects.equals(this.allowedRoles, indicatorOverviewType.allowedRoles) &&
        Objects.equals(this.referencedIndicators, indicatorOverviewType.referencedIndicators) &&
        Objects.equals(this.referencedGeoresources, indicatorOverviewType.referencedGeoresources) &&
        Objects.equals(this.creationType, indicatorOverviewType.creationType) &&
        Objects.equals(this.lowestSpatialUnitForComputation, indicatorOverviewType.lowestSpatialUnitForComputation) &&
        Objects.equals(this.defaultClassificationMapping, indicatorOverviewType.defaultClassificationMapping) &&
        Objects.equals(this.ogcServices, indicatorOverviewType.ogcServices) &&
        Objects.equals(this.abbreviation, indicatorOverviewType.abbreviation) &&
        Objects.equals(this.interpretation, indicatorOverviewType.interpretation) &&
        Objects.equals(this.isHeadlineIndicator, indicatorOverviewType.isHeadlineIndicator) &&
        Objects.equals(this.tags, indicatorOverviewType.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorName, characteristicValue, indicatorId, indicatorType, unit, metadata, processDescription, applicableSpatialUnits, applicableDates, topicReference, allowedRoles, referencedIndicators, referencedGeoresources, creationType, lowestSpatialUnitForComputation, defaultClassificationMapping, ogcServices, abbreviation, interpretation, isHeadlineIndicator, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorOverviewType {\n");
    
    sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
    sb.append("    characteristicValue: ").append(toIndentedString(characteristicValue)).append("\n");
    sb.append("    indicatorId: ").append(toIndentedString(indicatorId)).append("\n");
    sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    processDescription: ").append(toIndentedString(processDescription)).append("\n");
    sb.append("    applicableSpatialUnits: ").append(toIndentedString(applicableSpatialUnits)).append("\n");
    sb.append("    applicableDates: ").append(toIndentedString(applicableDates)).append("\n");
    sb.append("    topicReference: ").append(toIndentedString(topicReference)).append("\n");
    sb.append("    allowedRoles: ").append(toIndentedString(allowedRoles)).append("\n");
    sb.append("    referencedIndicators: ").append(toIndentedString(referencedIndicators)).append("\n");
    sb.append("    referencedGeoresources: ").append(toIndentedString(referencedGeoresources)).append("\n");
    sb.append("    creationType: ").append(toIndentedString(creationType)).append("\n");
    sb.append("    lowestSpatialUnitForComputation: ").append(toIndentedString(lowestSpatialUnitForComputation)).append("\n");
    sb.append("    defaultClassificationMapping: ").append(toIndentedString(defaultClassificationMapping)).append("\n");
    sb.append("    ogcServices: ").append(toIndentedString(ogcServices)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    interpretation: ").append(toIndentedString(interpretation)).append("\n");
    sb.append("    isHeadlineIndicator: ").append(toIndentedString(isHeadlineIndicator)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

