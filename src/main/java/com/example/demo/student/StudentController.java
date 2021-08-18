package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        List<Student> list= new ArrayList<>();
        list.add(new Student(1L,
                "John",
                25,
                LocalDate.of(2020, Month.JANUARY,1),
                "johnwick@gmail.com"
        ));
        return list;

    }

}
