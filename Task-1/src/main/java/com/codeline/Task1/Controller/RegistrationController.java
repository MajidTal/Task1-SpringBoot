package com.codeline.Task1.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class RegistrationController {

        @PostMapping("/api/register/player")
        public ResponseEntity<String> registerPlayer(@RequestBody PlayerRegistrationRequest request) {
            // Method implementation for player registration
        }

        @PostMapping("/api/register/team")
        public ResponseEntity<String> registerTeam(@RequestBody TeamRegistrationRequest request) {
            // Method implementation for team registration
        }
    }


