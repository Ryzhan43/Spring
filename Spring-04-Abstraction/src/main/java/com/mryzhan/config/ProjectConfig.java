package com.mryzhan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mryzhan")
//@ComponentScan(basePackages = {"com.mryzhan.proxy",'com.mryzhan.service', 'com.mryzhan.repository' })
public class ProjectConfig {
}
