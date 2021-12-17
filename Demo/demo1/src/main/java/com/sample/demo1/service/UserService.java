package com.sample.demo1.service;

import com.sample.demo1.entity.User;
import com.sample.demo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<>();
        userRepository.findAll();
        return users;
    }

    public  void saveUser(User user)
    {
        userRepository.save(user);
    }
    public User getUserById(int id)
    {
        return userRepository.findById(id).get();
    }
    public void Delete(int id)
    {
        userRepository.deleteById(id);
    }
    public User Update(User user , int id)
    {
       return userRepository.save(user);
    }

}
