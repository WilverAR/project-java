package com.upc.chasisservice.inventory.infraestructure.persistence;

import com.upc.chasisservice.inventory.application.dto.ProductDTO;
import com.upc.chasisservice.inventory.domain.model.Product;
import com.upc.chasisservice.inventory.domain.repository.ProductRepository;
import com.upc.chasisservice.inventory.infraestructure.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplement implements ProductService {
    private final ProductRepository _productRepository;

    public ProductImplement(ProductRepository productRepository) {
        _productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        Product product = Product.builder().name(productDTO.getName()).build();
        return _productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return _productRepository.findAll();
    }
}
