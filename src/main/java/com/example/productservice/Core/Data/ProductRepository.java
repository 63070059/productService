package com.example.productservice.Core.Data;

import com.example.productservice.Core.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<ProductEntity, String>{
    ProductEntity findByProductId(String productId);
//    ProductEntity findProductIdOrTitle(String productId, String title);
}
