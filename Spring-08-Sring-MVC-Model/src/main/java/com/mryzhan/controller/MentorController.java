package com.mryzhan.controller;

import com.mryzhan.enums.Gender;
import com.mryzhan.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
@Controller
public class MentorController {

    List<Mentor> mentorList = Arrays.asList(
            new Mentor("Mike", "Smith", Gender.MALE, 65),
            new Mentor("Tom", "Hanks", Gender.MALE, 32),
             new Mentor("Ammy", "Rob", Gender.FEMALE, 18)
    );

    @RequestMapping("/mentor")
    public String mentorPage(Model model){
        model.addAttribute("mentors", mentorList);
        return "mentor/mentor-list";
    }
}
