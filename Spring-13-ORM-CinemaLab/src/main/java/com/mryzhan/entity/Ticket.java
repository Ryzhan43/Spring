package com.mryzhan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

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
