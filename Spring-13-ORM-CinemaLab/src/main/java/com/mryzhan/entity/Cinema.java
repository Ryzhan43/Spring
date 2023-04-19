package com.mryzhan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity {
    private String name;
    private String sponsored_name;

    @OneToOne
    private Location location;
    @ManyToMany
    private List<Movie> movies;
    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinema;
}
