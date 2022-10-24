package com.example.IHubserver.Controller;

import com.example.IHubserver.Entity.User;
import com.example.IHubserver.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")

    public List<User> get(){
        return userService.getAll();
    }

    @GetMapping("users/id/{userId}")

    public User getById(@PathVariable String userId) {
        return userService.getById(userId);
    }

    @PostMapping("users/user")
    public User getByUser(@RequestBody String username, String password) {
        return userService.getByUser( username, password);
    }
    @PostMapping("users")
    public User save(@RequestBody User user) {

        return userService.save(user);
    }

}
