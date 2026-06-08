package com.example.Task8Demo.Controller;

import com.example.Task8Demo.Entity.Campaign;
import com.example.Task8Demo.Service.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CampaignController {

    @Autowired
    CampaignManager campaignManager;

    @PostMapping("addCampaign")
    public String addCampaign(@RequestBody Campaign campaign){
        return campaignManager.addCampaign(campaign);
    }

    @GetMapping("display")
    public List<Campaign> displayCampaigns(){
        return campaignManager.displayCampaign();
    }

}
