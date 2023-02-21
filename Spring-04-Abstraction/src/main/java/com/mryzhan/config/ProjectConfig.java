package com.mryzhan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.mryzhan")
@ComponentScan(basePackages = {"com.mryzham.proxy","com.mryzham.service", "com.mryzham.repository" })
public class ProjectConfig {
}
