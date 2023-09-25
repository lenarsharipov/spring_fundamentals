package org.spring.fundamentals.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello(String name) throws Exception {
        if ("John".equals(name)) {
            throw new Exception("exception");
        }
        System.out.println("Hello, " + name);

        priv();
    }

    private void priv() {
        System.out.println("priv");
    }
}
