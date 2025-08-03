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
 * Current status of the registration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum RegistrationStatus {
  
  PENDING("PENDING"),
  
  CONFIRMED("CONFIRMED"),
  
  CHECKED_IN("CHECKED_IN"),
  
  CANCELLED("CANCELLED"),
  
  REFUNDED("REFUNDED");

  private String value;

  RegistrationStatus(String value) {
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
  public static RegistrationStatus fromValue(String value) {
    for (RegistrationStatus b : RegistrationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

