package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.User;
import com.example.IHubserver.Dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getAll() {
        return userDao.findAll();
    }
    public User getById(String userId) {
        return userDao.getById(userId);
    }

    public User getByUser(String username, String password) {
        return userDao.getByUser(username, password);
    }

    public User save(User user) {
        return userDao.save(user);
    }


}

