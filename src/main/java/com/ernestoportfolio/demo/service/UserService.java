package com.ernestoportfolio.demo.service;

import com.ernestoportfolio.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserByEmail(String email);
    User updateUser(Long id, User updatedUser);
}
