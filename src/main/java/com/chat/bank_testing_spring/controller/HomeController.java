package com.chat.bank_testing_spring.controller;

import com.chat.bank_testing_spring.service.*;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.CustomerAccountSimple;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
public class HomeController {

    private final AuthService auth;
    private final CustomerService customers;
    private final ConnectionUrl connect;
    private final AccountsService accounts;

    public HomeController(AuthService auth, CustomerService customers, ConnectionUrl connect, AccountsService accounts) {
        this.auth = auth;
        this.customers = customers;
        this.connect = connect;
        this.accounts = accounts;
    }

    @GetMapping("/home")
    public ResponseEntity<Void> home() throws ApiException{
        auth.ensureToken();
        String refId = UUID.randomUUID().toString();
        String username = "user_" + refId;
        String customerId = customers.createTestingCustomer(username);

        String link = connect.generateConnectLink(customerId,refId);

        return ResponseEntity.status(302)
                .location(URI.create(link))
                .build();

    }

    @GetMapping("/done")
    public String done(@RequestParam("ref") String refId) throws ApiException{
        return "Your refId is " + refId;
    }




}
