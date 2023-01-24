package com.example.cflclient.cflclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GamesResultDto {
    @JsonProperty("data")
    List<GamesDto> gamesDtos = new ArrayList<>();

}
