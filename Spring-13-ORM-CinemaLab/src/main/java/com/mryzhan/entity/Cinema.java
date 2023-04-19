package com.mryzhan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity {
    private String name;
    private String sponsored_name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;
    @ManyToMany
    private List<Movie> movies;
    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;
}
