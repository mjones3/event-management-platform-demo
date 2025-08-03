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
 * DemographicsData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DemographicsData {

  @Valid
  private Map<String, Integer> ageGroups = new HashMap<>();

  @Valid
  private Map<String, Integer> genderDistribution = new HashMap<>();

  @Valid
  private Map<String, Integer> locationDistribution = new HashMap<>();

  @Valid
  private Map<String, Integer> industryDistribution = new HashMap<>();

  @Valid
  private Map<String, Integer> registrationSources = new HashMap<>();

  public DemographicsData ageGroups(Map<String, Integer> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public DemographicsData putAgeGroupsItem(String key, Integer ageGroupsItem) {
    if (this.ageGroups == null) {
      this.ageGroups = new HashMap<>();
    }
    this.ageGroups.put(key, ageGroupsItem);
    return this;
  }

  /**
   * Get ageGroups
   * @return ageGroups
  */
  
  @Schema(name = "ageGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageGroups")
  public Map<String, Integer> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(Map<String, Integer> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public DemographicsData genderDistribution(Map<String, Integer> genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

  public DemographicsData putGenderDistributionItem(String key, Integer genderDistributionItem) {
    if (this.genderDistribution == null) {
      this.genderDistribution = new HashMap<>();
    }
    this.genderDistribution.put(key, genderDistributionItem);
    return this;
  }

  /**
   * Get genderDistribution
   * @return genderDistribution
  */
  
  @Schema(name = "genderDistribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genderDistribution")
  public Map<String, Integer> getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(Map<String, Integer> genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  public DemographicsData locationDistribution(Map<String, Integer> locationDistribution) {
    this.locationDistribution = locationDistribution;
    return this;
  }

  public DemographicsData putLocationDistributionItem(String key, Integer locationDistributionItem) {
    if (this.locationDistribution == null) {
      this.locationDistribution = new HashMap<>();
    }
    this.locationDistribution.put(key, locationDistributionItem);
    return this;
  }

  /**
   * Get locationDistribution
   * @return locationDistribution
  */
  
  @Schema(name = "locationDistribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDistribution")
  public Map<String, Integer> getLocationDistribution() {
    return locationDistribution;
  }

  public void setLocationDistribution(Map<String, Integer> locationDistribution) {
    this.locationDistribution = locationDistribution;
  }

  public DemographicsData industryDistribution(Map<String, Integer> industryDistribution) {
    this.industryDistribution = industryDistribution;
    return this;
  }

  public DemographicsData putIndustryDistributionItem(String key, Integer industryDistributionItem) {
    if (this.industryDistribution == null) {
      this.industryDistribution = new HashMap<>();
    }
    this.industryDistribution.put(key, industryDistributionItem);
    return this;
  }

  /**
   * Get industryDistribution
   * @return industryDistribution
  */
  
  @Schema(name = "industryDistribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industryDistribution")
  public Map<String, Integer> getIndustryDistribution() {
    return industryDistribution;
  }

  public void setIndustryDistribution(Map<String, Integer> industryDistribution) {
    this.industryDistribution = industryDistribution;
  }

  public DemographicsData registrationSources(Map<String, Integer> registrationSources) {
    this.registrationSources = registrationSources;
    return this;
  }

  public DemographicsData putRegistrationSourcesItem(String key, Integer registrationSourcesItem) {
    if (this.registrationSources == null) {
      this.registrationSources = new HashMap<>();
    }
    this.registrationSources.put(key, registrationSourcesItem);
    return this;
  }

  /**
   * Get registrationSources
   * @return registrationSources
  */
  
  @Schema(name = "registrationSources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationSources")
  public Map<String, Integer> getRegistrationSources() {
    return registrationSources;
  }

  public void setRegistrationSources(Map<String, Integer> registrationSources) {
    this.registrationSources = registrationSources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemographicsData demographicsData = (DemographicsData) o;
    return Objects.equals(this.ageGroups, demographicsData.ageGroups) &&
        Objects.equals(this.genderDistribution, demographicsData.genderDistribution) &&
        Objects.equals(this.locationDistribution, demographicsData.locationDistribution) &&
        Objects.equals(this.industryDistribution, demographicsData.industryDistribution) &&
        Objects.equals(this.registrationSources, demographicsData.registrationSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageGroups, genderDistribution, locationDistribution, industryDistribution, registrationSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsData {\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
    sb.append("    locationDistribution: ").append(toIndentedString(locationDistribution)).append("\n");
    sb.append("    industryDistribution: ").append(toIndentedString(industryDistribution)).append("\n");
    sb.append("    registrationSources: ").append(toIndentedString(registrationSources)).append("\n");
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

