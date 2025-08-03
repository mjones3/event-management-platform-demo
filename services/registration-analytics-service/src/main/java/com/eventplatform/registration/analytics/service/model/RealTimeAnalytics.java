package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.RealTimeAnalyticsLiveMetrics;
import com.eventplatform.registration.analytics.service.model.RealTimeAnalyticsSessionAttendanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealTimeAnalytics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealTimeAnalytics {

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private Integer currentAttendees;

  private Integer totalCheckIns;

  private RealTimeAnalyticsLiveMetrics liveMetrics;

  @Valid
  private List<@Valid RealTimeAnalyticsSessionAttendanceInner> sessionAttendance;

  public RealTimeAnalytics eventId(String eventId) {
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

  public RealTimeAnalytics timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public RealTimeAnalytics currentAttendees(Integer currentAttendees) {
    this.currentAttendees = currentAttendees;
    return this;
  }

  /**
   * Get currentAttendees
   * @return currentAttendees
  */
  
  @Schema(name = "currentAttendees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentAttendees")
  public Integer getCurrentAttendees() {
    return currentAttendees;
  }

  public void setCurrentAttendees(Integer currentAttendees) {
    this.currentAttendees = currentAttendees;
  }

  public RealTimeAnalytics totalCheckIns(Integer totalCheckIns) {
    this.totalCheckIns = totalCheckIns;
    return this;
  }

  /**
   * Get totalCheckIns
   * @return totalCheckIns
  */
  
  @Schema(name = "totalCheckIns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCheckIns")
  public Integer getTotalCheckIns() {
    return totalCheckIns;
  }

  public void setTotalCheckIns(Integer totalCheckIns) {
    this.totalCheckIns = totalCheckIns;
  }

  public RealTimeAnalytics liveMetrics(RealTimeAnalyticsLiveMetrics liveMetrics) {
    this.liveMetrics = liveMetrics;
    return this;
  }

  /**
   * Get liveMetrics
   * @return liveMetrics
  */
  @Valid 
  @Schema(name = "liveMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liveMetrics")
  public RealTimeAnalyticsLiveMetrics getLiveMetrics() {
    return liveMetrics;
  }

  public void setLiveMetrics(RealTimeAnalyticsLiveMetrics liveMetrics) {
    this.liveMetrics = liveMetrics;
  }

  public RealTimeAnalytics sessionAttendance(List<@Valid RealTimeAnalyticsSessionAttendanceInner> sessionAttendance) {
    this.sessionAttendance = sessionAttendance;
    return this;
  }

  public RealTimeAnalytics addSessionAttendanceItem(RealTimeAnalyticsSessionAttendanceInner sessionAttendanceItem) {
    if (this.sessionAttendance == null) {
      this.sessionAttendance = new ArrayList<>();
    }
    this.sessionAttendance.add(sessionAttendanceItem);
    return this;
  }

  /**
   * Get sessionAttendance
   * @return sessionAttendance
  */
  @Valid 
  @Schema(name = "sessionAttendance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionAttendance")
  public List<@Valid RealTimeAnalyticsSessionAttendanceInner> getSessionAttendance() {
    return sessionAttendance;
  }

  public void setSessionAttendance(List<@Valid RealTimeAnalyticsSessionAttendanceInner> sessionAttendance) {
    this.sessionAttendance = sessionAttendance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeAnalytics realTimeAnalytics = (RealTimeAnalytics) o;
    return Objects.equals(this.eventId, realTimeAnalytics.eventId) &&
        Objects.equals(this.timestamp, realTimeAnalytics.timestamp) &&
        Objects.equals(this.currentAttendees, realTimeAnalytics.currentAttendees) &&
        Objects.equals(this.totalCheckIns, realTimeAnalytics.totalCheckIns) &&
        Objects.equals(this.liveMetrics, realTimeAnalytics.liveMetrics) &&
        Objects.equals(this.sessionAttendance, realTimeAnalytics.sessionAttendance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, timestamp, currentAttendees, totalCheckIns, liveMetrics, sessionAttendance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeAnalytics {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    currentAttendees: ").append(toIndentedString(currentAttendees)).append("\n");
    sb.append("    totalCheckIns: ").append(toIndentedString(totalCheckIns)).append("\n");
    sb.append("    liveMetrics: ").append(toIndentedString(liveMetrics)).append("\n");
    sb.append("    sessionAttendance: ").append(toIndentedString(sessionAttendance)).append("\n");
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

