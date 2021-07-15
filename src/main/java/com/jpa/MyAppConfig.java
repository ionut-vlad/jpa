package com.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpa.services.MessengerService;

@Configuration
public class MyAppConfig {

    @Bean
    public MessengerService getMessengerService() {
        return new MessengerService("random");
    }
    
}
