package com.codeline.Task1.Controller;

import com.codeline.Task1.Models.Leaderboard;
import com.codeline.Task1.Models.Management;
import com.codeline.Task1.Service.LeaderboardService;
import com.codeline.Task1.Service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ManagementController {


    @Autowired
    ManagementService managementService;


    public void createManagement(){

        Management management = new Management();

        management.setCreatedDate(new Date());
        management.setIsActive(true);
        managementService.saveManagement(management);
    }


    @PostMapping("Management/create")
    public void saveManagement()
    {
        createManagement();
    }

    @GetMapping("Management/get")
    public List<Management> getManagement () {return managementService.getManagement();}



}
}
