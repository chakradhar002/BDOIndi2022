package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Product> getListOfProduct() {
		
		List<Product> resultedlist = productRepository.findAll();
		
		return resultedlist;
	}

	@Override
	public Product getProdutById(long id) {
		
		Optional<Product> getlist = productRepository.findById(id);//select * from table where id =?
		Product p= getlist.get();
		
		return p;
	}

}
