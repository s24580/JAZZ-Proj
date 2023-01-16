package com.example.cflclient.cflclient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CFLClient implements ICFLClient {
    RestTemplate restClient;
    String apiKey;
    String baseUrl;
    int version;
    private final ICFLClientSettings _settings;

    public CFLClient(ICFLClientSettings settings) {
        restClient = new RestTemplate();
        this.apiKey =settings.getApiKey();
        this.baseUrl =settings.getBaseUrl();
        this.version =settings.getApiVersion();
        _settings = settings;
    }
}
