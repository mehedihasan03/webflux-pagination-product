package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/all")
    public Mono<Page<Product>> getAll(@RequestParam("page") int page, @RequestParam("size") int size){
        return this.service.getProducts(PageRequest.of(page, size));
    }
}
