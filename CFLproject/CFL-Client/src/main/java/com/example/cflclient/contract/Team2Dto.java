
package com.example.cflclient.contract;

import java.util.HashMap;
import java.util.List;
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
    "team_id",
    "location",
    "nickname",
    "abbreviation",
    "score",
    "venue_id",
    "linescores",
    "is_at_home",
    "is_winner"
})
@Generated("jsonschema2pojo")
public class Team2Dto {

    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("venue_id")
    private Integer venueId;
    @JsonProperty("linescores")
    private List<LinescoreTeam2Dto> linescores = null;
    @JsonProperty("is_at_home")
    private Boolean isAtHome;
    @JsonProperty("is_winner")
    private Boolean isWinner;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("team_id")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("venue_id")
    public Integer getVenueId() {
        return venueId;
    }

    @JsonProperty("venue_id")
    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    @JsonProperty("linescores")
    public List<LinescoreTeam2Dto> getLinescores() {
        return linescores;
    }

    @JsonProperty("linescores")
    public void setLinescores(List<LinescoreTeam2Dto> linescores) {
        this.linescores = linescores;
    }

    @JsonProperty("is_at_home")
    public Boolean getIsAtHome() {
        return isAtHome;
    }

    @JsonProperty("is_at_home")
    public void setIsAtHome(Boolean isAtHome) {
        this.isAtHome = isAtHome;
    }

    @JsonProperty("is_winner")
    public Boolean getIsWinner() {
        return isWinner;
    }

    @JsonProperty("is_winner")
    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
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
