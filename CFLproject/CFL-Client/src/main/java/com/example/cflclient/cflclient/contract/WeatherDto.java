
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
    "temperature",
    "sky",
    "wind_speed",
    "wind_direction",
    "field_conditions"
})
@Generated("jsonschema2pojo")
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("sky")
    public String getSky() {
        return sky;
    }

    @JsonProperty("sky")
    public void setSky(String sky) {
        this.sky = sky;
    }

    @JsonProperty("wind_speed")
    public String getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("wind_direction")
    public String getWindDirection() {
        return windDirection;
    }

    @JsonProperty("wind_direction")
    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    @JsonProperty("field_conditions")
    public String getFieldConditions() {
        return fieldConditions;
    }

    @JsonProperty("field_conditions")
    public void setFieldConditions(String fieldConditions) {
        this.fieldConditions = fieldConditions;
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
