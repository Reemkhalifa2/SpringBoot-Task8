package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Employee;
import com.example.Task8Demo.Repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getById(Integer id) {
        return employeeRepository.findById(id)
                .orElse(null);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public String update(Integer id, Employee newEmployee) {
        Employee emp = getById(id);
        if(emp== null){
            return "Employee not found!";
        }
        emp.setEmployeeName(newEmployee.getEmployeeName());
        emp.setDepartment(newEmployee.getDepartment());
        return employeeRepository.save(emp) + "Updated!";
    }

    public String delete(Integer id) {
        if(getById(id) == null){
            return "Employee not found";
        }
        employeeRepository.delete(getById(id));
        return "Deleted successfully";
    }



}
