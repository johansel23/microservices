package com.tutorial.userservice.service;

import com.tutorial.userservice.entity.User;
import com.tutorial.userservice.feignClients.BikeFeignClient;
import com.tutorial.userservice.feignClients.CarFeignClient;
import com.tutorial.userservice.model.Bike;
import com.tutorial.userservice.model.Car;
import com.tutorial.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    CarFeignClient carFeignClient;
    @Autowired
    BikeFeignClient bikeFeignClient;

//    @Override
//    public List<User> getAll() {
//        return userRepository.findAll();
//    }


    @Override
    public Map<String, Object> getAll() {

        Map<String, Object> result = new HashMap<>();

        List<User> users = userRepository.findAll();
        if (users.isEmpty()) {
            result.put("Usuarios", "No hay usuarios");
            return result;
        }
        result.put("Usuarios", users);

        return result;
    }



//    @Override
//    public User getUserById(int id) {
//
//        return userRepository.findById(id).orElse(null);
//    }


    @Override
    public Map<String, Object> getUserById(int id) {
        Map<String, Object> result = new HashMap<>();

        User user = userRepository.findById(id).orElse(null);

        result.put("Usuario", user);

        return result;
    }
    @Override
    public User save(User user) {
        User userNew = userRepository.save(user);
        return userNew;
    }
    @Override
    public Car saveCar(int userId,  Car car){
        car.setUserId(userId);
        Car carNew = carFeignClient.saveCar(car);
        return carNew;
    }

    @Override
    public List<Car> getCars(int userId) {
        return carFeignClient.getCars(userId);
    }

    @Override
    public Bike saveBike(int userId, Bike bike){
        bike.setUserId(userId);
        Bike bikeNew = bikeFeignClient.saveBike(bike);
        return bikeNew;
    }

    @Override
    public List<Bike> getBikes(int userId) {
        return bikeFeignClient.getBikes(userId);
    }

    @Override
    public Map<String, Object> getUserAndVehicles(int userId){
        Map<String, Object> result = new HashMap<>();

        User user = userRepository.findById(userId).orElse(null);

        if (user == null) {
            result.put("Mensaje", "no existe el usuario");
            return result;
        }
        result.put("User", user);

        List<Car> cars = carFeignClient.getCars(userId);

        if (cars.isEmpty()) {
            result.put("Cars", "ese user no tiene coches");
        }
        else{
            result.put("Cars", cars);
        }

        List<Bike> bikes = bikeFeignClient.getBikes(userId);
        if (bikes.isEmpty()) {
            result.put("Bikes", "ese user no tiene motos");
        }
        else{
            result.put("Bikes", bikes);
        }
        return result;
    }
}
