package com.example.Task8Demo.Service;

import com.example.Task8Demo.Entity.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

     List<Employee> employeeList = new ArrayList<>();

     @PostConstruct
     public void load(){
        employeeList.add(new Employee("E101","Ahmed","IT"));
        employeeList.add(new Employee("E102","Fatma","HR"));
        employeeList.add(new Employee("E103","Khawla","Operation"));
    }

    public List<Employee> displayEmployee(){
        return employeeList;
    }
    public  Boolean validateData(String id){
        for(Employee emp : employeeList){
            if(emp.getEmployeeId().equalsIgnoreCase(id)){
                return false;
            }
        }
        return true;
    }

    public String addEmployee(Employee employee) {
        if (validateData(employee.getEmployeeId())) {
            employeeList.add(employee);
            return "Employee added successfully";
        } else {
            return "Employee with this Id already exist";
        }
    }



}
