package com.tl.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello Interceptor";
    }

}
