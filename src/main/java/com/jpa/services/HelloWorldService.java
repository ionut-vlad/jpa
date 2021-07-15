package com.jpa.services;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
//@Service
public class HelloWorldService {

    
    public String doSomething() { 
        return "hello " + new Random().nextInt(10);
    }
    
}
