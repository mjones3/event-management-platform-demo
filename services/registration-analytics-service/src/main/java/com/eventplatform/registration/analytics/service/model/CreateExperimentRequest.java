package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.ExperimentVariant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateExperimentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateExperimentRequest {

  private String name;

  private String description;

  private String eventId;

  @Valid
  private List<@Valid ExperimentVariant> variants = new ArrayList<>();

  private Double trafficAllocation = 1.0d;

  @Valid
  private Map<String, Object> targetingRules = new HashMap<>();

  public CreateExperimentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateExperimentRequest(String name, List<@Valid ExperimentVariant> variants) {
    this.name = name;
    this.variants = variants;
  }

  public CreateExperimentRequest name(String name) {
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

  public CreateExperimentRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateExperimentRequest eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  
  @Schema(name = "eventId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public CreateExperimentRequest variants(List<@Valid ExperimentVariant> variants) {
    this.variants = variants;
    return this;
  }

  public CreateExperimentRequest addVariantsItem(ExperimentVariant variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    return this;
  }

  /**
   * Get variants
   * @return variants
  */
  @NotNull @Valid 
  @Schema(name = "variants", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("variants")
  public List<@Valid ExperimentVariant> getVariants() {
    return variants;
  }

  public void setVariants(List<@Valid ExperimentVariant> variants) {
    this.variants = variants;
  }

  public CreateExperimentRequest trafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
    return this;
  }

  /**
   * Get trafficAllocation
   * @return trafficAllocation
  */
  
  @Schema(name = "trafficAllocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficAllocation")
  public Double getTrafficAllocation() {
    return trafficAllocation;
  }

  public void setTrafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
  }

  public CreateExperimentRequest targetingRules(Map<String, Object> targetingRules) {
    this.targetingRules = targetingRules;
    return this;
  }

  public CreateExperimentRequest putTargetingRulesItem(String key, Object targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new HashMap<>();
    }
    this.targetingRules.put(key, targetingRulesItem);
    return this;
  }

  /**
   * Get targetingRules
   * @return targetingRules
  */
  
  @Schema(name = "targetingRules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetingRules")
  public Map<String, Object> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(Map<String, Object> targetingRules) {
    this.targetingRules = targetingRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExperimentRequest createExperimentRequest = (CreateExperimentRequest) o;
    return Objects.equals(this.name, createExperimentRequest.name) &&
        Objects.equals(this.description, createExperimentRequest.description) &&
        Objects.equals(this.eventId, createExperimentRequest.eventId) &&
        Objects.equals(this.variants, createExperimentRequest.variants) &&
        Objects.equals(this.trafficAllocation, createExperimentRequest.trafficAllocation) &&
        Objects.equals(this.targetingRules, createExperimentRequest.targetingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, eventId, variants, trafficAllocation, targetingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExperimentRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    trafficAllocation: ").append(toIndentedString(trafficAllocation)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
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

