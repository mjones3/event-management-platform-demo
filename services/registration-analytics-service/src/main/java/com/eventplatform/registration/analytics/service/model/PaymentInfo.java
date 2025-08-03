package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.PaymentMethod;
import com.eventplatform.registration.analytics.service.model.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
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
 * PaymentInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentInfo {

  private String paymentId;

  private PaymentMethod method;

  private PaymentStatus status;

  private String transactionId;

  private Double amount;

  private String currency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime processedAt;

  @Valid
  private Map<String, Object> paymentMetadata = new HashMap<>();

  public PaymentInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInfo(String paymentId, PaymentMethod method, PaymentStatus status, Double amount, String currency) {
    this.paymentId = paymentId;
    this.method = method;
    this.status = status;
    this.amount = amount;
    this.currency = currency;
  }

  public PaymentInfo paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  */
  @NotNull 
  @Schema(name = "paymentId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentId")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentInfo method(PaymentMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull @Valid 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public PaymentMethod getMethod() {
    return method;
  }

  public void setMethod(PaymentMethod method) {
    this.method = method;
  }

  public PaymentInfo status(PaymentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public PaymentStatus getStatus() {
    return status;
  }

  public void setStatus(PaymentStatus status) {
    this.status = status;
  }

  public PaymentInfo transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  
  @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentInfo amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", example = "99.99", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentInfo processedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
    return this;
  }

  /**
   * Get processedAt
   * @return processedAt
  */
  @Valid 
  @Schema(name = "processedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processedAt")
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  public PaymentInfo paymentMetadata(Map<String, Object> paymentMetadata) {
    this.paymentMetadata = paymentMetadata;
    return this;
  }

  public PaymentInfo putPaymentMetadataItem(String key, Object paymentMetadataItem) {
    if (this.paymentMetadata == null) {
      this.paymentMetadata = new HashMap<>();
    }
    this.paymentMetadata.put(key, paymentMetadataItem);
    return this;
  }

  /**
   * Get paymentMetadata
   * @return paymentMetadata
  */
  
  @Schema(name = "paymentMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMetadata")
  public Map<String, Object> getPaymentMetadata() {
    return paymentMetadata;
  }

  public void setPaymentMetadata(Map<String, Object> paymentMetadata) {
    this.paymentMetadata = paymentMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.paymentId, paymentInfo.paymentId) &&
        Objects.equals(this.method, paymentInfo.method) &&
        Objects.equals(this.status, paymentInfo.status) &&
        Objects.equals(this.transactionId, paymentInfo.transactionId) &&
        Objects.equals(this.amount, paymentInfo.amount) &&
        Objects.equals(this.currency, paymentInfo.currency) &&
        Objects.equals(this.processedAt, paymentInfo.processedAt) &&
        Objects.equals(this.paymentMetadata, paymentInfo.paymentMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, method, status, transactionId, amount, currency, processedAt, paymentMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    paymentMetadata: ").append(toIndentedString(paymentMetadata)).append("\n");
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

