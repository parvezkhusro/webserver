package com.parvezkhusro.webserver.controller;

import com.parvezkhusro.webserver.bo.UserServiceImpl;
import com.parvezkhusro.webserver.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(path = {"", "/"})
    ArrayList<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable long id) {
        return userService.findUserByID(id);
    }

    @PostMapping("/add")
    boolean addUser(@RequestBody User addUserRequest) {
       return userService.addUser(addUserRequest);
    }

    @DeleteMapping("/delete")
    void deleteAllUsers() {
        userService.deleteAllData();
    }
}
