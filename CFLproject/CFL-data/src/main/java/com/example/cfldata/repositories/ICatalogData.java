package com.example.cfldata.repositories;

public interface ICatalogData {
    GamesRepository getGames();
    CoinTossRepository getCoinToss();
    DatumRepository getDatum();
    EventStatusRepository getEventStatus();
    EventTypeRepository getEventType();
    LinescoreTeam1Repository getLinescoreTeam1();
    LinescoreTeam2Repository getLinescoreTeam2();
    Team1Repository getTeam1();
    Team1Repository getTeam2();
    VenueRepository getVenue();
    WeatherRepository getWeather();
}
