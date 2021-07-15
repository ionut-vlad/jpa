package com.jpa.controllers;



import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.services.HelloWorldService;

@RestController
public class MessageController {
    
    @Autowired
    HelloWorldService helloWorldService;
    
  
}
