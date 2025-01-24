package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dtos.GameListDTO;
import com.devsuperior.dslist.dtos.GameMinDTO;
import com.devsuperior.dslist.dtos.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameListDTO>> getGameList() {
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping("{id}/games")
    public ResponseEntity<List<GameMinDTO>> getGameList(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.findByList(id));
    }

    @PostMapping("{id}/replacement")
    public ResponseEntity<String> move(@PathVariable Long id, @RequestBody ReplacementDTO replacementDTO) {
        gameListService.move(id, replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());

        return ResponseEntity.ok("\"Alteração feita com sucesso\"");
    }

}
