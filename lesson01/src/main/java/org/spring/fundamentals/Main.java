package org.spring.fundamentals;

import org.spring.fundamentals.bean.MyBean;
import org.spring.fundamentals.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            // by name
            MyBean b1 = context.getBean("first Bean", MyBean.class);
            MyBean b2 = context.getBean("myBean2", MyBean.class);
            MyBean b3 = context.getBean("myBean3", MyBean.class);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);

            System.out.println(b1.getText());
            System.out.println(b2.getText());
            System.out.println(b3.getText());

        }
    }

}