package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.Team2;
import com.example.cflwebapi.webapi.contract.Team2Dto;
import org.springframework.stereotype.Component;

@Component
public class Team2Mapper implements IMap<Team2, Team2Dto>{

    @Override
    public Team2Dto map(Team2 team2) {
        return map(team2,new Team2Dto());
    }

    @Override
    public Team2Dto map(Team2 team2, Team2Dto team2Dto) {
        team2Dto.setTeamId(team2.getTeamId());
        team2Dto.setLocation(team2.getLocation());
        team2Dto.setNickname(team2.getNickname());
        team2Dto.setAbbreviation(team2.getAbbreviation());
        team2Dto.setScore(team2.getScore());
        team2Dto.setVenueId(team2.getVenueId());
        team2Dto.setIsAtHome(team2.getIsAtHome());
        team2Dto.setIsWinner(team2.getIsWinner());

        return team2Dto;
    }
}

