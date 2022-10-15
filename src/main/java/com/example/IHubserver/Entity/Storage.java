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

public class Storage {
    @Id
    private Integer id;
    private String name;
}
