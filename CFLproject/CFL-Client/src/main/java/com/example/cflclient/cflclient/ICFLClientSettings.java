package com.example.cflclient.cflclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface ICFLClientSettings {

    @return
    String getApiKey();

    @return

    String getBaseUrl();

    @return

    int getApiVersion();

    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(getBaseUrl())
                .pathSegment(getApiVersion()+"")
                .queryParam("key=",getApiKey());
    }
}
