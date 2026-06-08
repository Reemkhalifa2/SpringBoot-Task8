package com.example.Task8Demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private Double budget;
}
