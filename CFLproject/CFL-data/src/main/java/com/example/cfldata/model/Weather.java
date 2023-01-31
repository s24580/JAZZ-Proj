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
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer temperature;
    private String sky;
    private String windSpeed;
    private String windDirection;
    private String fieldConditions;

    @OneToOne
    private Games games;
}
