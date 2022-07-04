package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
	// di
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {

		Product p = productRepository.save(product);//Derived from hibernate  /interact with db

		return p;
	}

}
