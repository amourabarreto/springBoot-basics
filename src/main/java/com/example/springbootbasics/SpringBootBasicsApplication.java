package com.example.springbootbasics;

import com.example.springbootbasics.annotations.Cachorro;
import com.example.springbootbasics.annotations.Gato;
import com.example.springbootbasics.service.Animal;
import com.example.springbootbasics.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootApplication
@RestController
public class SpringBootBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }

    @Autowired
    private String applicationName;

    @Value("${spring.application.name}")
    private String nomeAplicacao;

    @Cachorro
    private Animal animal;

    @Bean
    public CommandLineRunner executando(){
        return args -> animal.fazerBarulho();
    }

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/hello")
    public String HelloWorld(){

        return applicationName +" ---  "+ clienteService.persistirRepository()+" ---- "+nomeAplicacao;
    }


}
