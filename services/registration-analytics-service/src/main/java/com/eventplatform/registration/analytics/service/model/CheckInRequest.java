package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.CheckInMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CheckInRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CheckInRequest {

  private CheckInMethod method;

  private String location;

  private String deviceId;

  @Valid
  private Map<String, Object> verificationData = new HashMap<>();

  @Valid
  private Map<String, Object> additionalData = new HashMap<>();

  public CheckInRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckInRequest(CheckInMethod method, String location) {
    this.method = method;
    this.location = location;
  }

  public CheckInRequest method(CheckInMethod method) {
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

  public CheckInRequest location(String location) {
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

  public CheckInRequest deviceId(String deviceId) {
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

  public CheckInRequest verificationData(Map<String, Object> verificationData) {
    this.verificationData = verificationData;
    return this;
  }

  public CheckInRequest putVerificationDataItem(String key, Object verificationDataItem) {
    if (this.verificationData == null) {
      this.verificationData = new HashMap<>();
    }
    this.verificationData.put(key, verificationDataItem);
    return this;
  }

  /**
   * QR code data, NFC tag info, etc.
   * @return verificationData
  */
  
  @Schema(name = "verificationData", description = "QR code data, NFC tag info, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verificationData")
  public Map<String, Object> getVerificationData() {
    return verificationData;
  }

  public void setVerificationData(Map<String, Object> verificationData) {
    this.verificationData = verificationData;
  }

  public CheckInRequest additionalData(Map<String, Object> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public CheckInRequest putAdditionalDataItem(String key, Object additionalDataItem) {
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
    CheckInRequest checkInRequest = (CheckInRequest) o;
    return Objects.equals(this.method, checkInRequest.method) &&
        Objects.equals(this.location, checkInRequest.location) &&
        Objects.equals(this.deviceId, checkInRequest.deviceId) &&
        Objects.equals(this.verificationData, checkInRequest.verificationData) &&
        Objects.equals(this.additionalData, checkInRequest.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, location, deviceId, verificationData, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    verificationData: ").append(toIndentedString(verificationData)).append("\n");
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

