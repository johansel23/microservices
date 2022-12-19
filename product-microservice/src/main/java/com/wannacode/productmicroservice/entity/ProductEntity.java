package com.wannacode.productmicroservice.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//   @Column(name = "idproducto")
    private String idProduct;

    private String productName;

    private String productDescription;

    private Double unitPrice;


}
