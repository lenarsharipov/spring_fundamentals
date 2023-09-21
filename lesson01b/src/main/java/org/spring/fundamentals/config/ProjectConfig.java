package org.spring.fundamentals.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
            "org.spring.fundamentals.bean",
            "org.spring.fundamentals.repository",
            "org.spring.fundamentals.service"
        }
)
public class ProjectConfig {

}
