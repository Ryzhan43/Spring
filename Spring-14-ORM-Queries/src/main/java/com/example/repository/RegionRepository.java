package com.example.repository;

import com.example.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);

    //Display all regions in Canada which is Unique
    List<Region> findDistinctByCountry(String country);

    //Display All regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order
    List<Region> findAllByCountryContainingOrderByRegion(String country);

    //
}
