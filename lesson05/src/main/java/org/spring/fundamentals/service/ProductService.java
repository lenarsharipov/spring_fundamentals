package org.spring.fundamentals.service;

import org.spring.fundamentals.repository.ProductRepository;
import org.spring.fundamentals.validator.NameValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private NameValidator nameValidator;

    @Transactional
    public void addProduct(String productName) {
        nameValidator.validate(productName);
        productRepository.addProduct(productName);
//        throw new RuntimeException("Exception in Service");
    }
}
