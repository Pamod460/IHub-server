package com.example.IHubserver.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDao {
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
