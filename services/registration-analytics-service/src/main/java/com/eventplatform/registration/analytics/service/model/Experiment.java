package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.ExperimentVariant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Experiment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Experiment {

  private String id;

  private String name;

  private String description;

  private String eventId;

  @Valid
  private List<@Valid ExperimentVariant> variants = new ArrayList<>();

  private Double trafficAllocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @Valid
  private Map<String, Object> targetingRules = new HashMap<>();

  public Experiment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Experiment(String id, String name, List<@Valid ExperimentVariant> variants, OffsetDateTime startDate, StatusEnum status) {
    this.id = id;
    this.name = name;
    this.variants = variants;
    this.startDate = startDate;
    this.status = status;
  }

  public Experiment id(String id) {
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

  public Experiment name(String name) {
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

  public Experiment description(String description) {
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

  public Experiment eventId(String eventId) {
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

  public Experiment variants(List<@Valid ExperimentVariant> variants) {
    this.variants = variants;
    return this;
  }

  public Experiment addVariantsItem(ExperimentVariant variantsItem) {
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

  public Experiment trafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
    return this;
  }

  /**
   * Get trafficAllocation
   * minimum: 0
   * maximum: 1
   * @return trafficAllocation
  */
  @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "trafficAllocation", example = "0.8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficAllocation")
  public Double getTrafficAllocation() {
    return trafficAllocation;
  }

  public void setTrafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
  }

  public Experiment startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @NotNull @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Experiment endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Experiment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Experiment targetingRules(Map<String, Object> targetingRules) {
    this.targetingRules = targetingRules;
    return this;
  }

  public Experiment putTargetingRulesItem(String key, Object targetingRulesItem) {
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
    Experiment experiment = (Experiment) o;
    return Objects.equals(this.id, experiment.id) &&
        Objects.equals(this.name, experiment.name) &&
        Objects.equals(this.description, experiment.description) &&
        Objects.equals(this.eventId, experiment.eventId) &&
        Objects.equals(this.variants, experiment.variants) &&
        Objects.equals(this.trafficAllocation, experiment.trafficAllocation) &&
        Objects.equals(this.startDate, experiment.startDate) &&
        Objects.equals(this.endDate, experiment.endDate) &&
        Objects.equals(this.status, experiment.status) &&
        Objects.equals(this.targetingRules, experiment.targetingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, eventId, variants, trafficAllocation, startDate, endDate, status, targetingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experiment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    trafficAllocation: ").append(toIndentedString(trafficAllocation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

