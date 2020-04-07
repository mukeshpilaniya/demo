package com.pilaniya.demo.service;

import com.pilaniya.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService  {
     List<User> userList();
     Optional<User> findUser(Long id);
     User saveUser(User user);
     List<User> deleteUser(Long id);
     User updateUser(User user);
}
