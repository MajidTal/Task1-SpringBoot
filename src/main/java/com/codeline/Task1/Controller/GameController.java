package com.codeline.Task1.Controller;
import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController

public class GameController {

    @Autowired
    GameService gameService;


    public void createGame(){

        Game game = new Game();
        game.setTeam1("seeb");
        game.setTeam2("Muscat");
        game.setScore1(2);
        game.setScore2(4);
        game.setCreatedDate(new Date());
        game.setIsActive(true);
        gameService.saveGame(game);
    }


    @PostMapping("game/create")
    public void saveGame()
    {
        createGame();
    }



}

