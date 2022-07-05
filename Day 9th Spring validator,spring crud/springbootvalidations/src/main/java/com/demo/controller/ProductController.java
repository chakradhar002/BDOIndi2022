package com.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;

@RestController
public class ProductController {

	// comment
	@PostMapping(value = "/addproduct")
	ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) throws Exception  {

		System.out.println(product.getBrand());
		System.out.println(product.getColor());
		System.out.println(product.getProductname());
		
		Product p = null;
 	  return new ResponseEntity<Product>(p, HttpStatus.BAD_REQUEST);

	}

}
