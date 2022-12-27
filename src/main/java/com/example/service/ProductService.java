package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Mono<Page<Product>> getProducts(PageRequest request){
        return repository.findAllBy(request)
                .collectList()
                .zipWith(this.repository.count())
                .map(t -> new PageImpl<>(t.getT1(), request, t.getT2()));
    }
}
