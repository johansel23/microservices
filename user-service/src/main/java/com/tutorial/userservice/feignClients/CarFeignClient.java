package com.tutorial.userservice.feignClients;

import com.tutorial.userservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "car-service")
public interface CarFeignClient {

    @PostMapping()
    Car saveCar(@RequestBody Car car);

    @GetMapping("byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") int userId);
}
