package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Employee;
import com.example.Task8Demo.Repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> deletedEmployee = new ArrayList<>();

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee save(Employee employee){

        return employeeRepository.save(employee);
    }

    public List<Employee> getAll(){
        return employeeRepository.getAll();
    }

    public Employee update(Integer id, Employee newEmployee) throws Exception {
        Employee emp = employeeRepository.getById(id);
        if(emp != null){
            emp.setEmployeeName(newEmployee.getEmployeeName());
            emp.setDepartment(newEmployee.getDepartment());
            emp.setUpdateDate(new Date());
            return employeeRepository.save(emp);
        }
        throw new Exception("Employee Cannot be Null!");

    }

    public Boolean delete(Integer id) {
        Employee employee = employeeRepository.getById(id);
        if(employee != null){
            employee.setIsActive(false);
            employee.setUpdateDate(new Date());
            employeeRepository.save(employee);
            return true;
        }
        return false;
    }



}
