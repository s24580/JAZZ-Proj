package com.example.cflclient.cflclient;

import com.example.cflclient.cflclient.contract.GamesDto;
import com.example.cflclient.cflclient.contract.GamesResultDto;
import com.example.cflclient.cflclient.contract.PlayersDto;

import java.util.List;

public interface ICFLClient {

    GamesResultDto getGames(int id);
    PlayersDto getPlayers(int id);

//    List<GamesDto> getGamesAll();

}
