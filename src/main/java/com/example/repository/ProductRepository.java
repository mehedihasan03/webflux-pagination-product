package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveSortingRepository<ProductRepository, Integer> {

    Flux<Product> findAllBy(Pageable pageable);
}
