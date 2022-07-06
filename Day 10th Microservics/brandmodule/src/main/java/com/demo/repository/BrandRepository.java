package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.Brand;


@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
	
	 

}
