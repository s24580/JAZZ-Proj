package com.example.cfldata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Players {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cflCentralId;
    private Integer statsIncId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private String birthPlace;
    private String height;
    private Integer weight;
    private Integer rookieYear;
    private Boolean foreignPlayer;
    private String imageUrl;

    @ManyToOne
    private School school;
}
