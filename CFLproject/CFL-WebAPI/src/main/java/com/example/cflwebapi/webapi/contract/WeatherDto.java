package com.example.cflwebapi.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    @JsonProperty("temperature")
    private Integer temperature;
    @JsonProperty("sky")
    private String sky;
    @JsonProperty("wind_speed")
    private String windSpeed;
    @JsonProperty("wind_direction")
    private String windDirection;
    @JsonProperty("field_conditions")
    private String fieldConditions;
}
