package org.spring.fundamentals.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(
        basePackages = {
                "org.spring.fundamentals.service",
                "org.spring.fundamentals.aspect"
        })
@EnableAspectJAutoProxy /* Mandatory when aspects are implemented */
public class ProjectConfig {

}
