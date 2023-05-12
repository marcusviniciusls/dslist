package com.programmingschool.dslist.controller;

import com.programmingschool.dslist.dto.GameDTO;
import com.programmingschool.dslist.dto.GameListDTO;
import com.programmingschool.dslist.dto.GameMinDTO;
import com.programmingschool.dslist.services.FindAllGamesServices;
import com.programmingschool.dslist.services.FindByIdGameService;
import com.programmingschool.dslist.services.FindGameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private FindGameListService findAll;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAllGames(){
        List<GameListDTO> listGames = findAll.findAll();
        return ResponseEntity.ok(listGames);
    }
}
