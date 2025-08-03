package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealTimeAnalyticsSessionAttendanceInner
 */

@JsonTypeName("RealTimeAnalytics_sessionAttendance_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealTimeAnalyticsSessionAttendanceInner {

  private String sessionId;

  private Integer attendeeCount;

  private Integer capacity;

  public RealTimeAnalyticsSessionAttendanceInner sessionId(String sessionId) {
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

  public RealTimeAnalyticsSessionAttendanceInner attendeeCount(Integer attendeeCount) {
    this.attendeeCount = attendeeCount;
    return this;
  }

  /**
   * Get attendeeCount
   * @return attendeeCount
  */
  
  @Schema(name = "attendeeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attendeeCount")
  public Integer getAttendeeCount() {
    return attendeeCount;
  }

  public void setAttendeeCount(Integer attendeeCount) {
    this.attendeeCount = attendeeCount;
  }

  public RealTimeAnalyticsSessionAttendanceInner capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  
  @Schema(name = "capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capacity")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeAnalyticsSessionAttendanceInner realTimeAnalyticsSessionAttendanceInner = (RealTimeAnalyticsSessionAttendanceInner) o;
    return Objects.equals(this.sessionId, realTimeAnalyticsSessionAttendanceInner.sessionId) &&
        Objects.equals(this.attendeeCount, realTimeAnalyticsSessionAttendanceInner.attendeeCount) &&
        Objects.equals(this.capacity, realTimeAnalyticsSessionAttendanceInner.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, attendeeCount, capacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeAnalyticsSessionAttendanceInner {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    attendeeCount: ").append(toIndentedString(attendeeCount)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

