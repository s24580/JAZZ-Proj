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

    private Long id;
    private Integer gameId;
    private String dateStart;
    private Integer gameNumber;
    private Integer season;
    private EventType eventType;
    private Venue venue;
    private Weather weather;
    private Team1 team1;
    private Team2 team2;

}
