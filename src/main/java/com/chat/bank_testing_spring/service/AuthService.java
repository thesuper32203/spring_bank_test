package com.chat.bank_testing_spring.service;


import com.chat.bank_testing_spring.config.FinicityClientBeanConfig;
import com.chat.bank_testing_spring.config.FinicityConfig;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.AuthenticationApi;
import org.openapitools.client.model.PartnerCredentials;
import org.springframework.stereotype.Service;
import com.chat.bank_testing_spring.sdk.FinicityClientFactory;


@Service
public class AuthService {
    private final ApiClient client;
    private final FinicityConfig config;

    public AuthService(ApiClient apiClient, FinicityConfig config) {
        this.client = apiClient;
        this.config = config;

    }

    public String createPartnerToken() throws ApiException {
        AuthenticationApi auth = new AuthenticationApi(client);
        var resp = auth.createToken(
                new PartnerCredentials()
                        .partnerId(config.getPartnerId())
                        .partnerSecret(config.getPartnerSecret())
        );
        var appToken = (org.openapitools.client.auth.ApiKeyAuth)
                client.getAuthentication("FinicityAppToken");
        appToken.setApiKey(resp.getToken()); // set on the SAME client (bean)
        return resp.getToken();
    }
}
