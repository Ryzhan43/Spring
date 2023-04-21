package com.example.entity;

import com.example.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private Gender gender;
    private Integer salary;

    @OneToOne
    private Department department;

    @OneToOne
    private Region region;
}
