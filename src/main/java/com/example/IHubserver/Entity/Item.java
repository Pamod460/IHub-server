package com.example.IHubserver.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "model")
    private String model;
    @Column(name = "price")
    private Double price;
    @Column(name = "specs")
    private String specs;
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    @ManyToOne
    private Brand brand;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne
    private Device device_id;

    @JoinColumn(name = "storage_id", referencedColumnName = "id")
    @ManyToOne
    private Storage storage_id;

    @JoinColumn(name = "memory_id", referencedColumnName = "id")
    @ManyToOne
    private Memory memory_id;
}
