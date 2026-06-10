package com.example.Task8Demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class Vehicle extends ParentEntity{

    private String vehicleModel;
    private Double rentalPricePerDay;
    @ManyToOne
    private Employee employee;
}
