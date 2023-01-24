package com.example.cflclient.cflclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CFLClientSettings implements ICFLClientSettings {

    @Value("V9E2zaOwyP9qsnSrOKspwxGACthOADpI")
    private String apiKey;
    @Value("api.cfl.ca")
    private String baseUrl;
//    @Value("/v1")
//    private int apiVersion;
    /***http://api.cfl.ca/v1/games/2013?key=V9E2zaOwyP9qsnSrOKspwxGACthOADpI***/

    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

//    @Override
//    public int getApiVersion(){return  apiVersion;}
}
