package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
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
 * CancellationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CancellationResult {

  private UUID registrationId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    REFUND_PENDING("REFUND_PENDING"),
    
    REFUND_PROCESSED("REFUND_PROCESSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Double refundAmount;

  private String refundMethod;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate estimatedRefundDate;

  private Double cancellationFee;

  private String reason;

  public CancellationResult registrationId(UUID registrationId) {
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

  public CancellationResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CancellationResult refundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Get refundAmount
   * @return refundAmount
  */
  
  @Schema(name = "refundAmount", example = "99.99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundAmount")
  public Double getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
  }

  public CancellationResult refundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * Get refundMethod
   * @return refundMethod
  */
  
  @Schema(name = "refundMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundMethod")
  public String getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public CancellationResult estimatedRefundDate(LocalDate estimatedRefundDate) {
    this.estimatedRefundDate = estimatedRefundDate;
    return this;
  }

  /**
   * Get estimatedRefundDate
   * @return estimatedRefundDate
  */
  @Valid 
  @Schema(name = "estimatedRefundDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRefundDate")
  public LocalDate getEstimatedRefundDate() {
    return estimatedRefundDate;
  }

  public void setEstimatedRefundDate(LocalDate estimatedRefundDate) {
    this.estimatedRefundDate = estimatedRefundDate;
  }

  public CancellationResult cancellationFee(Double cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

  /**
   * Get cancellationFee
   * @return cancellationFee
  */
  
  @Schema(name = "cancellationFee", example = "5.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellationFee")
  public Double getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(Double cancellationFee) {
    this.cancellationFee = cancellationFee;
  }

  public CancellationResult reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationResult cancellationResult = (CancellationResult) o;
    return Objects.equals(this.registrationId, cancellationResult.registrationId) &&
        Objects.equals(this.status, cancellationResult.status) &&
        Objects.equals(this.refundAmount, cancellationResult.refundAmount) &&
        Objects.equals(this.refundMethod, cancellationResult.refundMethod) &&
        Objects.equals(this.estimatedRefundDate, cancellationResult.estimatedRefundDate) &&
        Objects.equals(this.cancellationFee, cancellationResult.cancellationFee) &&
        Objects.equals(this.reason, cancellationResult.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, status, refundAmount, refundMethod, estimatedRefundDate, cancellationFee, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationResult {\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundMethod: ").append(toIndentedString(refundMethod)).append("\n");
    sb.append("    estimatedRefundDate: ").append(toIndentedString(estimatedRefundDate)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

