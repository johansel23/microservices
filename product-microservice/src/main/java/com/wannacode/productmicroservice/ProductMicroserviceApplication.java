package com.wannacode.productmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// Con esta anotacion EnableEurekaCliente ya indicamos que este micro sera uno de nuestros cliente para Eureka
@EnableEurekaClient
public class ProductMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMicroserviceApplication.class, args);
    }

}
