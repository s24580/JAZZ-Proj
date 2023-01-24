//package com.example.cflwebapi.webapi.services;
//
//import com.example.cfldata.model.Games;
//import com.example.cfldata.model.Players;
//import com.example.cfldata.model.School;
//import com.example.cfldata.repositories.ICatalogData;
//import com.example.cflwebapi.webapi.contract.GamesDto;
//import com.example.cflwebapi.webapi.contract.PlayersDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class PlayersService implements IPlayersService {
//
//    private final ICatalogData db;
//
//    @Override
//    public long savePlayers(PlayersDto playersDto) {
//        var playerEntity = new Players();
//        playerEntity.setCflCentralId(playersDto.getCflCentralId());
//        playerEntity.setFirstName(playersDto.getFirstName());
//        playerEntity.setLastName(playersDto.getLastName());
//        playerEntity.setBirthDate(playersDto.getBirthDate());
//        playerEntity.setHeight(playersDto.getHeight());
//        playerEntity.setWeight(playersDto.getWeight());
//        playerEntity.setRookieYear(playersDto.getRookieYear());
//        playerEntity.setForeignPlayer(playersDto.getForeignPlayer());
//        playerEntity.setSchool(playersDto.getSchool());
//        db.getPlayers().save(playerEntity);
//        return playerEntity.getId();
//    }
//    //    private Integer cflCentralId;
////    private String firstName;
////    private String lastName;
////    private String birthDate;
////    private String height;
////    private Integer weight;
////    private Integer rookieYear;
////    private Boolean foreignPlayer;
////    private School school;
//    @Override
//    public List<PlayersDto> getAll() {
//        return db.getPlayers()
//                .findAll()
//                .stream()
//                .map(entity->new PlayersDto(entity.getId()))
//                .toList();
//    }
//}
