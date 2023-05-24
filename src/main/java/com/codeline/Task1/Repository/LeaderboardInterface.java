package com.codeline.Task1.Repository;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardInterface extends JpaRepository<Leaderboard,Long> {
}
