package com.example.Task8Demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Campaign extends ParentEntity {
    private String campaignName;
    private String platform;
    private Double budget;
    @OneToOne
    Employee employee;
}
