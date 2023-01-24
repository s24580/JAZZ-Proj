package com.example.cfldata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer gameId;
    private String dateStart;

    private Integer gameNumber;
    private Integer week;
    private Integer season;
    private Integer attendance;
    @OneToOne(mappedBy = "games")
    private EventType eventType;
    @OneToOne(mappedBy = "games")
    private EventStatus eventStatus;
    @OneToOne(mappedBy = "games")
    private Venue venue;
    @OneToOne(mappedBy = "games")
    private Weather weather;
    @OneToOne(mappedBy = "games")
    private CoinToss coinToss;

    private String ticketsUrl;
    @OneToOne(mappedBy = "games")
    private Team1 team1;
    @OneToOne(mappedBy = "games")
    private Team2 team2;
}
