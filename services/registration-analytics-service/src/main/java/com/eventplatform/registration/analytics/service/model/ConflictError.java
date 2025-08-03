package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ConflictError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConflictError {

  /**
   * Gets or Sets error
   */
  public enum ErrorEnum {
    ALREADY_REGISTERED("ALREADY_REGISTERED"),
    
    TICKETS_SOLD_OUT("TICKETS_SOLD_OUT"),
    
    INVALID_STATUS_TRANSITION("INVALID_STATUS_TRANSITION"),
    
    CONCURRENT_MODIFICATION("CONCURRENT_MODIFICATION");

    private String value;

    ErrorEnum(String value) {
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
    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ErrorEnum error;

  private String message;

  @Valid
  private Map<String, Object> details = new HashMap<>();

  @Valid
  private List<String> suggestedActions;

  public ConflictError error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public ConflictError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConflictError details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public ConflictError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  public ConflictError suggestedActions(List<String> suggestedActions) {
    this.suggestedActions = suggestedActions;
    return this;
  }

  public ConflictError addSuggestedActionsItem(String suggestedActionsItem) {
    if (this.suggestedActions == null) {
      this.suggestedActions = new ArrayList<>();
    }
    this.suggestedActions.add(suggestedActionsItem);
    return this;
  }

  /**
   * Get suggestedActions
   * @return suggestedActions
  */
  
  @Schema(name = "suggestedActions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestedActions")
  public List<String> getSuggestedActions() {
    return suggestedActions;
  }

  public void setSuggestedActions(List<String> suggestedActions) {
    this.suggestedActions = suggestedActions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConflictError conflictError = (ConflictError) o;
    return Objects.equals(this.error, conflictError.error) &&
        Objects.equals(this.message, conflictError.message) &&
        Objects.equals(this.details, conflictError.details) &&
        Objects.equals(this.suggestedActions, conflictError.suggestedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message, details, suggestedActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConflictError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    suggestedActions: ").append(toIndentedString(suggestedActions)).append("\n");
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

