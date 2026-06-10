package com.example.Task8Demo.Repository;

import com.example.Task8Demo.Entity.Campaign;
import com.example.Task8Demo.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign,Integer> {

    @Query("SELECT c FROM Campaign WHERE c.isActive=true ")
    List<Campaign> getAll();

    @Query("SELECT c FROM Campaign WHERE c.isActive=true and c.id=:id")
    Campaign getById(@Param("id") Integer id);

    @Query("SELECT c FROM Campaign WHERE c.isActive=true and c.campaignName=:campaignName")
    Campaign getByName(@Param("campaignName") String campaignName);
}
