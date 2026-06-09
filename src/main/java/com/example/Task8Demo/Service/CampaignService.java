package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Campaign;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignManager {

    List<Campaign> campaignList = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        campaignList.add(new Campaign(101, "Summer Sale", "Instagram",500.0));
        campaignList.add(new Campaign(102, "Black Friday", "Google Ads",1000.0));
        campaignList.add(new Campaign(103, "Email Promo", "Email",500.0));
    }

    public String addCampaign(Campaign campaign){
        for(Campaign c : campaignList){
            if(c.getCampaignId().equals(campaign.getCampaignId())){
                return "Campaign with this id already exist";
            }
        }
        campaignList.add(campaign);
        return "Campaign added successfully!";
    }
    public List<Campaign> displayCampaign(){
        return campaignList;
    }
}
