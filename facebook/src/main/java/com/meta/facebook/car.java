package com.meta.facebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:test1.properties")
public class car {
    @Value("${honda.prop}")
    String name1;
    String name2;

    public String getName() {
        return this.name1;
    }
public String getName2()
{
    return this.name2;
}
    car()
    {

    }
    public car(String name) {
        this.name = name;
    }
}
