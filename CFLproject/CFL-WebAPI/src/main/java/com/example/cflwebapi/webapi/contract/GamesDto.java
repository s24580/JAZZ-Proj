package com.example.cflwebapi.webapi.contract;

import com.example.cfldata.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GamesDto {

    @JsonProperty("game_id")
    private Long gameId;
    @JsonProperty("date_start")
    private String dateStart;
    @JsonProperty("game_number")
    private Integer gameNumber;
    @JsonProperty("season")
    private Integer season;
    @JsonProperty("eventType")
    private EventTypeDto eventTypeDto;
    @JsonProperty("venue")
    private VenueDto venueDto;
    @JsonProperty("weather")
    private WeatherDto weatherDto;
    @JsonProperty("team1")
    private Team1Dto team1Dto;
    @JsonProperty("team2")
    private Team2Dto team2Dto;



}
