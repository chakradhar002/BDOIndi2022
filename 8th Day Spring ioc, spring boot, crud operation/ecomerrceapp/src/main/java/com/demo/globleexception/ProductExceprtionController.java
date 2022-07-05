package com.demo.globleexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.demo.exception.ProductNotfoundException;

@ControllerAdvice
public class ProductExceprtionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = ProductNotfoundException.class)
	public ResponseEntity<Object> exception(ProductNotfoundException exception) {
		
		 return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}

}
