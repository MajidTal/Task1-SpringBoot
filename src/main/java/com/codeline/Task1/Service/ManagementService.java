package com.codeline.Task1.Service;

import com.codeline.Task1.Models.Leaderboard;
import com.codeline.Task1.Models.Management;
import com.codeline.Task1.Repository.LeaderboardInterface;
import com.codeline.Task1.Repository.ManagementInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {

    @Autowired
    ManagementInterface managementInterface;

    public void saveManagement(Management management) {managementInterface.save(management);
    }
    public List<Management> getManagement() { return managementInterface.findAll();}


}


