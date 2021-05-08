package org.example.midterm.controller;

import org.example.midterm.Service.GameService;
import org.example.midterm.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> findAllGames(){
        return gameService.findAllGames();
    }

    @GetMapping("/{gameId}")
    public Optional<Game> findOne(@PathVariable Long gameId) {
        return gameService.findGame(gameId);
    }

    @PostMapping
    public void createGame(@RequestBody Game game){
        gameService.createGame(game);
    }

    @DeleteMapping("/{gameId}")
    public void deleteGame(@PathVariable Long gameId){
        gameService.deleteGame(gameId);
    }

    @PutMapping("/{gameId}")
    public void updateGame(@PathVariable Long gameId, @RequestBody Game game){
        gameService.updateGame(gameId, game);
    }
}
