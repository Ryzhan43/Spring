package com.mryzhan.entity;

import com.mryzhan.enums.MovieState;
import com.mryzhan.enums.MovieType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer summary;
    @Enumerated(EnumType.STRING)
    private MovieType type;
    @Enumerated(EnumType.STRING)
    private MovieState state;

    private Long price;

    private Long duration;

    @ManyToMany(mappedBy = "movies")
    private List<Cinema> cinemaList;

    @ManyToMany
    private List<Genre> genreList ;

    @OneToOne(mappedBy = "movie")
    private Ticket ticket;

    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movies;

}
