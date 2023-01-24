package com.example.cflwebapi.webapi.contract;

import com.example.cfldata.model.School;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayersDto {

    private Integer cflCentralId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String height;
    private Integer weight;
    private Integer rookieYear;
    private Boolean foreignPlayer;
    private School school;

}
