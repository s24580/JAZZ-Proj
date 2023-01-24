package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.*;
import com.example.cfldata.model.*;

public interface ICatalogMappers {

    IMapEntities<GamesDto,Games> forGames();
    IMapEntities<EventTypeDto,EventType> forEventType();
    IMapEntities<VenueDto,Venue> forVenue();
    IMapEntities<WeatherDto,Weather> forWeather();
    IMapEntities<Team1Dto,Team1> forTeam1();
    IMapEntities<Team2Dto,Team2> forTeam2();
//    IMapEntities<LinescoreTeam1Dto,LinescoreTeam1> forLinescoreTeam1();
//    IMapEntities<LinescoreTeam2Dto,LinescoreTeam2> forLinescoreTeam2();

}
