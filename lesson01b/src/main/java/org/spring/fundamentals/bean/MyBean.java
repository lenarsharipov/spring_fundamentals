package org.spring.fundamentals.bean;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component(value = "myBean1")
public class MyBean {

    private String text;

    @PostConstruct
    private void init() {
        this.text = "Hello";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "text='" + text + '\'' +
                '}';
    }
}
