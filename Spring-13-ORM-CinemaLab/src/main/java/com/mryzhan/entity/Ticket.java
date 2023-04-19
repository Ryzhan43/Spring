package com.mryzhan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor

public class Ticket extends BaseEntity {

    @Column(columnDefinition = "DATESTAMP")
    private LocalDateTime dateTime;
    private int seatNumber;
    private char rowNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserAccount userAccount;

    @OneToOne
    private Movie movie;
}
