package com.example.springbootbasics.configurators;

import com.example.springbootbasics.annotations.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Development
public class DevConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> System.out.println("config Desenvolvimento");
    }
}
