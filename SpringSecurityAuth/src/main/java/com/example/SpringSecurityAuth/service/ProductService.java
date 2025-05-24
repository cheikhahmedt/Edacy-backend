package com.example.SpringSecurityAuth.service;

import com.example.SpringSecurityAuth.model.Product;
import com.example.SpringSecurityAuth.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(@RequestBody Product product) {
        return this.productRepository.save(product);
    }

    public List<Product> findAllProduct() {
        return this.productRepository.findAll();
    }
}
