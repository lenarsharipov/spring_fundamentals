package org.spring.fundamentals;

import org.spring.fundamentals.config.ProjectConfig;
import org.spring.fundamentals.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var service = context.getBean(HelloService.class);
            service.hello("John1");
        }
    }
}