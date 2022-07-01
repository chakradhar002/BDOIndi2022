package com.demo.client;

import com.demo.entity.Product;
import com.demobusinesslogic.ProductRepo;

public class ProductManage {

	public static void main(String[] args) {

		Product record1 = new Product("sam","fair","red");
		Product record2 = new Product("iphone","good","red");
		
		
		ProductRepo.createProduct(record1);
		ProductRepo.createProduct(record2);
		System.out.println("done");

	}

}
