package com.example.IHubserver.Dao;

import com.example.IHubserver.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemDao extends JpaRepository<Item, Integer> {
    @Query(value = "select*from item where id=?1", nativeQuery = true)
    Item getById(String itemId);
}
