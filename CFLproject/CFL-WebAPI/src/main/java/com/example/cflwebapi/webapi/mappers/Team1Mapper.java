package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.Team1;
import com.example.cflwebapi.webapi.contract.EventTypeDto;
import com.example.cflwebapi.webapi.contract.Team1Dto;
import org.springframework.stereotype.Component;

@Component
public class Team1Mapper implements IMap<Team1, Team1Dto>{
    @Override
    public Team1Dto map(Team1 team1) {
        return map(team1,new Team1Dto());
    }

    @Override
    public Team1Dto map(Team1 team1, Team1Dto team1Dto) {
        team1Dto.setTeamId(team1.getTeamId());
        team1Dto.setLocation(team1.getLocation());
        team1Dto.setNickname(team1.getNickname());
        team1Dto.setAbbreviation(team1.getAbbreviation());
        team1Dto.setScore(team1.getScore());
        team1Dto.setVenueId(team1.getVenueId());
        team1Dto.setIsAtHome(team1.getIsAtHome());
        team1Dto.setIsWinner(team1.getIsWinner());


        return team1Dto;
    }
}
