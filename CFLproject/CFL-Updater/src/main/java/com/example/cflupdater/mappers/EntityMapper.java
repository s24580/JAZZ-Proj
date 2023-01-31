package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.*;
import com.example.cfldata.model.*;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper implements ICatalogMappers{

    private final   IMapEntities<GamesDto,Games> forGames;
    private final   IMapEntities<EventTypeDto,EventType> forEventType;
    private final   IMapEntities<VenueDto,Venue> forVenue;
    private final   IMapEntities<WeatherDto,Weather> forWeather;
    private final   IMapEntities<Team1Dto,Team1> forTeam1;
    private final   IMapEntities<Team2Dto,Team2> forTeam2;
//    private final   IMapEntities<LinescoreTeam1Dto,LinescoreTeam1> forLinescoreTeam1;
//    private final   IMapEntities<LinescoreTeam2Dto,LinescoreTeam2> forLinescoreTeam2;

    public EntityMapper(IMapEntities<GamesDto,Games> forGames
            , IMapEntities<EventTypeDto,EventType> forEventType
            , IMapEntities<VenueDto,Venue> forVenue
            , IMapEntities<WeatherDto,Weather> forWeather
            , IMapEntities<Team1Dto,Team1> forTeam1
            , IMapEntities<Team2Dto,Team2> forTeam2
//            , IMapEntities<LinescoreTeam1Dto, LinescoreTeam1> forLinescoreTeam1
//            , IMapEntities<LinescoreTeam2Dto, LinescoreTeam2> forLinescoreTeam2
    ) {
        this.forGames = forGames;
        this.forEventType = forEventType;
        this.forVenue = forVenue;
        this.forWeather = forWeather;
        this.forTeam1 = forTeam1;
        this.forTeam2 = forTeam2;
//        this.forLinescoreTeam1 = forLinescoreTeam1;
//        this.forLinescoreTeam2 = forLinescoreTeam2;
    }


    @Override
    public IMapEntities<GamesDto, Games> forGames() {
        return forGames;
    }

    @Override
    public IMapEntities<EventTypeDto, EventType> forEventType() {
        return forEventType;
    }

    @Override
    public IMapEntities<VenueDto, Venue> forVenue() {
        return forVenue;
    }

    @Override
    public IMapEntities<WeatherDto, Weather> forWeather() {
        return forWeather;
    }

    @Override
    public IMapEntities<Team1Dto, Team1> forTeam1() {
        return forTeam1;
    }

    @Override
    public IMapEntities<Team2Dto, Team2> forTeam2() {
        return forTeam2;
    }

//    @Override
//    public IMapEntities<LinescoreTeam1Dto, LinescoreTeam1> forLinescoreTeam1() {
//        return forLinescoreTeam1;
//    }
//
//    @Override
//    public IMapEntities<LinescoreTeam2Dto, LinescoreTeam2> forLinescoreTeam2() {
//        return forLinescoreTeam2;
//    }
}
