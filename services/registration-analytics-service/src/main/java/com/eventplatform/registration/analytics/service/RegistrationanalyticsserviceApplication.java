package com.eventplatform.registration.analytics.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
public class RegistrationanalyticsserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationanalyticsserviceApplication.class, args);
    }
}

@RestController
class HealthController {
    
    @GetMapping("/")
    public Map<String, Object> root() {
        Map<String, Object> response = new HashMap<>();
        response.put("service", "registration-analytics-service");
        response.put("status", "UP");
        response.put("message", "Welcome to registration-analytics-service API");
        response.put("documentation", "/swagger-ui.html");
        response.put("health", "/actuator/health");
        return response;
    }
    
    @GetMapping("/api/v1/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "registration-analytics-service");
        response.put("timestamp", java.time.Instant.now().toString());
        response.put("version", "1.0.0");
        return response;
    }
}
