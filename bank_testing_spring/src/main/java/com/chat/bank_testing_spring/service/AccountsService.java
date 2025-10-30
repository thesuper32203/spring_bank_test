package com.chat.bank_testing_spring.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.AccountsApi;
import org.openapitools.client.api.AccountsSimpleApi;
import org.openapitools.client.model.CustomerAccountSimple;
import org.openapitools.client.model.CustomerAccountsSimple;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    private final AccountsSimpleApi accountsApi;

    public AccountsService(ApiClient apiClient) {
        this.accountsApi = new AccountsSimpleApi(apiClient);
    }

    public List<CustomerAccountSimple> gatherAccounts(String customerId) throws ApiException {
        CustomerAccountsSimple res = accountsApi.getCustomerAccountsSimple(customerId);
        if(res.getAccounts().isEmpty()) {throw new IllegalArgumentException("Account not found");}
        return res.getAccounts();

    }
}
