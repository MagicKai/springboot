package com.zkx.spingboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
