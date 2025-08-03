package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.RegistrationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * BulkRegistrationRequestCriteria
 */

@JsonTypeName("BulkRegistrationRequest_criteria")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BulkRegistrationRequestCriteria {

  @Valid
  private List<UUID> registrationIds;

  private String eventId;

  private RegistrationStatus status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registeredAfter;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registeredBefore;

  public BulkRegistrationRequestCriteria registrationIds(List<UUID> registrationIds) {
    this.registrationIds = registrationIds;
    return this;
  }

  public BulkRegistrationRequestCriteria addRegistrationIdsItem(UUID registrationIdsItem) {
    if (this.registrationIds == null) {
      this.registrationIds = new ArrayList<>();
    }
    this.registrationIds.add(registrationIdsItem);
    return this;
  }

  /**
   * Get registrationIds
   * @return registrationIds
  */
  @Valid 
  @Schema(name = "registrationIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationIds")
  public List<UUID> getRegistrationIds() {
    return registrationIds;
  }

  public void setRegistrationIds(List<UUID> registrationIds) {
    this.registrationIds = registrationIds;
  }

  public BulkRegistrationRequestCriteria eventId(String eventId) {
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

  public BulkRegistrationRequestCriteria status(RegistrationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public RegistrationStatus getStatus() {
    return status;
  }

  public void setStatus(RegistrationStatus status) {
    this.status = status;
  }

  public BulkRegistrationRequestCriteria registeredAfter(OffsetDateTime registeredAfter) {
    this.registeredAfter = registeredAfter;
    return this;
  }

  /**
   * Get registeredAfter
   * @return registeredAfter
  */
  @Valid 
  @Schema(name = "registeredAfter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registeredAfter")
  public OffsetDateTime getRegisteredAfter() {
    return registeredAfter;
  }

  public void setRegisteredAfter(OffsetDateTime registeredAfter) {
    this.registeredAfter = registeredAfter;
  }

  public BulkRegistrationRequestCriteria registeredBefore(OffsetDateTime registeredBefore) {
    this.registeredBefore = registeredBefore;
    return this;
  }

  /**
   * Get registeredBefore
   * @return registeredBefore
  */
  @Valid 
  @Schema(name = "registeredBefore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registeredBefore")
  public OffsetDateTime getRegisteredBefore() {
    return registeredBefore;
  }

  public void setRegisteredBefore(OffsetDateTime registeredBefore) {
    this.registeredBefore = registeredBefore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRegistrationRequestCriteria bulkRegistrationRequestCriteria = (BulkRegistrationRequestCriteria) o;
    return Objects.equals(this.registrationIds, bulkRegistrationRequestCriteria.registrationIds) &&
        Objects.equals(this.eventId, bulkRegistrationRequestCriteria.eventId) &&
        Objects.equals(this.status, bulkRegistrationRequestCriteria.status) &&
        Objects.equals(this.registeredAfter, bulkRegistrationRequestCriteria.registeredAfter) &&
        Objects.equals(this.registeredBefore, bulkRegistrationRequestCriteria.registeredBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationIds, eventId, status, registeredAfter, registeredBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRegistrationRequestCriteria {\n");
    sb.append("    registrationIds: ").append(toIndentedString(registrationIds)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registeredAfter: ").append(toIndentedString(registeredAfter)).append("\n");
    sb.append("    registeredBefore: ").append(toIndentedString(registeredBefore)).append("\n");
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

