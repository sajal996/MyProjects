package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;


@RestController("/HelloWorld")
@RequestMapping("/HelloWorld")
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    public String getMessage(@PathVariable String name){
        return "Hi " + name + " Welcome to SpringBoot";
    }

    @RequestMapping(method = RequestMethod.GET, path = "HelloWorldBean/{name}")
    public com.example.demo.bean.HelloWorld getBean(@PathVariable String name){
        return new com.example.demo.bean.HelloWorld(name);
    }

}
