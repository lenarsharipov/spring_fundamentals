package org.spring.fundamentals.validator;

import org.springframework.stereotype.Component;

@Component
public class NameValidator {

    public void validate(String name) {
        if ("Milk".equals(name)) {
            throw new RuntimeException();
        }
    }

}
