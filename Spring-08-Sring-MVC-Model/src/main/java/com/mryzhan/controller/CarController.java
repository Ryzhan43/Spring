package com.mryzhan.controller;

import com.mryzhan.Spring08SringMvcModelApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    private final Spring08SringMvcModelApplication model;

    public CarController(Spring08SringMvcModelApplication model) {
        this.model = model;
    }

    @RequestMapping("/info")  //localhost:8080/car/info?male=honda&year=2001
    public String carInfo(@RequestParam String make, @RequestParam int year, Model model){

        model.addAttribute("model", make);
        model.addAttribute("year", year);
        System.out.println(make);
        return "car/car-info";
    }

    @RequestMapping("/info2")  //localhost:8080/car/info?male=honda&year=2001
    public String carInfo2(@RequestParam( value = "make" , required = false) String make,Model model){

        model.addAttribute("model", make);
        System.out.println(make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}") //localhost:8080/car/info/
    public String getCarInfo(@PathVariable String make, @PathVariable int year, Model model) {
        model.addAttribute("model", make);
        model.addAttribute("year", year);

        return "car/car-info";
    }
}
