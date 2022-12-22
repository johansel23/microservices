package com.tutorial.userservice.service;

import com.tutorial.userservice.entity.User;
import com.tutorial.userservice.model.Bike;
import com.tutorial.userservice.model.Car;

import java.util.List;
import java.util.Map;

public interface UserService {


    public List<User> getAll();

    public User getUserById(int id);

    public User save(User user);

    public Car saveCar(int userId, Car car);

    public Bike saveBike(int userId, Bike bike);

    public Map<String, Object> getUserAndVehicles(int userId);
}
