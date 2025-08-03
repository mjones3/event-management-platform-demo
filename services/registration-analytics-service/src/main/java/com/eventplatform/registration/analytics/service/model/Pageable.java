package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.Sort;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pageable
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Pageable {

  private Integer page;

  private Integer size;

  private Sort sort;

  public Pageable page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  
  @Schema(name = "page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Pageable size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Pageable sort(Sort sort) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.page, pageable.page) &&
        Objects.equals(this.size, pageable.size) &&
        Objects.equals(this.sort, pageable.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

