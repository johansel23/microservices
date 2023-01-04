package com.tutorial.userservice.service;

import com.tutorial.userservice.entity.User;
import com.tutorial.userservice.model.Bike;
import com.tutorial.userservice.model.Car;

import java.util.List;
import java.util.Map;

public interface UserService {


    public Map<String, Object> getAll();

    public Map<String, Object> getUserById(int id);

    public User save(User user);

    public Car saveCar(int userId, Car car);

    public List<Car> getCars(int userId);

    public Bike saveBike(int userId, Bike bike);
    public List<Bike> getBikes(int userId);

    public Map<String, Object> getUserAndVehicles(int userId);
}
