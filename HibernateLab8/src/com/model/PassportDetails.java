package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PassportDetails {
    @Id
    private int passportNo;
    @Column(name = "firstName",length = 10)
    private String firstName;
    @Column(name = "lastName",length = 10)
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "gender",length = 7)
    private String gender;
    @Column(name = "nationality",length = 10)
    private String nationality;
    @Column(name = "countryCode",length = 12)
    private String countryCode;
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Column(name = "birthplace",length = 15)
    private String birthplace;

    @OneToOne
    @JoinColumn(name = "custId")
    private Customer cust;

	public PassportDetails() {}

	public PassportDetails(int passportNo, String firstName, String lastName, Date dob, String gender,
			String nationality, String countryCode, Date expiryDate, Date issueDate, String birthplace, Customer cust) {
		super();
		this.passportNo = passportNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.expiryDate = expiryDate;
		this.issueDate = issueDate;
		this.birthplace = birthplace;
		this.cust = cust;
	}
	// Getters and Setters

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "PassportDetails [passportNo=" + passportNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality + ", countryCode="
				+ countryCode + ", expiryDate=" + expiryDate + ", issueDate=" + issueDate + ", birthplace=" + birthplace
				+ ", cust=" + cust + "]";
	}
    
    
}

