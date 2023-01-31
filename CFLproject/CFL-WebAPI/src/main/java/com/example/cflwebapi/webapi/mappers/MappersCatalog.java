package com.example.cflwebapi.webapi.mappers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
public class MappersCatalog implements ICatalogMap{

    private final EventTypeMapper eventTypeMapper;
    private final GamesMapperDto gamesMapper;
    private final Team1Mapper team1Mapper;
    private final Team2Mapper team2Mapper;
    private final VenueMapper venueMapper;
    private final WeatherMapper weatherMapper;
}
