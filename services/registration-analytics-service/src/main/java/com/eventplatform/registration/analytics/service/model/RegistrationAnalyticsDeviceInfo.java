package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegistrationAnalyticsDeviceInfo
 */

@JsonTypeName("RegistrationAnalytics_deviceInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationAnalyticsDeviceInfo {

  /**
   * Gets or Sets deviceType
   */
  public enum DeviceTypeEnum {
    DESKTOP("DESKTOP"),
    
    MOBILE("MOBILE"),
    
    TABLET("TABLET");

    private String value;

    DeviceTypeEnum(String value) {
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
    public static DeviceTypeEnum fromValue(String value) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeviceTypeEnum deviceType;

  private String browser;

  private String operatingSystem;

  public RegistrationAnalyticsDeviceInfo deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  
  @Schema(name = "deviceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceType")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public RegistrationAnalyticsDeviceInfo browser(String browser) {
    this.browser = browser;
    return this;
  }

  /**
   * Get browser
   * @return browser
  */
  
  @Schema(name = "browser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("browser")
  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }

  public RegistrationAnalyticsDeviceInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Get operatingSystem
   * @return operatingSystem
  */
  
  @Schema(name = "operatingSystem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingSystem")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationAnalyticsDeviceInfo registrationAnalyticsDeviceInfo = (RegistrationAnalyticsDeviceInfo) o;
    return Objects.equals(this.deviceType, registrationAnalyticsDeviceInfo.deviceType) &&
        Objects.equals(this.browser, registrationAnalyticsDeviceInfo.browser) &&
        Objects.equals(this.operatingSystem, registrationAnalyticsDeviceInfo.operatingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, browser, operatingSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationAnalyticsDeviceInfo {\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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

