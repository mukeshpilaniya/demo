package com.pilaniya.demo.service;

import com.pilaniya.demo.model.User;
import com.pilaniya.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    //list all the users
    @Override
    public List<User> userList(){
        return userRepository.findAll();
    }

    //find specific user
    @Override
    public Optional<User> findUser(Long id){
        return  userRepository.findById(id);
    }

    //save user info
    @Override
    public User saveUser(User user){
         return userRepository.save(user);
    }

    //update user info
    @Override
    public  User updateUser(User user){
        return userRepository.save(user);
    }

    //delete user
    @Override
    public List<User> deleteUser(Long id){
        userRepository.deleteById(id);
        return userRepository.findAll();
    }
}
