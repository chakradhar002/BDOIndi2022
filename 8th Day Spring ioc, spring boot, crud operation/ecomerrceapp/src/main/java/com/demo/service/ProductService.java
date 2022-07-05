package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {
	
	 Product createProduct(Product product) ;
	
	//Product updateProdutBy(Product product,long id) ;
	
     Product getProdutById(long id) ;
	
	List<Product> getListOfProduct();
	
	//  void delById();
	
	// void delList();
	 
	 //Integer Otplogin(int number);

}
