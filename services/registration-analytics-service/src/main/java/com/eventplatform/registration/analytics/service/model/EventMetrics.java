package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * EventMetrics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EventMetrics {

  private Integer totalViews;

  private Integer uniqueVisitors;

  private Integer registrationStarted;

  private Integer registrationCompleted;

  private Double conversionRate;

  private Double totalRevenue;

  private Double averageOrderValue;

  @Valid
  private Map<String, Integer> trafficSources = new HashMap<>();

  @Valid
  private Map<String, Object> customMetrics = new HashMap<>();

  public EventMetrics totalViews(Integer totalViews) {
    this.totalViews = totalViews;
    return this;
  }

  /**
   * Get totalViews
   * @return totalViews
  */
  
  @Schema(name = "totalViews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalViews")
  public Integer getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(Integer totalViews) {
    this.totalViews = totalViews;
  }

  public EventMetrics uniqueVisitors(Integer uniqueVisitors) {
    this.uniqueVisitors = uniqueVisitors;
    return this;
  }

  /**
   * Get uniqueVisitors
   * @return uniqueVisitors
  */
  
  @Schema(name = "uniqueVisitors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uniqueVisitors")
  public Integer getUniqueVisitors() {
    return uniqueVisitors;
  }

  public void setUniqueVisitors(Integer uniqueVisitors) {
    this.uniqueVisitors = uniqueVisitors;
  }

  public EventMetrics registrationStarted(Integer registrationStarted) {
    this.registrationStarted = registrationStarted;
    return this;
  }

  /**
   * Get registrationStarted
   * @return registrationStarted
  */
  
  @Schema(name = "registrationStarted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationStarted")
  public Integer getRegistrationStarted() {
    return registrationStarted;
  }

  public void setRegistrationStarted(Integer registrationStarted) {
    this.registrationStarted = registrationStarted;
  }

  public EventMetrics registrationCompleted(Integer registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
    return this;
  }

  /**
   * Get registrationCompleted
   * @return registrationCompleted
  */
  
  @Schema(name = "registrationCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationCompleted")
  public Integer getRegistrationCompleted() {
    return registrationCompleted;
  }

  public void setRegistrationCompleted(Integer registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
  }

  public EventMetrics conversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Get conversionRate
   * @return conversionRate
  */
  
  @Schema(name = "conversionRate", example = "0.25", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionRate")
  public Double getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
  }

  public EventMetrics totalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

  /**
   * Get totalRevenue
   * @return totalRevenue
  */
  
  @Schema(name = "totalRevenue", example = "15000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRevenue")
  public Double getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public EventMetrics averageOrderValue(Double averageOrderValue) {
    this.averageOrderValue = averageOrderValue;
    return this;
  }

  /**
   * Get averageOrderValue
   * @return averageOrderValue
  */
  
  @Schema(name = "averageOrderValue", example = "125.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageOrderValue")
  public Double getAverageOrderValue() {
    return averageOrderValue;
  }

  public void setAverageOrderValue(Double averageOrderValue) {
    this.averageOrderValue = averageOrderValue;
  }

  public EventMetrics trafficSources(Map<String, Integer> trafficSources) {
    this.trafficSources = trafficSources;
    return this;
  }

  public EventMetrics putTrafficSourcesItem(String key, Integer trafficSourcesItem) {
    if (this.trafficSources == null) {
      this.trafficSources = new HashMap<>();
    }
    this.trafficSources.put(key, trafficSourcesItem);
    return this;
  }

  /**
   * Get trafficSources
   * @return trafficSources
  */
  
  @Schema(name = "trafficSources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficSources")
  public Map<String, Integer> getTrafficSources() {
    return trafficSources;
  }

  public void setTrafficSources(Map<String, Integer> trafficSources) {
    this.trafficSources = trafficSources;
  }

  public EventMetrics customMetrics(Map<String, Object> customMetrics) {
    this.customMetrics = customMetrics;
    return this;
  }

  public EventMetrics putCustomMetricsItem(String key, Object customMetricsItem) {
    if (this.customMetrics == null) {
      this.customMetrics = new HashMap<>();
    }
    this.customMetrics.put(key, customMetricsItem);
    return this;
  }

  /**
   * Get customMetrics
   * @return customMetrics
  */
  
  @Schema(name = "customMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customMetrics")
  public Map<String, Object> getCustomMetrics() {
    return customMetrics;
  }

  public void setCustomMetrics(Map<String, Object> customMetrics) {
    this.customMetrics = customMetrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMetrics eventMetrics = (EventMetrics) o;
    return Objects.equals(this.totalViews, eventMetrics.totalViews) &&
        Objects.equals(this.uniqueVisitors, eventMetrics.uniqueVisitors) &&
        Objects.equals(this.registrationStarted, eventMetrics.registrationStarted) &&
        Objects.equals(this.registrationCompleted, eventMetrics.registrationCompleted) &&
        Objects.equals(this.conversionRate, eventMetrics.conversionRate) &&
        Objects.equals(this.totalRevenue, eventMetrics.totalRevenue) &&
        Objects.equals(this.averageOrderValue, eventMetrics.averageOrderValue) &&
        Objects.equals(this.trafficSources, eventMetrics.trafficSources) &&
        Objects.equals(this.customMetrics, eventMetrics.customMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalViews, uniqueVisitors, registrationStarted, registrationCompleted, conversionRate, totalRevenue, averageOrderValue, trafficSources, customMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventMetrics {\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    uniqueVisitors: ").append(toIndentedString(uniqueVisitors)).append("\n");
    sb.append("    registrationStarted: ").append(toIndentedString(registrationStarted)).append("\n");
    sb.append("    registrationCompleted: ").append(toIndentedString(registrationCompleted)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    averageOrderValue: ").append(toIndentedString(averageOrderValue)).append("\n");
    sb.append("    trafficSources: ").append(toIndentedString(trafficSources)).append("\n");
    sb.append("    customMetrics: ").append(toIndentedString(customMetrics)).append("\n");
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

