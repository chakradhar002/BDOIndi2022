package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	
	@PostMapping(value="/addproduct")
	Product addProduct(@RequestBody Product product) {

		Product p = productService.createProduct(product);

		return p;

	}

}
