package com.example.springboot3security.controller;

import com.example.springboot3security.entity.UserInfo;
import com.example.springboot3security.model.Product;
import com.example.springboot3security.service.ProductService;
import com.example.springboot3security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userhome")
    public String welcome(){
        return "Welcome this endpoint is not secure";
    }

//    @GetMapping("/all")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    public List<Product> getAllTheProducts(){
//        return productService.getProducts();
//    }
//
//    @GetMapping("/{id}")
//    public UserInfo getProductById(@PathVariable int id){
//        return userService.getUser(id);
//    }

    @PostMapping("/newUser")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return userService.addUser(userInfo);
    }

}
