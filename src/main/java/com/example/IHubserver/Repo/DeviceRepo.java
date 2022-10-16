package com.example.IHubserver.Repo;

import com.example.IHubserver.Entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeviceRepo extends JpaRepository<Device,Integer> {

    @Query(value = "select*from device where id=?1", nativeQuery = true)
    Device getById(String deviceId);

}