package com.cg.product.exceptions;

@SuppressWarnings("serial")
public class InvalidProductIdException extends RuntimeException {

	public InvalidProductIdException(String msg) {
		super(msg);
	}

	
}
