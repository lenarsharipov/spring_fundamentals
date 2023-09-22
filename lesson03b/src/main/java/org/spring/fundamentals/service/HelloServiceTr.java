package org.spring.fundamentals.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tr")
public class HelloServiceTr implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Merhaba, " + name + "!";
    }
}
