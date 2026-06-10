package com.example.Task8Demo.Entity;


import com.example.Task8Demo.Repository.EmployeeRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Employee extends ParentEntity{
    private String employeeName;
    private String department;
    @OneToMany
    private List<Vehicle> vehicles;

}
