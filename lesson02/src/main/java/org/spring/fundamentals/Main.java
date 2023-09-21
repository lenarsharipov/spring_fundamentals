package org.spring.fundamentals;

import org.spring.fundamentals.beans.Cat;
import org.spring.fundamentals.beans.Owner;
import org.spring.fundamentals.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Cat cat = context.getBean(Cat.class);
            Owner owner = context.getBean(Owner.class);

            cat.setName("Leopold");

            System.out.println(cat);
            System.out.println(owner);
        }
    }

}