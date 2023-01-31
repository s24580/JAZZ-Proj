package com.example.cflclient.cflclient;

import com.example.cflclient.cflclient.contract.GamesDto;
import com.example.cflclient.cflclient.contract.GamesResultDto;
import com.example.cflclient.cflclient.contract.PlayersDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CFLClient implements ICFLClient {
    RestTemplate restClient;
    String apiKey;
    String baseUrl;
    private final ICFLClientSettings _settings;

    public CFLClient(ICFLClientSettings settings) {
        restClient = new RestTemplate();
        this.apiKey =settings.getApiKey();
        this.baseUrl =settings.getBaseUrl();
        _settings = settings;
    }
    /***http://api.cfl.ca/v1/games/2013?key=V9E2zaOwyP9qsnSrOKspwxGACthOADpI***/
    @Override
    public GamesResultDto getGames(int id) {
        String url = _settings.getUrlBuilder()
                .path("/v1/games/"+id).queryParam("key={apiKey}")
                .buildAndExpand(apiKey)
                .toUriString();
        return restClient.getForObject(url, GamesResultDto.class);
    }

    @Override
    public PlayersDto getPlayers(int id) {
        String url = _settings.getUrlBuilder()
                .pathSegment("players", id+"")
                .build()
                .toUriString();
        var response = restClient.getForEntity(url,PlayersDto.class).getBody();
        return response;
    }
//    @Override
//    public List<GamesDto> getGamesAll(){
//        String url = _settings.getBaseUrl()
//                .
//
//    }
}
