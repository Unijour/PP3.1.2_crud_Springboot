package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User showUser(Long id);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void updateUser(User user);

}
