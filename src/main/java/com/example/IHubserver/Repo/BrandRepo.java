package com.example.IHubserver.Repo;

import com.example.IHubserver.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BrandRepo extends JpaRepository<Brand,Integer> {

    @Query(value = "select*from brand where id=?1", nativeQuery = true)
    Brand getById(String brandId);
}
