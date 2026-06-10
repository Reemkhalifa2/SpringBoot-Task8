package com.example.Task8Demo.Repository;

import com.example.Task8Demo.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
    @Query("SELECT v FROM Vehicle v WHERE v.isActive=true ")
    List<Vehicle> getAll();

    @Query("SELECT v FROM Vehicle v WHERE v.isActive=true and v.id=:id")
    Vehicle getById(@Param("id") Integer id);

    @Query("SELECT v FROM Vehicle v WHERE v.isActive=true and v.vehicleModel=:vehicleModel")
    List<Vehicle> getByModel(@Param("vehicleModel") String vehicleModel);



}
