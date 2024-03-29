package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table  (name = "regions")
@Data
@NoArgsConstructor
public class Region{

    @Id
    private Long id;
    private String region;
    private String country;
}
