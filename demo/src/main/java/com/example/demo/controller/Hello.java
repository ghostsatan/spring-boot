package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @RequestMapping("/hello")
    public String handle01(){
        return "hello spring";
    }
}
