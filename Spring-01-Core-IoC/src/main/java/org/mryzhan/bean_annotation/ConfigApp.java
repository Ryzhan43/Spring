package org.mryzhan.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    @Bean
    FullTimeMentor fullTimeContainer(){
        return new FullTimeMentor();
    }

//    @Bean(name = "pt1")
    @Bean
    @Primary
    PartTimeMentor partTimeContainer(){
        return new PartTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeContainer2(){
        return new PartTimeMentor();
    }

}
