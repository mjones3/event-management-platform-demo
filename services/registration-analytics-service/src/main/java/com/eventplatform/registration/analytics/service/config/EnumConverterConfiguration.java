package com.eventplatform.registration.analytics.service.config;

import com.eventplatform.registration.analytics.service.model.AnalyticsEventType;
import com.eventplatform.registration.analytics.service.model.CheckInMethod;
import com.eventplatform.registration.analytics.service.model.PaymentMethod;
import com.eventplatform.registration.analytics.service.model.PaymentStatus;
import com.eventplatform.registration.analytics.service.model.RegistrationStatus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "com.eventplatform.registration.analytics.service.config.EnumConverterConfiguration.analyticsEventTypeConverter")
    Converter<String, AnalyticsEventType> analyticsEventTypeConverter() {
        return new Converter<String, AnalyticsEventType>() {
            @Override
            public AnalyticsEventType convert(String source) {
                return AnalyticsEventType.fromValue(source);
            }
        };
    }
    @Bean(name = "com.eventplatform.registration.analytics.service.config.EnumConverterConfiguration.checkInMethodConverter")
    Converter<String, CheckInMethod> checkInMethodConverter() {
        return new Converter<String, CheckInMethod>() {
            @Override
            public CheckInMethod convert(String source) {
                return CheckInMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "com.eventplatform.registration.analytics.service.config.EnumConverterConfiguration.paymentMethodConverter")
    Converter<String, PaymentMethod> paymentMethodConverter() {
        return new Converter<String, PaymentMethod>() {
            @Override
            public PaymentMethod convert(String source) {
                return PaymentMethod.fromValue(source);
            }
        };
    }
    @Bean(name = "com.eventplatform.registration.analytics.service.config.EnumConverterConfiguration.paymentStatusConverter")
    Converter<String, PaymentStatus> paymentStatusConverter() {
        return new Converter<String, PaymentStatus>() {
            @Override
            public PaymentStatus convert(String source) {
                return PaymentStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "com.eventplatform.registration.analytics.service.config.EnumConverterConfiguration.registrationStatusConverter")
    Converter<String, RegistrationStatus> registrationStatusConverter() {
        return new Converter<String, RegistrationStatus>() {
            @Override
            public RegistrationStatus convert(String source) {
                return RegistrationStatus.fromValue(source);
            }
        };
    }

}
