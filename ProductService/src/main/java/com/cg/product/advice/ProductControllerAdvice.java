package com.cg.product.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.product.exceptions.InvalidProductIdException;
import com.cg.product.exceptions.ProductNotFoundException;

@RestControllerAdvice
public class ProductControllerAdvice {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidProductIdException.class)
	public ResponseEntity<String> handleInvalidProductIdException(InvalidProductIdException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
