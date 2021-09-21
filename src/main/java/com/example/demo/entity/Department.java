package com.example.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity // this enables the class to interact with db
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    // to specify the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "departmentName cannot be blank.")    // for validating name
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
