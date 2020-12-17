package com.cg.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.cg.user.entity.Product;
import com.cg.user.exceptions.ProductServiceException;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		return restTemplate.getForObject("http://localhost:9090/product-service/getAll", List.class);
	}

	@Override
	public Product getProductById(Integer productId) {
		try {
			return restTemplate.getForObject("http://localhost:9090/product-service/getProductById/" + productId,
				Product.class);
		}catch(HttpClientErrorException exception) {
			   logger.error(exception.getMessage(),exception);
			   throw new ProductServiceException(exception.getMessage());
		}
	}
}