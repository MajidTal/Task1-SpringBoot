package com.codeline.Task1.Controller;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Models.Leaderboard;
import com.codeline.Task1.Service.GameService;
import com.codeline.Task1.Service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class LeaderboardController {

    @Autowired
    LeaderboardService leaderboardService;


    public void createLeaderboard(){

        Leaderboard leaderboard = new Leaderboard();
        leaderboard.setWins(2);
        leaderboard.setLosses(5);
        leaderboard.setCreatedDate(new Date());
        leaderboard.setIsActive(true);
        leaderboardService.saveLeaderboard(leaderboard);
    }


    @PostMapping("leaderboard/create")
    public void saveLeaderboard()
    {
        createLeaderboard();
    }

    @GetMapping("leaderboard/get")
    public List<Leaderboard> getLeaderboard () {return leaderboardService.getLeaderboard();}



}
