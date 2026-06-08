package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Vehicle;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManager {
    List<Vehicle> vehicleList = new ArrayList<>();
    @PostConstruct
    public void loadData() {
        vehicleList.add(new Vehicle("V101", "Toyota Corolla", 20.00));
        vehicleList.add(new Vehicle("V102", "Nissan Sunny", 18.00));
        vehicleList.add(new Vehicle("V103", "Hyundai Elantra", 22.00));
    }

    public String addVehicle(Vehicle vehicle){

        for(Vehicle v : vehicleList){
            if(v.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())){
                return "Vehicle with this id already exist";
            }
        }

        vehicleList.add(vehicle);
        return "Vehicle added successfully!";
    }

    public List<Vehicle> displayAllVehicle(){
        return vehicleList;
    }


}
