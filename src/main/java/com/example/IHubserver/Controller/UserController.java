package com.example.IHubserver.Controller;

import com.example.IHubserver.Entity.User;
import com.example.IHubserver.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ihub/server/")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")

    public List<User> get() {
        return userService.getAll();
    }

    @GetMapping("users/id/{userId}")

    public User getById(@PathVariable String userId) {
        return userService.getById(userId);
    }

    @PostMapping("users/login")
    public User getByUser(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        return userService.getByUser(username, password);
    }

    @PostMapping("users/save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

}
