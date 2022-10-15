package com.example.IHubserver.Repo;

import com.example.IHubserver.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Integer> {



}
