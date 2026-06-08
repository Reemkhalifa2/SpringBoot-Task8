package com.example.Task8Demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Vehicle {

    private String vehicleId;
    private String vehicleModel;
    private Double rentalPricePerDay;
}
