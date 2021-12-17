package com.sample.demo1.controller;

import com.sample.demo1.entity.User;
import com.sample.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    UserService userService;
    @GetMapping
    private List<User> getAllUser()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    private User getUser(@PathVariable("id") int id)
    {
        return userService.getUserById(id);
    }
    @DeleteMapping("/{id}")
    private void DeleteUser(@PathVariable("id") int id)
    {
        userService.Delete(id);
    }
    @PostMapping
    private int SaveUser(@RequestBody User user)
    {
       userService.saveUser(user);
       return user.getId();
    }
    @PutMapping
    private User Update(User user , int id)
    {
        return userService.Update(user,id);
    }


}
