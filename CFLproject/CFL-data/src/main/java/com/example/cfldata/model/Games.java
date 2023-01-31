package com.example.cfldata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long gamesId;

    private String dateStart;

    private Integer gameNumber;
    private Integer week;
    private Integer season;
    private Integer attendance;
    @OneToOne(mappedBy = "games")
    //@JoinColumn(name = "event_type_id",referencedColumnName = "id")
    private EventType eventType;
    @OneToOne(mappedBy = "games")
    //@JoinColumn(name = "event_status_id",referencedColumnName = "id")
    private EventStatus eventStatus;
    @OneToOne(mappedBy = "games")
    //@JoinColumn(name = "venue_id",referencedColumnName = "id")
    private Venue venue;
    @OneToOne(mappedBy = "games")
   // @JoinColumn(name = "weather_id",referencedColumnName = "id")
    private Weather weather;
    @OneToOne(mappedBy = "games")
    //@JoinColumn(name = "coin_toss_id",referencedColumnName = "id")
    private CoinToss coinToss;

    private String ticketsUrl;
    @OneToOne(mappedBy = "games")
   // @JoinColumn(name = "team1_id",referencedColumnName = "id")
    private Team1 team1;
    @OneToOne(mappedBy = "games")
    //@JoinColumn(name = "team2_id",referencedColumnName = "id")
    private Team2 team2;

    @ManyToOne
    private GamesResult gamesResult;

}
