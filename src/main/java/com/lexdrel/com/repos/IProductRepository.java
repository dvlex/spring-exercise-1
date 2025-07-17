package com.lexdrel.com.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lexdrel.com.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {


}
