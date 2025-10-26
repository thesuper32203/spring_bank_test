package com.chat.bank_testing_spring.controller;

import com.chat.bank_testing_spring.config.FinicityConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final FinicityConfig cfg;

    public HelloController(FinicityConfig cfg) {this.cfg = cfg;}

    @GetMapping("/hello")
    public String helloWorld(){

        return "Testing";
    }

}

