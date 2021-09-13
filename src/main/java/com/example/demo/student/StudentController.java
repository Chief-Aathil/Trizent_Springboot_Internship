package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student") // This class will handle url with .../api/v1/Student/
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
       return studentService.getStudents();

    }


    @PostMapping //Handles POST requests.
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path = "{studentId}") //Handles DELETE requests with url: .../api/v1/Student/{studentId}
                                         //The value {studentId} can be used in the method by using @PathVariable
    public void deleteStudent(@PathVariable("studentId")Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId")Long studentId,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String email){
        studentService.updateStudent(studentId, name, email);
    }

}

