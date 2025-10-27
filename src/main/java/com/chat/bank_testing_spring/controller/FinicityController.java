package com.chat.bank_testing_spring.controller;

import com.chat.bank_testing_spring.service.AuthService;
import org.openapitools.client.ApiException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FinicityController {

    private final AuthService authService;

    public FinicityController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/auth/token")
    public String createToken() throws ApiException{
        return authService.createPartnerToken();
    }

}
