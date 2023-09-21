package org.spring.fundamentals.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired(required = false)
    private Cat cat;

//    private Cat cat;
//
//    public Owner(Cat cat) {
//        this.cat = cat;
//    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }

}
