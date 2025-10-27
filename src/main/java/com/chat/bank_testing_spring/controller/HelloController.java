package com.chat.bank_testing_spring.controller;

import com.chat.bank_testing_spring.config.FinicityConfig;
import org.openapitools.client.ApiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String helloWorld(){

        return "test";
    }

}

