package com.mryzhnan.bean_annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft_mentor = context.getBean(FullTimeMentor.class);

        ft_mentor.createAccount();

        String ft =  context.getBean(String.class);

        System.out.println(ft);
    }
}