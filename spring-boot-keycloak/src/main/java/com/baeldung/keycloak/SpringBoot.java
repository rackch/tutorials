package com.baeldung.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBoot {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBoot.class);

        app.run(args);
//        SpringApplication.run(SpringBoot.class, args);
    }

}
