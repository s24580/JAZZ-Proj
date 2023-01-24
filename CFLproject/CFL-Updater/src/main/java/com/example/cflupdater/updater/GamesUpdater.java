package com.example.cflupdater.updater;

import com.example.cflclient.cflclient.ICFLClient;
import com.example.cflclient.cflclient.contract.GamesDto;
import com.example.cfldata.repositories.ICatalogData;
import com.example.cflupdater.mappers.ICatalogMappers;
import org.springframework.stereotype.Component;

@Component
public class GamesUpdater implements IUpdateGames {

    private final ICatalogData data;
    private final ICatalogMappers entityMapper;
    private final ICFLClient cflClient;

    public GamesUpdater(ICatalogData data, ICatalogMappers entityMapper, ICFLClient cflClient) {
        this.data = data;
        this.entityMapper = entityMapper;
        this.cflClient = cflClient;
    }

    @Override
    public void updateGames(int season) {
        var result = cflClient.getGames(season);

        //set relacji eventTyper do games (od dziecka do rodzica)
        result.getGamesDtos().forEach((gamesDto) -> {
            var eventTypeDto = gamesDto.getEventType();
            var eventType = entityMapper.forEventType().map(eventTypeDto);
            var games = entityMapper.forGames().map(gamesDto);

            eventType.setGames(games);

            data.getGames().save(games);
            data.getEventType().save(eventType);
        });



//        for (GamesDto gamesDto : result.getGamesDtos()){
//            var entity = entityMapper.forGames().map(gamesDto);
//            data.getGames().save(entity);
//        }

    }


}
