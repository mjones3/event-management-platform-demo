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
 * RealTimeAnalyticsLiveMetrics
 */

@JsonTypeName("RealTimeAnalytics_liveMetrics")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RealTimeAnalyticsLiveMetrics {

  private Integer registrationsLastHour;

  private Integer checkInsLastHour;

  private Double averageSessionDuration;

  public RealTimeAnalyticsLiveMetrics registrationsLastHour(Integer registrationsLastHour) {
    this.registrationsLastHour = registrationsLastHour;
    return this;
  }

  /**
   * Get registrationsLastHour
   * @return registrationsLastHour
  */
  
  @Schema(name = "registrationsLastHour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationsLastHour")
  public Integer getRegistrationsLastHour() {
    return registrationsLastHour;
  }

  public void setRegistrationsLastHour(Integer registrationsLastHour) {
    this.registrationsLastHour = registrationsLastHour;
  }

  public RealTimeAnalyticsLiveMetrics checkInsLastHour(Integer checkInsLastHour) {
    this.checkInsLastHour = checkInsLastHour;
    return this;
  }

  /**
   * Get checkInsLastHour
   * @return checkInsLastHour
  */
  
  @Schema(name = "checkInsLastHour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkInsLastHour")
  public Integer getCheckInsLastHour() {
    return checkInsLastHour;
  }

  public void setCheckInsLastHour(Integer checkInsLastHour) {
    this.checkInsLastHour = checkInsLastHour;
  }

  public RealTimeAnalyticsLiveMetrics averageSessionDuration(Double averageSessionDuration) {
    this.averageSessionDuration = averageSessionDuration;
    return this;
  }

  /**
   * Get averageSessionDuration
   * @return averageSessionDuration
  */
  
  @Schema(name = "averageSessionDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageSessionDuration")
  public Double getAverageSessionDuration() {
    return averageSessionDuration;
  }

  public void setAverageSessionDuration(Double averageSessionDuration) {
    this.averageSessionDuration = averageSessionDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeAnalyticsLiveMetrics realTimeAnalyticsLiveMetrics = (RealTimeAnalyticsLiveMetrics) o;
    return Objects.equals(this.registrationsLastHour, realTimeAnalyticsLiveMetrics.registrationsLastHour) &&
        Objects.equals(this.checkInsLastHour, realTimeAnalyticsLiveMetrics.checkInsLastHour) &&
        Objects.equals(this.averageSessionDuration, realTimeAnalyticsLiveMetrics.averageSessionDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationsLastHour, checkInsLastHour, averageSessionDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeAnalyticsLiveMetrics {\n");
    sb.append("    registrationsLastHour: ").append(toIndentedString(registrationsLastHour)).append("\n");
    sb.append("    checkInsLastHour: ").append(toIndentedString(checkInsLastHour)).append("\n");
    sb.append("    averageSessionDuration: ").append(toIndentedString(averageSessionDuration)).append("\n");
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

