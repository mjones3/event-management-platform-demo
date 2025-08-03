package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.CheckInRecord;
import com.eventplatform.registration.analytics.service.model.NotificationRecord;
import com.eventplatform.registration.analytics.service.model.PaymentInfo;
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
 * Registration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Registration {

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

  public Registration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Registration(UUID id, UUID userId, String eventId, RegistrationStatus status, OffsetDateTime registeredAt, Double totalAmount, String currency) {
    this.id = id;
    this.userId = userId;
    this.eventId = eventId;
    this.status = status;
    this.registeredAt = registeredAt;
    this.totalAmount = totalAmount;
    this.currency = currency;
  }

  public Registration id(UUID id) {
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

  public Registration userId(UUID userId) {
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

  public Registration eventId(String eventId) {
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

  public Registration status(RegistrationStatus status) {
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

  public Registration paymentInfo(PaymentInfo paymentInfo) {
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

  public Registration registeredAt(OffsetDateTime registeredAt) {
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

  public Registration registrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
    return this;
  }

  public Registration putRegistrationDataItem(String key, Object registrationDataItem) {
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

  public Registration selectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
    return this;
  }

  public Registration addSelectedTicketTierIdsItem(String selectedTicketTierIdsItem) {
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

  public Registration totalAmount(Double totalAmount) {
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

  public Registration currency(String currency) {
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

  public Registration checkIns(List<@Valid CheckInRecord> checkIns) {
    this.checkIns = checkIns;
    return this;
  }

  public Registration addCheckInsItem(CheckInRecord checkInsItem) {
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

  public Registration notifications(List<@Valid NotificationRecord> notifications) {
    this.notifications = notifications;
    return this;
  }

  public Registration addNotificationsItem(NotificationRecord notificationsItem) {
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

  public Registration createdAt(OffsetDateTime createdAt) {
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

  public Registration updatedAt(OffsetDateTime updatedAt) {
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

  public Registration version(Integer version) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registration registration = (Registration) o;
    return Objects.equals(this.id, registration.id) &&
        Objects.equals(this.userId, registration.userId) &&
        Objects.equals(this.eventId, registration.eventId) &&
        Objects.equals(this.status, registration.status) &&
        Objects.equals(this.paymentInfo, registration.paymentInfo) &&
        Objects.equals(this.registeredAt, registration.registeredAt) &&
        Objects.equals(this.registrationData, registration.registrationData) &&
        Objects.equals(this.selectedTicketTierIds, registration.selectedTicketTierIds) &&
        Objects.equals(this.totalAmount, registration.totalAmount) &&
        Objects.equals(this.currency, registration.currency) &&
        Objects.equals(this.checkIns, registration.checkIns) &&
        Objects.equals(this.notifications, registration.notifications) &&
        Objects.equals(this.createdAt, registration.createdAt) &&
        Objects.equals(this.updatedAt, registration.updatedAt) &&
        Objects.equals(this.version, registration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, eventId, status, paymentInfo, registeredAt, registrationData, selectedTicketTierIds, totalAmount, currency, checkIns, notifications, createdAt, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registration {\n");
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

