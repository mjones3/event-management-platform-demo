package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegistrationSummaryReportDailyRegistrationsInner
 */

@JsonTypeName("RegistrationSummaryReport_dailyRegistrations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationSummaryReportDailyRegistrationsInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private Integer count;

  private Double revenue;

  public RegistrationSummaryReportDailyRegistrationsInner date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public RegistrationSummaryReportDailyRegistrationsInner count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RegistrationSummaryReportDailyRegistrationsInner revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }

  /**
   * Get revenue
   * @return revenue
  */
  
  @Schema(name = "revenue", example = "1250.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revenue")
  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationSummaryReportDailyRegistrationsInner registrationSummaryReportDailyRegistrationsInner = (RegistrationSummaryReportDailyRegistrationsInner) o;
    return Objects.equals(this.date, registrationSummaryReportDailyRegistrationsInner.date) &&
        Objects.equals(this.count, registrationSummaryReportDailyRegistrationsInner.count) &&
        Objects.equals(this.revenue, registrationSummaryReportDailyRegistrationsInner.revenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, count, revenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationSummaryReportDailyRegistrationsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
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

