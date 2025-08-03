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
 * ExperimentParticipationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExperimentParticipationRequest {

  private UUID userId;

  @Valid
  private Map<String, Object> userContext = new HashMap<>();

  public ExperimentParticipationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExperimentParticipationRequest(UUID userId) {
    this.userId = userId;
  }

  public ExperimentParticipationRequest userId(UUID userId) {
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

  public ExperimentParticipationRequest userContext(Map<String, Object> userContext) {
    this.userContext = userContext;
    return this;
  }

  public ExperimentParticipationRequest putUserContextItem(String key, Object userContextItem) {
    if (this.userContext == null) {
      this.userContext = new HashMap<>();
    }
    this.userContext.put(key, userContextItem);
    return this;
  }

  /**
   * Get userContext
   * @return userContext
  */
  
  @Schema(name = "userContext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userContext")
  public Map<String, Object> getUserContext() {
    return userContext;
  }

  public void setUserContext(Map<String, Object> userContext) {
    this.userContext = userContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentParticipationRequest experimentParticipationRequest = (ExperimentParticipationRequest) o;
    return Objects.equals(this.userId, experimentParticipationRequest.userId) &&
        Objects.equals(this.userContext, experimentParticipationRequest.userContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentParticipationRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userContext: ").append(toIndentedString(userContext)).append("\n");
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

