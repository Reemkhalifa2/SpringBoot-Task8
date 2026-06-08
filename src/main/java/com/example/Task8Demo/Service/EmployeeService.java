package com.example.Task8Demo.Service;

import com.example.Task8Demo.EmployeeController;
import com.example.Task8Demo.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

     List<Employee> employeeList = new ArrayList<>();
     public EmployeeService(){
         load();
     }

     public void load(){
        employeeList.add(new Employee("E101","Ahmed","IT"));
        employeeList.add(new Employee("E102","Fatma","HR"));
        employeeList.add(new Employee("E103","Khawla","Operation"));
    }

    public void displayEmployee(){
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }
    public  Boolean validateData(String id){
        for(Employee emp : employeeList){
            if(emp.getEmployeeId().equalsIgnoreCase(id)){
                return false;
            }
        }
        return true;
    }

    public String addEmployee(String id, String name, String department) {
        if (validateData(id)) {
            employeeList.add(new Employee(id, name, department));
            return "Employee added successfully";
        } else {
            return "Employee with this Id already exist";
        }
    }



}
