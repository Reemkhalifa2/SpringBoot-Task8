package com.example.Task8Demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer campaignId;
    private String campaignName;
    private String platform;
    private Double budget;

    @OneToOne
    Employee employee;
}
