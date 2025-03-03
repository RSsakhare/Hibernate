package com.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Dept1")
public class Department {

	@Id
	
	@Column(name = "deptId")
	private int departmentId;
	@Column(name = "deptName",length = 15)
	private String departmentName;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private Set<Employee>employees;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String departmentName, Set<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + "]";
	}
	
	
}
