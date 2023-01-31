package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.Team1Dto;

import com.example.cfldata.model.Team1;
import org.springframework.stereotype.Component;


@Component
public class Team1Mapper implements IMapEntities<Team1Dto, Team1>{

//    private LinescoreTeam1Mapper linescoreTeam1Mapper;

    @Override
    public Team1 map(Team1Dto team1Dto) {
        return map(team1Dto,new Team1());
    }


    public Team1 map(Team1Dto team1Dto, Team1 team1 ) {
        team1.setTeamId(team1Dto.getTeamId());
        team1.setLocation(team1Dto.getLocation());
        team1.setNickname(team1Dto.getNickname());
        team1.setAbbreviation(team1Dto.getAbbreviation());
        team1.setScore(team1Dto.getScore());
        team1.setVenueId(team1Dto.getVenueId());
        team1.setIsAtHome(team1Dto.getIsAtHome());
        team1.setIsWinner(team1Dto.getIsWinner());
        return team1;
    }
}
//        for(LinescoreTeam1Dto entity: team1Dto.getLinescores()) {
//            team1.getLinescores().add(linescoreTeam1Mapper.map(entity));
//        }
//        LinescoreTeam1Mapper linescoreTeam1Mapper = new LinescoreTeam1Mapper();
//        team1.getLinescores().add(linescoreTeam1Mapper.map(team1.getLinescores().get(0),team1Dto.getLinescores().get(0)));
