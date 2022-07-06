package com.demo.exception;

public class BrandNotfoundException extends RuntimeException {
	
	BrandNotfoundException(String exceptionmessage){
		
		super(String.format(" your product not found"+exceptionmessage));
	}	

}
