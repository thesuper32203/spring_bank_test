package com.chat.bank_testing_spring.controller;

import com.chat.bank_testing_spring.service.AuthService;
import com.chat.bank_testing_spring.service.ConnectionUrl;
import com.chat.bank_testing_spring.service.CustomerService;
import org.openapitools.client.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.UUID;

@RestController
public class HomeController {

    private final AuthService auth;
    private final CustomerService customers;
    private final ConnectionUrl connect;

    public HomeController(AuthService auth, CustomerService customers, ConnectionUrl connect) {
        this.auth = auth;
        this.customers = customers;
        this.connect = connect;
    }

    @GetMapping("/home")
    public ResponseEntity<Void> home() throws ApiException{
        auth.ensureToken();
        String username = "user_" + UUID.randomUUID();
        String customerId = customers.createTestingCustomer(username);
        String link = connect.generateConnectLink(customerId);
        return ResponseEntity.status(302)
                .location(URI.create(link))
                .build();

    }
}
