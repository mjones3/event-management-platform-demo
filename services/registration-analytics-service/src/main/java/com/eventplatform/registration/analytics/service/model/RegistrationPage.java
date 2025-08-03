package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.Pageable;
import com.eventplatform.registration.analytics.service.model.Registration;
import com.eventplatform.registration.analytics.service.model.Sort;
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
 * RegistrationPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationPage {

  @Valid
  private List<@Valid Registration> content = new ArrayList<>();

  private Pageable pageable;

  private Long totalElements;

  private Integer totalPages;

  private Boolean last;

  private Boolean first;

  private Integer numberOfElements;

  private Integer size;

  private Integer number;

  private Sort sort;

  private Boolean empty;

  public RegistrationPage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegistrationPage(List<@Valid Registration> content, Pageable pageable, Long totalElements, Integer totalPages, Boolean last, Boolean first, Integer numberOfElements, Integer size, Integer number) {
    this.content = content;
    this.pageable = pageable;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
    this.last = last;
    this.first = first;
    this.numberOfElements = numberOfElements;
    this.size = size;
    this.number = number;
  }

  public RegistrationPage content(List<@Valid Registration> content) {
    this.content = content;
    return this;
  }

  public RegistrationPage addContentItem(Registration contentItem) {
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
  public List<@Valid Registration> getContent() {
    return content;
  }

  public void setContent(List<@Valid Registration> content) {
    this.content = content;
  }

  public RegistrationPage pageable(Pageable pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
  */
  @NotNull @Valid 
  @Schema(name = "pageable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageable")
  public Pageable getPageable() {
    return pageable;
  }

  public void setPageable(Pageable pageable) {
    this.pageable = pageable;
  }

  public RegistrationPage totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull 
  @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public RegistrationPage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull 
  @Schema(name = "totalPages", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public RegistrationPage last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  */
  @NotNull 
  @Schema(name = "last", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public RegistrationPage first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  @NotNull 
  @Schema(name = "first", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public RegistrationPage numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   * @return numberOfElements
  */
  @NotNull 
  @Schema(name = "numberOfElements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public RegistrationPage size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @NotNull 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public RegistrationPage number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @NotNull 
  @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public RegistrationPage sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @Valid 
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public RegistrationPage empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  */
  
  @Schema(name = "empty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationPage registrationPage = (RegistrationPage) o;
    return Objects.equals(this.content, registrationPage.content) &&
        Objects.equals(this.pageable, registrationPage.pageable) &&
        Objects.equals(this.totalElements, registrationPage.totalElements) &&
        Objects.equals(this.totalPages, registrationPage.totalPages) &&
        Objects.equals(this.last, registrationPage.last) &&
        Objects.equals(this.first, registrationPage.first) &&
        Objects.equals(this.numberOfElements, registrationPage.numberOfElements) &&
        Objects.equals(this.size, registrationPage.size) &&
        Objects.equals(this.number, registrationPage.number) &&
        Objects.equals(this.sort, registrationPage.sort) &&
        Objects.equals(this.empty, registrationPage.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, pageable, totalElements, totalPages, last, first, numberOfElements, size, number, sort, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationPage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

