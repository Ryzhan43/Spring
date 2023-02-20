package com.mryzhnan.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeContainer(){
        return new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeContainer(){
        return new PartTimeMentor();
    }
}
