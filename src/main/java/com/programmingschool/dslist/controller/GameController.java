package com.programmingschool.dslist.controller;

import com.programmingschool.dslist.dto.GameMinDTO;
import com.programmingschool.dslist.services.FindAllGamesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private FindAllGamesServices findAllGamesServices;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAllGames(){
        List<GameMinDTO> listGames = findAllGamesServices.findAllGames();
        return ResponseEntity.ok(listGames);
    }
}
