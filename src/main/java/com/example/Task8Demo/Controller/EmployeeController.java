package com.example.Task8Demo.Controller;

import com.example.Task8Demo.Entity.Employee;
import com.example.Task8Demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);

    }

    @GetMapping("getAllEmployee")
    public List<Employee> displayEmployee(){
        return employeeService.getAll();
    }

    @GetMapping("getById/{Id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getById(id);
    }

    @PutMapping("updateEmployee/{id}")
    public String update(@PathVariable Integer id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String delete(@PathVariable Integer id) {
        return employeeService.delete(id);
    }
}
