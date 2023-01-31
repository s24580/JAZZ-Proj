package com.example.cfldata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long teamId;

    private String location;
    private String nickname;
    private String abbreviation;
    private Integer score;
    private Integer venueId;
//    @OneToMany//(mappedBy = "Team2")
//    private List<LinescoreTeam2> linescores = new ArrayList<>();
    private Boolean isAtHome;
    private Boolean isWinner;

    @OneToOne
    private Games games;
}
