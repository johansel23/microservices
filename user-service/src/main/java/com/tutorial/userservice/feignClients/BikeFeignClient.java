package com.tutorial.userservice.feignClients;

import com.tutorial.userservice.model.Bike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "bike-service")
public interface BikeFeignClient {


    @PostMapping()
    Bike saveBike(@RequestBody Bike bike);

    @GetMapping("byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);

}
