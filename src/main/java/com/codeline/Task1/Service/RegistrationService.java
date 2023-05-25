package com.codeline.Task1.Service;

import com.codeline.Task1.Models.Leaderboard;
import com.codeline.Task1.Models.Registration;
import com.codeline.Task1.Repository.LeaderboardInterface;
import com.codeline.Task1.Repository.RegistrationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {


    @Autowired
    RegistrationInterface registrationInterface;

    public void saveRegistration(Registration registration) {registrationInterface.save(registration);
    }
    public List<Registration> getRegistration() { return registrationInterface.findAll();}
}
