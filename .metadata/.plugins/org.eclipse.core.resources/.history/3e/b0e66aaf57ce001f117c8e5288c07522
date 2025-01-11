package com.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="hib_emp")
public class Employee {
    @Id
    @Column(name="eid")
    private int employeeId;
    @Column(name="fname", length=15)
    private String firstName;
    @Column(name="lname", length=15)
    private String lastName;
    @Temporal(TemporalType.DATE)
    @Column(name="bdate")
    private Date birthDate;
    @Column(name="cellphone", length=15)
    private String cellphone;

    @OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
    private EmployeeDetails employeeDetail;

	

	public Employee(int employeeId, String firstName, String lastName, Date birthDate, String cellphone,
			EmployeeDetails employeeDetail) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.cellphone = cellphone;
		this.employeeDetail = employeeDetail;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public EmployeeDetails getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetails employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", cellphone=" + cellphone + ", employeeDetail=" + employeeDetail + "]";
	}

    
}
