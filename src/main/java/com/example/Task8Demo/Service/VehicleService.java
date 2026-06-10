package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Vehicle;
import com.example.Task8Demo.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle save(Vehicle vehicle){
        vehicle.setIsActive(true);
        vehicle.setCreationDate(new Date());
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getById(Integer id){
        return vehicleRepository.findById(id).orElseThrow(()-> new RuntimeException("Vehicle Not Found!"));
    }

    public List<Vehicle> getAll(){
        return vehicleRepository.getAll();
    }
    public List<Vehicle> getByModel(String vehicleModel){
        return vehicleRepository.getByModel(vehicleModel);
    }

    public Vehicle update(Integer id, Vehicle newVehicle) throws Exception{

        Vehicle vehicle = getById(id);
        if(vehicle == null){
            throw new Exception("vehicle not found");
        }
        vehicle.setVehicleModel(newVehicle.getVehicleModel());
        vehicle.setRentalPricePerDay(newVehicle.getRentalPricePerDay());
        vehicle.setUpdateDate(new Date());
        return vehicleRepository.save(vehicle) ;

    }

    public Boolean delete(Integer id){
        Vehicle vehicle = getById(id);
        if (vehicle != null){
            vehicle.setIsActive(false);
            vehicleRepository.save(vehicle);
            return true;
        }
        return false;
    }


}
