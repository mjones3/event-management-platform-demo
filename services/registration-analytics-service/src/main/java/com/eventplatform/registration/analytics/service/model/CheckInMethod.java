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
 * Gets or Sets CheckInMethod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum CheckInMethod {
  
  QR_CODE("QR_CODE"),
  
  NFC("NFC"),
  
  MANUAL("MANUAL"),
  
  FACIAL_RECOGNITION("FACIAL_RECOGNITION"),
  
  RFID("RFID"),
  
  MOBILE_APP("MOBILE_APP");

  private String value;

  CheckInMethod(String value) {
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
  public static CheckInMethod fromValue(String value) {
    for (CheckInMethod b : CheckInMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

