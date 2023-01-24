package com.example.cflwebapi.webapi.services;

import com.example.cflwebapi.webapi.contract.GamesDto;
import com.example.cflwebapi.webapi.contract.PlayersDto;

import java.util.List;

public interface IPlayersService {
    long savePlayers(PlayersDto playersDto);
    List<PlayersDto> getAll();
}
