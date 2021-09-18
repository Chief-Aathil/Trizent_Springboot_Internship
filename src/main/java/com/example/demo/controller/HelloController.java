package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //any GET requests with url= <server-address:port>/ will be handled. eg: localhost:8080/
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
}
