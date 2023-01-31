package com.example.cflwebapi.webapi.mappers;

import com.example.cfldata.model.Venue;
import com.example.cflwebapi.webapi.contract.VenueDto;
import org.springframework.stereotype.Component;

@Component
public class VenueMapper implements IMap<Venue, VenueDto>{
    @Override
    public VenueDto map(Venue venue) {
        return map(venue,new VenueDto());
    }

    @Override
    public VenueDto map(Venue venue, VenueDto venueDto) {
        venueDto.setVenueId(venue.getVenueId());
        venueDto.setName(venue.getName());


        return venueDto;
    }
}
