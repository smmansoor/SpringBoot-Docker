package com.example.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerApp {

    private static final Logger log = LoggerFactory.getLogger(SpringBootDockerApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApp.class, args);
    }


}
