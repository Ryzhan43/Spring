package com.mryzhan.bootstrap;

import com.mryzhan.entity.Car;
import com.mryzhan.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW", "X5");
        Car c2 = new Car("Honda", "C1");
        Car c3 = new Car("Toyota", "Corrola");

        //save these objects
        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

    }
}
