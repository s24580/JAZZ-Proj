package com.example.cflclient.cflclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface ICFLClientSettings {

    String getApiKey();


    String getBaseUrl();

//    int getApiVersion();



    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(getBaseUrl());
//                .pathSegment(getApiVersion() + "")
//                .queryParam("?key=",getApiKey());
    }
}
