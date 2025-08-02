package com.eventplatform.user.management.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.user.management.service.model.UserManagementServiceResponse;
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
 * PagedUserManagementServiceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PagedUserManagementServiceResponse {

  @Valid
  private List<@Valid UserManagementServiceResponse> content = new ArrayList<>();

  private Long totalElements;

  private Integer totalPages;

  private Integer size;

  private Integer number;

  private Boolean first;

  private Boolean last;

  public PagedUserManagementServiceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PagedUserManagementServiceResponse(List<@Valid UserManagementServiceResponse> content, Long totalElements, Integer totalPages, Integer size, Integer number, Boolean first, Boolean last) {
    this.content = content;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
    this.size = size;
    this.number = number;
    this.first = first;
    this.last = last;
  }

  public PagedUserManagementServiceResponse content(List<@Valid UserManagementServiceResponse> content) {
    this.content = content;
    return this;
  }

  public PagedUserManagementServiceResponse addContentItem(UserManagementServiceResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid UserManagementServiceResponse> getContent() {
    return content;
  }

  public void setContent(List<@Valid UserManagementServiceResponse> content) {
    this.content = content;
  }

  public PagedUserManagementServiceResponse totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull 
  @Schema(name = "totalElements", example = "150", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PagedUserManagementServiceResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull 
  @Schema(name = "totalPages", example = "8", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PagedUserManagementServiceResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @NotNull 
  @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PagedUserManagementServiceResponse number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PagedUserManagementServiceResponse first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @NotNull 
  @Schema(name = "first", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PagedUserManagementServiceResponse last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @NotNull 
  @Schema(name = "last", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedUserManagementServiceResponse pagedUserManagementServiceResponse = (PagedUserManagementServiceResponse) o;
    return Objects.equals(this.content, pagedUserManagementServiceResponse.content) &&
        Objects.equals(this.totalElements, pagedUserManagementServiceResponse.totalElements) &&
        Objects.equals(this.totalPages, pagedUserManagementServiceResponse.totalPages) &&
        Objects.equals(this.size, pagedUserManagementServiceResponse.size) &&
        Objects.equals(this.number, pagedUserManagementServiceResponse.number) &&
        Objects.equals(this.first, pagedUserManagementServiceResponse.first) &&
        Objects.equals(this.last, pagedUserManagementServiceResponse.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, size, number, first, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedUserManagementServiceResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

