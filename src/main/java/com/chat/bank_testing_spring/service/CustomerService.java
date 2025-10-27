package com.chat.bank_testing_spring.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.CustomersApi;
import org.openapitools.client.model.CreatedCustomer;
import org.openapitools.client.model.NewCustomer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private final CustomersApi customerApi;

    public CustomerService(ApiClient apiClient) {
        this.customerApi = new CustomersApi(apiClient);
    }

    public String createTestingCustomer(String username) throws ApiException {

        NewCustomer body = new NewCustomer()
                .username(username)
                .email(username + "@test.com");
        try {
            CreatedCustomer created = customerApi.addTestingCustomer(body);
            return created.getId();
        } catch (ApiException e) {
            System.err.println("Failed to create testing customer");
            throw new RuntimeException("Error creating customer", e);
        }

    }
}
