package com.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name="houseNo",length = 3)
	private int houseNo;
	@Column(name = "house",length = 10)
	private String house;
	@Column(name = "street",length = 10)
	private String street;
	@Column(name = "city",length = 10)
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String house, String street, String city) {
		super();
		this.houseNo = houseNo;
		this.house = house;
		this.street = street;
		this.city = city;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", house=" + house + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
