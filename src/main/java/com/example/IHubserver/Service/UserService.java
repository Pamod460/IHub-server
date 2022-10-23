package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.UserDao;
import com.example.IHubserver.Entity.User;
import com.example.IHubserver.Repo.UserRepo;
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
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;


    public List<UserDao> getAll(){
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDao>>(){}.getType());
    }

    public UserDao getById(String userId){
        User user = userRepo.getById(userId);
        return  modelMapper.map(user, UserDao.class);
    }

    public UserDao getByUser(String username,String password){
        User user = userRepo.getByUser(username,password);
        return  modelMapper.map(user, UserDao.class);
    }

    public UserDao addUser(UserDao userDao) {

        userRepo.save(modelMapper.map(userDao, User.class));
        return userDao;
    }



}

