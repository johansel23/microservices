package com.tutorial.bikeservice.service;

import com.tutorial.bikeservice.entity.Bike;

import java.util.List;

public interface BikeService {

    public List<Bike> getAll();

    public Bike getBikeById(int id);

    public Bike save(Bike bike);

    public List<Bike> byUserId(int userId);
}
