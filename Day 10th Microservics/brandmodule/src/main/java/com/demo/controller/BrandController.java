package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Brand;
import com.demo.exception.BrandNotfoundException;
import com.demo.service.BrandService;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping(value="/brand")
public class BrandController {

	@Autowired
	BrandService BrandService;


	/**functionality description adding Brand by admin
	 * @param Brand
	 * @return
	 */
	 
	
	@PostMapping(value = "/addBrand")
	ResponseEntity<Brand> addBrand(@RequestBody Brand Brand) {

		Brand p = BrandService.createBrand(Brand);

		return 	new ResponseEntity<Brand>(p,HttpStatus.ACCEPTED) ;

	}
    
	/**
	 * @return
	 * @throws BrandNotfoundException
	 */
	@GetMapping(value="/getlistofBrands") 
	List<Brand> getListOfBrands() throws BrandNotfoundException{

		List<Brand> resutedlist = BrandService.getListOfBrand();
		return resutedlist;

	}
	
	/**
	 * @param id
	 * @return
	 * @throws BrandNotfoundException
	 */
	@GetMapping(value="/getBrandbyid/{id}") 
	 Brand  getListOfBrands(@PathVariable long id) throws BrandNotfoundException{

		Brand resutedlist = BrandService.getBrandById(id);
		return resutedlist;

	}

}
