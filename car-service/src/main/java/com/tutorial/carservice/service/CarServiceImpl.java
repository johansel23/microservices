package com.tutorial.carservice.service;

import com.tutorial.carservice.entity.Car;
import com.tutorial.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;


    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(int id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car save(Car car) {
        Car carNew = carRepository.save(car);
        return  carNew;
    }

    @Override
    public List<Car> byUserId(int userId) {
        return carRepository.findByUserId(userId);
    }
}
