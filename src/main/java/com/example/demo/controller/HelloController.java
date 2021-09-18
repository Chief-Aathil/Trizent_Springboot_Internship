package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
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

    //Simplified way to define handlers for GET requests. If you open the annotation you can see that
    // RequestMapping is used in it.
    //GET requests with url= <server-address:port>/simple will be handled. eg: localhost:8080/simple
    @GetMapping("/simple")
    public String helloWorldSimple(){
        return "Hello World simplified";
    }
}
