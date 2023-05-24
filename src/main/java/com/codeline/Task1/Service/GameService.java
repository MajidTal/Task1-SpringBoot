package com.codeline.Task1.Service;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Repository.GameInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameInterface gameInterface;

    public void saveGame(Game game) {gameInterface.save(game);
    }
    public List<Game> getGame() { return gameInterface.findAll();}



}
