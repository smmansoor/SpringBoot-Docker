package com.example.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDockerApp {

    private static final Logger log = LoggerFactory.getLogger(SpringBootDockerApp.class);
    @Autowired
    private ToDoRepository toDoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApp.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            toDoRepository.save(new Todos("Pay electricity bill", false));
            toDoRepository.save(new Todos("Call property agent", false));
            toDoRepository.save(new Todos("Buy milk and eggs", false));


        };
    }
}
