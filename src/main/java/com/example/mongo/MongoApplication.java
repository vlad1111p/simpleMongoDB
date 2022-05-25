package com.example.mongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }



    @Bean
    CommandLineRunner runner(StudentRepository StudentRepository){
        return args -> {
            StudentRepository.save(new Student("Bilal","Ahmed"));
            
    };
    }
}


