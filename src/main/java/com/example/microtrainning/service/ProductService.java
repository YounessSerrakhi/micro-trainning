package com.example.microtrainning.service;

import com.example.microtrainning.controller.ProductResponse;
import com.example.microtrainning.domain.model.Product;
import com.example.microtrainning.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public  void createProduct(Product productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }


    public List<Product> getAllProducts() {
        List<Product> products=productRepository.findAll();
        return  products.stream().map(this::mapToProductResponse).toList();
    }

    private Product mapToProductResponse(Product product){
        return  Product.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
