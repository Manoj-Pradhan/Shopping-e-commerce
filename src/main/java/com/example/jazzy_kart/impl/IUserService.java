package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);
}
