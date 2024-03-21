package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
    @Bean
    @Scope(value = "prototype") //default scope
    public MyBean myBean(){
        return new MyBean();
    }
}
