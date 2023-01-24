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
public class EventStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer eventStatusId;
    private String name;
    private Boolean isActive;
    private Integer quarter;
    private Integer minutes;
    private Integer seconds;
    private Integer down;
    private Integer yardsToGo;

    @OneToOne
    Games games;
}
