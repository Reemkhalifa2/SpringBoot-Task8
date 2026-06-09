package com.example.Task8Demo.Controller;

import com.example.Task8Demo.Entity.Campaign;
import com.example.Task8Demo.Service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("campaign")
public class CampaignController {

    @Autowired
    CampaignService campaignService;

    @PostMapping("add")
    public Campaign save(Campaign campaign){
        return campaignService.save(campaign);
    }

    @GetMapping("getAll")
    public List<Campaign> getAll(){
        return campaignService.getAll();
    }

    @GetMapping("GetById")
    public Campaign getById(Integer id){
        return campaignService.getById(id);
    }

    @PutMapping("update")
    public Campaign update(Integer id , Campaign campaign){
        return campaignService.update(id,campaign);
    }

    @DeleteMapping("delete")
    public String delete(Integer id){
        campaignService.delete(id);
        return "Deleted!";
    }

}
