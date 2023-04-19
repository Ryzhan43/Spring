package com.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Ticket extends BaseEntity {

    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;
    private int seatNumber;
    private char rowNumber;

    @ManyToOne
    private UserAccount userAccount;

    @OneToOne
    private Movie movie;
}
