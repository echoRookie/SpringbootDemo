package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}
