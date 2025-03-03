package com.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp107")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EmpType",discriminatorType = DiscriminatorType.STRING,length = 6)
@DiscriminatorValue(value = "empl")
public class Employee 
{
	@Id
	@GeneratedValue
	@Column(name = "eid",length = 4)
	int eid;
	@Column(name="ename",length = 10)
	String ename;
	@Column(name = "esal",length = 10)
	int esal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
