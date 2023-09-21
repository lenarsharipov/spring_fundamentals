package org.spring.fundamentals.config;

import org.spring.fundamentals.beans.Cat;
import org.spring.fundamentals.beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat cat() {
        return new Cat("Tom");
    }

    @Bean
    public Owner owner() {
        return new Owner(cat());
    }
}
