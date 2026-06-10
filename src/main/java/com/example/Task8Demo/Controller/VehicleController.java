package com.example.Task8Demo.Controller;

import com.example.Task8Demo.Entity.Vehicle;
import com.example.Task8Demo.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping("add")
    public Vehicle save(@RequestBody Vehicle vehicle ){
        return vehicleService.save(vehicle);
    }

    @GetMapping("getAll")
    public List<Vehicle> getAll(){
        return vehicleService.getAll();
    }

    @GetMapping("getById/{id}")
    public Vehicle getById(@PathVariable Integer id){
        return vehicleService.getById(id);
    }

    @GetMapping("getById/{vehicleModel}")
    public List<Vehicle> getById(@PathVariable String vehicleModel){
        return vehicleService.getByModel(vehicleModel);
    }

    @PutMapping("update/{id}")
    public Vehicle update(@PathVariable Integer id , @RequestBody Vehicle vehicle) throws Exception{
        return vehicleService.update(id,vehicle);
    }

    @DeleteMapping("delete/{id}")

    public Boolean delete(@PathVariable Integer id){
        return vehicleService.delete(id);
    }

}
