package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.EventTypeDto;
import com.example.cflclient.cflclient.contract.GamesDto;
import com.example.cflclient.cflclient.contract.LinescoreTeam1Dto;
import com.example.cfldata.model.Games;
import org.springframework.stereotype.Component;

@Component
public class GamesMapper implements IMapEntities<GamesDto, Games> {

    private EventTypeMapper typeMapper;
    private VenueMapper venueMapper;
    private WeatherMapper weatherMapper;
    private Team1Mapper team1Mapper;
    private Team2Mapper team2Mapper;

    @Override
    public Games map(GamesDto gamesDto) {
        return map(gamesDto,new Games());
    }

    @Override
    public Games map(GamesDto gamesDto, Games games) {
        games.setGameId(gamesDto.getGameId());
        games.setAttendance(gamesDto.getAttendance());
        games.setDateStart(gamesDto.getDateStart());
        games.setGameNumber(gamesDto.getGameNumber());
        games.setSeason(gamesDto.getSeason());
        games.setTicketsUrl(gamesDto.getTicketsUrl());
        games.setWeek(gamesDto.getWeek());
//        games.setEventType(typeMapper.map(gamesDto.getEventType()));
//        games.setVenue(venueMapper.map(gamesDto.getVenue()));
//        games.setWeather(weatherMapper.map(gamesDto.getWeather()));
//        games.setTeam1(team1Mapper.map(gamesDto.getTeam1()));
//        games.setTeam2(team2Mapper.map(gamesDto.getTeam2()));
        return games;
    }
//    no np w updaterze jak juz pobierzesz sobie dane z tego api
//    to bierzesz games.getVenues.add(venue)
//    i to samo dla venue
//      venues.getGames.add(games)
//    cos w tym stylu
}
