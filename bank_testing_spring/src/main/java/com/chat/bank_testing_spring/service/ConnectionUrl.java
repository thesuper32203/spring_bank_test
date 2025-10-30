package com.chat.bank_testing_spring.service;

import com.chat.bank_testing_spring.config.FinicityConfig;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.ConnectApi;
import org.openapitools.client.model.ConnectParameters;
import org.openapitools.client.model.ReportCustomField;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class ConnectionUrl {
    private final ConnectApi connectApi;
    private final FinicityConfig cfg;

    public ConnectionUrl(ApiClient client, FinicityConfig cfg){
        this.cfg = cfg;
        this.connectApi = new ConnectApi(client);
    }

    public String generateConnectLink(String customerId, String refId) throws ApiException {
        String redirect = "http://spring-bank-test.onrender.com/done?ref="+URLEncoder.encode(refId, StandardCharsets.UTF_8);

        try {
            ConnectParameters params = new ConnectParameters()
                    .customerId(customerId)
                    .partnerId(cfg.getPartnerId())
                    .addReportCustomFieldsItem(new ReportCustomField().label("NA").value("Loan").shown(true))
                    .redirectUri(redirect);
            var linkResp = connectApi.generateConnectUrl(params);
            return linkResp.getLink();
        } catch (ApiException e) {
            System.err.println("Status: " + e.getCode());
            System.err.println("ErrorMessage: " + e.getResponseBody());
            throw e;
        }
    }
}
