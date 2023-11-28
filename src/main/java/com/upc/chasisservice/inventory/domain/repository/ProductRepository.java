package com.upc.chasisservice.inventory.domain.repository;

import com.upc.chasisservice.inventory.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByName(String name);
}
