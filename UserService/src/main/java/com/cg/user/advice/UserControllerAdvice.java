package com.cg.user.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.user.exceptions.ProductServiceException;

@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(ProductServiceException.class)
	public ResponseEntity<String> handleProductServiceException(ProductServiceException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
