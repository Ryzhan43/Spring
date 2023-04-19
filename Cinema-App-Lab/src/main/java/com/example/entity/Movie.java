package com.example.entity;

import com.example.enums.State;
import com.example.enums.Type;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Movie extends BaseEntity{

    private String name;
    private Long price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    private Long duration;
    private String summary;

    @ManyToMany(mappedBy = "movies")
    private List<Cinema> cinemaList;

    @ManyToMany(mappedBy = "movie")
    private List<Genre> genreList ;

    @OneToOne(mappedBy = "movie")
    private Ticket ticket;

}
