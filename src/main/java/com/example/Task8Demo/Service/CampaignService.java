package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Campaign;
import com.example.Task8Demo.Repository.CampaignRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CampaignService {

    @Autowired
    CampaignRepository campaignRepository;

    public Campaign save(Campaign campaign){
        campaign.setCreationDate(new Date());
        campaign.setIsActive(true);
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAll(){
        return campaignRepository.getAll();
    }

    public Campaign getById(Integer id){
        return campaignRepository.getById(id);
    }

    public Campaign getByName(String name){
        return campaignRepository.getByName(name);
    }

    public Campaign update(Integer id , Campaign newCampaign) throws Exception{
        Campaign campaign = getById(id);
        if(campaign == null){
            throw new Exception("Campaign not found");
        }
        campaign.setCampaignName(newCampaign.getCampaignName());
        campaign.setBudget(newCampaign.getBudget());
        campaign.setPlatform(newCampaign.getPlatform());
        campaign.setUpdateDate(new Date());
        return campaignRepository.save(campaign);
    }

    public Boolean delete(Integer id){
        Campaign campaign = getById(id);
        if (campaign != null){
            campaign.setIsActive(false);
            campaignRepository.save(campaign);
            return true;
        }
        return false;
    }

}
