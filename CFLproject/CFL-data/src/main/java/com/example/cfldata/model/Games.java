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
    private long id;

    private Integer gameId;
    private String dateStart;

    private Integer gameNumber;
    private Integer week;
    private Integer season;
    private Integer attendance;
    @OneToOne(mappedBy = "Games")
    private EventType eventType;
    @OneToOne(mappedBy = "Games")
    private EventStatus eventStatus;
    @ManyToOne
    private Venue venue;
    @OneToOne(mappedBy = "Games")
    private Weather weather;
    @OneToOne(mappedBy = "Games")
    private CoinToss coinToss;
    private String ticketsUrl;
    @OneToOne(mappedBy = "Games")
    private Team1 team1;
    @OneToOne(mappedBy = "Games")
    private Team2 team2;
}
