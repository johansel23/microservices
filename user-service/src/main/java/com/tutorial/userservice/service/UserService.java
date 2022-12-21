package com.tutorial.userservice.service;

import com.tutorial.userservice.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User getUserById(int id);

    public User save(User user);
}
