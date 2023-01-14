
package com.example.cflclient.contract;

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
        "cfl_central_id",
        "stats_inc_id",
        "first_name",
        "middle_name",
        "last_name",
        "birth_date",
        "birth_place",
        "height",
        "weight",
        "rookie_year",
        "foreign_player",
        "image_url",
        "school",
        "position"
})
@Generated("jsonschema2pojo")
public class PlayersDto {

    @JsonProperty("cfl_central_id")
    private Integer cflCentralId;
    @JsonProperty("stats_inc_id")
    private Integer statsIncId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("birth_place")
    private String birthPlace;
    @JsonProperty("height")
    private String height;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("rookie_year")
    private Integer rookieYear;
    @JsonProperty("foreign_player")
    private Boolean foreignPlayer;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("school")
    private SchoolDto school;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cfl_central_id")
    public Integer getCflCentralId() {
        return cflCentralId;
    }

    @JsonProperty("cfl_central_id")
    public void setCflCentralId(Integer cflCentralId) {
        this.cflCentralId = cflCentralId;
    }

    @JsonProperty("stats_inc_id")
    public Integer getStatsIncId() {
        return statsIncId;
    }

    @JsonProperty("stats_inc_id")
    public void setStatsIncId(Integer statsIncId) {
        this.statsIncId = statsIncId;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birth_place")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("rookie_year")
    public Integer getRookieYear() {
        return rookieYear;
    }

    @JsonProperty("rookie_year")
    public void setRookieYear(Integer rookieYear) {
        this.rookieYear = rookieYear;
    }

    @JsonProperty("foreign_player")
    public Boolean getForeignPlayer() {
        return foreignPlayer;
    }

    @JsonProperty("foreign_player")
    public void setForeignPlayer(Boolean foreignPlayer) {
        this.foreignPlayer = foreignPlayer;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("school")
    public SchoolDto getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(SchoolDto school) {
        this.school = school;
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
