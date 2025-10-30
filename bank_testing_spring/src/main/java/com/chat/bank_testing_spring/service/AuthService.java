package com.chat.bank_testing_spring.service;


import com.chat.bank_testing_spring.config.FinicityClientBeanConfig;
import com.chat.bank_testing_spring.config.FinicityConfig;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.AuthenticationApi;
import org.openapitools.client.model.PartnerCredentials;
import org.springframework.stereotype.Service;
import com.chat.bank_testing_spring.sdk.FinicityClientFactory;

import java.time.Duration;
import java.time.Instant;


@Service
public class AuthService {
    private final ApiClient client;
    private final FinicityConfig cfg;
    private volatile String token;
    private volatile Instant expiry;

    public AuthService(ApiClient apiClient, FinicityConfig cfg) {
        this.client = apiClient;
        this.cfg = cfg;
    }

    public synchronized void ensureToken() throws ApiException {
        if (token == null || expiry == null || Instant.now().isAfter(expiry.minus(Duration.ofMinutes(5)))) {
            var auth = new AuthenticationApi(client);
            var resp = auth.createToken(new PartnerCredentials()
                    .partnerId(cfg.getPartnerId())
                    .partnerSecret(cfg.getPartnerSecret()));
            token = resp.getToken();
            expiry = Instant.now().plus(Duration.ofHours(1)); // or real TTL if provided
            ((org.openapitools.client.auth.ApiKeyAuth) client.getAuthentication("FinicityAppToken"))
                    .setApiKey(token);
        }
    }
}
