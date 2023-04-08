package com.mryzhan.bootstrap;

import com.github.javafaker.Faker;
import com.mryzhan.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Student> createStudent() {

        List<Student> students = getRandomStudents(20);

        return students;
    }

    public static List<Student> getRandomStudents(int count){
        List<Student> students =new ArrayList<>();

        for (int i = 0; i < count; i++) {
            students.add(new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20, 500), new Faker().address().state()));
        }
        return students;
    }
}
