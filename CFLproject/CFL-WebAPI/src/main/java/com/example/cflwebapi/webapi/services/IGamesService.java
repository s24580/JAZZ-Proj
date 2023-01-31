package com.example.cflwebapi.webapi.services;

import com.example.cfldata.model.GamesResult;
import com.example.cflwebapi.webapi.contract.GamesDto;
import com.example.cflwebapi.webapi.contract.GamesResultDto;

import java.util.List;

public interface IGamesService {
    GamesResultDto getAll();
}
