package com.wannacode.productmicroservice.repository;

import com.wannacode.productmicroservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
