package com.example.Task8Demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle extends ParentEntity{

    private String vehicleModel;
    private Double rentalPricePerDay;
    @OneToOne
    Employee employee;
}
