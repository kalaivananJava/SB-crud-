package com.kgisl.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    Product findByName(String name);
    
}
