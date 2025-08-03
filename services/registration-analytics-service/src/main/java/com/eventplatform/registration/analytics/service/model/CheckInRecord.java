package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.CheckInMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * CheckInRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CheckInRecord {

  private UUID id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime checkInTime;

  private CheckInMethod method;

  private String location;

  private String deviceId;

  @Valid
  private Map<String, Object> additionalData = new HashMap<>();

  public CheckInRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckInRecord(UUID id, OffsetDateTime checkInTime, CheckInMethod method, String location) {
    this.id = id;
    this.checkInTime = checkInTime;
    this.method = method;
    this.location = location;
  }

  public CheckInRecord id(UUID id) {
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

  public CheckInRecord checkInTime(OffsetDateTime checkInTime) {
    this.checkInTime = checkInTime;
    return this;
  }

  /**
   * Get checkInTime
   * @return checkInTime
  */
  @NotNull @Valid 
  @Schema(name = "checkInTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("checkInTime")
  public OffsetDateTime getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(OffsetDateTime checkInTime) {
    this.checkInTime = checkInTime;
  }

  public CheckInRecord method(CheckInMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull @Valid 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public CheckInMethod getMethod() {
    return method;
  }

  public void setMethod(CheckInMethod method) {
    this.method = method;
  }

  public CheckInRecord location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @NotNull 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CheckInRecord deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
  */
  
  @Schema(name = "deviceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public CheckInRecord additionalData(Map<String, Object> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public CheckInRecord putAdditionalDataItem(String key, Object additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
  */
  
  @Schema(name = "additionalData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalData")
  public Map<String, Object> getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Map<String, Object> additionalData) {
    this.additionalData = additionalData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckInRecord checkInRecord = (CheckInRecord) o;
    return Objects.equals(this.id, checkInRecord.id) &&
        Objects.equals(this.checkInTime, checkInRecord.checkInTime) &&
        Objects.equals(this.method, checkInRecord.method) &&
        Objects.equals(this.location, checkInRecord.location) &&
        Objects.equals(this.deviceId, checkInRecord.deviceId) &&
        Objects.equals(this.additionalData, checkInRecord.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checkInTime, method, location, deviceId, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

