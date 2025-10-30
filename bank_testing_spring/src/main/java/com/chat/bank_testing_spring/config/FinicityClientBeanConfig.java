package com.chat.bank_testing_spring.config;

import com.chat.bank_testing_spring.sdk.FinicityClientFactory;
import org.openapitools.client.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FinicityClientBeanConfig {

    private final FinicityClientFactory factory;
    private final FinicityConfig config;

    public FinicityClientBeanConfig(FinicityClientFactory factory, FinicityConfig config) {
        this.factory = factory;
        this.config = config;
    }

    @Bean
    public ApiClient finicityApiClient(){

        return factory.create(config);
    }
}
