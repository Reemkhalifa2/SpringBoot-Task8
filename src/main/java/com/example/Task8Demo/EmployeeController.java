package com.example.Task8Demo;

import com.example.Task8Demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("addEmployee")
    public String addEmployee(@RequestParam String id, @RequestParam String name , @RequestParam String department){
        return employeeService.addEmployee(id, name, department);

    }
}
