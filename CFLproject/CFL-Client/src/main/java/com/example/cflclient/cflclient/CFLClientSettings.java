package com.example.cflclient.cflclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CFLClientSettings implements ICFLClientSettings{

    @Value("${wpisz api key do CFL}")
    private String apiKey;
    @Value("${wpisz base url}")
    private String baseUrl;
    @Value("${nwm czy trzeba}")
    private int apiVersion;



    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public int getApiVersion() {
        return apiVersion;
    }
}
