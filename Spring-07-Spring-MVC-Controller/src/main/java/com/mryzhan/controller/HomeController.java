package com.mryzhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotye annotation
public class HomeController {

    @RequestMapping("/home") // Use @Request annotation to associate the action with an HTTP request
    public String home(){
        return "home.html"; //Return the HTML document name thath contains the deteils we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }


    @RequestMapping
    public String home3(){
        return "welcome.html";
    }
}
