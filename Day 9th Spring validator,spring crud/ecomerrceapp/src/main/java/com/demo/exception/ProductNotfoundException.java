package com.demo.exception;

public class ProductNotfoundException extends RuntimeException {
	
	ProductNotfoundException(String exceptionmessage){
		
		super(String.format(" your product not found"+exceptionmessage));
	}	

}
