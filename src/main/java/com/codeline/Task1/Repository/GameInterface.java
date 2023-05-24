package com.codeline.Task1.Repository;

import com.codeline.Task1.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameInterface extends JpaRepository<Game,Long> {
}
