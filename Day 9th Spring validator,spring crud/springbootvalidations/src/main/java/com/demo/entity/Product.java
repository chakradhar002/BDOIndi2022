package com.demo.entity;

import javax.validation.constraints.NotEmpty;

public class Product {

	private long id;

	@NotEmpty(message = "brand name is required")
	private String brand;
	@NotEmpty(message = "product name is required")
	private String productname;
	@NotEmpty(message = "color name is required")
	private String color;
	@NotEmpty(message = "os name is required")
	private String os;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}
