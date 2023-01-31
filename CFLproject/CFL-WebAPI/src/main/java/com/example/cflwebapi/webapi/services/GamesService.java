package com.example.cflwebapi.webapi.services;

import com.example.cfldata.repositories.CFLDataCatalog;
import com.example.cflwebapi.webapi.contract.GamesDto;
import com.example.cflwebapi.webapi.contract.GamesResultDto;
import com.example.cflwebapi.webapi.mappers.ICatalogMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GamesService implements  IGamesService {

    private final CFLDataCatalog db;
    private final ICatalogMap catalog;



    @Override
    public GamesResultDto getAll() {

        var gamesResultDto = new GamesResultDto();
        var gamesResult = db.getGamesResult().findAll().get(0);


        gamesResult.getGames().forEach((games) -> {
            var gamesDto =  catalog.getGamesMapper().map(games);
            var eventTypeDto = catalog.getEventTypeMapper().map(games.getEventType());
            var weatherDto = catalog.getWeatherMapper().map(games.getWeather());
            var venueDto = catalog.getVenueMapper().map(games.getVenue());
            var team1Dto  = catalog.getTeam1Mapper().map(games.getTeam1());
            var team2Dto  = catalog.getTeam2Mapper().map(games.getTeam2());

            gamesDto.setEventTypeDto(eventTypeDto);
            gamesDto.setWeatherDto(weatherDto);
            gamesDto.setVenueDto(venueDto);
            gamesDto.setTeam1Dto(team1Dto);
            gamesDto.setTeam2Dto(team2Dto);

            gamesResultDto.getGamesDto().add(gamesDto);

        });

        return gamesResultDto;

    }

}
