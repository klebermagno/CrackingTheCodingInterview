package com.klebermagno.code.advanced.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Marks this class as a Spring Boot application
public class Application {

  public static void main(String[] args) {
    // Bootstraps the Spring Boot application
    SpringApplication.run(Application.class, args);
  }
}
