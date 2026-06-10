package com.example.Task8Demo.Entity;


import com.example.Task8Demo.Repository.EmployeeRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Employee extends ParentEntity{
    private String employeeName;
    private String department;
    @OneToMany
    private List<Vehicle> vehicles;

}
