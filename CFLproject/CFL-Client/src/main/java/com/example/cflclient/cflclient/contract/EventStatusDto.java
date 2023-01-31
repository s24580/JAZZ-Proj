
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
    "event_status_id",
    "name",
    "is_active",
    "quarter",
    "minutes",
    "seconds",
    "down",
    "yards_to_go"
})
@Generated("jsonschema2pojo")
public class EventStatusDto {

    @JsonProperty("event_status_id")
    private Long eventStatusId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("quarter")
    private Integer quarter;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("seconds")
    private Integer seconds;
    @JsonProperty("down")
    private Integer down;
    @JsonProperty("yards_to_go")
    private Integer yardsToGo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event_status_id")
    public Long getEventStatusId() {
        return eventStatusId;
    }

    @JsonProperty("event_status_id")
    public void setEventStatusId(Long eventStatusId) {
        this.eventStatusId = eventStatusId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("quarter")
    public Integer getQuarter() {
        return quarter;
    }

    @JsonProperty("quarter")
    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("seconds")
    public Integer getSeconds() {
        return seconds;
    }

    @JsonProperty("seconds")
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @JsonProperty("down")
    public Integer getDown() {
        return down;
    }

    @JsonProperty("down")
    public void setDown(Integer down) {
        this.down = down;
    }

    @JsonProperty("yards_to_go")
    public Integer getYardsToGo() {
        return yardsToGo;
    }

    @JsonProperty("yards_to_go")
    public void setYardsToGo(Integer yardsToGo) {
        this.yardsToGo = yardsToGo;
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
