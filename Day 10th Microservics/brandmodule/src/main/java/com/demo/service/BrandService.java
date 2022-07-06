package com.demo.service;

import java.util.List;

import com.demo.entity.Brand;

public interface BrandService {
	
	 Brand createBrand(Brand Brand) ;
	
	//Brand updateProdutBy(Brand Brand,long id) ;
	
     Brand getBrandById(long id) ;
	
	List<Brand> getListOfBrand();
	
	//  void delById();
	
	// void delList();
	 
	 //Integer Otplogin(int number);

}
