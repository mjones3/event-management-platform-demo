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
 * RegistrationSummaryReportSummary
 */

@JsonTypeName("RegistrationSummaryReport_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationSummaryReportSummary {

  private Integer totalRegistrations;

  private Integer confirmedRegistrations;

  private Integer checkedInAttendees;

  private Double totalRevenue;

  private Double averageRegistrationValue;

  public RegistrationSummaryReportSummary totalRegistrations(Integer totalRegistrations) {
    this.totalRegistrations = totalRegistrations;
    return this;
  }

  /**
   * Get totalRegistrations
   * @return totalRegistrations
  */
  
  @Schema(name = "totalRegistrations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRegistrations")
  public Integer getTotalRegistrations() {
    return totalRegistrations;
  }

  public void setTotalRegistrations(Integer totalRegistrations) {
    this.totalRegistrations = totalRegistrations;
  }

  public RegistrationSummaryReportSummary confirmedRegistrations(Integer confirmedRegistrations) {
    this.confirmedRegistrations = confirmedRegistrations;
    return this;
  }

  /**
   * Get confirmedRegistrations
   * @return confirmedRegistrations
  */
  
  @Schema(name = "confirmedRegistrations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmedRegistrations")
  public Integer getConfirmedRegistrations() {
    return confirmedRegistrations;
  }

  public void setConfirmedRegistrations(Integer confirmedRegistrations) {
    this.confirmedRegistrations = confirmedRegistrations;
  }

  public RegistrationSummaryReportSummary checkedInAttendees(Integer checkedInAttendees) {
    this.checkedInAttendees = checkedInAttendees;
    return this;
  }

  /**
   * Get checkedInAttendees
   * @return checkedInAttendees
  */
  
  @Schema(name = "checkedInAttendees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkedInAttendees")
  public Integer getCheckedInAttendees() {
    return checkedInAttendees;
  }

  public void setCheckedInAttendees(Integer checkedInAttendees) {
    this.checkedInAttendees = checkedInAttendees;
  }

  public RegistrationSummaryReportSummary totalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

  /**
   * Get totalRevenue
   * @return totalRevenue
  */
  
  @Schema(name = "totalRevenue", example = "25000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRevenue")
  public Double getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(Double totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public RegistrationSummaryReportSummary averageRegistrationValue(Double averageRegistrationValue) {
    this.averageRegistrationValue = averageRegistrationValue;
    return this;
  }

  /**
   * Get averageRegistrationValue
   * @return averageRegistrationValue
  */
  
  @Schema(name = "averageRegistrationValue", example = "125.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageRegistrationValue")
  public Double getAverageRegistrationValue() {
    return averageRegistrationValue;
  }

  public void setAverageRegistrationValue(Double averageRegistrationValue) {
    this.averageRegistrationValue = averageRegistrationValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationSummaryReportSummary registrationSummaryReportSummary = (RegistrationSummaryReportSummary) o;
    return Objects.equals(this.totalRegistrations, registrationSummaryReportSummary.totalRegistrations) &&
        Objects.equals(this.confirmedRegistrations, registrationSummaryReportSummary.confirmedRegistrations) &&
        Objects.equals(this.checkedInAttendees, registrationSummaryReportSummary.checkedInAttendees) &&
        Objects.equals(this.totalRevenue, registrationSummaryReportSummary.totalRevenue) &&
        Objects.equals(this.averageRegistrationValue, registrationSummaryReportSummary.averageRegistrationValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRegistrations, confirmedRegistrations, checkedInAttendees, totalRevenue, averageRegistrationValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationSummaryReportSummary {\n");
    sb.append("    totalRegistrations: ").append(toIndentedString(totalRegistrations)).append("\n");
    sb.append("    confirmedRegistrations: ").append(toIndentedString(confirmedRegistrations)).append("\n");
    sb.append("    checkedInAttendees: ").append(toIndentedString(checkedInAttendees)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    averageRegistrationValue: ").append(toIndentedString(averageRegistrationValue)).append("\n");
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

