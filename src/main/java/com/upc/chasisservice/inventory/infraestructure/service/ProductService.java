package com.upc.chasisservice.inventory.infraestructure.service;

import com.upc.chasisservice.inventory.application.dto.ProductDTO;
import com.upc.chasisservice.inventory.domain.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDTO productDTO);
    List<Product> getAllProducts();
}
