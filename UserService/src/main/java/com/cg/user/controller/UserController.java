package com.cg.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.user.entity.Product;
import com.cg.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/user-service/getAll")
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<>(userService.getAllProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/user-service/getProductById/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer productId) {
		return new ResponseEntity<>(userService.getProductById(productId),HttpStatus.OK);
	}
}