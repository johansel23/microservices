package com.tutorial.userservice.feignClients;

import com.tutorial.userservice.model.Bike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bike-service", path = "/bike")
public interface BikeFeignClient {


    @PostMapping()
    Bike saveBike(@RequestBody Bike bike);

    @GetMapping("byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);

}
