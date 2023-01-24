package com.example.cflupdater.mappers;

import com.example.cflclient.cflclient.contract.VenueDto;
import com.example.cfldata.model.Venue;
import org.springframework.stereotype.Component;

@Component
public class VenueMapper implements IMapEntities<VenueDto, Venue>{
    @Override
    public Venue map(VenueDto venueDto) {
        return map(venueDto,new Venue());
    }

    @Override
    public Venue map(VenueDto venueDto, Venue venue) {
        venue.setVenueId(venue.getVenueId());
        venue.setName(venueDto.getName());
        return venue;
    }
}
