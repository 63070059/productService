package com.example.productservice.Query;

import com.example.productservice.Core.Data.ProductRepository;
import com.example.productservice.Core.ProductEntity;
import com.example.productservice.Query.Rest.ProductRestModel;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductQueryHandler {
    @Autowired
    private final ProductRepository productRepository;

    public ProductQueryHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    List<ProductRestModel> findProduct(FindProductQuery query){
        List<ProductRestModel> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findAll();
        for (ProductEntity entity : entities){
            ProductRestModel model = new ProductRestModel();
            BeanUtils.copyProperties(entity, model);
            models.add(model);
        }
        return models;
    }
}
