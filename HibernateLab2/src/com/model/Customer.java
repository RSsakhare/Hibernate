package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerId",length = 5)
    private int custId;
    @Column(name = "CustName",length = 10)
    private String custName;
    @Column(name = "ContactNo",length = 10)
    private String contactNo;
    @Column(name = "birthDate",length = 10)
    private Date birthDate;

    @Embedded
    private Address resAddr;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, String contactNo, Date birthDate, Address resAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.contactNo = contactNo;
		this.birthDate = birthDate;
		this.resAddr = resAddr;
	}

    // Getters and setters

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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getResAddr() {
		return resAddr;
	}

	public void setResAddr(Address resAddr) {
		this.resAddr = resAddr;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", contactNo=" + contactNo + ", birthDate="
				+ birthDate + ", resAddr=" + resAddr + "]";
	}
    
	
}

