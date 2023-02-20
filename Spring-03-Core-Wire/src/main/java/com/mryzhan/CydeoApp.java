package com.mryzhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext conteiner = new AnnotationConfigApplicationContext(Config.class);

        Java java = conteiner.getBean(Java.class);

        java.getTeachingHours();
    }
}
