package com.cg.product.service;

import java.util.List;
import com.cg.product.entity.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(Integer productId);
}
