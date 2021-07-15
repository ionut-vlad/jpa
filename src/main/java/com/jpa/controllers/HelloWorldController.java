package com.jpa.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.services.HelloWorldService;

@RestController
public class HelloWorldController {
    
    @Autowired
    private HelloWorldService helloWorldService;
    
    @GetMapping(value="/hello/{name}/id/{id}")
    public String sayHelloToMyLittleFriend(@PathVariable String name, @PathVariable int id ) {
        return "Hello world! My path variable name is " + name + "and id: " + id;
    }
    
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/hello")
    public String sayHelloAgainToMyLittleFriend(@PathParam(value = "name") String name, @PathParam(value = "surname") String surname ) {
        return "Hello world! My path param name is " + name + " " + surname;
    }
    
    
}
