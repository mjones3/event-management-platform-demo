package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.BulkOperationResultErrorsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BulkOperationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BulkOperationResult {

  private UUID operationId;

  private Integer totalItems;

  private Integer processedItems;

  private Integer successfulItems;

  private Integer failedItems;

  @Valid
  private List<@Valid BulkOperationResultErrorsInner> errors;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    PARTIAL_SUCCESS("PARTIAL_SUCCESS"),
    
    FAILED("FAILED");

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

  public BulkOperationResult operationId(UUID operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  */
  @Valid 
  @Schema(name = "operationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationId")
  public UUID getOperationId() {
    return operationId;
  }

  public void setOperationId(UUID operationId) {
    this.operationId = operationId;
  }

  public BulkOperationResult totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
  */
  
  @Schema(name = "totalItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public BulkOperationResult processedItems(Integer processedItems) {
    this.processedItems = processedItems;
    return this;
  }

  /**
   * Get processedItems
   * @return processedItems
  */
  
  @Schema(name = "processedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processedItems")
  public Integer getProcessedItems() {
    return processedItems;
  }

  public void setProcessedItems(Integer processedItems) {
    this.processedItems = processedItems;
  }

  public BulkOperationResult successfulItems(Integer successfulItems) {
    this.successfulItems = successfulItems;
    return this;
  }

  /**
   * Get successfulItems
   * @return successfulItems
  */
  
  @Schema(name = "successfulItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successfulItems")
  public Integer getSuccessfulItems() {
    return successfulItems;
  }

  public void setSuccessfulItems(Integer successfulItems) {
    this.successfulItems = successfulItems;
  }

  public BulkOperationResult failedItems(Integer failedItems) {
    this.failedItems = failedItems;
    return this;
  }

  /**
   * Get failedItems
   * @return failedItems
  */
  
  @Schema(name = "failedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedItems")
  public Integer getFailedItems() {
    return failedItems;
  }

  public void setFailedItems(Integer failedItems) {
    this.failedItems = failedItems;
  }

  public BulkOperationResult errors(List<@Valid BulkOperationResultErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public BulkOperationResult addErrorsItem(BulkOperationResultErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid BulkOperationResultErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid BulkOperationResultErrorsInner> errors) {
    this.errors = errors;
  }

  public BulkOperationResult status(StatusEnum status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationResult bulkOperationResult = (BulkOperationResult) o;
    return Objects.equals(this.operationId, bulkOperationResult.operationId) &&
        Objects.equals(this.totalItems, bulkOperationResult.totalItems) &&
        Objects.equals(this.processedItems, bulkOperationResult.processedItems) &&
        Objects.equals(this.successfulItems, bulkOperationResult.successfulItems) &&
        Objects.equals(this.failedItems, bulkOperationResult.failedItems) &&
        Objects.equals(this.errors, bulkOperationResult.errors) &&
        Objects.equals(this.status, bulkOperationResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, totalItems, processedItems, successfulItems, failedItems, errors, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationResult {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    processedItems: ").append(toIndentedString(processedItems)).append("\n");
    sb.append("    successfulItems: ").append(toIndentedString(successfulItems)).append("\n");
    sb.append("    failedItems: ").append(toIndentedString(failedItems)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

