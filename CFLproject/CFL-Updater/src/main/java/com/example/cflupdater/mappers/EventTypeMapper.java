package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.EventTypeDto;
import com.example.cfldata.model.EventType;
import org.springframework.stereotype.Component;

@Component
public class EventTypeMapper implements IMapEntities <EventTypeDto, EventType>{
    @Override
    public EventType map(EventTypeDto eventTypeDto) {
        return map(eventTypeDto, new EventType());
    }

    @Override
    public EventType map(EventTypeDto eventTypeDto, EventType eventType) {
        eventType.setEventTypeId(eventTypeDto.getEventTypeId());
        eventType.setName(eventTypeDto.getName());
        eventType.setTitle(eventTypeDto.getTitle());

        return eventType;
    }
}
