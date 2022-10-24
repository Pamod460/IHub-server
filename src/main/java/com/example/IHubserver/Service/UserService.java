package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.User;
import com.example.IHubserver.Dao.UserDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ModelMapper modelMapper;


    public List<User> getAll() {
        List<User> userList = userDao.findAll();
        return modelMapper.map(userList, new TypeToken<List<User>>() {
        }.getType());
    }

    public User getById(String userId) {
        User user = userDao.getById(userId);
        return modelMapper.map(user, User.class);
    }

    public User getByUser(String username, String password) {
        User user = userDao.getByUser(username, password);
        return modelMapper.map(user, User.class);
    }

    public User save(User user) {

        userDao.save(modelMapper.map(user, User.class));
        return user;
    }


}

