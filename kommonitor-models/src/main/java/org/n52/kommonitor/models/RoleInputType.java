package org.n52.kommonitor.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleInputType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-13T17:03:30.872+01:00")

public class RoleInputType  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("accessibleGeoresources")
  @Valid
  private List<String> accessibleGeoresources = new ArrayList<>();

  @JsonProperty("accessibleIndicators")
  @Valid
  private List<String> accessibleIndicators = new ArrayList<>();

  public RoleInputType roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * the role name
   * @return roleName
  **/
  @ApiModelProperty(required = true, value = "the role name")
  @NotNull


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleInputType accessibleGeoresources(List<String> accessibleGeoresources) {
    this.accessibleGeoresources = accessibleGeoresources;
    return this;
  }

  public RoleInputType addAccessibleGeoresourcesItem(String accessibleGeoresourcesItem) {
    this.accessibleGeoresources.add(accessibleGeoresourcesItem);
    return this;
  }

  /**
   * mandatory list of identifiers of georesources that this role is allowed to retrieve. Specify 'ALL' to enable access to all existing georesources. If unspecified, than full content restriction is assumed (this means that this role cannot access any content).
   * @return accessibleGeoresources
  **/
  @ApiModelProperty(required = true, value = "mandatory list of identifiers of georesources that this role is allowed to retrieve. Specify 'ALL' to enable access to all existing georesources. If unspecified, than full content restriction is assumed (this means that this role cannot access any content).")
  @NotNull


  public List<String> getAccessibleGeoresources() {
    return accessibleGeoresources;
  }

  public void setAccessibleGeoresources(List<String> accessibleGeoresources) {
    this.accessibleGeoresources = accessibleGeoresources;
  }

  public RoleInputType accessibleIndicators(List<String> accessibleIndicators) {
    this.accessibleIndicators = accessibleIndicators;
    return this;
  }

  public RoleInputType addAccessibleIndicatorsItem(String accessibleIndicatorsItem) {
    this.accessibleIndicators.add(accessibleIndicatorsItem);
    return this;
  }

  /**
   * mandatory list of identifiers of indicators that this role is allowed to retrieve. Specify 'ALL' to enable access to all existing georesources. If unspecified, than full content restriction is assumed (this means that this role cannot access any content).
   * @return accessibleIndicators
  **/
  @ApiModelProperty(required = true, value = "mandatory list of identifiers of indicators that this role is allowed to retrieve. Specify 'ALL' to enable access to all existing georesources. If unspecified, than full content restriction is assumed (this means that this role cannot access any content).")
  @NotNull


  public List<String> getAccessibleIndicators() {
    return accessibleIndicators;
  }

  public void setAccessibleIndicators(List<String> accessibleIndicators) {
    this.accessibleIndicators = accessibleIndicators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleInputType roleInputType = (RoleInputType) o;
    return Objects.equals(this.roleName, roleInputType.roleName) &&
        Objects.equals(this.accessibleGeoresources, roleInputType.accessibleGeoresources) &&
        Objects.equals(this.accessibleIndicators, roleInputType.accessibleIndicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, accessibleGeoresources, accessibleIndicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleInputType {\n");
    
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    accessibleGeoresources: ").append(toIndentedString(accessibleGeoresources)).append("\n");
    sb.append("    accessibleIndicators: ").append(toIndentedString(accessibleIndicators)).append("\n");
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

