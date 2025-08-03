package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.RegistrationStatus;
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
 * UpdateRegistrationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UpdateRegistrationRequest {

  private RegistrationStatus status;

  @Valid
  private Map<String, Object> registrationData = new HashMap<>();

  @Valid
  private List<String> selectedTicketTierIds;

  public UpdateRegistrationRequest status(RegistrationStatus status) {
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

  public UpdateRegistrationRequest registrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
    return this;
  }

  public UpdateRegistrationRequest putRegistrationDataItem(String key, Object registrationDataItem) {
    if (this.registrationData == null) {
      this.registrationData = new HashMap<>();
    }
    this.registrationData.put(key, registrationDataItem);
    return this;
  }

  /**
   * Get registrationData
   * @return registrationData
  */
  
  @Schema(name = "registrationData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationData")
  public Map<String, Object> getRegistrationData() {
    return registrationData;
  }

  public void setRegistrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
  }

  public UpdateRegistrationRequest selectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
    return this;
  }

  public UpdateRegistrationRequest addSelectedTicketTierIdsItem(String selectedTicketTierIdsItem) {
    if (this.selectedTicketTierIds == null) {
      this.selectedTicketTierIds = new ArrayList<>();
    }
    this.selectedTicketTierIds.add(selectedTicketTierIdsItem);
    return this;
  }

  /**
   * Get selectedTicketTierIds
   * @return selectedTicketTierIds
  */
  
  @Schema(name = "selectedTicketTierIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedTicketTierIds")
  public List<String> getSelectedTicketTierIds() {
    return selectedTicketTierIds;
  }

  public void setSelectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRegistrationRequest updateRegistrationRequest = (UpdateRegistrationRequest) o;
    return Objects.equals(this.status, updateRegistrationRequest.status) &&
        Objects.equals(this.registrationData, updateRegistrationRequest.registrationData) &&
        Objects.equals(this.selectedTicketTierIds, updateRegistrationRequest.selectedTicketTierIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, registrationData, selectedTicketTierIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRegistrationRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registrationData: ").append(toIndentedString(registrationData)).append("\n");
    sb.append("    selectedTicketTierIds: ").append(toIndentedString(selectedTicketTierIds)).append("\n");
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

