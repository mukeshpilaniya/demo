package com.pilaniya.demo.controller;

import com.pilaniya.demo.model.User;
import com.pilaniya.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> userList(){
        return userService.userList();
    }

    @GetMapping("/users/{id}")
    public Optional<User> findUser(@PathVariable Long id){
        return userService.findUser(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return  userService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public  User updateUser(@RequestBody User user){
        return  userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public List<User> deleteUser(@PathVariable Long id){
        return  userService.deleteUser(id);
    }
}
