package com.example.SpringSecurityAuth.controller;

import com.example.SpringSecurityAuth.model.Product;
import com.example.SpringSecurityAuth.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    private   ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("create")
    public Product createProduct(@RequestBody Product product) {
        return this.productService.createProduct(product);
    }

    @RequestMapping("product-list")
    public List<Product> findAllProduct() {
        return this.productService.findAllProduct();
    }

}
