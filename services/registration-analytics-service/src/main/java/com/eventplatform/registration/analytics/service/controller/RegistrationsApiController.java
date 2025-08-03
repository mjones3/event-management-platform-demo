package com.eventplatform.registration.analytics.service.controller;

import com.eventplatform.registration.analytics.service.model.BulkOperationResult;
import com.eventplatform.registration.analytics.service.model.BulkRegistrationRequest;
import com.eventplatform.registration.analytics.service.model.CancellationResult;
import com.eventplatform.registration.analytics.service.model.ConflictError;
import com.eventplatform.registration.analytics.service.model.CreateRegistrationRequest;
import org.springframework.format.annotation.DateTimeFormat;
import com.eventplatform.registration.analytics.service.model.ErrorResponse;
import java.time.OffsetDateTime;
import com.eventplatform.registration.analytics.service.model.PaymentStatus;
import com.eventplatform.registration.analytics.service.model.Registration;
import com.eventplatform.registration.analytics.service.model.RegistrationDetails;
import com.eventplatform.registration.analytics.service.model.RegistrationPage;
import com.eventplatform.registration.analytics.service.model.RegistrationStatus;
import java.util.UUID;
import com.eventplatform.registration.analytics.service.model.UpdateRegistrationRequest;
import com.eventplatform.registration.analytics.service.model.ValidationError;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.registrationAnalyticsService.base-path:/registration/v1}")
public class RegistrationsApiController implements RegistrationsApi {

    private final NativeWebRequest request;

    @Autowired
    public RegistrationsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
