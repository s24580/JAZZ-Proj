package com.example.cflwebapi.webapi.services;

import com.example.cfldata.model.*;
import com.example.cfldata.repositories.CFLDataCatalog;
import com.example.cfldata.repositories.ICatalogData;
import com.example.cflwebapi.webapi.contract.GamesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class GamesService implements  IGamesService {

    private final CFLDataCatalog db;

    @Autowired
    public GamesService(CFLDataCatalog db) {
        this.db = db;
    }

    @Override
    public long saveGame(GamesDto gamesDto) {
        var gameEntity = new Games();
        gameEntity.setGameId(gamesDto.getGameId());
        gameEntity.setDateStart(gamesDto.getDateStart());
        gameEntity.setGameNumber(gamesDto.getGameNumber());
        gameEntity.setSeason(gamesDto.getSeason());
        gameEntity.setEventType(gamesDto.getEventType());
        gameEntity.setVenue(gamesDto.getVenue());
        gameEntity.setWeather(gamesDto.getWeather());
        gameEntity.setTeam1(gamesDto.getTeam1());
        gameEntity.setTeam2(gamesDto.getTeam2());
        db.getGames().save(gameEntity);
        return gameEntity.getId();
    }

    @Override
    public List<GamesDto> getAll() {
        return db.getGames()
                .findAll()
                .stream()
                .map(entity->new GamesDto(entity.getId(),
                        entity.getGameId(),
                        entity.getDateStart(),
                        entity.getGameNumber(),
                        entity.getSeason(),
                        entity.getEventType(),
                        entity.getVenue(),
                        entity.getWeather(),
                        entity.getTeam1(),
                        entity.getTeam2()))
                .toList();
    }

}
