package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Brand;
import com.demo.entity.Brand;
import com.demo.repository.BrandRepository;
import com.demo.service.BrandService;
import com.demo.service.BrandService;

@Service
public class BrandServiceImp implements BrandService {
	// di
	@Autowired
	BrandRepository BrandRepository;

	@Override
	public Brand createBrand(Brand Brand) {

		Brand p = BrandRepository.save(Brand);//Derived from hibernate  /interact with db

		return p;
	}

	@Override
	public List<Brand> getListOfBrand() {
		
		List<Brand> resultedlist = BrandRepository.findAll();
		
		return resultedlist;
	}

	@Override
	public Brand getBrandById(long id) {
		
		Optional<Brand> getlist = BrandRepository.findById(id);//select * from table where id =?
		Brand p= getlist.get();
		
		return p;
	}

	

}
