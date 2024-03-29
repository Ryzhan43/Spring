package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Cinema extends BaseEntity{
    private String name;
    private String sponsored_name;

    @ManyToMany
    private List<Movie> movies;

    @OneToOne
    private Location location;

}
