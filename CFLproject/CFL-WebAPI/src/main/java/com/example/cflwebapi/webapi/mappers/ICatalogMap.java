package com.example.cflwebapi.webapi.mappers;

public interface ICatalogMap {

    EventTypeMapper getEventTypeMapper();
    GamesMapperDto getGamesMapper();
    Team1Mapper getTeam1Mapper();
    Team2Mapper getTeam2Mapper();
    VenueMapper getVenueMapper();
    WeatherMapper getWeatherMapper();

}
