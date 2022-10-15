package com.example.IHubserver.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "brand")
public class Brand {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
}
