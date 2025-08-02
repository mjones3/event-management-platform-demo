package com.eventplatform.event.management.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HealthResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class HealthResponse {

  private String status;

  private String service;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String version;

  public HealthResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HealthResponse(String status, String service, OffsetDateTime timestamp) {
    this.status = status;
    this.service = service;
    this.timestamp = timestamp;
  }

  public HealthResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "UP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HealthResponse service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @NotNull 
  @Schema(name = "service", example = "event-management-service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public HealthResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @NotNull @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HealthResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", example = "1.0.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthResponse healthResponse = (HealthResponse) o;
    return Objects.equals(this.status, healthResponse.status) &&
        Objects.equals(this.service, healthResponse.service) &&
        Objects.equals(this.timestamp, healthResponse.timestamp) &&
        Objects.equals(this.version, healthResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, service, timestamp, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

