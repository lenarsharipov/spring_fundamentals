package org.spring.fundamentals;

import org.spring.fundamentals.config.ProjectConfig;
import org.spring.fundamentals.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var person = context.getBean(Person.class);
            person.sayHello("Bill");
        }
    }
}