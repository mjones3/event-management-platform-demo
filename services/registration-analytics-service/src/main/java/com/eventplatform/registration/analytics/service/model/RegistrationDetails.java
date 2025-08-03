package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.CheckInRecord;
import com.eventplatform.registration.analytics.service.model.NotificationRecord;
import com.eventplatform.registration.analytics.service.model.PaymentInfo;
import com.eventplatform.registration.analytics.service.model.RegistrationAnalytics;
import com.eventplatform.registration.analytics.service.model.RegistrationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RegistrationDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RegistrationDetails {

  private UUID id;

  private UUID userId;

  private String eventId;

  private RegistrationStatus status;

  private PaymentInfo paymentInfo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registeredAt;

  @Valid
  private Map<String, Object> registrationData = new HashMap<>();

  @Valid
  private List<String> selectedTicketTierIds;

  private Double totalAmount;

  private String currency;

  @Valid
  private List<@Valid CheckInRecord> checkIns;

  @Valid
  private List<@Valid NotificationRecord> notifications;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private Integer version;

  private RegistrationAnalytics analyticsData;

  private Object eventDetails;

  private Object userDetails;

  public RegistrationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegistrationDetails(UUID id, UUID userId, String eventId, RegistrationStatus status, OffsetDateTime registeredAt, Double totalAmount, String currency) {
    this.id = id;
    this.userId = userId;
    this.eventId = eventId;
    this.status = status;
    this.registeredAt = registeredAt;
    this.totalAmount = totalAmount;
    this.currency = currency;
  }

  public RegistrationDetails id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique registration identifier
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", description = "Unique registration identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RegistrationDetails userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Reference to user from User Management Service
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", description = "Reference to user from User Management Service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public RegistrationDetails eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Reference to event from Event Management Service
   * @return eventId
  */
  @NotNull 
  @Schema(name = "eventId", description = "Reference to event from Event Management Service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RegistrationDetails status(RegistrationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public RegistrationStatus getStatus() {
    return status;
  }

  public void setStatus(RegistrationStatus status) {
    this.status = status;
  }

  public RegistrationDetails paymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

  /**
   * Get paymentInfo
   * @return paymentInfo
  */
  @Valid 
  @Schema(name = "paymentInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInfo")
  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public RegistrationDetails registeredAt(OffsetDateTime registeredAt) {
    this.registeredAt = registeredAt;
    return this;
  }

  /**
   * Get registeredAt
   * @return registeredAt
  */
  @NotNull @Valid 
  @Schema(name = "registeredAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registeredAt")
  public OffsetDateTime getRegisteredAt() {
    return registeredAt;
  }

  public void setRegisteredAt(OffsetDateTime registeredAt) {
    this.registeredAt = registeredAt;
  }

  public RegistrationDetails registrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
    return this;
  }

  public RegistrationDetails putRegistrationDataItem(String key, Object registrationDataItem) {
    if (this.registrationData == null) {
      this.registrationData = new HashMap<>();
    }
    this.registrationData.put(key, registrationDataItem);
    return this;
  }

  /**
   * Custom form responses and additional data
   * @return registrationData
  */
  
  @Schema(name = "registrationData", description = "Custom form responses and additional data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationData")
  public Map<String, Object> getRegistrationData() {
    return registrationData;
  }

  public void setRegistrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
  }

  public RegistrationDetails selectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
    return this;
  }

  public RegistrationDetails addSelectedTicketTierIdsItem(String selectedTicketTierIdsItem) {
    if (this.selectedTicketTierIds == null) {
      this.selectedTicketTierIds = new ArrayList<>();
    }
    this.selectedTicketTierIds.add(selectedTicketTierIdsItem);
    return this;
  }

  /**
   * Get selectedTicketTierIds
   * @return selectedTicketTierIds
  */
  
  @Schema(name = "selectedTicketTierIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedTicketTierIds")
  public List<String> getSelectedTicketTierIds() {
    return selectedTicketTierIds;
  }

  public void setSelectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
  }

  public RegistrationDetails totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * minimum: 0
   * @return totalAmount
  */
  @NotNull @DecimalMin("0") 
  @Schema(name = "totalAmount", example = "99.99", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public RegistrationDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currency", example = "USD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RegistrationDetails checkIns(List<@Valid CheckInRecord> checkIns) {
    this.checkIns = checkIns;
    return this;
  }

  public RegistrationDetails addCheckInsItem(CheckInRecord checkInsItem) {
    if (this.checkIns == null) {
      this.checkIns = new ArrayList<>();
    }
    this.checkIns.add(checkInsItem);
    return this;
  }

  /**
   * Get checkIns
   * @return checkIns
  */
  @Valid 
  @Schema(name = "checkIns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkIns")
  public List<@Valid CheckInRecord> getCheckIns() {
    return checkIns;
  }

  public void setCheckIns(List<@Valid CheckInRecord> checkIns) {
    this.checkIns = checkIns;
  }

  public RegistrationDetails notifications(List<@Valid NotificationRecord> notifications) {
    this.notifications = notifications;
    return this;
  }

  public RegistrationDetails addNotificationsItem(NotificationRecord notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Get notifications
   * @return notifications
  */
  @Valid 
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public List<@Valid NotificationRecord> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<@Valid NotificationRecord> notifications) {
    this.notifications = notifications;
  }

  public RegistrationDetails createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RegistrationDetails updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RegistrationDetails version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Version for optimistic locking
   * @return version
  */
  
  @Schema(name = "version", description = "Version for optimistic locking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public RegistrationDetails analyticsData(RegistrationAnalytics analyticsData) {
    this.analyticsData = analyticsData;
    return this;
  }

  /**
   * Get analyticsData
   * @return analyticsData
  */
  @Valid 
  @Schema(name = "analyticsData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticsData")
  public RegistrationAnalytics getAnalyticsData() {
    return analyticsData;
  }

  public void setAnalyticsData(RegistrationAnalytics analyticsData) {
    this.analyticsData = analyticsData;
  }

  public RegistrationDetails eventDetails(Object eventDetails) {
    this.eventDetails = eventDetails;
    return this;
  }

  /**
   * Cached event information
   * @return eventDetails
  */
  
  @Schema(name = "eventDetails", description = "Cached event information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDetails")
  public Object getEventDetails() {
    return eventDetails;
  }

  public void setEventDetails(Object eventDetails) {
    this.eventDetails = eventDetails;
  }

  public RegistrationDetails userDetails(Object userDetails) {
    this.userDetails = userDetails;
    return this;
  }

  /**
   * Cached user information
   * @return userDetails
  */
  
  @Schema(name = "userDetails", description = "Cached user information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userDetails")
  public Object getUserDetails() {
    return userDetails;
  }

  public void setUserDetails(Object userDetails) {
    this.userDetails = userDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationDetails registrationDetails = (RegistrationDetails) o;
    return Objects.equals(this.id, registrationDetails.id) &&
        Objects.equals(this.userId, registrationDetails.userId) &&
        Objects.equals(this.eventId, registrationDetails.eventId) &&
        Objects.equals(this.status, registrationDetails.status) &&
        Objects.equals(this.paymentInfo, registrationDetails.paymentInfo) &&
        Objects.equals(this.registeredAt, registrationDetails.registeredAt) &&
        Objects.equals(this.registrationData, registrationDetails.registrationData) &&
        Objects.equals(this.selectedTicketTierIds, registrationDetails.selectedTicketTierIds) &&
        Objects.equals(this.totalAmount, registrationDetails.totalAmount) &&
        Objects.equals(this.currency, registrationDetails.currency) &&
        Objects.equals(this.checkIns, registrationDetails.checkIns) &&
        Objects.equals(this.notifications, registrationDetails.notifications) &&
        Objects.equals(this.createdAt, registrationDetails.createdAt) &&
        Objects.equals(this.updatedAt, registrationDetails.updatedAt) &&
        Objects.equals(this.version, registrationDetails.version) &&
        Objects.equals(this.analyticsData, registrationDetails.analyticsData) &&
        Objects.equals(this.eventDetails, registrationDetails.eventDetails) &&
        Objects.equals(this.userDetails, registrationDetails.userDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, eventId, status, paymentInfo, registeredAt, registrationData, selectedTicketTierIds, totalAmount, currency, checkIns, notifications, createdAt, updatedAt, version, analyticsData, eventDetails, userDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    registrationData: ").append(toIndentedString(registrationData)).append("\n");
    sb.append("    selectedTicketTierIds: ").append(toIndentedString(selectedTicketTierIds)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    checkIns: ").append(toIndentedString(checkIns)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    analyticsData: ").append(toIndentedString(analyticsData)).append("\n");
    sb.append("    eventDetails: ").append(toIndentedString(eventDetails)).append("\n");
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
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

