package com.example.cflwebapi.webapi.controllers;

import com.example.cflwebapi.webapi.contract.GamesDto;
import com.example.cflwebapi.webapi.services.IGamesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/v1/games")
public class GamesController {

    private final IGamesService gamesService;

    @Autowired
    public GamesController(IGamesService gamesService){
        this.gamesService = gamesService;
    }


    @GetMapping
    public ResponseEntity getAll(){
        log.info("allData");
        return ResponseEntity.ok(gamesService.getAll());
    }


}
