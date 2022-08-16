package com.example.springbootbasics.configurators;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public String applicationName(){
        return "Basic Spring Boot";
    }
}

