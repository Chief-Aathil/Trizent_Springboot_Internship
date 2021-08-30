package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student john =
                    new Student(
                    "John",
                    25,
                    LocalDate.of(2020, JANUARY,1),
                    "johnwick@gmail.com"
                    );
            Student tom =
                    new Student(
                            "Tom",
                            26,
                            LocalDate.of(2004, JANUARY,2),
                            "tomcruise@gmail.com"
                    );
            repository.saveAll(Arrays.asList(john, tom));
        };
    }
}
