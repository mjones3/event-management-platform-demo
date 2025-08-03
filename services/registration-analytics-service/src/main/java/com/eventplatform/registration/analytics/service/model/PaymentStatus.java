package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PaymentStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum PaymentStatus {
  
  PENDING("PENDING"),
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  CANCELLED("CANCELLED"),
  
  REFUNDED("REFUNDED"),
  
  PARTIALLY_REFUNDED("PARTIALLY_REFUNDED");

  private String value;

  PaymentStatus(String value) {
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
  public static PaymentStatus fromValue(String value) {
    for (PaymentStatus b : PaymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

