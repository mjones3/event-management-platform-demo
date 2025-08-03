package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.ExperimentParticipation;
import com.eventplatform.registration.analytics.service.model.RegistrationAnalyticsDeviceInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * RegistrationAnalytics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationAnalytics {

  private UUID registrationId;

  private Integer viewCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastViewedAt;

  private String referralSource;

  private RegistrationAnalyticsDeviceInfo deviceInfo;

  private Integer timeToRegister;

  @Valid
  private List<@Valid ExperimentParticipation> experimentParticipations;

  public RegistrationAnalytics registrationId(UUID registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
  */
  @Valid 
  @Schema(name = "registrationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationId")
  public UUID getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(UUID registrationId) {
    this.registrationId = registrationId;
  }

  public RegistrationAnalytics viewCount(Integer viewCount) {
    this.viewCount = viewCount;
    return this;
  }

  /**
   * Get viewCount
   * @return viewCount
  */
  
  @Schema(name = "viewCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewCount")
  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public RegistrationAnalytics lastViewedAt(OffsetDateTime lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * Get lastViewedAt
   * @return lastViewedAt
  */
  @Valid 
  @Schema(name = "lastViewedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastViewedAt")
  public OffsetDateTime getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(OffsetDateTime lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  public RegistrationAnalytics referralSource(String referralSource) {
    this.referralSource = referralSource;
    return this;
  }

  /**
   * Get referralSource
   * @return referralSource
  */
  
  @Schema(name = "referralSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referralSource")
  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

  public RegistrationAnalytics deviceInfo(RegistrationAnalyticsDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Get deviceInfo
   * @return deviceInfo
  */
  @Valid 
  @Schema(name = "deviceInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceInfo")
  public RegistrationAnalyticsDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(RegistrationAnalyticsDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public RegistrationAnalytics timeToRegister(Integer timeToRegister) {
    this.timeToRegister = timeToRegister;
    return this;
  }

  /**
   * Time from first view to registration in seconds
   * @return timeToRegister
  */
  
  @Schema(name = "timeToRegister", description = "Time from first view to registration in seconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeToRegister")
  public Integer getTimeToRegister() {
    return timeToRegister;
  }

  public void setTimeToRegister(Integer timeToRegister) {
    this.timeToRegister = timeToRegister;
  }

  public RegistrationAnalytics experimentParticipations(List<@Valid ExperimentParticipation> experimentParticipations) {
    this.experimentParticipations = experimentParticipations;
    return this;
  }

  public RegistrationAnalytics addExperimentParticipationsItem(ExperimentParticipation experimentParticipationsItem) {
    if (this.experimentParticipations == null) {
      this.experimentParticipations = new ArrayList<>();
    }
    this.experimentParticipations.add(experimentParticipationsItem);
    return this;
  }

  /**
   * Get experimentParticipations
   * @return experimentParticipations
  */
  @Valid 
  @Schema(name = "experimentParticipations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experimentParticipations")
  public List<@Valid ExperimentParticipation> getExperimentParticipations() {
    return experimentParticipations;
  }

  public void setExperimentParticipations(List<@Valid ExperimentParticipation> experimentParticipations) {
    this.experimentParticipations = experimentParticipations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationAnalytics registrationAnalytics = (RegistrationAnalytics) o;
    return Objects.equals(this.registrationId, registrationAnalytics.registrationId) &&
        Objects.equals(this.viewCount, registrationAnalytics.viewCount) &&
        Objects.equals(this.lastViewedAt, registrationAnalytics.lastViewedAt) &&
        Objects.equals(this.referralSource, registrationAnalytics.referralSource) &&
        Objects.equals(this.deviceInfo, registrationAnalytics.deviceInfo) &&
        Objects.equals(this.timeToRegister, registrationAnalytics.timeToRegister) &&
        Objects.equals(this.experimentParticipations, registrationAnalytics.experimentParticipations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, viewCount, lastViewedAt, referralSource, deviceInfo, timeToRegister, experimentParticipations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationAnalytics {\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    timeToRegister: ").append(toIndentedString(timeToRegister)).append("\n");
    sb.append("    experimentParticipations: ").append(toIndentedString(experimentParticipations)).append("\n");
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

