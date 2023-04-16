package com.mryzhan.entity;

import com.mryzhan.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{

    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "email", length = 50)
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @OneToOne(cascade = CascadeType.ALL)
    //@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "department_id")
    private Department  department;
    private int salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int regionId;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }
}
