package com.example.cflwebapi.webapi.controllers;

import com.example.cflwebapi.webapi.contract.GamesDto;
import com.example.cflwebapi.webapi.services.IGamesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/games")
@RequiredArgsConstructor
public class GamesController {

    private final IGamesService gamesService;

    @PostMapping
    public ResponseEntity saveGame(@RequestBody GamesDto game){
        var id = gamesService.saveGame(game);
        return ResponseEntity.ok(id);
    }

    @GetMapping
    public ResponseEntity getAll(){
        return ResponseEntity.ok(gamesService.getAll());
    }


}
