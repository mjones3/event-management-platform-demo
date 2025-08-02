package com.eventplatform.event.management.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateEventManagementServiceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateEventManagementServiceRequest {

  private String name;

  private String description;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    PENDING("PENDING");

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

  public UpdateEventManagementServiceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Size(min = 1, max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateEventManagementServiceRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Size(max = 500) 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateEventManagementServiceRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEventManagementServiceRequest updateEventManagementServiceRequest = (UpdateEventManagementServiceRequest) o;
    return Objects.equals(this.name, updateEventManagementServiceRequest.name) &&
        Objects.equals(this.description, updateEventManagementServiceRequest.description) &&
        Objects.equals(this.status, updateEventManagementServiceRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventManagementServiceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

