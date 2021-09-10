package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

//  @Query("select s from Student s where s.email = ?1") // This is the query that corresponds to the Optional variable
    Optional<Student>findStudentByEmail(String email);
}
