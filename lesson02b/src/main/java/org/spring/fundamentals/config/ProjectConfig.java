package org.spring.fundamentals.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.fundamentals.bean")
public class ProjectConfig {

}
