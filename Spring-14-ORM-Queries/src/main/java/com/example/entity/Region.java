package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table  (name = "regions")
public class Region extends BaseEntity{
    private String region;
    private String country;
}
