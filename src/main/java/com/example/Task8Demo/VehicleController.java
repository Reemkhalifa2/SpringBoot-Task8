package com.example.Task8Demo;

import com.example.Task8Demo.Entity.Vehicle;
import com.example.Task8Demo.Service.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;
    @PostMapping("loadData")
    public void loadData(){
        vehicleManager.loadData();
    }

    @PostMapping("addVehicle")
    public String addVehicle(@RequestBody Vehicle vehicle ){
        return vehicleManager.addVehicle(vehicle);
    }

    @GetMapping("vehicles")
    public List<Vehicle> displayVehicle(){
        return vehicleManager.displayAllVehicle();
    }
}
