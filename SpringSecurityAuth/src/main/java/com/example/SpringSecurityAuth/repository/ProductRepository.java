package com.example.SpringSecurityAuth.repository;

import com.example.SpringSecurityAuth.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
