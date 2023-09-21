package org.spring.fundamentals;

import org.spring.fundamentals.bean.MyBean;
import org.spring.fundamentals.config.ProjectConfig;
import org.spring.fundamentals.service.ProductDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
           var b1 = context.getBean("myBean1", MyBean.class);
            System.out.println(b1);
            System.out.println(b1.getText());

            ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
            service.addProduct();

        }
    }

}