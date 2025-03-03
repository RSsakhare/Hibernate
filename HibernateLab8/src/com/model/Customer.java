package com.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer2")
public class Customer {
    @Id
    private int custId;
    @Column(name = "custName",length = 10)
    private String custName;
    private long contactNum;

    @Embedded
    private Address custAddress;

    @OneToOne(mappedBy = "cust", cascade = CascadeType.ALL)
    private PassportDetails passDetails;

	public Customer() {}

	public Customer(int custId, String custName, long contactNum, Address custAddress, PassportDetails passDetails) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.contactNum = contactNum;
		this.custAddress = custAddress;
		this.passDetails = passDetails;
	}
	
	 // Getters and Setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public PassportDetails getPassDetails() {
		return passDetails;
	}

	public void setPassDetails(PassportDetails passDetails) {
		this.passDetails = passDetails;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", contactNum=" + contactNum + ", custAddress="
				+ custAddress + ", passDetails=" + passDetails + "]";
	}
    
   
}

