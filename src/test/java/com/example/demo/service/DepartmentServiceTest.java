package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentId(1L)
                .departmentName("IT")
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }

    @Test
    public void whenValidDepartmentName_thenDepartmentFound(){
        /*
        * To test findDepartmentByName()
        * Requires:
        *   Objects: DepartmentService, DepartmentRepository
        *
        * */
        String departmentName = "IT";

        //fetchDepartmentByName() should be mocked.
        // this function calls DepartmentRepository.findByDepartmentNameIgnoreCase()
        // so DepartmentRepository should be mocked.
        Department found = departmentService.fetchDepartmentByName(departmentName);//

        //checking if the passed name is same as the found name.
        assertEquals(departmentName, found.getDepartmentName());

    }
}