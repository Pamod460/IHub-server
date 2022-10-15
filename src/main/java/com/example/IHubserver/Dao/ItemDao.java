package com.example.IHubserver.Dao;

import com.example.IHubserver.Entity.Brand;
import com.example.IHubserver.Entity.Device;
import com.example.IHubserver.Entity.Memory;
import com.example.IHubserver.Entity.Storage;
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
    private Brand brand;
    private Device device;
    private Storage storage;
    private Memory memory;
}
