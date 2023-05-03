package com.example.spring_aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Eragon")
    private String name;

    public String getName() {
        return name;
    }
}
