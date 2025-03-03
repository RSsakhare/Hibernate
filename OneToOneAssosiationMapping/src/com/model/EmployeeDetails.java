package com.model;

import javax.persistence.*;


@Entity
@Table(name = "EmpDetails")

public class EmployeeDetails {
    @Id
    @Column(name="eid")
    private int employeeId;
    @Column(name="street", length=20)
    private String street;
    @Column(name="city", length=20)
    private String city;
    @Column(name="state", length=20)
    private String state;
    @Column(name="country", length=20)
    private String country;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Employee employee;

	public EmployeeDetails(int employeeId, String street, String city, String state, String country,
			Employee employee) {
		super();
		this.employeeId = employeeId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.employee = employee;
	}

	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", employee=" + employee + "]";
	}
    
   
}

