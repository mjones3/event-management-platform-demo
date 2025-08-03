package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExperimentParticipationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExperimentParticipationResponse {

  private UUID participationId;

  private String variant;

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  public ExperimentParticipationResponse participationId(UUID participationId) {
    this.participationId = participationId;
    return this;
  }

  /**
   * Get participationId
   * @return participationId
  */
  @Valid 
  @Schema(name = "participationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("participationId")
  public UUID getParticipationId() {
    return participationId;
  }

  public void setParticipationId(UUID participationId) {
    this.participationId = participationId;
  }

  public ExperimentParticipationResponse variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
  */
  
  @Schema(name = "variant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public ExperimentParticipationResponse _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public ExperimentParticipationResponse putConfigurationItem(String key, Object _configurationItem) {
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
    ExperimentParticipationResponse experimentParticipationResponse = (ExperimentParticipationResponse) o;
    return Objects.equals(this.participationId, experimentParticipationResponse.participationId) &&
        Objects.equals(this.variant, experimentParticipationResponse.variant) &&
        Objects.equals(this._configuration, experimentParticipationResponse._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participationId, variant, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentParticipationResponse {\n");
    sb.append("    participationId: ").append(toIndentedString(participationId)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

