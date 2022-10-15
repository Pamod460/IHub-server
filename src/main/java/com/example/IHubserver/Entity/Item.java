package com.example.IHubserver.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class Item {

    @Id
    private Integer id;
    private String name;
    private String model;
    private Double price;
    private String specs;
    private Integer brand_id;
    private Integer device_id;
    private Integer storage_id;
    private Integer memory_id;
}
