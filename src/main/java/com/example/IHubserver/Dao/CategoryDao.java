package com.example.IHubserver.Dao;

import com.example.IHubserver.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    @Query(value = "select*from device where id=?1", nativeQuery = true)
    Category getById(String deviceId);

}
