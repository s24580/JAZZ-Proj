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
public class EventTypeDto {
    @JsonProperty("event_type_id")
    private Integer eventTypeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("title")
    private String title;
}
