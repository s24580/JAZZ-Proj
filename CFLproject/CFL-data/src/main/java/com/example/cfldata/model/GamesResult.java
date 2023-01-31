package com.example.cfldata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class GamesResult {

    @JsonProperty("nie_kocham_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("kocham_jave")
    @OneToMany(mappedBy = "gamesResult")
    List<Games> games = new ArrayList<>();
}
