package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.EventType;
import com.example.cflwebapi.webapi.contract.EventTypeDto;
import org.springframework.stereotype.Component;

@Component
public class EventTypeMapper implements IMap<EventType, EventTypeDto>{
    @Override
    public EventTypeDto map(EventType eventType) {
        return map(eventType,new EventTypeDto());
    }

    @Override
    public EventTypeDto map(EventType eventType, EventTypeDto eventTypeDto) {
        eventTypeDto.setName(eventType.getName());
        eventTypeDto.setTitle(eventType.getTitle());
        eventTypeDto.setEventTypeId(eventType.getEventTypeId());


        return eventTypeDto;
    }
}
