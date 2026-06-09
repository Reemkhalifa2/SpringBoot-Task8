package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Campaign;
import com.example.Task8Demo.Repository.CampaignRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService {

    @Autowired
    CampaignRepository campaignRepository;

    public Campaign save(Campaign campaign){
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAll(){
        return campaignRepository.findAll();
    }

    public Campaign getById(Integer id){
        return campaignRepository.findById(id).orElseThrow(() -> new RuntimeException("Campaign not found"));
    }

    public Campaign update(Integer id , Campaign newCampaign){
        Campaign campaign = getById(id);
        campaign.setCampaignName(newCampaign.getCampaignName());
        campaign.setBudget(newCampaign.getBudget());
        campaign.setPlatform(newCampaign.getPlatform());
        return campaignRepository.save(campaign);
    }

    public void delete(Integer id){
        Campaign campaign = getById(id);
        campaignRepository.delete(campaign);
    }

}
