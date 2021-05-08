package org.example.midterm.Service;

import org.example.midterm.model.Game;
import org.example.midterm.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<Game> findAllGames(){
        return gamesRepository.findAll();
    }

    public Optional<Game> findGame(Long id){
        return gamesRepository.findById(id);
    }

    public void deleteGame(Long id){
        gamesRepository.deleteById(id);
    }

    public void updateGame(Long id, Game game) {
        Game myGame = gamesRepository.findById(id).orElse(null);

        if (myGame != null) {
            myGame.setTitle(game.getTitle());
            myGame.setStatusIsReleased(game.isStatusIsReleased());
            myGame.setPrice(game.getPrice());
            gamesRepository.saveAndFlush(myGame);
        }
    }

    public void createGame(Game game) {
        Game mySomeGame = new Game();
        mySomeGame.setTitle(game.getTitle());
        mySomeGame.setPrice(game.getPrice());
        mySomeGame.setStatusIsReleased(game.isStatusIsReleased());
        gamesRepository.saveAndFlush(mySomeGame);
    }
}
