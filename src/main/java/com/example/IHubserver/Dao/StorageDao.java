package com.example.IHubserver.Dao;

import com.example.IHubserver.Entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StorageDao extends JpaRepository<Storage, Integer> {
    @Query(value = "select*from brand where id=?1", nativeQuery = true)
    Storage getById(String storageId);

}
