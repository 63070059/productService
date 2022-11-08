package com.example.productservice.Core.Event;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductCreatedEvent implements Serializable {
    private String productId;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
