package org.spring.fundamentals;

import org.spring.fundamentals.config.ProjectConfig;
import org.spring.fundamentals.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var productService = context.getBean(ProductService.class);
            productService.addTenProducts();
        }
    }
}