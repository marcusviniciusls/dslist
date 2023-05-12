package com.programmingschool.dslist.services;


import com.programmingschool.dslist.dto.GameListDTO;
import com.programmingschool.dslist.entities.GameList;
import com.programmingschool.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FindGameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> listGame = gameListRepository.findAll();
        return listGame.stream().map(x -> new GameListDTO(x)).toList();
    }
}
