package com.mryzhan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        Car c = new Car();
        c.setName("Honda");
        return c;
    }

    //Direct wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Joe");
//        p.setCar(car());
//        return p;
//    }

//Auto wiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Joe");
        p.setCar(car);
        return p;
    }
}
