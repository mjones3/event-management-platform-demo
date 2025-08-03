package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.Registration;
import com.eventplatform.registration.analytics.service.model.RegistrationSummaryReportDailyRegistrationsInner;
import com.eventplatform.registration.analytics.service.model.RegistrationSummaryReportSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegistrationSummaryReport
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationSummaryReport {

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  private RegistrationSummaryReportSummary summary;

  @Valid
  private Map<String, Integer> statusBreakdown = new HashMap<>();

  @Valid
  private Map<String, Integer> paymentMethodBreakdown = new HashMap<>();

  @Valid
  private List<@Valid RegistrationSummaryReportDailyRegistrationsInner> dailyRegistrations;

  @Valid
  private List<@Valid Registration> registrations;

  public RegistrationSummaryReport eventId(String eventId) {
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

  public RegistrationSummaryReport generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @Valid 
  @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public RegistrationSummaryReport summary(RegistrationSummaryReportSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid 
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public RegistrationSummaryReportSummary getSummary() {
    return summary;
  }

  public void setSummary(RegistrationSummaryReportSummary summary) {
    this.summary = summary;
  }

  public RegistrationSummaryReport statusBreakdown(Map<String, Integer> statusBreakdown) {
    this.statusBreakdown = statusBreakdown;
    return this;
  }

  public RegistrationSummaryReport putStatusBreakdownItem(String key, Integer statusBreakdownItem) {
    if (this.statusBreakdown == null) {
      this.statusBreakdown = new HashMap<>();
    }
    this.statusBreakdown.put(key, statusBreakdownItem);
    return this;
  }

  /**
   * Get statusBreakdown
   * @return statusBreakdown
  */
  
  @Schema(name = "statusBreakdown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusBreakdown")
  public Map<String, Integer> getStatusBreakdown() {
    return statusBreakdown;
  }

  public void setStatusBreakdown(Map<String, Integer> statusBreakdown) {
    this.statusBreakdown = statusBreakdown;
  }

  public RegistrationSummaryReport paymentMethodBreakdown(Map<String, Integer> paymentMethodBreakdown) {
    this.paymentMethodBreakdown = paymentMethodBreakdown;
    return this;
  }

  public RegistrationSummaryReport putPaymentMethodBreakdownItem(String key, Integer paymentMethodBreakdownItem) {
    if (this.paymentMethodBreakdown == null) {
      this.paymentMethodBreakdown = new HashMap<>();
    }
    this.paymentMethodBreakdown.put(key, paymentMethodBreakdownItem);
    return this;
  }

  /**
   * Get paymentMethodBreakdown
   * @return paymentMethodBreakdown
  */
  
  @Schema(name = "paymentMethodBreakdown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethodBreakdown")
  public Map<String, Integer> getPaymentMethodBreakdown() {
    return paymentMethodBreakdown;
  }

  public void setPaymentMethodBreakdown(Map<String, Integer> paymentMethodBreakdown) {
    this.paymentMethodBreakdown = paymentMethodBreakdown;
  }

  public RegistrationSummaryReport dailyRegistrations(List<@Valid RegistrationSummaryReportDailyRegistrationsInner> dailyRegistrations) {
    this.dailyRegistrations = dailyRegistrations;
    return this;
  }

  public RegistrationSummaryReport addDailyRegistrationsItem(RegistrationSummaryReportDailyRegistrationsInner dailyRegistrationsItem) {
    if (this.dailyRegistrations == null) {
      this.dailyRegistrations = new ArrayList<>();
    }
    this.dailyRegistrations.add(dailyRegistrationsItem);
    return this;
  }

  /**
   * Get dailyRegistrations
   * @return dailyRegistrations
  */
  @Valid 
  @Schema(name = "dailyRegistrations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dailyRegistrations")
  public List<@Valid RegistrationSummaryReportDailyRegistrationsInner> getDailyRegistrations() {
    return dailyRegistrations;
  }

  public void setDailyRegistrations(List<@Valid RegistrationSummaryReportDailyRegistrationsInner> dailyRegistrations) {
    this.dailyRegistrations = dailyRegistrations;
  }

  public RegistrationSummaryReport registrations(List<@Valid Registration> registrations) {
    this.registrations = registrations;
    return this;
  }

  public RegistrationSummaryReport addRegistrationsItem(Registration registrationsItem) {
    if (this.registrations == null) {
      this.registrations = new ArrayList<>();
    }
    this.registrations.add(registrationsItem);
    return this;
  }

  /**
   * Detailed registration list (only if includeDetails=true)
   * @return registrations
  */
  @Valid 
  @Schema(name = "registrations", description = "Detailed registration list (only if includeDetails=true)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrations")
  public List<@Valid Registration> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(List<@Valid Registration> registrations) {
    this.registrations = registrations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationSummaryReport registrationSummaryReport = (RegistrationSummaryReport) o;
    return Objects.equals(this.eventId, registrationSummaryReport.eventId) &&
        Objects.equals(this.generatedAt, registrationSummaryReport.generatedAt) &&
        Objects.equals(this.summary, registrationSummaryReport.summary) &&
        Objects.equals(this.statusBreakdown, registrationSummaryReport.statusBreakdown) &&
        Objects.equals(this.paymentMethodBreakdown, registrationSummaryReport.paymentMethodBreakdown) &&
        Objects.equals(this.dailyRegistrations, registrationSummaryReport.dailyRegistrations) &&
        Objects.equals(this.registrations, registrationSummaryReport.registrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, generatedAt, summary, statusBreakdown, paymentMethodBreakdown, dailyRegistrations, registrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationSummaryReport {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    statusBreakdown: ").append(toIndentedString(statusBreakdown)).append("\n");
    sb.append("    paymentMethodBreakdown: ").append(toIndentedString(paymentMethodBreakdown)).append("\n");
    sb.append("    dailyRegistrations: ").append(toIndentedString(dailyRegistrations)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
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

