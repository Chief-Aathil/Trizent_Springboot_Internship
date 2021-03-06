package com.example.demo.student;



import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
     @Id
     @SequenceGenerator(
             name="student_sequence",
             sequenceName ="student_sequence",
             allocationSize = 1
     )
     @GeneratedValue(
             strategy = GenerationType.SEQUENCE,
             generator = "student_sequence"
     )
    private Long id;
    private String name;
    @Transient
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(){}

    public Student(Long id,
                   String name,
                   LocalDate dob,
                   String email) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.email = email;
    }

    public Student(String name,
                   LocalDate dob,
                   String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
