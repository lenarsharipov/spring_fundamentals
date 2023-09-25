package org.spring.fundamentals.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* org.spring.fundamentals.service.HelloService.hello(..))")
    public void before() {
        System.out.println("Starting hello");
    }

    @After("execution(* org.spring.fundamentals.service.HelloService.hello(..))")
    public void after() {
        System.out.println("Finishing hello");
    }

    @AfterReturning("execution(* org.spring.fundamentals.service.HelloService.hello(..))")
    public void afterReturning() {
        System.out.println("Finishing if no exception");
    }

    @AfterThrowing("execution(* org.spring.fundamentals.service.HelloService.hello(..))")
    public void afterThrowing() {
        System.out.println("Finishing after throwing exception");
    }

    @Before("execution(* org.spring.fundamentals.service.HelloService.priv())")
    public void beforePrivate() {
        System.out.println("Starting hello");
    }

}
