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
public class VenueDto {

    @JsonProperty("venue_id")
    private Long venueId;
    @JsonProperty("name")
    private String name;

}
