package com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "street",length = 15)
    private String street;
	@Column(name = "city",length = 10)
    private String city;
	@Column(name = "country",length = 10)
    private String country;
	@Column(name = "pinCode",length = 10)
    private String pinCode;
	public Address() {
		super();
	}
	public Address(String street, String city, String country, String pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	
	 // Getters and Setters
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
    
    
   
}

