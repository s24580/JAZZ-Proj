package com.example.cflwebapi.webapi.services;

import com.example.cflwebapi.webapi.contract.GamesDto;

import java.util.List;

public interface IGamesService {
    long saveGame(GamesDto gamesDto);
    List<GamesDto> getAll();
}
