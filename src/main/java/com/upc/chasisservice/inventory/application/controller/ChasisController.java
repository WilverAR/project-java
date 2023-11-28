package com.upc.chasisservice.inventory.application.controller;

import com.upc.chasisservice.inventory.application.dto.ProductDTO;
import com.upc.chasisservice.inventory.domain.model.Product;
import com.upc.chasisservice.inventory.domain.repository.ProductRepository;
import com.upc.chasisservice.inventory.infraestructure.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo")
public class ChasisController {
    private final ProductService _productService;
    private final ProductRepository _productRepository;

    public ChasisController(ProductService productService, ProductRepository productRepository) {
        _productService = productService;
        _productRepository = productRepository;
    }

    @GetMapping("/status")
    public ResponseEntity<String> checkStatus() {
        return ResponseEntity.ok("Servicio disponible");
    }

    @PostMapping("/one/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
        var response = _productRepository.existsByName(productDTO.getName());
        if (response) throw new RuntimeException("PRODUCT EXISTS ALREADY!!");
        return new ResponseEntity<>(_productService.createProduct(productDTO), HttpStatus.CREATED);
    }

    @GetMapping("/all/product")
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok(_productService.getAllProducts());
    }
}
