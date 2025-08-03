package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.ConversionFunnelStagesInner;
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
 * ConversionFunnel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionFunnel {

  @Valid
  private List<@Valid ConversionFunnelStagesInner> stages;

  public ConversionFunnel stages(List<@Valid ConversionFunnelStagesInner> stages) {
    this.stages = stages;
    return this;
  }

  public ConversionFunnel addStagesItem(ConversionFunnelStagesInner stagesItem) {
    if (this.stages == null) {
      this.stages = new ArrayList<>();
    }
    this.stages.add(stagesItem);
    return this;
  }

  /**
   * Get stages
   * @return stages
  */
  @Valid 
  @Schema(name = "stages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stages")
  public List<@Valid ConversionFunnelStagesInner> getStages() {
    return stages;
  }

  public void setStages(List<@Valid ConversionFunnelStagesInner> stages) {
    this.stages = stages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionFunnel conversionFunnel = (ConversionFunnel) o;
    return Objects.equals(this.stages, conversionFunnel.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionFunnel {\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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

