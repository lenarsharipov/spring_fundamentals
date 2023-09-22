package org.spring.fundamentals.model;

import org.spring.fundamentals.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("tr")
    private HelloService helloService;

    public void sayHello(String name) {
        var message = helloService.sayHello(name);
        System.out.println(message);
    }
}
