package com.wannacode.productmicroservice.controller;

import com.wannacode.productmicroservice.entity.ProductEntity;
import com.wannacode.productmicroservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {


    private final ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    //  De esta forma se hace el metodo de arriba en dado caso de que no queramos usar ResponseStatus
//    @GetMapping
//    public ResponseEntity<List<ProductEntity>>getAllProducts(){
//        List<ProductEntity> productEntities = productRepository.findAll();
//        if (productEntities.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.ok(productEntities);
//    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity producto){
        productRepository.save(producto);

    }
}
