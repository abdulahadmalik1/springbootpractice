package com.meta.facebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({@PropertySource("classpath:test1.properties"),@PropertySource("classpath:test2.properties")})
public class car {
    @Value("${honda.prop}")
    String name1;
    @Value("${king.age}")
    String name2;

    public String getName() {
        return this.name2;
    }
public String getName2()
{
    return this.name2;
}
    car()
    {

    }
    public car(String name) {
        this.name1 = name;
    }
}
