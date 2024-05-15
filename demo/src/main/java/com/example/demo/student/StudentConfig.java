package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joel = new Student("Joel", "joelkong2001@gmail.com",  LocalDate.of(2001, Month.NOVEMBER, 16));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2005, Month.NOVEMBER, 16));

            repository.saveAll(List.of(joel, alex));
        };
    }
}
