package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.ConversionFunnel;
import com.eventplatform.registration.analytics.service.model.DatePeriod;
import com.eventplatform.registration.analytics.service.model.DemographicsData;
import com.eventplatform.registration.analytics.service.model.EventMetrics;
import com.eventplatform.registration.analytics.service.model.TimeSeriesDataPoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventAnalyticsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class EventAnalyticsResponse {

  private String eventId;

  private DatePeriod period;

  private EventMetrics metrics;

  @Valid
  private List<@Valid TimeSeriesDataPoint> timeSeries;

  private DemographicsData demographics;

  private ConversionFunnel conversionFunnel;

  public EventAnalyticsResponse eventId(String eventId) {
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

  public EventAnalyticsResponse period(DatePeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @Valid 
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public DatePeriod getPeriod() {
    return period;
  }

  public void setPeriod(DatePeriod period) {
    this.period = period;
  }

  public EventAnalyticsResponse metrics(EventMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Get metrics
   * @return metrics
  */
  @Valid 
  @Schema(name = "metrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics")
  public EventMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(EventMetrics metrics) {
    this.metrics = metrics;
  }

  public EventAnalyticsResponse timeSeries(List<@Valid TimeSeriesDataPoint> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public EventAnalyticsResponse addTimeSeriesItem(TimeSeriesDataPoint timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new ArrayList<>();
    }
    this.timeSeries.add(timeSeriesItem);
    return this;
  }

  /**
   * Get timeSeries
   * @return timeSeries
  */
  @Valid 
  @Schema(name = "timeSeries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSeries")
  public List<@Valid TimeSeriesDataPoint> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(List<@Valid TimeSeriesDataPoint> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public EventAnalyticsResponse demographics(DemographicsData demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
  */
  @Valid 
  @Schema(name = "demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demographics")
  public DemographicsData getDemographics() {
    return demographics;
  }

  public void setDemographics(DemographicsData demographics) {
    this.demographics = demographics;
  }

  public EventAnalyticsResponse conversionFunnel(ConversionFunnel conversionFunnel) {
    this.conversionFunnel = conversionFunnel;
    return this;
  }

  /**
   * Get conversionFunnel
   * @return conversionFunnel
  */
  @Valid 
  @Schema(name = "conversionFunnel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionFunnel")
  public ConversionFunnel getConversionFunnel() {
    return conversionFunnel;
  }

  public void setConversionFunnel(ConversionFunnel conversionFunnel) {
    this.conversionFunnel = conversionFunnel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventAnalyticsResponse eventAnalyticsResponse = (EventAnalyticsResponse) o;
    return Objects.equals(this.eventId, eventAnalyticsResponse.eventId) &&
        Objects.equals(this.period, eventAnalyticsResponse.period) &&
        Objects.equals(this.metrics, eventAnalyticsResponse.metrics) &&
        Objects.equals(this.timeSeries, eventAnalyticsResponse.timeSeries) &&
        Objects.equals(this.demographics, eventAnalyticsResponse.demographics) &&
        Objects.equals(this.conversionFunnel, eventAnalyticsResponse.conversionFunnel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, period, metrics, timeSeries, demographics, conversionFunnel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAnalyticsResponse {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    conversionFunnel: ").append(toIndentedString(conversionFunnel)).append("\n");
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

