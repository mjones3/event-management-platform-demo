package com.eventplatform.registration.analytics.service.model;

import java.net.URI;
import java.util.Objects;
import com.eventplatform.registration.analytics.service.model.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateRegistrationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateRegistrationRequest {

  private UUID userId;

  private String eventId;

  @Valid
  private List<String> selectedTicketTierIds = new ArrayList<>();

  @Valid
  private Map<String, Object> registrationData = new HashMap<>();

  private PaymentMethod paymentMethod;

  private String promoCode;

  private String referralSource;

  public CreateRegistrationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateRegistrationRequest(UUID userId, String eventId, List<String> selectedTicketTierIds) {
    this.userId = userId;
    this.eventId = eventId;
    this.selectedTicketTierIds = selectedTicketTierIds;
  }

  public CreateRegistrationRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public CreateRegistrationRequest eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  @NotNull 
  @Schema(name = "eventId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public CreateRegistrationRequest selectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
    return this;
  }

  public CreateRegistrationRequest addSelectedTicketTierIdsItem(String selectedTicketTierIdsItem) {
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
  @NotNull @Size(min = 1) 
  @Schema(name = "selectedTicketTierIds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selectedTicketTierIds")
  public List<String> getSelectedTicketTierIds() {
    return selectedTicketTierIds;
  }

  public void setSelectedTicketTierIds(List<String> selectedTicketTierIds) {
    this.selectedTicketTierIds = selectedTicketTierIds;
  }

  public CreateRegistrationRequest registrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
    return this;
  }

  public CreateRegistrationRequest putRegistrationDataItem(String key, Object registrationDataItem) {
    if (this.registrationData == null) {
      this.registrationData = new HashMap<>();
    }
    this.registrationData.put(key, registrationDataItem);
    return this;
  }

  /**
   * Get registrationData
   * @return registrationData
  */
  
  @Schema(name = "registrationData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationData")
  public Map<String, Object> getRegistrationData() {
    return registrationData;
  }

  public void setRegistrationData(Map<String, Object> registrationData) {
    this.registrationData = registrationData;
  }

  public CreateRegistrationRequest paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  */
  @Valid 
  @Schema(name = "paymentMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethod")
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public CreateRegistrationRequest promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
  */
  
  @Schema(name = "promoCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoCode")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public CreateRegistrationRequest referralSource(String referralSource) {
    this.referralSource = referralSource;
    return this;
  }

  /**
   * Get referralSource
   * @return referralSource
  */
  
  @Schema(name = "referralSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referralSource")
  public String getReferralSource() {
    return referralSource;
  }

  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRegistrationRequest createRegistrationRequest = (CreateRegistrationRequest) o;
    return Objects.equals(this.userId, createRegistrationRequest.userId) &&
        Objects.equals(this.eventId, createRegistrationRequest.eventId) &&
        Objects.equals(this.selectedTicketTierIds, createRegistrationRequest.selectedTicketTierIds) &&
        Objects.equals(this.registrationData, createRegistrationRequest.registrationData) &&
        Objects.equals(this.paymentMethod, createRegistrationRequest.paymentMethod) &&
        Objects.equals(this.promoCode, createRegistrationRequest.promoCode) &&
        Objects.equals(this.referralSource, createRegistrationRequest.referralSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, eventId, selectedTicketTierIds, registrationData, paymentMethod, promoCode, referralSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRegistrationRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    selectedTicketTierIds: ").append(toIndentedString(selectedTicketTierIds)).append("\n");
    sb.append("    registrationData: ").append(toIndentedString(registrationData)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
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

