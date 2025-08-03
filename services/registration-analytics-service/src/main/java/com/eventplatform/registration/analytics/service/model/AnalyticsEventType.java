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
 * Gets or Sets AnalyticsEventType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum AnalyticsEventType {
  
  PAGE_VIEW("PAGE_VIEW"),
  
  REGISTRATION_START("REGISTRATION_START"),
  
  REGISTRATION_COMPLETE("REGISTRATION_COMPLETE"),
  
  CHECK_IN("CHECK_IN"),
  
  SESSION_ATTENDANCE("SESSION_ATTENDANCE"),
  
  FEEDBACK_SUBMITTED("FEEDBACK_SUBMITTED"),
  
  PAYMENT_INITIATED("PAYMENT_INITIATED"),
  
  PAYMENT_COMPLETED("PAYMENT_COMPLETED"),
  
  EMAIL_OPENED("EMAIL_OPENED"),
  
  EMAIL_CLICKED("EMAIL_CLICKED");

  private String value;

  AnalyticsEventType(String value) {
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
  public static AnalyticsEventType fromValue(String value) {
    for (AnalyticsEventType b : AnalyticsEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

