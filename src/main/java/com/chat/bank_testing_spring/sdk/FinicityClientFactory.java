package com.chat.bank_testing_spring.sdk;

import com.chat.bank_testing_spring.config.FinicityConfig;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.ApiKeyAuth;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FinicityClientFactory {

    public ApiClient create(FinicityConfig config){
        ApiClient client = new ApiClient();
        //AppKey header for all calls
        ApiKeyAuth appKey = (ApiKeyAuth) client.getAuthentication("FinicityAppKey");
        appKey.setApiKey(config.getAppKey());

        return client;
    }

    public void setParameterToken(ApiClient client, String token){
        ApiKeyAuth appToken = (ApiKeyAuth) client.getAuthentication("FinicityAppToken");
        appToken.setApiKey(token);
    }

}
