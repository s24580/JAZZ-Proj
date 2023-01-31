package com.example.cflupdater.updater;

import com.example.cflclient.cflclient.ICFLClient;
import com.example.cflclient.cflclient.contract.GamesDto;
import com.example.cfldata.model.GamesResult;
import com.example.cfldata.repositories.ICatalogData;
import com.example.cflupdater.mappers.ICatalogMappers;
import org.springframework.stereotype.Component;

@Component
public class GamesUpdater implements IUpdateGames {

    private final ICatalogData data;
    private final ICatalogMappers entityMapper;
    private final ICFLClient cflClient;

    public GamesUpdater(ICatalogData data, ICatalogMappers entityMapper, ICFLClient cflClient) {
        this.data = data;
        this.entityMapper = entityMapper;
        this.cflClient = cflClient;
    }



    @Override
    public void updateGames(int season) {
        var resultDto = cflClient.getGames(season);
        var gamesResult = new GamesResult();
        data.getGamesResult().save(gamesResult);



        resultDto.getGamesDtos().forEach((gamesDto) -> {

            var eventTypeDto = gamesDto.getEventTypeDto();
            var eventType = entityMapper.forEventType().map(eventTypeDto);

            var venueDto = gamesDto.getVenueDto();
            var venue = entityMapper.forVenue().map(venueDto);

            var weatherDto = gamesDto.getWeatherDto();
            var weather = entityMapper.forWeather().map(weatherDto);



            var team1Dto = gamesDto.getTeam1Dto();
            var team1 = entityMapper.forTeam1().map(team1Dto);

            var team2Dto = gamesDto.getTeam2Dto();
            var team2 = entityMapper.forTeam2().map(team2Dto);

            var games = entityMapper.forGames().map(gamesDto);

            games.setGamesResult(gamesResult);


            eventType.setGames(games);
            venue.setGames(games);
            weather.setGames(games);
            team1.setGames(games);
            team2.setGames(games);

            data.getGames().save(games);

            data.getWeather().save(weather);//to nie przechodi reszta tak

//            if (venue.getId() == null || venue.getId() == 0) throw new IllegalStateException("jest zerem");
//            if(!data.getVenue().existsById(venue.getId()))
            data.getVenue().save(venue);

//            if(!data.getEventType().existsById(eventType.getId()))
            data.getEventType().save(eventType);

//            if(!data.getTeam1().existsById(team1.getId()))
            data.getTeam1().save(team1);

//            if(!data.getTeam2().existsById(team2.getId()))
            data.getTeam2().save(team2);


//            if(!data.getGames().existsById(games.getId()) && gamesDto.getGameId() != 2174)
                //74


        });



//        for (GamesDto gamesDto : result.getGamesDtos()){
//            var entity = entityMapper.forGames().map(gamesDto);
//            data.getGames().save(entity);
//        }

    }

//    @Override
//    public void updateGameAll() {
//        var result = cflClient.getGamesAll();
//        for (GamesDto gamesDto : result){
//            var entity =entityMapper.forGames().map(gamesDto);
//            data.getGames().save(entity);
//        }
//    }


}
