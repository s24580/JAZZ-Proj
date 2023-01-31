package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.Games;
import com.example.cflwebapi.webapi.contract.GamesDto;
import org.springframework.stereotype.Component;

@Component
public class GamesMapperDto implements IMap<Games, GamesDto>{
    @Override
    public GamesDto map(Games games) {
        return map(games,new GamesDto());
    }

    @Override
    public GamesDto map(Games games, GamesDto gamesDto) {
        gamesDto.setGameId(games.getGamesId());
        gamesDto.setDateStart(games.getDateStart());
        gamesDto.setGameNumber(games.getGameNumber());
        gamesDto.setSeason(games.getSeason());


        return gamesDto;
    }
}
