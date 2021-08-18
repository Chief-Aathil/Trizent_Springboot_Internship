package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

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
