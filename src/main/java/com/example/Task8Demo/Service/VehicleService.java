package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Vehicle;
import com.example.Task8Demo.Repository.VehicleRepository;
import org.hibernate.generator.internal.VersionGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle save(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getById(Integer id){
        return vehicleRepository.findById(id).orElseThrow(()-> new RuntimeException("Vehicle Not Found!"));
    }

    public List<Vehicle> getAll(){
        return vehicleRepository.findAll();
    }

    public Vehicle update(Integer id, Vehicle newVehicle){
        Vehicle vehicle = getById(id);

        vehicle.setVehicleModel(newVehicle.getVehicleModel());
        vehicle.setRentalPricePerDay(newVehicle.getRentalPricePerDay());
        return vehicleRepository.save(vehicle) ;

    }

    public String delete(Integer id){
        Vehicle vehicle = getById(id);
        vehicleRepository.delete(vehicle);
        return  "Deleted!";
    }


}
