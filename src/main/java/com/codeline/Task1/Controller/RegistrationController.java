package com.codeline.Task1.Controller;

import com.codeline.Task1.Models.Game;
import com.codeline.Task1.Models.Registration;
import com.codeline.Task1.Service.GameService;
import com.codeline.Task1.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class RegistrationController {
@Autowired
    RegistrationService registrationService;

public void registerGame() {

    Registration registration=new Registration();

    registration.setUsername("Ali");
    registration.setPassword(111222);
    registration.setTeamName("qatar");
    registration.setSport("foot ball");

}

@PostMapping("registration/create")
    public void saveRegistration() {registerGame();}

    @GetMapping("registration/get")
    public List<Registration> getRegistration(){return registrationService.getRegistration(); }

}
