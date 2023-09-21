package org.spring.fundamentals;

import org.spring.fundamentals.bean.Cat;
import org.spring.fundamentals.bean.Owner;
import org.spring.fundamentals.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            var cat = context.getBean(Cat.class);
            var owner = context.getBean(Owner.class);
//            cat.setName("Tom");

//            System.out.println(cat);
            System.out.println(owner);

        }
    }
}