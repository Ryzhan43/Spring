package com.example.bootstrap;

import com.example.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGeneration implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGeneration(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("=========================== START ===================");

        System.out.println(regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println(regionRepository.findAllByCountryContainingOrderByRegion("United"));

        System.out.println("===========================  END  ===================");
    }
}
