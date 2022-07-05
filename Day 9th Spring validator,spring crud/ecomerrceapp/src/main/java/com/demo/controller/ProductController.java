package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.exception.ProductNotfoundException;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	// comment
	@PostMapping(value = "/addproduct")
	Product addProduct(@RequestBody Product product) {

		Product p = productService.createProduct(product);

		return p;

	}
    
	@GetMapping(value="/getlistofproducts") 
	List<Product> getListOfproducts() throws ProductNotfoundException{

		List<Product> resutedlist = productService.getListOfProduct();
		return resutedlist;

	}

}
