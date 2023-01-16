
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
public class GamesDto {

    @JsonProperty("game_id")
    private Integer gameId;
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
    private EventTypeDto eventType;
    @JsonProperty("event_status")
    private EventStatusDto eventStatus;
    @JsonProperty("venue")
    private VenueDto venue;
    @JsonProperty("weather")
    private WeatherDto weather;
    @JsonProperty("coin_toss")
    private CoinTossDto coinToss;
    @JsonProperty("tickets_url")
    private String ticketsUrl;
    @JsonProperty("team_1")
    private Team1Dto team1;
    @JsonProperty("team_2")
    private Team2Dto team2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("game_id")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("game_id")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("date_start")
    public String getDateStart() {
        return dateStart;
    }

    @JsonProperty("date_start")
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    @JsonProperty("game_number")
    public Integer getGameNumber() {
        return gameNumber;
    }

    @JsonProperty("game_number")
    public void setGameNumber(Integer gameNumber) {
        this.gameNumber = gameNumber;
    }

    @JsonProperty("week")
    public Integer getWeek() {
        return week;
    }

    @JsonProperty("week")
    public void setWeek(Integer week) {
        this.week = week;
    }

    @JsonProperty("season")
    public Integer getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(Integer season) {
        this.season = season;
    }

    @JsonProperty("attendance")
    public Integer getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("event_type")
    public EventTypeDto getEventType() {
        return eventType;
    }

    @JsonProperty("event_type")
    public void setEventType(EventTypeDto eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("event_status")
    public EventStatusDto getEventStatus() {
        return eventStatus;
    }

    @JsonProperty("event_status")
    public void setEventStatus(EventStatusDto eventStatus) {
        this.eventStatus = eventStatus;
    }

    @JsonProperty("venue")
    public VenueDto getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(VenueDto venue) {
        this.venue = venue;
    }

    @JsonProperty("weather")
    public WeatherDto getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(WeatherDto weather) {
        this.weather = weather;
    }

    @JsonProperty("coin_toss")
    public CoinTossDto getCoinToss() {
        return coinToss;
    }

    @JsonProperty("coin_toss")
    public void setCoinToss(CoinTossDto coinToss) {
        this.coinToss = coinToss;
    }

    @JsonProperty("tickets_url")
    public String getTicketsUrl() {
        return ticketsUrl;
    }

    @JsonProperty("tickets_url")
    public void setTicketsUrl(String ticketsUrl) {
        this.ticketsUrl = ticketsUrl;
    }

    @JsonProperty("team_1")
    public Team1Dto getTeam1() {
        return team1;
    }

    @JsonProperty("team_1")
    public void setTeam1(Team1Dto team1) {
        this.team1 = team1;
    }

    @JsonProperty("team_2")
    public Team2Dto getTeam2() {
        return team2;
    }

    @JsonProperty("team_2")
    public void setTeam2(Team2Dto team2) {
        this.team2 = team2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
