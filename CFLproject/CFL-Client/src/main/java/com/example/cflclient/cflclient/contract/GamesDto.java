
package com.example.cflclient.cflclient.contract;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "game_id",
    "date_start",
    "game_number",
    "week",
    "season",
    "attendance",
    "event_type",
    "event_status",
    "venue",
    "weather",
    "coin_toss",
    "tickets_url",
    "team_1",
    "team_2"
})
@Generated("jsonschema2pojo")
@Getter
@Setter
public class GamesDto {

    @JsonProperty("game_id")
    private Long gameId;
    @JsonProperty("date_start")
    private String dateStart;
    @JsonProperty("game_number")
    private Integer gameNumber;
    @JsonProperty("week")
    private Integer week;
    @JsonProperty("season")
    private Integer season;
    @JsonProperty("attendance")
    private Integer attendance;
    @JsonProperty("event_type")
    private EventTypeDto eventTypeDto;
    @JsonProperty("event_status")
    private EventStatusDto eventStatusDto;
    @JsonProperty("venue")
    private VenueDto venueDto;
    @JsonProperty("weather")
    private WeatherDto weatherDto;
    @JsonProperty("coin_toss")
    private CoinTossDto coinTossDto;
    @JsonProperty("tickets_url")
    private String ticketsUrl;
    @JsonProperty("team_1")
    private Team1Dto team1Dto;
    @JsonProperty("team_2")
    private Team2Dto team2Dto;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
