package com.example.cfldata.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Getter
public class CFLDataCatalog implements ICatalogData{

    private final GamesRepository games;
    private final CoinTossRepository coinToss;
    private final DatumRepository datum;
    private final EventStatusRepository eventStatus;
    private final EventTypeRepository eventType;
    private final LinescoreTeam1Repository linescoreTeam1;
    private final LinescoreTeam2Repository linescoreTeam2;
    private final Team1Repository team1;
    private final Team2Repository team2;
    private final VenueRepository venue;
    private final WeatherRepository weather;

}
