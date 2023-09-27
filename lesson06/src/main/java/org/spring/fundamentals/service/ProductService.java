package org.spring.fundamentals.service;

import org.spring.fundamentals.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    /**
     *
     */
    @Autowired
    private ProductRepository productRepository;

//    @Transactional(propagation = Propagation.REQUIRED) // by default
    @Transactional(propagation = Propagation.NOT_SUPPORTED) // NOT_SUPPORTED does not create a transaction
    public void addTenProducts() { // created Transaction
        for (int i = 1; i <= 10; i++) {
            productRepository.addProduct("Product " + i);
            if (i == 5) throw new RuntimeException(":(");
        }
    } // Transaction commits
}
