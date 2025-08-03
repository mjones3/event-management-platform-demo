package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExperimentVariant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExperimentVariant {

  private String id;

  private String name;

  private Double weight;

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  public ExperimentVariant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExperimentVariant(String id, String name, Double weight) {
    this.id = id;
    this.name = name;
    this.weight = weight;
  }

  public ExperimentVariant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExperimentVariant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentVariant weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * minimum: 0
   * maximum: 1
   * @return weight
  */
  @NotNull @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "weight", example = "0.5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ExperimentVariant _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public ExperimentVariant putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  */
  
  @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentVariant experimentVariant = (ExperimentVariant) o;
    return Objects.equals(this.id, experimentVariant.id) &&
        Objects.equals(this.name, experimentVariant.name) &&
        Objects.equals(this.weight, experimentVariant.weight) &&
        Objects.equals(this._configuration, experimentVariant._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, weight, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentVariant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

