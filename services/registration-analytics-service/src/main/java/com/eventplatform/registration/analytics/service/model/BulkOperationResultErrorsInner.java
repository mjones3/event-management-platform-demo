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
 * BulkOperationResultErrorsInner
 */

@JsonTypeName("BulkOperationResult_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BulkOperationResultErrorsInner {

  private String itemId;

  private String error;

  private String details;

  public BulkOperationResultErrorsInner itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
  */
  
  @Schema(name = "itemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public BulkOperationResultErrorsInner error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public BulkOperationResultErrorsInner details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationResultErrorsInner bulkOperationResultErrorsInner = (BulkOperationResultErrorsInner) o;
    return Objects.equals(this.itemId, bulkOperationResultErrorsInner.itemId) &&
        Objects.equals(this.error, bulkOperationResultErrorsInner.error) &&
        Objects.equals(this.details, bulkOperationResultErrorsInner.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, error, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationResultErrorsInner {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

