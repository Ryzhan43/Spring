package com.mryzhan.repository;

import com.mryzhan.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    //custom methods
    //sql
}
