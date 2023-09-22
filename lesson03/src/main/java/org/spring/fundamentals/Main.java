package org.spring.fundamentals;

import org.spring.fundamentals.config.ProjectConfig;
import org.spring.fundamentals.model.Product;
import org.spring.fundamentals.repository.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var productRepository = context.getBean(ProductRepository.class);

            Product milk = new Product();
            milk.setName("Milk");
            milk.setPrice(0.85);

            productRepository.addProduct(milk);

            System.out.println(productRepository.getProducts());

        }
    }

}