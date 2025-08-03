package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.AnalyticsEventType;
import com.eventplatform.registration.analytics.service.model.GeoPoint;
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
 * AnalyticsEventRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AnalyticsEventRequest {

  private String eventId;

  private AnalyticsEventType eventType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private UUID userId;

  private String sessionId;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  private String userAgent;

  private String ipAddress;

  private GeoPoint location;

  public AnalyticsEventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalyticsEventRequest(AnalyticsEventType eventType, OffsetDateTime timestamp) {
    this.eventType = eventType;
    this.timestamp = timestamp;
  }

  public AnalyticsEventRequest eventId(String eventId) {
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

  public AnalyticsEventRequest eventType(AnalyticsEventType eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  */
  @NotNull @Valid 
  @Schema(name = "eventType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventType")
  public AnalyticsEventType getEventType() {
    return eventType;
  }

  public void setEventType(AnalyticsEventType eventType) {
    this.eventType = eventType;
  }

  public AnalyticsEventRequest timestamp(OffsetDateTime timestamp) {
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

  public AnalyticsEventRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public AnalyticsEventRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  
  @Schema(name = "sessionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public AnalyticsEventRequest properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public AnalyticsEventRequest putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
  */
  
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public AnalyticsEventRequest userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
  */
  
  @Schema(name = "userAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public AnalyticsEventRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * @return ipAddress
  */
  
  @Schema(name = "ipAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public AnalyticsEventRequest location(GeoPoint location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public GeoPoint getLocation() {
    return location;
  }

  public void setLocation(GeoPoint location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsEventRequest analyticsEventRequest = (AnalyticsEventRequest) o;
    return Objects.equals(this.eventId, analyticsEventRequest.eventId) &&
        Objects.equals(this.eventType, analyticsEventRequest.eventType) &&
        Objects.equals(this.timestamp, analyticsEventRequest.timestamp) &&
        Objects.equals(this.userId, analyticsEventRequest.userId) &&
        Objects.equals(this.sessionId, analyticsEventRequest.sessionId) &&
        Objects.equals(this.properties, analyticsEventRequest.properties) &&
        Objects.equals(this.userAgent, analyticsEventRequest.userAgent) &&
        Objects.equals(this.ipAddress, analyticsEventRequest.ipAddress) &&
        Objects.equals(this.location, analyticsEventRequest.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventType, timestamp, userId, sessionId, properties, userAgent, ipAddress, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsEventRequest {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

