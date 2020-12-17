package com.cg.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.product.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
