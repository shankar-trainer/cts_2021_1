package com.spring.exception;
import org.springframework.stereotype.Component;

@Component
public class InvalidProductIdException extends Exception {
 	public InvalidProductIdException(String msg) {
 		// fill the code
		super(msg);
	}
 }
