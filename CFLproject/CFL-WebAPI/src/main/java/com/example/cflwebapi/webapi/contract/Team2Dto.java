package com.example.cflwebapi.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team2Dto {

    @JsonProperty("team_id")
    private Long teamId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("venue_id")
    private Integer venueId;
    @JsonProperty("is_at_home")
    private Boolean isAtHome;
    @JsonProperty("is_winner")
    private Boolean isWinner;
}
