package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // the changes in DB will be removed after the test when using this annotation.
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;
    DepartmentRepositoryTest() {
    }

    @BeforeEach
    void setUp() {
        Department department=Department.builder()
                .departmentName("Mechanical Engineering")
                .departmentCode("ME-01")
                .departmentAddress("Kothamangalam")
                .build();
        entityManager.persist(department); // to make the entry available in DB.
    }

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department= departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(),"Mechanical Engineering");
    }
}