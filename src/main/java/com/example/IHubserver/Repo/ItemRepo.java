package com.example.IHubserver.Repo;

import com.example.IHubserver.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepo extends JpaRepository<Item, Integer> {

    @Query(value = "select*from item where id=?1", nativeQuery = true)
    Item getById(String itemId);
}
