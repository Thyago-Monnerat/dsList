package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameDTO;
import com.devsuperior.dslist.models.GameModel;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<GameModel> gameList = gameRepository.findAll();
        return gameList.stream().map(GameDTO::new).toList();
    }
}
