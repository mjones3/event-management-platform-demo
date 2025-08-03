package com.eventplatform.registration.analytics.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.eventplatform.registration.analytics.service.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Registration &amp; Analytics Service API")
                                .description("Comprehensive service for managing event registrations, payment processing,  attendance tracking, and real-time analytics with A/B testing capabilities.   Features: - Complex registration workflows with custom form handling - Multi-tier ticketing system with dynamic pricing - Real-time analytics and time-series data - Payment processing integration - Attendance tracking with multiple check-in methods - A/B testing framework for event optimization - Advanced reporting and metrics aggregation ")
                                .contact(
                                        new Contact()
                                                .name("Event Platform Team")
                                                .email("api-support@eventplatform.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://opensource.org/licenses/MIT")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("BearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                                .addSecuritySchemes("ApiKeyAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("X-API-Key")
                                )
                )
        ;
    }
}