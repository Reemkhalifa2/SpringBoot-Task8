package com.example.Task8Demo.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Boolean isActive;
    private Date creationDate;
    private Date updateDate;
}
