package com.tutorial.carservice.service;

import com.tutorial.carservice.entity.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAll();

    public Car getCarById(int id);
    public Car save(Car car);
    public List<Car> byUserId(int userId);
}
