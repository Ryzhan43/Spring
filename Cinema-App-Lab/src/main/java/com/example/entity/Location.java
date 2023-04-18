package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Location extends BaseEntity{

    private String name;
    private Long latitude;
    private Long longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @ManyToOne
    private Cinema cinema;

}
