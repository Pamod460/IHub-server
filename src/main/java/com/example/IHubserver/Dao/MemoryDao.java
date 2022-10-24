package com.example.IHubserver.Dao;

import com.example.IHubserver.Entity.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemoryDao extends JpaRepository<Memory,Integer> {
    @Query(value = "select*from memory where id=?1", nativeQuery = true)
    Memory getById(String memoryId);
}
