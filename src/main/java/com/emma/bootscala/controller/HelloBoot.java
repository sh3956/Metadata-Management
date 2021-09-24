package com.emma.bootscala.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {
    @RequestMapping(value="/sayHi", method=RequestMethod.GET)
    public String sayHello(){
        return "Hello Boot....";
    }
}
