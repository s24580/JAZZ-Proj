package com.example.cflupdater.mappers;


import com.example.cflclient.cflclient.contract.Team2Dto;
import com.example.cfldata.model.Team2;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Team2Mapper implements IMapEntities<Team2Dto, Team2>{

//    private LinescoreTeam2Mapper linescoreTeam2Mapper;

    @Override
    public Team2 map(Team2Dto team2Dto) {
        return map(team2Dto,new Team2());
    }


    public Team2 map(Team2Dto team2Dto, Team2 team2 ) {
        team2.setTeamId(team2Dto.getTeamId());
        team2.setLocation(team2Dto.getLocation());
        team2.setNickname(team2Dto.getNickname());
        team2.setAbbreviation(team2Dto.getAbbreviation());
        team2.setScore(team2Dto.getScore());
        team2.setVenueId(team2Dto.getVenueId());
//        for(LinescoreTeam2Dto entity: team2Dto.getLinescores()) {
//            team2.getLinescores().add(linescoreTeam2Mapper.map(entity));
//        }

//        weather.setWeatherDescription(weatherDescriptionMapper.map(weatherDto.getCurrentWeatherDto().getWeatherDescriptionDto().get(0)));
//        LinescoreTeam2Mapper linescoreTeam2Mapper = new LinescoreTeam2Mapper();
//        team2.getLinescores().add(linescoreTeam2Mapper.map(team2.getLinescores().get(0),team2Dto.getLinescores().get(0)));
        team2.setIsAtHome(team2Dto.getIsAtHome());
        team2.setIsWinner(team2Dto.getIsWinner());
        return team2;
    }
}
