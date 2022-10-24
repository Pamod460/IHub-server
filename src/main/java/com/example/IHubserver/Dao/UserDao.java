package com.example.IHubserver.Dao;


import com.example.IHubserver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User,Integer> {

    @Query(value = "select*from user where id=?1", nativeQuery = true)
    User getById(String userid);

    @Query(value = "select*from user where username=?1 and password=?2 ", nativeQuery = true)
    User getByUser(String username, String password);

}
