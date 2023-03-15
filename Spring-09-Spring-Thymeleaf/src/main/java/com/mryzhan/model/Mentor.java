package com.mryzhan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String graduate;
    private String batch;


    private String company;
}
