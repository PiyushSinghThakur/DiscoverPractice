package com.cg.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.dao.ProductDao;
import com.cg.product.entity.Product;
import com.cg.product.exceptions.InvalidProductIdException;
import com.cg.product.exceptions.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public Product getProductById(Integer productId) {
		if(productId>0) {
			Optional<Product> product = productDao.findById(productId);
			if(product.isPresent()) {
				return product.get();
			}else
				throw new ProductNotFoundException("!! Product Not Found !!");
		}else
			throw new InvalidProductIdException("!! Invalid product ID !!");
		
	}
	
}
