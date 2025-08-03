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
 * ConversionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionRequest {

  private UUID userId;

  private String conversionType;

  @Valid
  private Map<String, Object> conversionData = new HashMap<>();

  public ConversionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionRequest(UUID userId, String conversionType) {
    this.userId = userId;
    this.conversionType = conversionType;
  }

  public ConversionRequest userId(UUID userId) {
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

  public ConversionRequest conversionType(String conversionType) {
    this.conversionType = conversionType;
    return this;
  }

  /**
   * Get conversionType
   * @return conversionType
  */
  @NotNull 
  @Schema(name = "conversionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversionType")
  public String getConversionType() {
    return conversionType;
  }

  public void setConversionType(String conversionType) {
    this.conversionType = conversionType;
  }

  public ConversionRequest conversionData(Map<String, Object> conversionData) {
    this.conversionData = conversionData;
    return this;
  }

  public ConversionRequest putConversionDataItem(String key, Object conversionDataItem) {
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
    ConversionRequest conversionRequest = (ConversionRequest) o;
    return Objects.equals(this.userId, conversionRequest.userId) &&
        Objects.equals(this.conversionType, conversionRequest.conversionType) &&
        Objects.equals(this.conversionData, conversionRequest.conversionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, conversionType, conversionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
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

