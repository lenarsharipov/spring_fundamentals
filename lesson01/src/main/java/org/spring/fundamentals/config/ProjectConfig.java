package org.spring.fundamentals.config;

import org.spring.fundamentals.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "first Bean")
    @Primary
    public MyBean myBean1() {
        var myBean = new MyBean();
        myBean.setText("Hello!");
        return myBean;
    }

    @Bean
    public MyBean myBean2() {
        var myBean = new MyBean();
        myBean.setText("World!");
        return myBean;
    }

    @Bean
    public MyBean myBean3() {
        var myBean = new MyBean();
        myBean.setText("Third!");
        return myBean;
    }

}
