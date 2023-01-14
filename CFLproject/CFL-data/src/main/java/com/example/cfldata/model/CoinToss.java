package com.example.cfldata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CoinToss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String coinTossWinner;
    private String coinTossWinnerElection;
}