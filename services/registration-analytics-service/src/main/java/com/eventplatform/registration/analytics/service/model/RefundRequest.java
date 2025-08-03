package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RefundRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RefundRequest {

  private Double amount;

  private String reason;

  /**
   * Gets or Sets refundMethod
   */
  public enum RefundMethodEnum {
    ORIGINAL_METHOD("ORIGINAL_METHOD"),
    
    STORE_CREDIT("STORE_CREDIT"),
    
    MANUAL("MANUAL");

    private String value;

    RefundMethodEnum(String value) {
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
    public static RefundMethodEnum fromValue(String value) {
      for (RefundMethodEnum b : RefundMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RefundMethodEnum refundMethod = RefundMethodEnum.ORIGINAL_METHOD;

  public RefundRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RefundRequest(Double amount, String reason) {
    this.amount = amount;
    this.reason = reason;
  }

  public RefundRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 0
   * @return amount
  */
  @NotNull @DecimalMin("0") 
  @Schema(name = "amount", example = "50.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public RefundRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @NotNull @Size(max = 500) 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RefundRequest refundMethod(RefundMethodEnum refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * Get refundMethod
   * @return refundMethod
  */
  
  @Schema(name = "refundMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundMethod")
  public RefundMethodEnum getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(RefundMethodEnum refundMethod) {
    this.refundMethod = refundMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.amount, refundRequest.amount) &&
        Objects.equals(this.reason, refundRequest.reason) &&
        Objects.equals(this.refundMethod, refundRequest.refundMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, reason, refundMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundMethod: ").append(toIndentedString(refundMethod)).append("\n");
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

