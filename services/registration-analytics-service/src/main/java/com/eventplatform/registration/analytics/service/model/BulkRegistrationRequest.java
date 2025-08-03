package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.BulkRegistrationRequestCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * BulkRegistrationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BulkRegistrationRequest {

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    UPDATE_STATUS("UPDATE_STATUS"),
    
    SEND_NOTIFICATION("SEND_NOTIFICATION"),
    
    BULK_CHECK_IN("BULK_CHECK_IN"),
    
    EXPORT("EXPORT");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  private BulkRegistrationRequestCriteria criteria;

  @Valid
  private Map<String, Object> operationData = new HashMap<>();

  public BulkRegistrationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkRegistrationRequest(OperationEnum operation, BulkRegistrationRequestCriteria criteria) {
    this.operation = operation;
    this.criteria = criteria;
  }

  public BulkRegistrationRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
  @NotNull 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public BulkRegistrationRequest criteria(BulkRegistrationRequestCriteria criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Get criteria
   * @return criteria
  */
  @NotNull @Valid 
  @Schema(name = "criteria", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criteria")
  public BulkRegistrationRequestCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(BulkRegistrationRequestCriteria criteria) {
    this.criteria = criteria;
  }

  public BulkRegistrationRequest operationData(Map<String, Object> operationData) {
    this.operationData = operationData;
    return this;
  }

  public BulkRegistrationRequest putOperationDataItem(String key, Object operationDataItem) {
    if (this.operationData == null) {
      this.operationData = new HashMap<>();
    }
    this.operationData.put(key, operationDataItem);
    return this;
  }

  /**
   * Data specific to the operation being performed
   * @return operationData
  */
  
  @Schema(name = "operationData", description = "Data specific to the operation being performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationData")
  public Map<String, Object> getOperationData() {
    return operationData;
  }

  public void setOperationData(Map<String, Object> operationData) {
    this.operationData = operationData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRegistrationRequest bulkRegistrationRequest = (BulkRegistrationRequest) o;
    return Objects.equals(this.operation, bulkRegistrationRequest.operation) &&
        Objects.equals(this.criteria, bulkRegistrationRequest.criteria) &&
        Objects.equals(this.operationData, bulkRegistrationRequest.operationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, criteria, operationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRegistrationRequest {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    operationData: ").append(toIndentedString(operationData)).append("\n");
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

