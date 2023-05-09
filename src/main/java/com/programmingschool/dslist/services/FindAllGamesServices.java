package com.programmingschool.dslist.services;

import com.programmingschool.dslist.dto.GameMinDTO;
import com.programmingschool.dslist.entities.Game;
import com.programmingschool.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllGamesServices {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames(){
        List<Game> listResultEntity = gameRepository.findAll();
        return listResultEntity.stream().map(game -> new GameMinDTO(game)).toList();
    }
}
