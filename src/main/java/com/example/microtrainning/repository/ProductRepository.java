package com.example.microtrainning.repository;

import com.example.microtrainning.domain.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product,String> {
}
