package com.effecia.webdata.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/Test")
public class TestController {

    @GetMapping(value = "/getHealthy")
    public String getHealthy(){
        return "OK";
    }
}
