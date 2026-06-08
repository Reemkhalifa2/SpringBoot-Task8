package com.example.Task8Demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    static List<Employee> employeeList = new ArrayList<>();

    static public void load(){
        employeeList.add(new Employee("E101","Ahmed","IT"));
        employeeList.add(new Employee("E102","Fatma","HR"));
        employeeList.add(new Employee("E103","Khawla","Operation"));
    }

    public static void displayEmployee(){
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }
    public static Boolean validateData(String id){
        for(Employee emp : employeeList){
            if(emp.getEmployeeId().equalsIgnoreCase(id)){
                return false;
            }
        }
        return true;
    }

    public static void addEmployee(String name , String id ,String department){
        if(validateData(id)){
            employeeList.add(new Employee(id,name,department));
            System.out.println("Employee added successfully");
        }else{
            System.out.println("Employee with this Id already exist");
        }

    }
    public static void main(String[] args) {
        load();
        displayEmployee();
        addEmployee("Reem", "E106" , "IT");
        displayEmployee();

    }


}
