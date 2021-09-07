package com.ms.course.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    // Resgitra uma instancia unica, um singleton de um objeto RestTemplate
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}