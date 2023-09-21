package org.spring.fundamentals.service;

import org.spring.fundamentals.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDeliveryService {

    @Autowired
    private ProductRepository productRepository;

//    private final ProductRepository productRepository;
//
//    public ProductDeliveryService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public void addProduct() {
        productRepository.add();
    }

}
