package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExperimentParticipation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExperimentParticipation {

  private UUID id;

  private UUID userId;

  private String experimentId;

  private String variant;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime convertedAt;

  @Valid
  private Map<String, Object> conversionData = new HashMap<>();

  public ExperimentParticipation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExperimentParticipation(UUID id, UUID userId, String experimentId, String variant, OffsetDateTime startedAt) {
    this.id = id;
    this.userId = userId;
    this.experimentId = experimentId;
    this.variant = variant;
    this.startedAt = startedAt;
  }

  public ExperimentParticipation id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExperimentParticipation userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public ExperimentParticipation experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * Get experimentId
   * @return experimentId
  */
  @NotNull 
  @Schema(name = "experimentId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("experimentId")
  public String getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }

  public ExperimentParticipation variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
  */
  @NotNull 
  @Schema(name = "variant", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public ExperimentParticipation startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid 
  @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public ExperimentParticipation convertedAt(OffsetDateTime convertedAt) {
    this.convertedAt = convertedAt;
    return this;
  }

  /**
   * Get convertedAt
   * @return convertedAt
  */
  @Valid 
  @Schema(name = "convertedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("convertedAt")
  public OffsetDateTime getConvertedAt() {
    return convertedAt;
  }

  public void setConvertedAt(OffsetDateTime convertedAt) {
    this.convertedAt = convertedAt;
  }

  public ExperimentParticipation conversionData(Map<String, Object> conversionData) {
    this.conversionData = conversionData;
    return this;
  }

  public ExperimentParticipation putConversionDataItem(String key, Object conversionDataItem) {
    if (this.conversionData == null) {
      this.conversionData = new HashMap<>();
    }
    this.conversionData.put(key, conversionDataItem);
    return this;
  }

  /**
   * Get conversionData
   * @return conversionData
  */
  
  @Schema(name = "conversionData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionData")
  public Map<String, Object> getConversionData() {
    return conversionData;
  }

  public void setConversionData(Map<String, Object> conversionData) {
    this.conversionData = conversionData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentParticipation experimentParticipation = (ExperimentParticipation) o;
    return Objects.equals(this.id, experimentParticipation.id) &&
        Objects.equals(this.userId, experimentParticipation.userId) &&
        Objects.equals(this.experimentId, experimentParticipation.experimentId) &&
        Objects.equals(this.variant, experimentParticipation.variant) &&
        Objects.equals(this.startedAt, experimentParticipation.startedAt) &&
        Objects.equals(this.convertedAt, experimentParticipation.convertedAt) &&
        Objects.equals(this.conversionData, experimentParticipation.conversionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, experimentId, variant, startedAt, convertedAt, conversionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentParticipation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    convertedAt: ").append(toIndentedString(convertedAt)).append("\n");
    sb.append("    conversionData: ").append(toIndentedString(conversionData)).append("\n");
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

