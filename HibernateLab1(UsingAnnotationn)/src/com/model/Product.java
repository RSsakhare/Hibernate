package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="code",length = 5)
	int code;
	@Column(name="name",length=10)
	String name;
	@Column(name = "price",length=7)
	double price;
	@Column(name="brand",length = 10)
	String brand;
	@Column(name="manufacturingDate",length = 10)
	Date manufacturingDate = new Date();
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int code, String name, double price, String brand, Date manufacturingDate) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.manufacturingDate = manufacturingDate;
	}
	
	

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Date getManufacturingDate() {
		return manufacturingDate;
	}


	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}


	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", brand=" + brand
				+ ", manufacturingDate=" + getManufacturingDate() + "]";
	}
	
	
	
}
