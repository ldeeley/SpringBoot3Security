package com.example.springboot3security.controller;

import com.example.springboot3security.model.Product;
import com.example.springboot3security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome this endpoint is not secure";
    }

    @GetMapping("/all")
    public List<Product> getAllTheProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProduct(id);
    }

}
