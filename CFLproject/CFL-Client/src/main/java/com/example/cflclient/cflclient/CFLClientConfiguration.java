package com.example.cflclient.cflclient;

import org.springframework.beans.factory.annotation.Value;

public class CFLClientConfiguration {

    public ICFLClientSettings getSetting(
            @Value("${wpisz api key do CFL}") String apiKey,
            @Value("${wpisz base url}") String host,
            @Value("${nwm czy trzeba}") int apiVersion){
        return new CFLClientSettings();
    }
}
