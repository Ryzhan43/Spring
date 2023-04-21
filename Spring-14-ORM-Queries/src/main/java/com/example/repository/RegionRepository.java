package com.example.repository;

import com.example.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //
    List<Region> findByCountry(String country);

}
