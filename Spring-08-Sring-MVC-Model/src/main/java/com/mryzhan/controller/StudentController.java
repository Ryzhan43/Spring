package com.mryzhan.controller;

import com.mryzhan.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.lang.model.element.ModuleElement;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        int studentID = (int)(Math.random()*10000);
        model.addAttribute("studentId", studentID);

        List<Integer> listInt = Arrays.asList(1,2,3,456,7);
        model.addAttribute("numbers", listInt);

        Student stud = new Student(1, "Mike", "Smoth");
        model.addAttribute("student", stud);
        return "student/welcome";
    }


}
