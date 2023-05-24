package com.codeline.Task1.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/games")

public class GameController {
    @PostMapping("/create")
    public ResponseEntity<String> createGame(@RequestBody GameCreationRequest request) {
        // Method implementation for game creation
    }



}

