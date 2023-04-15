package com.mryzhan.entity;

import com.mryzhan.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "studentFirstName", length = 105)
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient
    private String city;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDay;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
