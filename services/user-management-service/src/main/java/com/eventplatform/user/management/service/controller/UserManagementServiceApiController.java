package com.eventplatform.user.management.service.controller;

import com.eventplatform.user.management.service.model.CreateUserManagementServiceRequest;
import com.eventplatform.user.management.service.model.ErrorResponse;
import com.eventplatform.user.management.service.model.PagedUserManagementServiceResponse;
import java.util.UUID;
import com.eventplatform.user.management.service.model.UpdateUserManagementServiceRequest;
import com.eventplatform.user.management.service.model.UserManagementServiceResponse;


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
@RequestMapping("${openapi.userManagementServiceService.base-path:/user-management-service/v1}")
public class UserManagementServiceApiController implements UserManagementServiceApi {

    private final NativeWebRequest request;

    @Autowired
    public UserManagementServiceApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
