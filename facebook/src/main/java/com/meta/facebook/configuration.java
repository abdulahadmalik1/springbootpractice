package com.meta.facebook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {
   @Bean("honda")
    public car getCar()
    {
        return new car("honda");
    }
}
