package com.mryzhan.model;

import com.mryzhan.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Mentor {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;

    @Override
    public String toString() {
        return firstName + '\t' +lastName + '\t' + gender + '\t' +age +'\n';
    }
}
