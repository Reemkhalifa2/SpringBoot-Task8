package com.example.Task8Demo.Controller;

import com.example.Task8Demo.Entity.Employee;
import com.example.Task8Demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }
    @GetMapping("displayEmployee")
    public List<Employee> displayEmployee(){
        return employeeService.displayEmployee();
    }
}
