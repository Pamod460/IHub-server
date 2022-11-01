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
    @Column(name = "specifications")
    private String specifications;
    @Column(name = "photo")
    private byte[] photo;

    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    @ManyToOne
    private Brand brand;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne
    private Category category;

    @JoinColumn(name = "storage_id", referencedColumnName = "id")
    @ManyToOne
    private Storage storage;

    @JoinColumn(name = "memory_id", referencedColumnName = "id")
    @ManyToOne
    private Memory memory;
}
