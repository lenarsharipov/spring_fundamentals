package org.spring.fundamentals.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.NEVER)          // forces not to have a transaction at all
//    @Transactional(propagation = Propagation.MANDATORY)    // forces to have a transaction
//    @Transactional(propagation = Propagation.REQUIRES_NEW) // creates new transaction each time once the method is called
    public void addProduct(String name) {
        var sql = "INSERT INTO products(name) VALUES(?)";
        jdbcTemplate.update(sql, name);
    }

}
