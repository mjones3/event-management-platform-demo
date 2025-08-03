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
 * ConversionFunnelStagesInner
 */

@JsonTypeName("ConversionFunnel_stages_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionFunnelStagesInner {

  private String name;

  private Integer count;

  private Double conversionRate;

  private Double dropOffRate;

  public ConversionFunnelStagesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConversionFunnelStagesInner count(Integer count) {
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

  public ConversionFunnelStagesInner conversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * Get conversionRate
   * @return conversionRate
  */
  
  @Schema(name = "conversionRate", example = "0.75", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversionRate")
  public Double getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
  }

  public ConversionFunnelStagesInner dropOffRate(Double dropOffRate) {
    this.dropOffRate = dropOffRate;
    return this;
  }

  /**
   * Get dropOffRate
   * @return dropOffRate
  */
  
  @Schema(name = "dropOffRate", example = "0.25", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropOffRate")
  public Double getDropOffRate() {
    return dropOffRate;
  }

  public void setDropOffRate(Double dropOffRate) {
    this.dropOffRate = dropOffRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionFunnelStagesInner conversionFunnelStagesInner = (ConversionFunnelStagesInner) o;
    return Objects.equals(this.name, conversionFunnelStagesInner.name) &&
        Objects.equals(this.count, conversionFunnelStagesInner.count) &&
        Objects.equals(this.conversionRate, conversionFunnelStagesInner.conversionRate) &&
        Objects.equals(this.dropOffRate, conversionFunnelStagesInner.dropOffRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, count, conversionRate, dropOffRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionFunnelStagesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    dropOffRate: ").append(toIndentedString(dropOffRate)).append("\n");
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

