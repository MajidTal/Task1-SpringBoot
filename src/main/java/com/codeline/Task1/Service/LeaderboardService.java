package com.codeline.Task1.Service;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Models.Leaderboard;
import com.codeline.Task1.Repository.GameInterface;
import com.codeline.Task1.Repository.LeaderboardInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class LeaderboardService {
    @Autowired
        LeaderboardInterface  leaderboardInterface;

        public void saveLeaderboard(Leaderboard leaderboard) {leaderboardInterface.save(leaderboard);
        }
        public List<Leaderboard> getLeaderboard() { return leaderboardInterface.findAll();}


    }
