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

public class Device {
    @Id
    private Integer id;
    private String type;

}
