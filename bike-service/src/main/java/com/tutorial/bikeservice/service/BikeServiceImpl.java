package com.tutorial.bikeservice.service;

import com.tutorial.bikeservice.entity.Bike;
import com.tutorial.bikeservice.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public List<Bike> getAll() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike getBikeById(int id) {
        return bikeRepository.findById(id).orElse(null);
    }

    @Override
    public Bike save(Bike bike) {
        Bike bikeNew = bikeRepository.save(bike);
        return bikeNew;
    }

    @Override
    public List<Bike> byUserId(int userId) {
        return bikeRepository.findByUserId(userId);
    }
}
